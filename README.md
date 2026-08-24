# PIPA_INTEGRATOR

O **PIPA_INTEGRATOR** é um módulo JAR desenvolvido em Java com dependências Spring. Ele estabelece os contratos, interfaces e anotações que um provider deve cumprir para ser disponibilizado na plataforma.

## Tecnologias Utilizadas
- Spring Boot 3.5.0
- Spring Boot Starter Web
- Spring Boot DevTools
- Spring Boot Starter Test
- Lombok
- Maven Compiler Plugin
- Maven JAR Plugin
- Gson 2.10.1
- Módulo interno: apiai 0.0.1-SNAPSHOT
- Java 21

## Regras estabelecidas

1. Adicionar provider ao banco de dados, deve seguir o padrão do exemplo:
   * "shortName": "ueg",
   * "providerClass": "UEGProvider",
   * "providerPath": "ueg_provider"
2. Para que um provider possa ser integrado ao PIPA, o mesmo deve seguir os seguintes contratos:
3. O pacote src do projeto deve ser igual ao da plataforma;
4. O provider deve possuir uma classe concreta que implemente a interface [IBaseInstitutionProvider.java](src/main/java/br/ueg/tc/pipa_integrator/interfaces/providers/IBaseInstitutionProvider.java)
5. As classes de serviço devem implementar a interface marker [IServiceProvider.java](src/main/java/br/ueg/tc/pipa_integrator/interfaces/providers/service/IServiceProvider.java)
6. As classes de serviço devem estar anotadas com [ServiceProviderClass.java](src/main/java/br/ueg/tc/pipa_integrator/annotations/ServiceProviderClass.java)
7. Os métodos que executam serviços devem estar anotados com [ServiceProviderMethod.java](src/main/java/br/ueg/tc/pipa_integrator/annotations/ServiceProviderMethod.java). A própria anotação declara `activationPhrases`, `actionName`, `addSpec`, `manipulatesData` e `version`; não existe uma anotação separada `ActivationPhrases` no código atual.
8. A implementação de `IServiceProvider` e o uso das anotações são essenciais para a descoberta dos serviços por Reflection.
9. O provider deve seguir o padrão {Personas com acesso}Service ou {Tema do serviço}Service
10. Ex: Para um service que fornece os serviços para alunos, nomes recomendados seriam:
    * StudentService
    * StudentDataService
    * StudentScheduleService

## Ascpectos importantes
1. O integrator, fornece aos provider a possibilidade de usarem o motor de ia, cuja chave deve ser fornecida no application.properties
2. O integrador estabelece padrões de prompts para solicitações feitas a ia, sendo visto como o meio pelo qual tanto pipa quando o provider se beneficiam
3. O integrator disponibiliza interfaces que facilitam os providers a fornecerem possíveis serviços comuns para instituições de ensino.
