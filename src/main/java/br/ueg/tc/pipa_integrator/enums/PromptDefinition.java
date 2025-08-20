package br.ueg.tc.pipa_integrator.enums;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public enum PromptDefinition {

    GET_SERVICE(
            """
            Você é uma ferramenta que identifica serviços pelas intenções, considere:
            
            1. A lista de serviços disponíveis.
            2. A solicitação/intenção do usuário.
            3. As personas do usuário.
          
                Objetivo:
            - Retornar EXCLUSIVAMENTE, ou seja, não precisa justificar nada, envie unicamente em string simples, o serviço correspondente se for possível identificá-lo com clareza.
            - Atente-se que o prefixo da classe, geralmente é correspondente ao tipo de persona que pode acessá-lo.
            - Existem serviços que podem ser acessados por todos, com acesso livre.
            - Caso o serviço não seja encontrado ou haja ambiguidade, retorne um erro apropriado.
            exemplo da sua resposta:
                    meu-servico
                exemplo de erro:
                    Pode ser mais específico?

            ➡   Segue a lista de serviços, a persona e a intenção do usuário:
            """
    ), TREAT_PARAMETER(
            """
            Para o tratamento dos parâmetros:
              Considere o dia de hoje como:
            \s""" + LocalDateTime.now() + " e o dia da semana como: "
                    + LocalDateTime.now().getDayOfWeek().name() +
                    " o ano atual é: "
                    + LocalDateTime.now().getYear() +
             """
             converta os parâmetros numéricos para números mesmo: primeiro -> 1; II -> 2 ; 1° -> 1 e etc
             É importante entender que se há por exemplo hoje? trata-se da data da semana, retorno o respectivo -> SEG, TER, QUA, QUI, SEX, SAB, DOM
            
            """
    ), TREAT_INTENT(
            """
                    Vê é única e apenas uma ferramenta de humanização de resposta.
                    \s
                    Regras:
                    - Se for lista ou estrutura com vários dados, mostre **todos**, resumidamente, mas sem omissões.
                    - Se for texto, apenas repita como veio.
                    - Se for dado simples, seja direto em até 100 palavras.
                    - Use o mínimo de tokens possível, sem omitir nenhuma informação
                    \s
                    Exemplos:
                    {Matemática; 7.9} → Sua nota em matemática é 7.9.
                    {Faltas Matemática; 7} → Você tem 7 faltas em matemática.
                    {Média; 5} → Sua média geral é 5.0.
                    {Aulas: null} → Você não tem aula nesse dia.
                    Para lista de disciplinas e horários -> Nas {dia da semana}, você tem aula de {nome da matéria}, com {Nome do professor}, das {horário de início no formato hh:mm} às {horário de termino no formato hh:mm}. (Caso dê pra estipular o intervalo acrescente Intervalo de {tempo de intervalo em minutos} minutos.
                   \s
            **IMPORTANTE**: Para listas ou dados estruturados, **não omita nenhuma disciplina, horário ou nome. Inclua todos**. Se for necessário, divida em frases curtas, mas nunca resuma omitindo.\n" +
            "\n" +
            "Agora, gere a resposta humanizada para:"""),
    TREAT_ERROR("Você é especialista em comunicação humana, diga apenas que ocorreu um erro com no máximo 5 palavras"),
    FREE_ACCESS("""
            Como especialista em correspondência de intenções e serviços, considere:
            Objetivo:
            - Retornar EXCLUSIVAMENTE, ou seja, não precisa justificar nada, envie unicamente o json desserializado com sua resposta, em JSON, o serviço correspondente se for possível identificá-lo com clareza.
            - Caso o serviço não seja encontrado ou haja ambiguidade, retorne um JSON de erro apropriado.
            exemplo da sua resposta:
                    "{\\"serviceName\\": \\"meu-servico\\"}
                Formato do JSON de erro:
                    "{\\"erro\\": \\"serviço não encontrado\\"}
            
            ➡   Segue a lista de serviços, as persona e a intenção do usuário:
            """);

    private final String promptText;

    PromptDefinition(String promptText) {
        this.promptText = promptText;
    }

}
