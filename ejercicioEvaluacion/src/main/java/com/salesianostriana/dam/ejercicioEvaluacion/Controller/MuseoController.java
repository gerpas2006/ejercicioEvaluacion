package com.salesianostriana.dam.ejercicioEvaluacion.Controller;


import com.salesianostriana.dam.ejercicioEvaluacion.Model.Museos;
import com.salesianostriana.dam.ejercicioEvaluacion.Service.MuseoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestControllerAdvice
@RequiredArgsConstructor
@Schema
@Tag(name = "Museo", description = "Controlador de las funciones del museo")
public class MuseoController {

    private final MuseoService museoService;

    @GetMapping
    public List<Museos> findAll(){
        return museoService.findAll();
    }

    @GetMapping("{id}")
    public Museos findById(Long id){
        return museoService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id){
        museoService.delete(id);
    }

    @PostMapping
    public Museos save(Museos museos){
        return museoService.save(museos);
    }

    @PutMapping
    public Museos edit(Museos museos){
        return museoService.edit(museos);
    }




}
