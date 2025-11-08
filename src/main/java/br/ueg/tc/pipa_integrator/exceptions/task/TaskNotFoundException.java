package br.ueg.tc.pipa_integrator.exceptions.task;

import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_SESSION_EXPIRES;

public class TaskNotFoundException extends BusinessException {

    public TaskNotFoundException() {
        super(ERROR_SESSION_EXPIRES);
    }

    public TaskNotFoundException(Object... parameters){
        super(ERROR_SESSION_EXPIRES, parameters);
    }

    public TaskNotFoundException(String message) {
        super(message,ERROR_SESSION_EXPIRES.getCode());
    }
}
