package br.ueg.tc.pipa_integrator.institutions;
import br.ueg.tc.pipa_integrator.enums.WeekDay;
import br.ueg.tc.pipa_integrator.exceptions.institution.InstitutionComunicationException;
import br.ueg.tc.pipa_integrator.exceptions.intent.IntentNotSupportedException;
import br.ueg.tc.pipa_integrator.exceptions.user.UserNotAuthenticatedException;
import br.ueg.tc.pipa_integrator.institutions.info.*;
import br.ueg.tc.pipa_integrator.serviceprovider.service.IServiceProvider;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IBaseInstitutionProvider {

    List<KeyValue> authenticateUser(String username, String password) throws UserNotAuthenticatedException, InstitutionComunicationException;
    void setUserAccessData(List<KeyValue> accessData);
    List<KeyValue> refreshUserAccessData(List<KeyValue> accessData);
    List<IDisciplineSchedule> getScheduleByWeekDay(WeekDay weekDay) throws IntentNotSupportedException;
    //Não vai ser implementado na UEG, apenas tratamento de exception
    Integer getAbsenceByDisciplineAndDate(String disciplineName, LocalDate date) throws IntentNotSupportedException;
    List<IDisciplineSchedule> getWeekSchedule() throws IntentNotSupportedException;
    List<IDisciplineSchedule> getScheduleByDisciplineName(String disciplineToGetSchedule) throws IntentNotSupportedException;
    List<IDisciplineGrade> getGrades() throws IntentNotSupportedException, InstitutionComunicationException;
    List<IDisciplineGrade> getGradesBySemester(String semester) throws IntentNotSupportedException, InstitutionComunicationException;
    IAcademicData getAcademicData() throws IntentNotSupportedException, InstitutionComunicationException;
    List<IDisciplineAbsence> getActiveDisciplinesWithAbsences() throws IntentNotSupportedException, InstitutionComunicationException;
    IUserData getUserData() throws IntentNotSupportedException, InstitutionComunicationException;
    Set<Class<? extends IServiceProvider>> getAllServiceProvider();


}
