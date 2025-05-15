package br.ueg.tc.pipa_integrator.exceptions.serviceprovider;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_SERVICE_PARAMETER_NOT_FOUND;

public class ServiceParameterNotFound extends BusinessException {

    public ServiceParameterNotFound(Object... parameters) {
        super(ERROR_SERVICE_PARAMETER_NOT_FOUND, parameters);
    }

    public ServiceParameterNotFound() {
        super(ERROR_SERVICE_PARAMETER_NOT_FOUND);
    }

    public ServiceParameterNotFound(String message) {
        super(message, ERROR_SERVICE_PARAMETER_NOT_FOUND.getCode());
    }
}
