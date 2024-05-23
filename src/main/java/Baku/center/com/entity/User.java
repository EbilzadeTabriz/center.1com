package Baku.center.com.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(nullable = false)
    private String fullname;
    @Column(nullable = false,length = 15)
    private Long number;

    @Column(unique = true,updatable = false,nullable = false)
    private String email;
    @Column(unique = true,nullable = false,length = 15)
    private String password;

    @ManyToOne
    @JoinColumn(name = "roleId")
    private Roles role;

}
