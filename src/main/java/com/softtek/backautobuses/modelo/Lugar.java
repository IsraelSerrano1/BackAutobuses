package com.softtek.backautobuses.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "lugares")
public class Lugar {
    @Id
    @Column(name = "id_lugar", nullable = false)
    @ToString.Include
    private Integer idLugar;
    @Column(name = "nombre", nullable = false)
    @ToString.Include
    private String nombre;
}
