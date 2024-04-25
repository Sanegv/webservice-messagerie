package com.ynov.messagerie.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Command {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true)
    private long number;
    private Date date;

    @OneToOne
    private Bill bill;

    @OneToMany
    List<Article> articles = new ArrayList<>();

    @OneToOne
    Conversation conversation;

    @ManyToOne
    private Buyer buyer;
}
