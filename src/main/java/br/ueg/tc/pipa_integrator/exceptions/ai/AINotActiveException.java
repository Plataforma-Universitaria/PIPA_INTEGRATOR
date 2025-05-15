package br.ueg.tc.pipa_integrator.exceptions.ai;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_NO_AI_ACTIVE;

public class AINotActiveException extends BusinessException {


    public AINotActiveException(Object... parameters) {
        super(ERROR_NO_AI_ACTIVE, parameters);
    }

    public AINotActiveException() {
        super(ERROR_NO_AI_ACTIVE);
    }

    public AINotActiveException(String message) {
        super(message, ERROR_NO_AI_ACTIVE.getCode());
    }
}
