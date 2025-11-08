package br.ueg.tc.pipa_integrator.interfaces.platform;


import java.time.LocalDateTime;

public interface ITask {

    void setDate(LocalDateTime date);
    void setNote(String note);

}
