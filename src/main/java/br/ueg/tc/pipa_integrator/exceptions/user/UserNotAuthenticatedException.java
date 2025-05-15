package br.ueg.tc.pipa_integrator.exceptions.user;

import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_USER_NOT_AUTHENTICATED;

public class UserNotAuthenticatedException extends BusinessException {

    public UserNotAuthenticatedException(Object... parameters) {
        super(ERROR_USER_NOT_AUTHENTICATED, parameters);
    }

    public UserNotAuthenticatedException() {
        super(ERROR_USER_NOT_AUTHENTICATED);
    }

    public UserNotAuthenticatedException(String message) {
        super(message, ERROR_USER_NOT_AUTHENTICATED.getCode());
    }
}
