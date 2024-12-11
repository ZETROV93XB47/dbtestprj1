package com.example.dbtestprj.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Génère une clé primaire auto-incrémentée
    @Column(name = "userId")  // Spécifie le nom de la colonne dans la table de données
    private Long userId;

    @Column(name = "nom", unique = true)
    private String nom;

    @Column(name = "prenom", unique = true)
    private String prenom;

    @Column(name = "age", unique = true, nullable = true)
    private int age;

    @Column(name = "adresse", unique = true, nullable = true)
    private String adresse;

    @Column(name = "email", unique = true, nullable = true)
    private String email;

    @Column(name = "telephone", unique = true, nullable = true)
    private String telephone;
}