package com.bread.web.bread;
import com.bread.web.order.BreadOrder;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "bread")
public class Bread {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bread_id") private Long breadId;
    @Column(name = "bread_name", nullable = false) private String breadName;
    @Column(name = "bread_image", nullable = false) private String breadImage;
    @Column(name = "bread_price", nullable = false) private String breadPrice;
    @Column(name = "bread_description", nullable = false) private String breadDescription;
    @Column(name = "option", nullable = false) private String option;
    @Column(name = "allergy", nullable = false) private String allergy;

    @Builder
    public Bread(String breadName,String breadImage,String breadPrice,String breadDescription,String option,String allergy) {
        this.breadName = breadName;
        this.breadImage = breadImage;
        this.breadPrice = breadPrice;
        this.breadDescription = breadDescription;
        this.option = option;
        this.allergy = allergy;
    }

    @OneToMany(mappedBy = "bread")
    private List<BreadOrder> breadOrders = new ArrayList<BreadOrder>();


}
