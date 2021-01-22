package com.github.tomix26.embedded.database.demo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "test", name = "car")
@DiscriminatorValue("car")
public class Car extends Transportation {
    private Integer speed;

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
