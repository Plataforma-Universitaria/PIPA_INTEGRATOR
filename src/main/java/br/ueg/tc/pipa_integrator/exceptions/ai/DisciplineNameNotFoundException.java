package br.ueg.tc.pipa_integrator.exceptions.ai;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_DISCIPLINE_NAME_NOT_FOUND;

public class DisciplineNameNotFoundException extends BusinessException {


    public DisciplineNameNotFoundException(Object... parameters) {
        super(ERROR_DISCIPLINE_NAME_NOT_FOUND, parameters);
    }

    public DisciplineNameNotFoundException() {
        super(ERROR_DISCIPLINE_NAME_NOT_FOUND);
    }

    public DisciplineNameNotFoundException(String message) {
        super(message, ERROR_DISCIPLINE_NAME_NOT_FOUND.getCode());
    }
}
