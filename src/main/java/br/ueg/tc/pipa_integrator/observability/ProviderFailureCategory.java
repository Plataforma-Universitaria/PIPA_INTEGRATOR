package br.ueg.tc.pipa_integrator.observability;

/** Categorias estáveis usadas para normalizar falhas de providers distintos. */
public enum ProviderFailureCategory {
    AUTHENTICATION,
    AUTHORIZATION,
    COMMUNICATION,
    INVALID_RESPONSE,
    DATA_MAPPING,
    VALIDATION,
    BUSINESS_RULE,
    CONFIGURATION,
    INTERNAL,
    UNKNOWN
}
