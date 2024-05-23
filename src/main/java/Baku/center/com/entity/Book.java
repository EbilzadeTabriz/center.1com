package Baku.center.com.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    private String bookName;
    private String bookType;
    @Column(columnDefinition = "Text")
    private String bookDescription;
    private String bookAuthor;
    @CreationTimestamp
    @Column(name = "publishYear")
    private LocalDate publishYear;
    @ManyToOne
    @JoinColumn(name = "shop_id",referencedColumnName = "shopId")
    private Shop shop;


}
