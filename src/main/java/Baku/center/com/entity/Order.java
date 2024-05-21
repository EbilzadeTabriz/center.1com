package Baku.center.com.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private String fullnameOfBuyer;
    private String orderName;
    private String cartType;
    @Column(unique = true,length = 16)
    private Character cardNumber;
    @Column(unique = true,length = 3)
    private Character securityCode;
    @Column(name = "expireDate")
    private LocalDateTime expireDate;

    @ManyToOne
    @JoinColumn(name = "shop_id",referencedColumnName = "shopId")
    private Shop shop;

}
