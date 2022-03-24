package com.AgendaSpring.AgendaSpring.mapper;

import com.AgendaSpring.AgendaSpring.domain.Agenda;
import com.AgendaSpring.AgendaSpring.requests.AgendaPostRequestBody;
import com.AgendaSpring.AgendaSpring.requests.AgendaPutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AgendaMapper {

    public static final AgendaMapper INSTANCE = Mappers.getMapper(AgendaMapper.class);

    public abstract Agenda toAgenda(AgendaPostRequestBody agendaPostRequestBody);

    public abstract Agenda toAgenda(AgendaPutRequestBody agendaPutRequestBody);


}
