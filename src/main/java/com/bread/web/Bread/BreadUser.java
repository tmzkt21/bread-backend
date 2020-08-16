package com.bread.web.Bread;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "bread_user")
public class BreadUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_no") private Long userNo;
    @Column(name = "user_id") private String userId;
    @Column(name = "password", nullable = false) private String password;
    @Column(name = "name", nullable = false) private String name;
    @Column(name = "phone", nullable = false) private String phone;
    @Column(name = "email", nullable = false) private String email;
    @Column(name = "address", nullable = false) private String address;

    @OneToMany(mappedBy = "breadUser")
    private List<BreadOrder> breadOrders = new ArrayList<BreadOrder>();

    @Builder
    public BreadUser(String userId, String password, String name, String phone, String email){
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.email = email;

    }


}
