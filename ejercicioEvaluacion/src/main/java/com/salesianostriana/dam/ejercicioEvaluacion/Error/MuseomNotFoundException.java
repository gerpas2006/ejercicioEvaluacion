package com.salesianostriana.dam.ejercicioEvaluacion.Error;

public class MuseomNotFoundException extends RuntimeException {

    public MuseomNotFoundException(){
        super("No se ha encontradao registro de museos");
    }

    public MuseomNotFoundException(String message) {
        super(message);
    }


    public MuseomNotFoundException (Long id){
        super("No se ha encontrado el munumento con la id %d".formatted(id));
    }
}
