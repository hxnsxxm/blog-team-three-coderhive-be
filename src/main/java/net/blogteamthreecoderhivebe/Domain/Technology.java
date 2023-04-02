package net.blogteamthreecoderhivebe.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name="technology",
       schema="test_coder_hive",
       uniqueConstraints={@UniqueConstraint(columnNames="technology_id")})
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="technology_id", unique = true, nullable=false)
    private Long technologyId;


}
