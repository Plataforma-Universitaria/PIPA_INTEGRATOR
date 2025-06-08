package br.ueg.tc.pipa_integrator.exceptions.serviceProvider;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_MANDATORY_PARAMETER_NOT_FILLED;

public class MandatoryParameterNotFilled extends BusinessException {

    public MandatoryParameterNotFilled(Object... parameters) {
        super(ERROR_MANDATORY_PARAMETER_NOT_FILLED, parameters);
    }

    public MandatoryParameterNotFilled() {
        super(ERROR_MANDATORY_PARAMETER_NOT_FILLED);
    }

    public MandatoryParameterNotFilled(String message) {
        super(message, ERROR_MANDATORY_PARAMETER_NOT_FILLED.getCode());
    }
}
