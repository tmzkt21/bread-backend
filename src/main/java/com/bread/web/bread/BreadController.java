package com.bread.web.bread;

import com.bread.web.chart.Chart;
import com.bread.web.user.User;
import com.bread.web.utils.Box;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController @AllArgsConstructor
@RequestMapping("/bread")
public class BreadController {
    private final BreadService breadService;
    private final BreadRepository breadRepository;
    @Autowired Box box;

    @GetMapping("/data")
    public Map<?,?> hospitalData(){
        System.out.println("들어옴");
        Iterable<Bread> data = breadService.findAll();
        box.put("list", data);
        System.out.println(box.get());
        return box.get();

    }

    @GetMapping("/list/{page}/{category}/{search}")
    public Iterable<Bread> breadList(@PathVariable String page,String category,String search) {
        System.out.println("자바들어옴");
        Iterable<Bread> breadList = breadService.findAll();
        return breadList;
    }
    @PostMapping("/product")
    public String Product(@RequestBody Bread bread){
        breadService.save(bread);
        return "상품등록완료";
    }
    @PostMapping("/allUpdate")
    public void allUpdate(@RequestBody List<Bread> bread){
        breadService.allUpdate(bread);
    }

    // 빵리스트 출력
    @GetMapping("/findAll")
    public List<Bread> findAll(){
        return breadRepository.findAll();
    }

}
