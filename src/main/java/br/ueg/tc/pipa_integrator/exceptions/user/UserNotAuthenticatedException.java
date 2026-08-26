package br.ueg.tc.pipa_integrator.exceptions.user;

import br.ueg.tc.pipa_integrator.exceptions.provider.ProviderException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_USER_NOT_AUTHENTICATED;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureCategory.AUTHENTICATION;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureStage.USER_RESOLUTION;

public class UserNotAuthenticatedException extends ProviderException {

    private static final String ERROR_CODE = "USER_NOT_AUTHENTICATED";

    public UserNotAuthenticatedException(Object... parameters) {
        super(ERROR_CODE, AUTHENTICATION, USER_RESOLUTION, false,
                ERROR_USER_NOT_AUTHENTICATED, parameters);
    }

    public UserNotAuthenticatedException() {
        super(ERROR_CODE, AUTHENTICATION, USER_RESOLUTION, false,
                ERROR_USER_NOT_AUTHENTICATED);
    }

    public UserNotAuthenticatedException(String message) {
        super(ERROR_CODE, AUTHENTICATION, USER_RESOLUTION, false,
                message, ERROR_USER_NOT_AUTHENTICATED);
    }
}
