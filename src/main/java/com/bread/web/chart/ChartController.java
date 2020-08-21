package com.bread.web.chart;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/chart")
@AllArgsConstructor
public class ChartController {
    private final ChartRepository chartRepository;
    private final ChartService chartService;


    @GetMapping("/total/user")
    public Map<String, Long> userTotalCount(){
        System.out.println("userTotal");
        Map<String,Long> userTotal = new HashMap<>();
        userTotal.put("total",chartService.userTotalCount());
        return userTotal;
    }


}
