package br.ueg.tc.pipa_integrator.exceptions.task;

import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_SESSION_EXPIRES;

public class TaskException extends BusinessException {

    public TaskException() {
        super(ERROR_SESSION_EXPIRES);
    }

    public TaskException(Object... parameters){
        super(ERROR_SESSION_EXPIRES, parameters);
    }

    public TaskException(String message) {
        super(message,ERROR_SESSION_EXPIRES.getCode());
    }
}
