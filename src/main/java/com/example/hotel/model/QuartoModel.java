package com.example.hotel.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "tb_quartos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuartoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "quarto")
    private List<ReservaModel> reservas;

    @Column(name = "tipo")
    private String tipo;  //Todo:Fazer enum

    @Column(name = "preco")
    private BigDecimal preco;

    @Column(name = "status")
    private String status; //Todo:Fazer enum

}
