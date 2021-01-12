package com.itdel.pulsa.service.sipintar.controller;

import com.itdel.pulsa.service.sipintar.exception.ResourceNotFoundException;
import com.itdel.pulsa.service.sipintar.model.PulsaModel;
import com.itdel.pulsa.service.sipintar.repository.PulsaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/pulsa")
public class PulsaController {
    @Autowired
    private PulsaRepository pulsaRepository;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public PulsaModel addPulsa(@RequestBody PulsaModel pulsaModel){

        return pulsaRepository.save(pulsaModel);
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public List<PulsaModel> getAllPulsa(){
        return pulsaRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public PulsaModel getOnePulsa(@PathVariable String id){
        return pulsaRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }

    @PutMapping(value = "/{id}")
    public PulsaModel updateOnePulsa(@PathVariable String id, @RequestBody PulsaModel updatePulsa){
        PulsaModel pulsaModel = pulsaRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
        pulsaModel.setPriceIdr(updatePulsa.getPriceIdr());
        return pulsaRepository.save(pulsaModel);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void deleteOnePulsa(@PathVariable String id){
        PulsaModel pulsaModel = pulsaRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
        pulsaRepository.delete(pulsaModel);
    }
}
