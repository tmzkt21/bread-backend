package com.bread.web.page;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
    // test 시도중인 테이블
}
