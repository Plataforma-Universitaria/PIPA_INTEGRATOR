package br.ueg.tc.pipa_integrator.exceptions.institution;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_COMUNICATION_WITH_INSTITUTION;

public class InstitutionComunicationException extends BusinessException {

    public InstitutionComunicationException(Object... parameters) {
        super(ERROR_COMUNICATION_WITH_INSTITUTION, parameters);
    }

    public InstitutionComunicationException() {
        super(ERROR_COMUNICATION_WITH_INSTITUTION);
    }

    public InstitutionComunicationException(String message) {
        super(message, ERROR_COMUNICATION_WITH_INSTITUTION.getCode());
    }
}
