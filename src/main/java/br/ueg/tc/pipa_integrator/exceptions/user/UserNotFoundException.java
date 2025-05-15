package br.ueg.tc.pipa_integrator.exceptions.user;

import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_SESSION_EXPIRES;

public class UserNotFoundException extends BusinessException {

    public UserNotFoundException() {
        super(ERROR_SESSION_EXPIRES);
    }

    public UserNotFoundException(Object... parameters){
        super(ERROR_SESSION_EXPIRES, parameters);
    }

    public UserNotFoundException(String message) {
        super(message,ERROR_SESSION_EXPIRES.getCode());
    }
}
