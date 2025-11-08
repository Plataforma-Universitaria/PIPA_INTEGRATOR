package br.ueg.tc.pipa_integrator.exceptions.diary;

import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_SESSION_EXPIRES;

public class DiaryNotFoundException extends BusinessException {

    public DiaryNotFoundException() {
        super(ERROR_SESSION_EXPIRES);
    }

    public DiaryNotFoundException(Object... parameters){
        super(ERROR_SESSION_EXPIRES, parameters);
    }

    public DiaryNotFoundException(String message) {
        super(message,ERROR_SESSION_EXPIRES.getCode());
    }
}
