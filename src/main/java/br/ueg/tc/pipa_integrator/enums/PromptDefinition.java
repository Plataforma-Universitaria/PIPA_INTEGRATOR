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
                    - Eles podem ser strings compostas por várias palavras, números, datas, dias da semana e etc.
                    - Considere que:
                        • A data de hoje é:\s""" + getToday().toLocalDateTime().toString() + """
                    • O dia da semana é:\s""" + getToday().getDayOfWeek().name() + """
                    • O ano atual é:\s""" + getToday().getYear() + """
                    
                    Regras:
                    1. Se o parâmetro for "hoje", substitua pelo dia da semana correspondente (ex: SEG, TER, QUA, QUI, SEX, SAB, DOM).
                    2. Se o parâmetro for "amanhã", substitua pelo próximo dia da semana.
                    3. Se o parâmetro for "ontem", substitua pelo dia da semana anterior.
                    4. Converta números escritos em palavras ou algarismos romanos para o formato numérico (ex: "primeiro" -> 1, "II" -> 2, "1°" -> 1).
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
            IMPORTANTE: Esta função deve identificar APENAS saudações isoladas ou que iniciam a conversa.\s
                        Regras de Identificação:
            
                        1. **SAUDAÇÕES SIMPLES** (retornar saudação correspondente):
                           - Palavras isoladas: "Oi", "Olá", "E aí", "Hey", "Alô",
                           - Exemplo de entrada: "Oi" → Resposta: "Olá! Como posso ajudar?"
            
            
                        2. **SAUDAÇÕES DE TEMPO** (verificar horário atual):
                           - Frases isoladas: "Bom dia", "Boa tarde", "Boa noite"
                           - Usar horário atual:""" + getToday().toLocalDateTime().toString() + """
            
                              \s
                               Regras de horário:
                               - 04:00 às 11:59 → "Bom dia! Como posso te ajudar?"
                               - 12:00 às 17:59 → "Boa tarde! Como posso te ajudar?" \s
                               - 18:00 às 03:59 → "Boa noite! Como posso te ajudar?"
            
                            3. **RETORNAR "N/A" quando**:
                               - A entrada contém qualquer conteúdo além da saudação
                               - A entrada é uma pergunta ou solicitação específica
                               - A entrada menciona tópicos como: notas, aulas, trabalhos, materiais, etc.
                               - A saudação é seguida de vírgula e outro conteúdo
                              \s
                             4. **FRASES DE CONFIRMAÇÃO** (retornar um como posso ajudar):
                               - Palavras isoladas: "Pronto", "Ok", "deu certo", "Foi", "Autenticado",
                               - Exemplo de entrada: Resposta: "Como posso ajudar?", "O que seja saber"
                            **Exemplos de entradas que DEVEM retornar "N/A":**
                            - "Notas do 9 período"\s
                            - "Boa noite, quais são minhas notas?"
                            - "Olá, quais são minhas aulas hoje?"
                            - "Bom dia, preciso ver meu horário"
                            - "E aí, como está o tempo?"
                            - "Ajuda"
                            - "Funcionalidades"
                            - "notas"
            
                            **Exemplos de entradas que devem retornar saudação:**
                            - "Oi"
                            - "Olá" \s
                            - "Bom dia"
                            - "Boa tarde"
                            - "Boa noite"
            
                            - Seja rigoroso. Na menor dúvida, retorne "N/A".
                            NUNCA RETORNE NADA, NADA MESMO, ALÈM DA SAUDAÇÃO OU DO N/A para essa tarefa!
            """);

    private final String promptText;

    PromptDefinition(String promptText) {
        this.promptText = promptText;
    }

    private static ZonedDateTime getToday() {
        ZoneId brasiliaZoneId = ZoneId.of("America/Sao_Paulo");
        return ZonedDateTime.now(brasiliaZoneId);
    }

}
