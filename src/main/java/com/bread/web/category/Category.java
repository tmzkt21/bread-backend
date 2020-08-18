package com.bread.web.category;
import com.bread.web.bread.Bread;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity @Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id") private Long categoryId;
    @Column(name = "option", nullable = false) private String option;
    @Column(name = "allergy", nullable = false) private String allergy;

    @OneToMany(mappedBy = "category")
    private List<Bread> breads = new ArrayList<Bread>();

    @Builder
    public Category(String option,String allergy) {
        this.option = option;
        this.allergy = allergy;
    }
}
