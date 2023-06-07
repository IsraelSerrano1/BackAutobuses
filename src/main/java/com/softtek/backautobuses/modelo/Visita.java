package com.softtek.backautobuses.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "visitas")
public class Visita {
    @Id
    @Column(name = "id", nullable = false)
    @ToString.Include
    private Integer id;
    @Column(name = "f_visita", nullable = false)
    @ToString.Include
    private Date fVisita;
    @ManyToOne
    @JoinColumn(name = "autobus", referencedColumnName = "matricula")
    private Autobus matricula;
    @ManyToOne

    private Conductor dni;
    @ManyToOne

    private Lugar idLugar;

}
