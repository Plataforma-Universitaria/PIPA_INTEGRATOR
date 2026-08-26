package br.ueg.tc.pipa_integrator.exceptions.institution;


import br.ueg.tc.pipa_integrator.exceptions.provider.ProviderException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_COMUNICATION_WITH_INSTITUTION;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureCategory.COMMUNICATION;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureStage.PROVIDER_CALL;

public class InstitutionCommunicationException extends ProviderException {

    private static final String ERROR_CODE = "INSTITUTION_COMMUNICATION_ERROR";

    public InstitutionCommunicationException(Object... parameters) {
        super(ERROR_CODE, COMMUNICATION, PROVIDER_CALL, true,
                ERROR_COMUNICATION_WITH_INSTITUTION, parameters);
    }

    public InstitutionCommunicationException() {
        super(ERROR_CODE, COMMUNICATION, PROVIDER_CALL, true,
                ERROR_COMUNICATION_WITH_INSTITUTION);
    }

    public InstitutionCommunicationException(String message) {
        super(ERROR_CODE, COMMUNICATION, PROVIDER_CALL, true,
                message, ERROR_COMUNICATION_WITH_INSTITUTION);
    }

    public InstitutionCommunicationException(String message, Throwable cause) {
        super(ERROR_CODE, COMMUNICATION, PROVIDER_CALL, true,
                message, ERROR_COMUNICATION_WITH_INSTITUTION, cause);
    }
}
