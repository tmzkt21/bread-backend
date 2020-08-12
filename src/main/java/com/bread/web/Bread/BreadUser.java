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
public class BreadUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id") private Long userId;
    @Column(name = "password", nullable = false) private String password;
    @Column(name = "name", nullable = false) private String name;
    @Column(name = "phone", nullable = false) private String phone;
    @Column(name = "email", nullable = false) private String email;

    @OneToMany(mappedBy = "breadUser")
    private List<BreadOrder> breadOrders = new ArrayList<BreadOrder>();

}
