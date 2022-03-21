package com.AgendaSpring.AgendaSpring.controller;

import com.AgendaSpring.AgendaSpring.domain.Agenda;
import com.AgendaSpring.AgendaSpring.requests.AgendaPostRequestBody;
import com.AgendaSpring.AgendaSpring.requests.AgendaPutRequestBody;
import com.AgendaSpring.AgendaSpring.service.AgendaService;
import lombok.RequiredArgsConstructor;
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
    public List<Agenda> listAll() {
        return agendaService.listAll();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Agenda> findById(@PathVariable long id) {
        return ResponseEntity.ok(agendaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Agenda> save(@RequestBody AgendaPostRequestBody agendaPostRequestBody) {
        return new ResponseEntity<>(agendaService.save(agendaPostRequestBody), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        agendaService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody AgendaPutRequestBody agendaPutRequestBody){
        agendaService.replace(agendaPutRequestBody);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
