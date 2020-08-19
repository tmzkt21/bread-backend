package com.bread.web.bread;

import com.bread.web.user.User;
import com.bread.web.utils.GenericService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

interface BreadService extends GenericService<Bread> {

    void allUpdate(List<Bread> user);

}
@Service @AllArgsConstructor
public class BreadServiceImpl implements BreadService {
private final BreadRepository breadRepository;
    @Override
    public void save(Bread bread) {
        breadRepository.save(bread);
    }

    @Override
    public Optional<Bread> findById(Long id) {
        return breadRepository.findById(id);
    }

    @Override
    public Iterable<Bread> findAll() {
        return breadRepository.findAll();
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

    @Override
    public void allUpdate(List<Bread> bread) {
        breadRepository.saveAll(bread);
    }
}
