package com.bread.web.page;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "page")
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "page_id") private Long pageId;
    @Column(name = "name", nullable = false) private String name;
    @Column(name = "amount", nullable = false) private String amount;
    @Column(name = "buyer_name", nullable = false) private String buyerName;
    @Column(name = "buyer_tel", nullable = false) private String buyerTame;

    @Builder
    public Page(String name,String amount,String buyerName,String buyerTame) {
        this.name = name;
        this.amount = amount;
        this.buyerName = buyerName;
        this.buyerTame = buyerTame;
    }
}
