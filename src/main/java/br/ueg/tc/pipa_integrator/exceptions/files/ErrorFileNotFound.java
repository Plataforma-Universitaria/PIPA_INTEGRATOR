package br.ueg.tc.pipa_integrator.exceptions.files;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_FILE_NOT_FOUND;

public class ErrorFileNotFound extends BusinessException {


    public ErrorFileNotFound(Object... parameters) {
        super(ERROR_FILE_NOT_FOUND, parameters);
    }

    public ErrorFileNotFound() {
        super(ERROR_FILE_NOT_FOUND);
    }

    public ErrorFileNotFound(String message) {
        super(message, ERROR_FILE_NOT_FOUND.getCode());
    }
}
