package br.ueg.tc.pipa_integrator.observability;

/**
 * Contrato semântico de uma falha ocorrida na periferia da plataforma.
 * Não transporta contexto de usuário, credenciais ou detalhes técnicos brutos.
 */
public interface ProviderFailure {

    String errorCode();

    ProviderFailureCategory category();

    ProviderFailureStage stage();

    boolean retryable();
}
