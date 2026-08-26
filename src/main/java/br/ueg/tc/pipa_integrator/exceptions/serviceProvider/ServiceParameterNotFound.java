package br.ueg.tc.pipa_integrator.exceptions.serviceProvider;


import br.ueg.tc.pipa_integrator.exceptions.provider.ProviderException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_SERVICE_PARAMETER_NOT_FOUND;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureCategory.VALIDATION;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureStage.ARGUMENT_BINDING;

public class ServiceParameterNotFound extends ProviderException {

    private static final String ERROR_CODE = "SERVICE_PARAMETER_NOT_FOUND";

    public ServiceParameterNotFound(Object... parameters) {
        super(ERROR_CODE, VALIDATION, ARGUMENT_BINDING, false,
                ERROR_SERVICE_PARAMETER_NOT_FOUND, parameters);
    }

    public ServiceParameterNotFound() {
        super(ERROR_CODE, VALIDATION, ARGUMENT_BINDING, false,
                ERROR_SERVICE_PARAMETER_NOT_FOUND);
    }

    public ServiceParameterNotFound(String message) {
        super(ERROR_CODE, VALIDATION, ARGUMENT_BINDING, false,
                message, ERROR_SERVICE_PARAMETER_NOT_FOUND);
    }
}
