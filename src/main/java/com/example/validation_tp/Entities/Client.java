package com.example.validation_tp.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idclient ;
    private String nom;
    private String prenom;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)

    private CategorieClient categorieClient;
    @Enumerated(EnumType.STRING)

    private Profession profession;
@JsonIgnore
    @OneToMany(mappedBy = "client")
    private List<Facture>factures;





}
