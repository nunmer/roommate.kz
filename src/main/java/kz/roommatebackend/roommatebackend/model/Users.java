package kz.roommatebackend.roommatebackend.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.mail.iap.ByteArray;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.management.relation.Role;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "users")
public class Users {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_surname")
    private String surname;

    @Column(name = "user_birth_day")
    private LocalDateTime userBirthDay;

    @Column(name = "user_gender")
    private String gender;

    @Column(name ="user_phone_number")
    private Integer userPhoneNumber;

    @Column(name = "user_email",unique = true)
    private String email;

    @Column(name = "user_password",nullable = false)
    private String password;

    @Lob
    @Column(name="user_avatar", nullable = true, length = 64)
    private String images;

    @Column(name = "user_likes_count")
    private Long userLikesCount;

    @Column(name = "user_home_status")
    private Boolean userHomeStatus;

    @Column(name = "user_status")
    private Boolean userStatus;

    @Column(name = "user_city")
    private String userCity;

    @CreatedDate
    @Column(name = "creared_at",nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "user_summa")
    private Long userSum;

    @Column(name = "user_role")
    private Integer userRole;

    public Users(String email,String password,LocalDateTime createdAt){
        this.email=email;
        this.password=password;
        this.createdAt=createdAt;
    }
}
