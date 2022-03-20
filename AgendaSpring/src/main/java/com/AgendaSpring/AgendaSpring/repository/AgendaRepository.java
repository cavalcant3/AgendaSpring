package com.AgendaSpring.AgendaSpring.repository;

import com.AgendaSpring.AgendaSpring.domain.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
}
