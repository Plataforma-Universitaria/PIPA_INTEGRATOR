package br.ueg.tc.pipa_integrator.exceptions.institution;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_INSTITUTION_POVIDER_NOT_FOUND;

public class InstitutionPackageNotFoundException extends BusinessException {

    public InstitutionPackageNotFoundException(Object... parameters) {
        super(ERROR_INSTITUTION_POVIDER_NOT_FOUND, parameters);
    }

    public InstitutionPackageNotFoundException() {
        super(ERROR_INSTITUTION_POVIDER_NOT_FOUND);
    }

    public InstitutionPackageNotFoundException(String message) {
        super(message, ERROR_INSTITUTION_POVIDER_NOT_FOUND.getCode());
    }
}
