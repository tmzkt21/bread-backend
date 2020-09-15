package com.bread.web.review;


import com.bread.web.utils.Box;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/review")
public class ReviewController {
    private final ReviewService reviewService;
    private final ReviewRepository reviewRepository;
    @Autowired Box box;

    @PostMapping("/posts/notice/create")
    public String Review(@RequestBody Review review){
        reviewRepository.save(review);
        return "리뷰 저장완료";
    }
}
