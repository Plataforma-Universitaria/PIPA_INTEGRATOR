package br.ueg.tc.pipa_integrator.exceptions.serviceProvider;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_PARAMETER_TYPE_NOT_SUPPORTED;

public class ParameterTypeNotSupported extends BusinessException {

    public ParameterTypeNotSupported(Object... parameters) {
        super(ERROR_PARAMETER_TYPE_NOT_SUPPORTED, parameters);
    }

    public ParameterTypeNotSupported() {
        super(ERROR_PARAMETER_TYPE_NOT_SUPPORTED);
    }

    public ParameterTypeNotSupported(String message) {
        super(message, ERROR_PARAMETER_TYPE_NOT_SUPPORTED.getCode());
    }
}
