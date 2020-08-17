package com.bread.web.registration;
import lombok.*;
import javax.persistence.*;


@Entity @Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "registration")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "registration_id") private Long registrationId;
    @Column(name = "registration_name", nullable = false) private String registrationName;
    @Column(name = "registration_image", nullable = false) private String registrationImage;
    @Column(name = "registration_price", nullable = false) private String registrationPrice;
    @Column(name = "registration_description", nullable = false) private String registrationDescription;

}
