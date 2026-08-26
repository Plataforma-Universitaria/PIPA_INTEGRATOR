package br.ueg.tc.pipa_integrator.observability;

/**
 * Contexto técnico seguro de uma operação. O PIPA Core combina este contrato
 * com seu contexto interno de usuário e sessão; providers não recebem entidades JPA.
 */
public record ProviderOperationContext(
        String provider,
        String service,
        String operation,
        String toolName,
        String toolVersion
) {
}
