package com.bread.web.page;
import com.bread.web.utils.GenericService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

interface PageService extends GenericService<Page> {

}
@Service @AllArgsConstructor
public class PageServiceImpl implements PageService{
private final PageRepository pageRepository;
    @Override
    public void save(Page page) {
        pageRepository.save(page);
    }

    @Override
    public Optional<Page> findById(Long id) {
        return pageRepository.findById(id);
    }

    @Override
    public Iterable<Page> findAll() {
        return pageRepository.findAll();
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
