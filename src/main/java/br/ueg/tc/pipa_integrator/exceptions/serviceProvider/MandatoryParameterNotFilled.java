package br.ueg.tc.pipa_integrator.exceptions.serviceProvider;


import br.ueg.tc.pipa_integrator.exceptions.provider.ProviderException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_MANDATORY_PARAMETER_NOT_FILLED;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureCategory.VALIDATION;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureStage.ARGUMENT_BINDING;

public class MandatoryParameterNotFilled extends ProviderException {

    private static final String ERROR_CODE = "MANDATORY_PARAMETER_NOT_FILLED";

    public MandatoryParameterNotFilled(Object... parameters) {
        super(ERROR_CODE, VALIDATION, ARGUMENT_BINDING, false,
                ERROR_MANDATORY_PARAMETER_NOT_FILLED, parameters);
    }

    public MandatoryParameterNotFilled() {
        super(ERROR_CODE, VALIDATION, ARGUMENT_BINDING, false,
                ERROR_MANDATORY_PARAMETER_NOT_FILLED);
    }

    public MandatoryParameterNotFilled(String message) {
        super(ERROR_CODE, VALIDATION, ARGUMENT_BINDING, false,
                message, ERROR_MANDATORY_PARAMETER_NOT_FILLED);
    }
}
