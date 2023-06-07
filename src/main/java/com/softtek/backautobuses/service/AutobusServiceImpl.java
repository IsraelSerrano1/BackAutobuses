package com.softtek.backautobuses.service;

import com.softtek.backautobuses.modelo.Autobus;
import com.softtek.backautobuses.repository.IAutobusRepository;
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
public class AutobusServiceImpl implements IAutobusService{
    @Autowired
    IAutobusRepository repo;

    @Override
    public List<Autobus> listar() {
        return repo.findAll();
    }
}
