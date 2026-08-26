package br.ueg.tc.pipa_integrator.exceptions.serviceProvider;


import br.ueg.tc.pipa_integrator.exceptions.provider.ProviderException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_SERVICE_PROVIDER_NOT_FOUND;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureCategory.CONFIGURATION;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureStage.SERVICE_DISCOVERY;

public class ServiceProviderNotFound extends ProviderException {

  private static final String ERROR_CODE = "SERVICE_PROVIDER_NOT_FOUND";

  public ServiceProviderNotFound(Object... parameters) {
    super(ERROR_CODE, CONFIGURATION, SERVICE_DISCOVERY, false,
            ERROR_SERVICE_PROVIDER_NOT_FOUND, parameters);
  }

  public ServiceProviderNotFound() {
    super(ERROR_CODE, CONFIGURATION, SERVICE_DISCOVERY, false,
            ERROR_SERVICE_PROVIDER_NOT_FOUND);
  }

  public ServiceProviderNotFound(String message) {
    super(ERROR_CODE, CONFIGURATION, SERVICE_DISCOVERY, false,
            message, ERROR_SERVICE_PROVIDER_NOT_FOUND);
  }
}
