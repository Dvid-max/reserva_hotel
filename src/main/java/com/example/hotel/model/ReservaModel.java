package com.example.hotel.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_reserva")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // Muitas reservas podem pertencer a UM mesmo hóspede
    @ManyToOne
    @JoinColumn(name = "hospede_id", nullable = false)
    private HospedeModel hospede;

    // Muitas reservas podem ser feitas para UM mesmo quarto
    @ManyToOne
    @JoinColumn(name = "quarto_id", nullable = false)
    private QuartoModel quarto;

    //Uma reserva tem um pagamento
    @OneToOne(mappedBy = "reserva", cascade = CascadeType.ALL)
    private PagamentoModel pagamentoModel;


    @Column(name = "check_in")
    private LocalDateTime checkIn;

    @Column(name = "check_out")
    private LocalDate checkOut;

    @Column(name = "status_reserva")
    private String statusDaReserva; //Todo:Fazer enum
}
