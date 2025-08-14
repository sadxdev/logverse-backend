package com.bashverse.logverse.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "log_entries")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String message;

    @Column(nullable = false)
    private String level;

    @Column(nullable = false)
    private Long timestamp;
}
