package br.ueg.tc.pipa_integrator.exceptions.intent;


import br.ueg.tc.pipa_integrator.exceptions.provider.ProviderException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_SCHEDULE_EMPTY_OR_NOT_FOUND;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureCategory.BUSINESS_RULE;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureStage.TOOL_INVOCATION;

public class ScheduleWeekEmptyOrNotFoundException extends ProviderException {

    private static final String ERROR_CODE = "SCHEDULE_NOT_FOUND";

    public ScheduleWeekEmptyOrNotFoundException() {
        super(ERROR_CODE, BUSINESS_RULE, TOOL_INVOCATION, false,
                ERROR_SCHEDULE_EMPTY_OR_NOT_FOUND);
    }

    public ScheduleWeekEmptyOrNotFoundException(Object... parameters){
        super(ERROR_CODE, BUSINESS_RULE, TOOL_INVOCATION, false,
                ERROR_SCHEDULE_EMPTY_OR_NOT_FOUND, parameters);
    }

    public ScheduleWeekEmptyOrNotFoundException(String message) {
        super(ERROR_CODE, BUSINESS_RULE, TOOL_INVOCATION, false,
                message, ERROR_SCHEDULE_EMPTY_OR_NOT_FOUND);
    }
}
