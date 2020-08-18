package com.bread.web.order;
import com.bread.web.bread.Bread;
import com.bread.web.shipping.Shipping;
import com.bread.web.user.User;
import lombok.*;

import javax.persistence.*;

@Entity @Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "bread_order")
public class BreadOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id") private Long orderId;
    @Column(name = "order_date", nullable = false) private String orderDate;
    @Column(name = "order_amount", nullable = false) private String orderAmount;
    @Column(name = "order_status", nullable = false) private String orderStatus;
    @Column(name = "order_method", nullable = false) private String orderMethod;

    @Builder
    public BreadOrder(String orderDate,String orderAmount,String orderStatus,String orderMethod) {
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.orderStatus = orderStatus;
        this.orderMethod = orderMethod;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "bread_id")
    private Bread bread;

    @OneToOne
    @JoinColumn(name = "shipping_id")
    private Shipping shipping;
}
