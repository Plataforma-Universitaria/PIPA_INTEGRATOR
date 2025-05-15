package br.ueg.tc.pipa_integrator.institutions.info;

public interface IDisciplineAbsence extends IDiscipline{

    String getSemesterActive();
    Long getTotalAbsence();
    Long getTotalExcusedAbsences();
}
