package br.ueg.tc.pipa_integrator.exceptions.institution;


import br.ueg.tc.pipa_integrator.exceptions.provider.ProviderException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_INSTITUTION_POVIDER_NOT_FOUND;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureCategory.CONFIGURATION;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureStage.PROVIDER_RESOLUTION;

public class InstitutionPackageNotFoundException extends ProviderException {

    private static final String ERROR_CODE = "INSTITUTION_PROVIDER_NOT_FOUND";

    public InstitutionPackageNotFoundException(Object... parameters) {
        super(ERROR_CODE, CONFIGURATION, PROVIDER_RESOLUTION, false,
                ERROR_INSTITUTION_POVIDER_NOT_FOUND, parameters);
    }

    public InstitutionPackageNotFoundException() {
        super(ERROR_CODE, CONFIGURATION, PROVIDER_RESOLUTION, false,
                ERROR_INSTITUTION_POVIDER_NOT_FOUND);
    }

    public InstitutionPackageNotFoundException(String message) {
        super(ERROR_CODE, CONFIGURATION, PROVIDER_RESOLUTION, false,
                message, ERROR_INSTITUTION_POVIDER_NOT_FOUND);
    }
}
