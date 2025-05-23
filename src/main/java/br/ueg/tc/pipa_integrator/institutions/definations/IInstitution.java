package br.ueg.tc.pipa_integrator.institutions.definations;

import br.ueg.tc.pipa_integrator.enums.Persona;

import java.util.List;

public interface IInstitution {

   Long getId();
   String getShortName();
   String getLongName();
   List<Persona> getPersonas();
   IPreference getPreference();
}
