package br.ueg.tc.pipa_integrator.institutions;

import br.ueg.tc.pipa_integrator.exceptions.institution.InstitutionComunicationException;
import br.ueg.tc.pipa_integrator.exceptions.intent.IntentNotSupportedException;
import br.ueg.tc.pipa_integrator.exceptions.user.UserNotAuthenticatedException;
import br.ueg.tc.pipa_integrator.institutions.info.IUserData;

import java.util.List;

public interface IBaseInstitutionProvider {

    List<KeyValue> authenticateUser(String username, String password) throws UserNotAuthenticatedException, InstitutionComunicationException;
    void setUserAccessData(List<KeyValue> accessData);
    List<KeyValue> refreshUserAccessData(List<KeyValue> accessData);
    IUserData getUserData() throws IntentNotSupportedException, InstitutionComunicationException;
    List<String> getAllServiceProvider();

}
