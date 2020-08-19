package com.bread.web.chart;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity @Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "chart")
public class Chart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chart_id") private Long chartId;
    @Column(name = "visitor", nullable = false) private String visitor;
    @Column(name = "sales", nullable = false) private String sales;

    @Builder
    public Chart(String visitor,String sales) {
        this.visitor = visitor;
        this.sales = sales;
    }

}
