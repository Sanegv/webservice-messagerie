package com.ynov.messagerie.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@DiscriminatorValue("buyer")
public class Buyer extends User{
    @OneToMany(mappedBy = "buyer")
    private List<Command> commands = new ArrayList<>();
}
