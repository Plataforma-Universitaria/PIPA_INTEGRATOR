package br.ueg.tc.pipa_integrator.exceptions.institution;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_COMUNICATION_WITH_INSTITUTION;

public class InstitutionCommunicationException extends BusinessException {

    public InstitutionCommunicationException(Object... parameters) {
        super(ERROR_COMUNICATION_WITH_INSTITUTION, parameters);
    }

    public InstitutionCommunicationException() {
        super(ERROR_COMUNICATION_WITH_INSTITUTION);
    }

    public InstitutionCommunicationException(String message) {
        super(message, ERROR_COMUNICATION_WITH_INSTITUTION.getCode());
    }
}
