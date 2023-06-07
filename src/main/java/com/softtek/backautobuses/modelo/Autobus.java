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
@Table(name = "autobuses")
public class Autobus {
    @Id
    @Column(name = "matricula", nullable = false)
    @ToString.Include
    private String matricula;
    @Column(name = "a_fabricacion", nullable = false)
    @ToString.Include
    private Integer aFabricacion;
    @ToString.Exclude
    @OneToMany(mappedBy = "matricula", cascade = CascadeType.ALL)
    private List<Visita> visitas;
}
