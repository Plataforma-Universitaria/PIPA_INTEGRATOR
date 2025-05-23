package br.ueg.tc.pipa_integrator.serviceprovider.service;

import br.ueg.tc.pipa_integrator.exceptions.BusinessException;
import br.ueg.tc.pipa_integrator.institutions.info.IUserData;

import java.util.List;

public interface IServiceProvider {
    String doService( String activationPhrase, IUserData userData) throws BusinessException;
    List<String> getValidPersonas();
    Boolean isValidPersona(String persona);
    Boolean manipulatesData();
}
