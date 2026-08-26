package br.ueg.tc.pipa_integrator.exceptions.institution;


import br.ueg.tc.pipa_integrator.exceptions.provider.ProviderException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_INSTITUTION_NOT_FOUND;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureCategory.CONFIGURATION;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureStage.PROVIDER_RESOLUTION;

public class InstitutionNotFoundException extends ProviderException {

    private static final String ERROR_CODE = "INSTITUTION_NOT_FOUND";

    public InstitutionNotFoundException(Object... parameters) {
        super(ERROR_CODE, CONFIGURATION, PROVIDER_RESOLUTION, false,
                ERROR_INSTITUTION_NOT_FOUND, parameters);
    }

    public InstitutionNotFoundException() {
        super(ERROR_CODE, CONFIGURATION, PROVIDER_RESOLUTION, false,
                ERROR_INSTITUTION_NOT_FOUND);
    }

    public InstitutionNotFoundException(String message) {
        super(ERROR_CODE, CONFIGURATION, PROVIDER_RESOLUTION, false,
                message, ERROR_INSTITUTION_NOT_FOUND);
    }
}
