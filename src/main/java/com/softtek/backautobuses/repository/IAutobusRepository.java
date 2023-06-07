package com.softtek.backautobuses.repository;

import com.softtek.backautobuses.modelo.Autobus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAutobusRepository extends JpaRepository<Autobus, Integer> {
    List<Autobus> findAll();
}
