package com.softtek.backautobuses.service;

import com.softtek.backautobuses.modelo.Visita;
import com.softtek.backautobuses.repository.IVisitaRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@NoArgsConstructor
@AllArgsConstructor
@Data
public class VisitaService implements IVisitaService{
    @Autowired
    private IVisitaRepository repo;
    @Override
    public List<Visita> listarVisita() {
        return null;
    }
}
