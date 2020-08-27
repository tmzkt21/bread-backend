package com.bread.web.shipping;

import com.bread.web.order.BreadOrder;
import lombok.*;

import javax.persistence.*;
@Entity @Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "shipping")
public class Shipping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipping_id") private Long shippingId;
    @Column(name = "shipping_date", nullable = false) private String shippingDate;
    @Column(name = "shipping_name", nullable = false) private String shippingName;
    @Column(name = "shipping_status", nullable = false) private String shippingStatus;
    @Column(name = "shipping_bread_name", nullable = false) private String shippingBreadName;

    @Builder
    public Shipping(String shippingDate,String shippingName,String shippingStatus,String shippingBreadName) {
        this.shippingDate =shippingDate;
        this.shippingName = shippingName;
        this.shippingStatus = shippingStatus;
        this.shippingBreadName = shippingBreadName;
    }

    @OneToOne
    @JoinColumn(name = "order_id")
    private BreadOrder breadOrder;
}
