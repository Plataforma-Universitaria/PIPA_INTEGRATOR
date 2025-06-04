package br.ueg.tc.pipa_integrator.serviceprovider.service;

import java.util.List;

public interface IServiceProvider {
    List<String> getValidPersonas();
    Boolean isValidPersona(String persona);
    Boolean manipulatesData();
}
