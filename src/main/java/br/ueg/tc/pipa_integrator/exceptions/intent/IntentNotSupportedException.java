package br.ueg.tc.pipa_integrator.exceptions.intent;


import br.ueg.tc.pipa_integrator.exceptions.provider.ProviderException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_INTENT_NOT_SUPPORTED;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureCategory.BUSINESS_RULE;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureStage.TOOL_INVOCATION;

public class IntentNotSupportedException extends ProviderException {

    private static final String ERROR_CODE = "INTENT_NOT_SUPPORTED";

    public IntentNotSupportedException(Object... parameters) {
        super(ERROR_CODE, BUSINESS_RULE, TOOL_INVOCATION, false,
                ERROR_INTENT_NOT_SUPPORTED, parameters);
    }

    public IntentNotSupportedException() {
        super(ERROR_CODE, BUSINESS_RULE, TOOL_INVOCATION, false,
                ERROR_INTENT_NOT_SUPPORTED);
    }

    public IntentNotSupportedException(String institutionMessage) {
        super(ERROR_CODE, BUSINESS_RULE, TOOL_INVOCATION, false,
                institutionMessage, ERROR_INTENT_NOT_SUPPORTED);
    }
}
