package com.bread.web.user;
import com.bread.web.utils.GenericService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

interface UserService extends GenericService<User> {


    boolean save(User user);

    Optional<User> findByUserId(String userId);


    List<User> findUsers();

}

@Service
public class UserServiceImpl implements UserService {
    final private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public boolean save(User user) {
        try {
            userRepository.save(user);
            return true;
        }
        catch (Exception e) {
            e.toString();
            return false;
        }
    }

    @Override
    public Optional<User> findByUserId(String userId) {
        return userRepository.findByUserId(userId);
    }


    @Override
    public List<User> findUsers() {
        return userRepository.findAll();
    }


    @Override
    public Optional<User> findById(String id) {
        return userRepository.findById(Long.valueOf(id));
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public int count() {
        return (int) userRepository.count();
    }

    @Override
    public void delete(String id) {
        userRepository.delete(findById(id).orElse(new User()));
    }

    @Override
    public boolean exists(String id) {
        return userRepository.existsById((long) Integer.parseInt(id));
    }
}