package br.ueg.tc.pipa_integrator.exceptions.param;


import br.ueg.tc.pipa_integrator.exceptions.provider.ProviderException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_PARAMETER_NOT_FOUND;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureCategory.VALIDATION;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureStage.ARGUMENT_BINDING;

public class ParamNotFoundException extends ProviderException {

    private static final String ERROR_CODE = "PARAMETER_NOT_FOUND";


    public ParamNotFoundException(Object... parameters) {
        super(ERROR_CODE, VALIDATION, ARGUMENT_BINDING, false,
                ERROR_PARAMETER_NOT_FOUND, parameters);
    }

    public ParamNotFoundException() {
        super(ERROR_CODE, VALIDATION, ARGUMENT_BINDING, false,
                ERROR_PARAMETER_NOT_FOUND);
    }

    public ParamNotFoundException(String message) {
        super(ERROR_CODE, VALIDATION, ARGUMENT_BINDING, false,
                message, ERROR_PARAMETER_NOT_FOUND);
    }
}
