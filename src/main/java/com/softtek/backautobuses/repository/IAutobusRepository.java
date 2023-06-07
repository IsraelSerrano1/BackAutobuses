package com.softtek.backautobuses.modelo.repository;

import com.softtek.backautobuses.modelo.Autobus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAutobusRepository extends JpaRepository<Autobus, Integer> {
}
