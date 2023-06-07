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
@Table(name = "conductores")
public class Conductor {
    @Id
    @Column(name = "dni", nullable = false)
    @ToString.Include
    private String dni;
    @Column(name = "nombre", nullable = false)
    @ToString.Include
    private String nombre;

}
