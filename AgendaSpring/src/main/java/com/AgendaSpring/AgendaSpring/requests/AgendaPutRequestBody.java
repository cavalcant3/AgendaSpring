package com.AgendaSpring.AgendaSpring.requests;

import lombok.Data;

@Data
public class AgendaPutRequestBody {
    private long id;
    private String name;
    private int numero;
}
