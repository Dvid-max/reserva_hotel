package com.example.hotel.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.data.repository.cdi.Eager;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_pagamento")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // Um pagamento esta vinculado a uma reserva
    @OneToOne
    @JoinColumn(name = "reserva_id", nullable = false)
    private ReservaModel reserva;

    @Column(name = "metodo_pagamento")
    private BigDecimal valorPago;

    @Column
    private String metodo; //Todo:Fazer enum

    @Column
    private String status; //Todo:Fazer enum
}
