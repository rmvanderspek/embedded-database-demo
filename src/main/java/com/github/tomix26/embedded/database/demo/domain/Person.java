package com.github.tomix26.embedded.database.demo.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(schema = "test", name = "person")
public class Person {

    @Id
    private UUID id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", name = "id")
    private Transportation transportation;

    public Transportation getTransportation() {
        return transportation;
    }

    public void setTransportation(Transportation transportation) {
        this.transportation = transportation;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
