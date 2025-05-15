package br.ueg.tc.pipa_integrator.exceptions.param;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_PARAMETER_NOT_FOUND;

public class ParamNotFoundException extends BusinessException {


    public ParamNotFoundException(Object... parameters) {
        super(ERROR_PARAMETER_NOT_FOUND, parameters);
    }

    public ParamNotFoundException() {
        super(ERROR_PARAMETER_NOT_FOUND);
    }

    public ParamNotFoundException(String message) {
        super(message, ERROR_PARAMETER_NOT_FOUND.getCode());
    }
}
