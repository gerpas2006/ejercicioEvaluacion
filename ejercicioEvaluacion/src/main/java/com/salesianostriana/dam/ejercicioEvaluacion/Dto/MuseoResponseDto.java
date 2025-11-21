package com.salesianostriana.dam.ejercicioEvaluacion.Dto;

import java.time.LocalDate;

public record MuseoResponseDto(
        Long id,
        String nombreMuseo,
        String ciudad,
        LocalDate anioApertura,
        int numSalas,
        String descripcion,
        String url
) {
}
