package com.salesianostriana.dam.ejercicioEvaluacion.Repository;

import com.salesianostriana.dam.ejercicioEvaluacion.Model.Museos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuseoRepository extends JpaRepository<Museos,Long> {
}
