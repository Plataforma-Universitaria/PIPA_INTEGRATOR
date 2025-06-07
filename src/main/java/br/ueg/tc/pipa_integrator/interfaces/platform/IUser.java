package br.ueg.tc.pipa_integrator.interfaces.platform;

import br.ueg.tc.pipa_integrator.interfaces.providers.KeyValue;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface IUser {

    Long getId();
    UUID getExternalKey();
    Set<? extends IAccessData> getAccessData();
    void setAccessData(Set<? extends IAccessData> accessData);
    IInstitution getEducationalInstitution();
    List<KeyValue> getKeyValueList();
    List<String> getPersonas();

}
