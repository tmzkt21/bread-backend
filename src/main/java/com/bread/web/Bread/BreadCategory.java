package com.bread.web.Bread;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "bread_categoty")
public class BreadCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id") private Long categoryId;
    @Column(name = "kind", nullable = false) private String visitor;
    @Column(name = "chart_id") private Long chartId;
    @Column(name = "option", nullable = false) private String option;
    @Column(name = "allergy", nullable = false) private String allergy;


    @OneToMany(mappedBy = "breadCategory")
    private List<Bread> breads = new ArrayList<Bread>();
}
