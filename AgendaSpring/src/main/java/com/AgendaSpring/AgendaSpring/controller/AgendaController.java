package com.AgendaSpring.AgendaSpring.controller;

import com.AgendaSpring.AgendaSpring.domain.Agenda;
import com.AgendaSpring.AgendaSpring.requests.AgendaPostRequestBody;
import com.AgendaSpring.AgendaSpring.service.AgendaService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("agenda")
@RequiredArgsConstructor
public class AgendaController {
    private final AgendaService agendaService;
    @GetMapping
    public List<Agenda> listAll(){
        return agendaService.listAll();
    }

    @PostMapping
    public ResponseEntity<Agenda> save(@RequestBody AgendaPostRequestBody agendaPostRequestBody){
        return new ResponseEntity<>(agendaService.save(agendaPostRequestBody), HttpStatus.CREATED);
    }
}
