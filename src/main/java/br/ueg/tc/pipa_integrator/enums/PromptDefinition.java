package br.ueg.tc.pipa_integrator.enums;

import lombok.Getter;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Getter
public enum PromptDefinition {

    TREAT_PARAMETER(
            """
            Para o tratamento dos parâmetros:
            Eles podem ser string compostas por várias palavras, números, datas, dias da sema e etc.
              Considere o dia de hoje como:
            \s""" + getToday().toLocalDateTime().toString() + " e o dia da semana como: "
                    + getToday().getDayOfWeek().name() +
                    " o ano atual é: "
                    + getToday().getYear()+
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
    VERIFY_INTENT("""
    Se a intenção recebida for uma SAUDAÇÃO, responda também com uma saudação apropriada.

    Regras:
    - Para saudações como "Oi", "Olá", "E aí", responda com uma saudação amigável do mesmo tipo. 
      Exemplos: "Olá! Como posso ajudar?", "E aí! Como posso te ajudar?".
    - Para saudações de tempo (ex.: "Bom dia", "Boa tarde", "Boa noite"), utilize a hora atual do sistema:
        Agora é: """ + getToday().toLocalDateTime().toString() + """
        - Se a hora for entre 04:00 e 11:59 → Responder algo como "Bom dia! O que deseja saber"
        - Se a hora for entre 12:00 e 17:59 → Responder algo como "Boa tarde! O que deseja saber"
        - Se a hora for entre 18:00 e 03:59 → Responder algo como "Boa noite! O que deseja saber"
    - Se não for uma saudação, ou se a saudação acompanhar algumas intenção de fato (ex: Olá, quais são minhas aulas hoje, boa nopite, notas em alg etc)
      apenas retorne "N/A".
""");

    private final String promptText;

    PromptDefinition(String promptText) {
        this.promptText = promptText;
    }

    private static ZonedDateTime getToday(){
        ZoneId brasiliaZoneId = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime nowInBrasilia = ZonedDateTime.now(brasiliaZoneId);
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.atZone(brasiliaZoneId);
    }

}
