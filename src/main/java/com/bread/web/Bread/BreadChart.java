package com.bread.web.Bread;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
@Entity @Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "bread_chart")
public class BreadChart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chart_id") private Long chartId;
    @Column(name = "visitor", nullable = false) private String visitor;
    @Column(name = "sales", nullable = false) private String sales;
}
