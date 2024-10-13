package com.kamila.eda_jornada_dan.controller;


import com.kamila.eda_jornada_dan.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void criarEvento(@RequestBody String evento){
         eventService.criarEvento(evento);
    }


}
