package com.gerenciamentodeponto.controle.enums;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;


public enum City {
    BET("Betim"),
    BH("Belo Horizonte");

    private String description;

    private City(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
