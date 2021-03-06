package com.AgendaSpring.AgendaSpring.service;

import com.AgendaSpring.AgendaSpring.domain.Agenda;
import com.AgendaSpring.AgendaSpring.exeption.BadRequestExeption;
import com.AgendaSpring.AgendaSpring.mapper.AgendaMapper;
import com.AgendaSpring.AgendaSpring.repository.AgendaRepository;
import com.AgendaSpring.AgendaSpring.requests.AgendaPostRequestBody;
import com.AgendaSpring.AgendaSpring.requests.AgendaPutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgendaService {
    private final AgendaRepository agendaRepository;

    public List<Agenda> listAll() {
        return agendaRepository.findAll();
    }

    public Agenda findById(long id){
        return agendaRepository.findById(id)
                .orElseThrow(()-> new BadRequestExeption("Contato não encontrado"));
    }

    public Agenda save(AgendaPostRequestBody agendaPostRequestBody) {
//        note como chamamos os atributos
        return agendaRepository.save(AgendaMapper.INSTANCE.toAgenda(agendaPostRequestBody));
    }


    public void delete(long id) {
        agendaRepository.delete(findById(id));
    }

    public void replace(AgendaPutRequestBody agendaPutRequestBody){
        findById(agendaPutRequestBody.getId());
        Agenda agenda = AgendaMapper.INSTANCE.toAgenda(agendaPutRequestBody);
        agendaRepository.save(agenda);
    }
}
