package com.gerenciamentodeponto.controle.enums;

public enum State {

    MG("Minas Gerais"),
    SP("São Paulo");

    private String description;

    private State(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
