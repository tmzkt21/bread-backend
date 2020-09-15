package com.bread.web.review;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id") private Long reviewId;
    @Column(name = "user_id", nullable = false) private String userId;
    @Column(name = "category", nullable = false) private String category;
    @Column(name = "post_title", nullable = false) private String postTitle;
    @Column(name = "contents", nullable = false) private String contents;
    @Column(name = "date", nullable = false) private String date;

    @Builder
    public Review(String userId,String category,String postTitle,String contents,String date){
    this.userId = userId;
    this.category = category;
    this.postTitle = postTitle;
    this.contents = contents;
    this.date = date;

    }
}
