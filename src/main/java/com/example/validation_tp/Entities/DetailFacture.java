package com.example.validation_tp.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private long idDetailFacture;
    private int qte;
    private float prixTotal;
    private int pourcentageRemise ;
    private int montantRemise ;
    @ManyToOne
    private Facture facture;

    @ManyToOne()
    private Produit produit;



}
