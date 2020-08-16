package com.bread.web.user;

import com.bread.web.Bread.BreadOrder;
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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_no") private Long userNo;
    @Column(name = "user_id") private String userId;
    @Column(name = "password", nullable = false) private String password;
    @Column(name = "name", nullable = false) private String name;
    @Column(name = "phone", nullable = false) private String phone;
    @Column(name = "email", nullable = false) private String email;

    @OneToMany(mappedBy = "breadUser")
    private List<BreadOrder> breadOrders = new ArrayList<BreadOrder>();

    @Builder
    public User(String userId, String password, String name, String phone, String email){
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.email = email;

    }

    public Long getUserNo() {
        return userNo;
    }

    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BreadOrder> getBreadOrders() {
        return breadOrders;
    }

    public void setBreadOrders(List<BreadOrder> breadOrders) {
        this.breadOrders = breadOrders;
    }
}
