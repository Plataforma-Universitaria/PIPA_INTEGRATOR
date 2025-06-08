package br.ueg.tc.pipa_integrator.interfaces.providers.info;

import br.ueg.tc.pipa_integrator.interfaces.providers.KeyValue;

import java.util.List;

public interface IUserData {

    String getFirstName();
    String getPersonId();
    String getEmail();
    List<String> getPersonas();
    List<KeyValue> getKeyValueList();
}
