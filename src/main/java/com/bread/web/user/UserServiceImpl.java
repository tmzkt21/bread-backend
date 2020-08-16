package com.bread.web.user;
import com.bread.web.utils.GenericService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

interface UserService extends GenericService<User> {




}

@Service
public class UserServiceImpl implements UserService {


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
}