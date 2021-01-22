package com.github.tomix26.embedded.database.demo.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public abstract class Transportation {
    @Id
    protected UUID id;
}
