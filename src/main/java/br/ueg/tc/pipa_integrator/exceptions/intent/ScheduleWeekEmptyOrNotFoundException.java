package br.ueg.tc.pipa_integrator.exceptions.intent;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_SCHEDULE_EMPTY_OR_NOT_FOUND;

public class ScheduleWeekEmptyOrNotFoundException extends BusinessException {

    public ScheduleWeekEmptyOrNotFoundException() {
        super(ERROR_SCHEDULE_EMPTY_OR_NOT_FOUND);
    }

    public ScheduleWeekEmptyOrNotFoundException(Object... parameters){
        super(ERROR_SCHEDULE_EMPTY_OR_NOT_FOUND, parameters);
    }

    public ScheduleWeekEmptyOrNotFoundException(String message) {
        super(message, ERROR_SCHEDULE_EMPTY_OR_NOT_FOUND.getCode());
    }
}