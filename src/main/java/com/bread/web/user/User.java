package com.bread.web.user;

import com.bread.web.order.BreadOrder;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Component
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_no") private Long userNo;
    @Column(name = "user_id", nullable = false) private String userId;
    @Column(name = "password", nullable = false) private String password;
    @Column(name = "name", nullable = false) private String name;
    @Column(name = "phone", nullable = false) private String phone;
    @Column(name = "email", nullable = false) private String email;
    @Column(name = "visitor", nullable = false) private String visitor;
    @Column(name = "sales", nullable = false) private String sales;

    @Builder
    public User(String userId, String password, String name, String phone, String email,String visitor,String sales){
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.visitor = visitor;
        this.sales = sales;
    }

    @OneToMany(mappedBy = "user")
    private List<BreadOrder> breadOrders = new ArrayList<BreadOrder>();

    @OneToMany(mappedBy = "user")
    private List<BreadOrder> breadOrder = new ArrayList<BreadOrder>();
}
