package com.salesianostriana.dam.ejercicioEvaluacion.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Museos {


    @Id
    @GeneratedValue
    private Long id;

    private String nombreMuseo;
    private String ciudad;
    private LocalDate anioApertura;
    private int numSalas;
    private String descripcion;
    private String url;



}
