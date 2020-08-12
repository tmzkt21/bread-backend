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
public class Bread {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bread_id") private Long breadId;
    @Column(name = "bread_name", nullable = false) private String breadName;
    @Column(name = "bread_photography", nullable = false) private String breadPhotography;
    @Column(name = "bread_price", nullable = false) private String breadPrice;
    @Column(name = "bread_number", nullable = false) private String breadNumberPrice;
    @Column(name = "bread_description", nullable = false) private String breadDescription;

    @OneToMany(mappedBy = "bread")
    private List<BreadOrder> breadOrders = new ArrayList<BreadOrder>();

    @ManyToOne
    @JoinColumn(name = "chart_id")
    private BreadCategory breadCategory;



}
