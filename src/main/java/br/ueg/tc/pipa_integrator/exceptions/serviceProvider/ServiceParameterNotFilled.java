package br.ueg.tc.pipa_integrator.exceptions.serviceProvider;


import br.ueg.tc.pipa_integrator.exceptions.provider.ProviderException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_SERVICE_PARAMETER_NOT_FILLED;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureCategory.VALIDATION;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureStage.ARGUMENT_BINDING;

public class ServiceParameterNotFilled extends ProviderException {

    private static final String ERROR_CODE = "SERVICE_PARAMETER_NOT_FILLED";

    public ServiceParameterNotFilled(Object... parameters) {
        super(ERROR_CODE, VALIDATION, ARGUMENT_BINDING, false,
                ERROR_SERVICE_PARAMETER_NOT_FILLED, parameters);
    }

    public ServiceParameterNotFilled() {
        super(ERROR_CODE, VALIDATION, ARGUMENT_BINDING, false,
                ERROR_SERVICE_PARAMETER_NOT_FILLED);
    }

    public ServiceParameterNotFilled(String message) {
        super(ERROR_CODE, VALIDATION, ARGUMENT_BINDING, false,
                message, ERROR_SERVICE_PARAMETER_NOT_FILLED);
    }
}
