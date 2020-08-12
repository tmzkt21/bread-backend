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
public class BreadShipping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipping_id") private Long shippingId;
    @Column(name = "shipping_date", nullable = false) private String shippingDate;
    @Column(name = "shipping_name", nullable = false) private String shippingName;
    @Column(name = "shipping_status", nullable = false) private String shippingStatus;

    @OneToOne
    @JoinColumn(name = "order_id")
    private BreadOrder breadOrder;
}
