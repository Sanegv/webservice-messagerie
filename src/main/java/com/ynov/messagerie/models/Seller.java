package com.ynov.messagerie.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@DiscriminatorValue("seller")
public class Seller extends User{
    @OneToMany(mappedBy = "seller")
    List<Article> articles = new ArrayList<>();
}
