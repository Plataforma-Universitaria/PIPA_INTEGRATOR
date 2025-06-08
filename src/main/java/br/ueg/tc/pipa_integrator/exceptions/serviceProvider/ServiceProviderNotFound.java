package br.ueg.tc.pipa_integrator.exceptions.serviceProvider;


import br.ueg.tc.pipa_integrator.exceptions.BusinessException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_SERVICE_PROVIDER_NOT_FOUND;

public class ServiceProviderNotFound extends BusinessException {

  public ServiceProviderNotFound(Object... parameters) {
    super(ERROR_SERVICE_PROVIDER_NOT_FOUND, parameters);
  }

  public ServiceProviderNotFound() {
    super(ERROR_SERVICE_PROVIDER_NOT_FOUND);
  }

  public ServiceProviderNotFound(String message) {
    super(message, ERROR_SERVICE_PROVIDER_NOT_FOUND.getCode());
  }
}