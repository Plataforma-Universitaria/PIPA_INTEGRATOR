package br.ueg.tc.pipa_integrator.exceptions.provider;

import br.ueg.tc.pipa_integrator.exceptions.BusinessException;
import br.ueg.tc.pipa_integrator.exceptions.institution.InstitutionCommunicationException;
import br.ueg.tc.pipa_integrator.observability.ProviderFailure;
import br.ueg.tc.pipa_integrator.observability.ProviderFailureCategory;
import br.ueg.tc.pipa_integrator.observability.ProviderFailureStage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProviderExceptionTest {

    @Test
    void shouldPreserveBusinessCompatibilityAndExposeFailureContract() {
        IllegalStateException cause = new IllegalStateException("detalhe interno");
        InstitutionCommunicationException exception =
                new InstitutionCommunicationException("mensagem segura", cause);

        assertThat(exception).isInstanceOf(BusinessException.class);
        assertThat(exception).isInstanceOf(ProviderFailure.class);
        assertThat(exception.errorCode()).isEqualTo("INSTITUTION_COMMUNICATION_ERROR");
        assertThat(exception.category()).isEqualTo(ProviderFailureCategory.COMMUNICATION);
        assertThat(exception.stage()).isEqualTo(ProviderFailureStage.PROVIDER_CALL);
        assertThat(exception.retryable()).isTrue();
        assertThat(exception.getCause()).isSameAs(cause);
    }
}
