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
public class BreadCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chart_id") private Long chartId;
    @Column(name = "visitor", nullable = false) private String visitor;
    @Column(name = "option", nullable = false) private String option;

    @OneToMany(mappedBy = "breadCategory")
    private List<Bread> breads = new ArrayList<Bread>();
}
