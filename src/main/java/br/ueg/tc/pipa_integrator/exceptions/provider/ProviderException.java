package br.ueg.tc.pipa_integrator.exceptions.provider;

import br.ueg.tc.pipa_integrator.enums.BusinessErrorMessage;
import br.ueg.tc.pipa_integrator.exceptions.BusinessException;
import br.ueg.tc.pipa_integrator.observability.ProviderFailure;
import br.ueg.tc.pipa_integrator.observability.ProviderFailureCategory;
import br.ueg.tc.pipa_integrator.observability.ProviderFailureStage;

import java.util.Objects;

/**
 * Implementação base do contrato de falhas dos providers.
 * Continua sendo uma BusinessException para preservar compatibilidade.
 */
public abstract class ProviderException extends BusinessException implements ProviderFailure {

    private final String errorCode;
    private final ProviderFailureCategory category;
    private final ProviderFailureStage stage;
    private final boolean retryable;

    protected ProviderException(String errorCode,
                                ProviderFailureCategory category,
                                ProviderFailureStage stage,
                                boolean retryable,
                                BusinessErrorMessage businessErrorMessage,
                                Object... parameters) {
        super(businessErrorMessage, parameters);
        this.errorCode = requireErrorCode(errorCode);
        this.category = Objects.requireNonNull(category, "category");
        this.stage = Objects.requireNonNull(stage, "stage");
        this.retryable = retryable;
    }

    protected ProviderException(String errorCode,
                                ProviderFailureCategory category,
                                ProviderFailureStage stage,
                                boolean retryable,
                                String safeMessage,
                                BusinessErrorMessage businessErrorMessage) {
        super(safeMessage, businessErrorMessage.getCode());
        this.errorCode = requireErrorCode(errorCode);
        this.category = Objects.requireNonNull(category, "category");
        this.stage = Objects.requireNonNull(stage, "stage");
        this.retryable = retryable;
    }

    protected ProviderException(String errorCode,
                                ProviderFailureCategory category,
                                ProviderFailureStage stage,
                                boolean retryable,
                                String safeMessage,
                                BusinessErrorMessage businessErrorMessage,
                                Throwable cause) {
        this(errorCode, category, stage, retryable, safeMessage, businessErrorMessage);
        if (cause != null) {
            initCause(cause);
        }
    }

    @Override
    public final String errorCode() {
        return errorCode;
    }

    @Override
    public final ProviderFailureCategory category() {
        return category;
    }

    @Override
    public final ProviderFailureStage stage() {
        return stage;
    }

    @Override
    public final boolean retryable() {
        return retryable;
    }

    private String requireErrorCode(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("errorCode deve ser informado");
        }
        return value;
    }
}
