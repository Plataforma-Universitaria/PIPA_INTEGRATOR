package br.ueg.tc.pipa_integrator.serviceprovider.service;

import br.ueg.tc.pipa_integrator.exceptions.BusinessException;
import br.ueg.tc.pipa_integrator.institutions.info.IUserData;

public interface IServiceProvider {
    String doService( String activationPhrase, IUserData userData) throws BusinessException;

}
