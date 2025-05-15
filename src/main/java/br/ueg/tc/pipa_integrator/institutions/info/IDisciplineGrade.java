package br.ueg.tc.pipa_integrator.institutions.info;

import java.util.List;

public interface IDisciplineGrade extends IDiscipline{

    Float getFinalMedia();
    String getSemester();
    List<IDetailedDisciplineGrade> getDetailedGrades();
}
