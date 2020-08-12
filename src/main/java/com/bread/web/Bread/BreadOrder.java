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
public class BreadOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id") private Long orderId;
    @Column(name = "order_date", nullable = false) private String orderDate;
    @Column(name = "amount", nullable = false) private String amount;
    @Column(name = "order_status", nullable = false) private String orderStatus;
    @Column(name = "order_method", nullable = false) private String orderMethod;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private BreadUser breadUser;

    @ManyToOne
    @JoinColumn(name = "bread_id")
    private Bread bread;

    @OneToOne
    @JoinColumn(name = "shipping_id")
    private BreadShipping breadShipping;
}
