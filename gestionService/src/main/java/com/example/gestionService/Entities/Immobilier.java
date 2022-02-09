package com.example.gestionService.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(schema = "immobilier")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Immobilier {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String addressOwner;
    private double price;
    private double surface;
    private String Ville;
    private String image;
    private String titer;
    private boolean isAnnounced;
    private boolean isProved;
    @OneToMany(mappedBy = "immobilier", fetch = FetchType.LAZY)

    private Collection<Transaction> transactions;

    @JsonIgnore
    public Collection<Transaction> getTransactions() {
        return transactions;
    }
}
