package br.ueg.tc.pipa_integrator.exceptions.ai;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_AI_PROVIDER_NOT_FOUND;

public class AIPackageNotFoundException extends BusinessException {


    public AIPackageNotFoundException(Object... parameters) {
        super(ERROR_AI_PROVIDER_NOT_FOUND, parameters);
    }

    public AIPackageNotFoundException() {
        super(ERROR_AI_PROVIDER_NOT_FOUND);
    }

    public AIPackageNotFoundException(String message) {
        super(message, ERROR_AI_PROVIDER_NOT_FOUND.getCode());
    }
}
