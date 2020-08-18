package com.bread.web.category;

import com.bread.web.user.UserRepository;
import com.bread.web.utils.GenericService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

interface CategoryService extends GenericService<Category> {

}
@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    final private CategoryRepository categoryRepository;

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
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
