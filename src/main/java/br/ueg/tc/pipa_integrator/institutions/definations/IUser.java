package br.ueg.tc.pipa_integrator.institutions.definations;

import br.ueg.tc.pipa_integrator.institutions.KeyValue;

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
