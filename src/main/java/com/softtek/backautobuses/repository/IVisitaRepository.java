package com.softtek.backautobuses.repository;

import com.softtek.backautobuses.modelo.Autobus;
import com.softtek.backautobuses.modelo.Visita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IVisitaRepository extends JpaRepository<Visita, Integer> {
    List<Visita> findAllByMatricula();
}
