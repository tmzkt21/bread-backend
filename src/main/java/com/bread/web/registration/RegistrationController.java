package com.bread.web.registration;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/registration")
public class RegistrationController {
    private final RegistrationRepository registrationRepository;

    public RegistrationController(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    @PostMapping("/add")
    public String add(@RequestBody Registration registration){
        Registration add = registrationRepository.save(registration);
        return add.getRegistrationName() + "상품 등록 완료!";
    }

}
