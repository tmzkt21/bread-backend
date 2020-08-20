package com.bread.web.shipping;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController @AllArgsConstructor
@RequestMapping("/shipping")


public class ShippingController {
    private final ShippingService shippingService;
    private final ShippingRepository shippingRepository;

    // 리스트로 전부찾기
    @GetMapping("/findAll")
    public List<Shipping> findAll() { return shippingRepository.findAll();}

    // 정보 수정
    @PostMapping("/allUpdate")
    public void allUpdate(@RequestBody List<Shipping> shipping){
        shippingService.allUpdate(shipping);
    }
}
