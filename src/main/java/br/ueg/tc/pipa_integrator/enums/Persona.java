package br.ueg.tc.pipa_integrator.enums;

import lombok.Getter;

@Getter
public enum Persona {
    ADMINISTRATOR("Administrador"),
    STUDENT("Aluno"),
    PROFESSOR("Professor"),
    GUEST("Convidado");

    private final String description;

    Persona(String description) {
        this.description = description;
    }
}
