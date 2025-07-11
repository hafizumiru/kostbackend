package com.kostapp.kostbackend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "kamar")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Kamar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_kamar")
    private Integer idKamar;

    private String nama;

    @Column(unique = true)
    private String nik;

    private String noHp;
}
