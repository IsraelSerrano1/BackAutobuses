package com.softtek.backautobuses.controller;

import com.softtek.backautobuses.modelo.Autobus;
import com.softtek.backautobuses.service.IAutobusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins= "http://localhost:4200")
@RestController
@RequestMapping("/autobuses")
public class AutobusController {

    @Autowired
    private IAutobusService servicio;

    @GetMapping
    public List<Autobus>listarAutobuses() {return servicio.listar();}
}
