package br.ueg.tc.pipa_integrator.observability;

/** Etapas comuns do envelope de execução de uma ferramenta da plataforma. */
public enum ProviderFailureStage {
    USER_RESOLUTION,
    PROVIDER_RESOLUTION,
    SERVICE_DISCOVERY,
    SERVICE_INSTANTIATION,
    ARGUMENT_BINDING,
    PROVIDER_CALL,
    RESPONSE_PARSING,
    TOOL_INVOCATION,
    UNKNOWN
}
