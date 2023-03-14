package net.blogteamthreecoderhivebe.Domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "user",
       schema = "test_coder_hive",
       uniqueConstraints = {@UniqueConstraint(columnNames = "user_id")})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true, nullable = false)
    private long userId;

    @Column(name = "user_name", unique = false, nullable = false)
    private String userName;

    @Column(name = "created_at", unique = false, nullable = true)
    private Date createdAt;
}
