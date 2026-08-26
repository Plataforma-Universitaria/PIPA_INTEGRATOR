package br.ueg.tc.pipa_integrator.exceptions.institution;


import br.ueg.tc.pipa_integrator.exceptions.provider.ProviderException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_COULD_NOT_EXECUTE_SERVICE;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureCategory.INTERNAL;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureStage.TOOL_INVOCATION;

public class InstitutionServiceException extends ProviderException {

    private static final String ERROR_CODE = "INSTITUTION_SERVICE_ERROR";

    public InstitutionServiceException(Object... parameters) {
        super(ERROR_CODE, INTERNAL, TOOL_INVOCATION, false,
                ERROR_COULD_NOT_EXECUTE_SERVICE, parameters);
    }

    public InstitutionServiceException() {
        super(ERROR_CODE, INTERNAL, TOOL_INVOCATION, false,
                ERROR_COULD_NOT_EXECUTE_SERVICE);
    }

    public InstitutionServiceException(String message) {
        super(ERROR_CODE, INTERNAL, TOOL_INVOCATION, false,
                message, ERROR_COULD_NOT_EXECUTE_SERVICE);
    }

    public InstitutionServiceException(String message, Throwable cause) {
        super(ERROR_CODE, INTERNAL, TOOL_INVOCATION, false,
                message, ERROR_COULD_NOT_EXECUTE_SERVICE, cause);
    }
}
