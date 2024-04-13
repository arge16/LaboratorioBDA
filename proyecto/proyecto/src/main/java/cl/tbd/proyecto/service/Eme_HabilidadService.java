package cl.tbd.proyecto.service;

import cl.tbd.proyecto.entities.Eme_HabilidadEntity;
import cl.tbd.proyecto.entities.EmergenciaEntity;
import cl.tbd.proyecto.entities.Eme_HabilidadEntity;
import cl.tbd.proyecto.repositories.Eme_HabilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class Eme_HabilidadService {
    @Autowired
    Eme_HabilidadRepository emeHabilidadRepository;

    public List<Eme_HabilidadEntity> getAllEmeHabilidades(){
        return emeHabilidadRepository.findAll();
    }

    public List<Eme_HabilidadEntity> getPageEmeHabilidades(int size, int page){
        return emeHabilidadRepository.findAllPagination(size, page);
    }

    public Eme_HabilidadEntity createEmeHabilidad(Eme_HabilidadEntity voluntario) {
        return emeHabilidadRepository.create(voluntario);
    }

    public Boolean deleteEmeHabilidad(Long id){
        return emeHabilidadRepository.delete(id);
    }

}