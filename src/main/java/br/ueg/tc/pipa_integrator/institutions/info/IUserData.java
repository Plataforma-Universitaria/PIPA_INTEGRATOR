package br.ueg.tc.pipa_integrator.institutions.info;

import br.ueg.tc.pipa_integrator.institutions.KeyValue;

import java.util.List;

public interface IUserData {

    String getFirstName();
    String getPersonId();
    String getEmail();
    List<String> getPersonas();
    List<KeyValue> getKeyValueList();
}
