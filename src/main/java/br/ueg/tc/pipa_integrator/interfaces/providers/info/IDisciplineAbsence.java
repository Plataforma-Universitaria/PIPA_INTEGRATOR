package br.ueg.tc.pipa_integrator.interfaces.providers.info;

public interface IDisciplineAbsence extends IDiscipline{

    String getSemesterActive();
    Long getTotalAbsence();
    Long getTotalExcusedAbsences();
    String getPercentPresence();
}
