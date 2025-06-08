package br.ueg.tc.pipa_integrator.exceptions.serviceProvider;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_SERVICE_PARAMETER_NOT_FILLED;

public class ServiceParameterNotFilled extends BusinessException {

    public ServiceParameterNotFilled(Object... parameters) {
        super(ERROR_SERVICE_PARAMETER_NOT_FILLED, parameters);
    }

    public ServiceParameterNotFilled() {
        super(ERROR_SERVICE_PARAMETER_NOT_FILLED);
    }

    public ServiceParameterNotFilled(String message) {
        super(message, ERROR_SERVICE_PARAMETER_NOT_FILLED.getCode());
    }
}
