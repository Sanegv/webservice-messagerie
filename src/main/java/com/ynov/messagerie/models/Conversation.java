package com.ynov.messagerie.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "conversation")
    private List<Message> messages = new ArrayList<>();

    @OneToOne
    Command command;

    @ManyToOne
    private Buyer buyer;

    @ManyToOne
    private Seller seller;

}
