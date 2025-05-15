package br.ueg.tc.pipa_integrator.exceptions.files;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_COULDNT_CREATE_FILE;

public class ErrorCouldNotCreateFile extends BusinessException {


    public ErrorCouldNotCreateFile(Object... parameters) {
        super(ERROR_COULDNT_CREATE_FILE, parameters);
    }

    public ErrorCouldNotCreateFile() {
        super(ERROR_COULDNT_CREATE_FILE);
    }

    public ErrorCouldNotCreateFile(String message) {
        super(message, ERROR_COULDNT_CREATE_FILE.getCode());
    }
}
