package br.ueg.tc.pipa_integrator.exceptions.institution;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_COMUNICATION_WITH_INSTITUTION;
import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_COULD_NOT_EXECUTE_SERVICE;

public class InstitutionServiceException extends BusinessException {

    public InstitutionServiceException(Object... parameters) {
        super(ERROR_COULD_NOT_EXECUTE_SERVICE, parameters);
    }

    public InstitutionServiceException() {
        super(ERROR_COULD_NOT_EXECUTE_SERVICE);
    }

    public InstitutionServiceException(String message) {
        super(message, ERROR_COULD_NOT_EXECUTE_SERVICE.getCode());
    }
}
