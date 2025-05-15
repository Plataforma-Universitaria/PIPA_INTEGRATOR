package br.ueg.tc.pipa_integrator.exceptions.institution;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_INSTITUTION_NOT_FOUND;

public class InstitutionNotFoundException extends BusinessException {

    public InstitutionNotFoundException(Object... parameters) {
        super(ERROR_INSTITUTION_NOT_FOUND, parameters);
    }

    public InstitutionNotFoundException() {
        super(ERROR_INSTITUTION_NOT_FOUND);
    }

    public InstitutionNotFoundException(String message) {
        super(message, ERROR_INSTITUTION_NOT_FOUND.getCode());
    }
}
