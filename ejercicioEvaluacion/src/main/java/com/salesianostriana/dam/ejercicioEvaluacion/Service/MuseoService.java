package com.salesianostriana.dam.ejercicioEvaluacion.Service;

import com.salesianostriana.dam.ejercicioEvaluacion.Dto.MuseoResponseDto;
import com.salesianostriana.dam.ejercicioEvaluacion.Dto.MuseomRequestDto;
import com.salesianostriana.dam.ejercicioEvaluacion.Error.MuseomNotFoundException;
import com.salesianostriana.dam.ejercicioEvaluacion.Model.Museos;
import com.salesianostriana.dam.ejercicioEvaluacion.Repository.MuseoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MuseoService {

    private final MuseoRepository museoRepository;


    public List<Museos> findAll(){
       List<Museos> result = museoRepository.findAll();
        if (result.isEmpty())
            throw new MuseomNotFoundException();
        return result;
    }

    public Museos findById(Long id){
        return museoRepository.findById(id).orElseThrow(()-> new MuseomNotFoundException(id));
    }

    public void delete(Long id){
         museoRepository.deleteById(id);
    }

    public Museos save(Museos museos){
        return museoRepository.save(museos);
    }

    public Museos edit(Museos museos){
        return museoRepository.save(museos);
    }


}
