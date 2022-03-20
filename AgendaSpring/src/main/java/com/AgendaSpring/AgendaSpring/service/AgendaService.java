package com.AgendaSpring.AgendaSpring.service;

import com.AgendaSpring.AgendaSpring.domain.Agenda;
import com.AgendaSpring.AgendaSpring.repository.AgendaRepository;
import com.AgendaSpring.AgendaSpring.requests.AgendaPostRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgendaService {
    private final AgendaRepository agendaRepository;

    public List<Agenda> listAll() {
        return agendaRepository.findAll();
    }

    public Agenda save(AgendaPostRequestBody agendaPostRequestBody) {
    return agendaRepository.save(Agenda.builder().nome(agendaPostRequestBody.getName()).build());
    }
}
