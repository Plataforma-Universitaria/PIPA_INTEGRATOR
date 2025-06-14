package br.ueg.tc.pipa_integrator.interfaces.providers;

import br.ueg.tc.pipa_integrator.exceptions.institution.InstitutionComunicationException;
import br.ueg.tc.pipa_integrator.exceptions.intent.IntentNotSupportedException;
import br.ueg.tc.pipa_integrator.exceptions.user.UserNotAuthenticatedException;
import br.ueg.tc.pipa_integrator.interfaces.providers.info.IUserData;

import java.util.List;

public interface IBaseInstitutionProvider {

    List<KeyValue> authenticateUser(String username, String password) throws UserNotAuthenticatedException, InstitutionComunicationException;
    List<KeyValue> refreshUserAccessData(List<KeyValue> accessData);
    IUserData getUserData() throws IntentNotSupportedException, InstitutionComunicationException;
    List<String> getPersonas();
    String getInstitutionName();
    String getSalutationPhrase();
    String getPasswordFieldName();
    String getUsernameFieldName();
}
