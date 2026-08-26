package br.ueg.tc.pipa_integrator.exceptions.serviceProvider;


import br.ueg.tc.pipa_integrator.exceptions.provider.ProviderException;

import static br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage.ERROR_COULD_NOT_EXECUTE_SERVICE;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureCategory.INTERNAL;
import static br.ueg.tc.pipa_integrator.observability.ProviderFailureStage.TOOL_INVOCATION;

public class ServiceCouldNotExecute extends ProviderException {

  private static final String ERROR_CODE = "SERVICE_COULD_NOT_EXECUTE";

  public ServiceCouldNotExecute(Object... parameters) {
    super(ERROR_CODE, INTERNAL, TOOL_INVOCATION, false,
            ERROR_COULD_NOT_EXECUTE_SERVICE, parameters);
  }

  public ServiceCouldNotExecute() {
    super(ERROR_CODE, INTERNAL, TOOL_INVOCATION, false,
            ERROR_COULD_NOT_EXECUTE_SERVICE);
  }

  public ServiceCouldNotExecute(String message) {
    super(ERROR_CODE, INTERNAL, TOOL_INVOCATION, false,
            message, ERROR_COULD_NOT_EXECUTE_SERVICE);
  }
}
