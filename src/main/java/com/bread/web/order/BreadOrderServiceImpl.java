package com.bread.web.order;

import com.bread.web.bread.Bread;
import com.bread.web.utils.GenericService;

import java.util.Optional;

interface BreadOrderService extends GenericService<Bread> {

}

public class BreadOrderServiceImpl implements BreadOrderService{

    @Override
    public void save(Bread bread) {

    }

    @Override
    public Optional<Bread> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Bread> findAll() {
        return null;
    }

    @Override
    public boolean exists(String id) {
        return false;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void delete(String id) {

    }
}
