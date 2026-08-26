package br.ueg.tc.pipa_integrator.exceptions.user;

import br.ueg.tc.pipa_integrator.exceptions.provider.ProviderException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_SESSION_EXPIRES;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureCategory.AUTHENTICATION;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureStage.USER_RESOLUTION;

public class UserNotFoundException extends ProviderException {

    private static final String ERROR_CODE = "PROVIDER_USER_NOT_FOUND";

    public UserNotFoundException() {
        super(ERROR_CODE, AUTHENTICATION, USER_RESOLUTION, false,
                ERROR_SESSION_EXPIRES);
    }

    public UserNotFoundException(Object... parameters){
        super(ERROR_CODE, AUTHENTICATION, USER_RESOLUTION, false,
                ERROR_SESSION_EXPIRES, parameters);
    }

    public UserNotFoundException(String message) {
        super(ERROR_CODE, AUTHENTICATION, USER_RESOLUTION, false,
                message, ERROR_SESSION_EXPIRES);
    }
}
