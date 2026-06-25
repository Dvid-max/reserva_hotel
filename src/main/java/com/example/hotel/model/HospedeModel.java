package com.example.hotel.model;

import jakarta.persistence.*;
import jdk.dynalink.linker.LinkerServices;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_quartos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospedeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "hospede", cascade = CascadeType.ALL)
    private List<ReservaModel> reservas;

    @Column(name = "nome_hospede")
    private String nomeDoHospede;

    @Column(name = "documento_hospede")
    private String documento;

    @Column(name = "email")
    private String email;

    @Column(name = "telefone")
    private String telefone;
}
