package br.ueg.tc.pipa_integrator.exceptions.serviceProvider;


import br.ueg.tc.pipa_integrator.exceptions.provider.ProviderException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_PARAMETER_TYPE_NOT_SUPPORTED;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureCategory.VALIDATION;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureStage.ARGUMENT_BINDING;

public class ParameterTypeNotSupported extends ProviderException {

    private static final String ERROR_CODE = "PARAMETER_TYPE_NOT_SUPPORTED";

    public ParameterTypeNotSupported(Object... parameters) {
        super(ERROR_CODE, VALIDATION, ARGUMENT_BINDING, false,
                ERROR_PARAMETER_TYPE_NOT_SUPPORTED, parameters);
    }

    public ParameterTypeNotSupported() {
        super(ERROR_CODE, VALIDATION, ARGUMENT_BINDING, false,
                ERROR_PARAMETER_TYPE_NOT_SUPPORTED);
    }

    public ParameterTypeNotSupported(String message) {
        super(ERROR_CODE, VALIDATION, ARGUMENT_BINDING, false,
                message, ERROR_PARAMETER_TYPE_NOT_SUPPORTED);
    }
}
