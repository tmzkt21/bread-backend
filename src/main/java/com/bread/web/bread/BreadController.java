package com.bread.web.bread;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController @AllArgsConstructor
@RequestMapping("/bread")
public class BreadController {
    private final BreadService breadService;



    @GetMapping("/list/{page}/{category}/{search}")
    public Iterable<Bread> breadList(@PathVariable String page,String category,String search) {
        System.out.println("자바들어옴");
        Iterable<Bread> breadList = breadService.findAll();
        return breadList;
    }

}
