package br.ueg.tc.pipa_integrator.exceptions.intent;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_INTENT_NOT_SUPPORTED;

public class IntentNotSupportedException extends BusinessException {

    public IntentNotSupportedException(Object... parameters) {
        super(ERROR_INTENT_NOT_SUPPORTED, parameters);
    }

    public IntentNotSupportedException() {
        super(ERROR_INTENT_NOT_SUPPORTED);
    }

    public IntentNotSupportedException(String institutionMessage) {
        super(institutionMessage, ERROR_INTENT_NOT_SUPPORTED.getCode());
    }
}
