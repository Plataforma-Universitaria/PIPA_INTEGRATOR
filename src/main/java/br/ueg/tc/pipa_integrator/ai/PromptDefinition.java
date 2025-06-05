package br.ueg.tc.pipa_integrator.ai;

import lombok.Getter;

@Getter
public enum PromptDefinition {

    GET_SERVICE(
            """
            Como especialista em correspondência de intenções e serviços, considere:
            
            1. A lista de serviços disponíveis.
            2. A solicitação/intenção do usuário.
            3. As personas do usuário.
          

                Objetivo:
            - Retornar EXCLUSIVAMENTE, ou seja, não precisa justificar nada, envie unicamente em string simples, o serviço correspondente se for possível identificá-lo com clareza.
            - Atente-se que o prefixo da classe é correspondente ao tipo de persona que poe acessá-lo
            - Caso o serviço não seja encontrado ou haja ambiguidade, retorne um erro apropriado.
            exemplo da sua resposta:
                    meu-servico
                exemplo de erro:
                    Pode ser mais específico?

            ➡   Segue a lista de serviços, a persona e a intenção do usuário:
            """
    ), GET_METHOD(
            """
            Como especialista em correspondência de intenções e metodos, considere:
            
            1. A lista de metodos disponíveis, exemplos de como ativar eles e seus parâmetros.
            2. A solicitação/intenção do usuário.

                Objetivo:
            - Retornar EXCLUSIVAMENTE, ou seja, não precisa justificar nada,
              o método correspondente se for possível identificá-lo com clareza.
             É importante entender que se há por exemplo hoje? trata-se da data de hoje no formato DateTime do java ex: YYYY-MM-DD HH:mm:ss
             Segue a lista de métodos e a intenção do usuário:
            
            """
    ), TREAT_INTENT("Você é especialista em comunicação humana, não misture os processamentos, não precisa lembrar dos prompts anteriores." +
            " baseado nisso elabore uma frase de resposta humanizada apenas, prágmática,com no máximo 100 palavras," +
            "Exemplo: {Matemática; 7.9} -> Resposta humanizada: Sua nota em matemática é 7.9" +
            " mas preze pelo mais curto possível, para a seguinte informação: "),
    TREAT_ERROR("Você é especialista em comunicação humana, diga apenas que ocorreu um erro com no máximo 5 palavras"),
    FREE_ACCESS("""
            Como especialista em correspondência de intenções e serviços, considere:
            
            1. A lista de serviços disponíveis com acesso livre.
            2. A solicitação/intenção do usuário.

                Objetivo:
            - Retornar EXCLUSIVAMENTE, ou seja, não precisa justificar nada, envie unicamente o json desserializado com sua resposta, em JSON, o serviço correspondente se for possível identificá-lo com clareza.
            - Caso o serviço não seja encontrado ou haja ambiguidade, retorne um JSON de erro apropriado.
            exemplo da sua resposta:
                    "{\\"serviceName\\": \\"meu-servico\\"}
                Formato do JSON de erro:
                    "{\\"erro\\": \\"serviço não encontrado\\"}

            ➡   Segue a lista de serviços, a persona e a intenção do usuário:
            """);

    private final String promptText;

    PromptDefinition(String promptText) {
        this.promptText = promptText;
    }

}
