package br.ueg.tc.pipa_integrator.ai;

import org.springframework.stereotype.Service;

import static br.ueg.tc.pipa_integrator.enums.PromptDefinition.GET_SERVICE;


@Service
public class AIPromptImpl implements IAIPrompt {

    @Override
    public String getRequestSpecificationPrompt() {
        return GET_SERVICE.name();
    }

    @Override
    public String getInformationsPrompt() {
        return "";
    }
}
