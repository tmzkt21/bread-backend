package com.bread.web.user;
import com.bread.web.utils.GenericService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

interface UserService extends GenericService<User> {

Optional<User> findByUserId(String userId);



}

@Service @AllArgsConstructor
public class UserServiceImpl implements UserService {
    final private UserRepository userRepository;

    @Override
    public Optional<User> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Iterable<User> findAll() {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public boolean exists(String id) {
        return false;
    }




    @Override
    public Optional<User> findByUserId(String userId) {
        return userRepository.findByUserId(userId);
    }



}