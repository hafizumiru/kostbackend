package com.kostapp.kostbackend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "penghuni")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Penghuni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_penghuni")
    private Integer idPenghuni;

    @Column(name = "nama_penghuni")
    private String namaPenghuni;

    @Column(name = "nik_penghuni", unique = true)
    private String nikPenghuni;

    @Column(name = "no_hp_penghuni")
    private String noHpPenghuni;
}
