package com.bread.web.chart;

import com.bread.web.user.User;
import com.bread.web.utils.GenericService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Component
interface ChartService extends GenericService<Chart> {
    Long userTotalCount();
}
@Service
@AllArgsConstructor
public class ChartServiceImpl implements ChartService {
final private ChartRepository chartRepository;
    @Override
    public void save(Chart chart) {
        chartRepository.save(chart);
    }

    @Override
    public Optional<Chart> findById(Long id) {
        return chartRepository.findById(id);
    }

    @Override
    public Iterable<Chart> findAll() {
        return chartRepository.findAll();
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
    public Long userTotalCount() {
        return chartRepository.userTotal();
    }


}
