package com.cfs.bms.model_entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="theatres")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String address;

    private String city;

    private int totalscreen;

    @OneToMany(mappedBy = "theatre",cascade = CascadeType.ALL)
    private List<Screen> screens;





}
