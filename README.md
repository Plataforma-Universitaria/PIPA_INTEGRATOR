# PIPA_INTEGRATOR

O **PIPA_INTEGRATOR** é um microsserviço desenvolvido com **Spring Boot**
Estabelece os contratos/interfaces a serem cumpridas para que um provider
possa ser disponibilizado na plataforma.

## Tecnologias Utilizadas
- Spring Boot 3.5.0
- Spring Boot Starter WebFlux
- Spring Boot Starter Web
- Spring Boot DevTools
- Spring Boot Starter Test
- Lombok  1.18.30
- Maven Compiler Plugin
- Spring Boot Maven Plugin
- Gson 2.10.1
- Lombok 1.18.30
- Módulo interno: apiai 0.0.1-SNAPSHOT
- Java 21

## Regras estabelecidas

1. Adicionar provider ao banco de dados, deve seguir o padrão do exemplo:
   * "shortName": "ueg",
   * "providerClass": "UEGProvider",
   * "providerPath": "ueg_provider"
2. Para que um provider possa ser integrado ao PIPA, o mesmo deve seguir os seguintes contratos:
3. O pacote src do projeto deve ser igual ao da plataforma;
4. O provider deve possuir uma classe concreta que implemente a interface [IBaseInstitutionProvider.java](src/main/java/br/ueg/tc/pipa_integrator/institutions/IBaseInstitutionProvider.java)
5. As classes de Serviço devem implementar a interface [IServiceProvider.java](src/main/java/br/ueg/tc/pipa_integrator/serviceprovider/service/IServiceProvider.java)
6. As classes de devem estar anotadas com [ServiceProviderClass.java](src/main/java/br/ueg/tc/pipa_integrator/annotations/ServiceProviderClass.java)
7. Os métodos que executam serviços deve estar anotados com [ServiceProviderMethod.java](src/main/java/br/ueg/tc/pipa_integrator/annotations/ServiceProviderMethod.java)[ActivationPhrases.java](src/main/java/br/ueg/tc/pipa_integrator/annotations/ActivationPhrases.java)
8. Os métodos da interface IServiceProvides e a utilização da anotação são essenciais para o processamento correto dos serviços.
9. O provider deve seguir o padrão {Personas com acesso}Service ou {Tema do serviço}Service
10. Ex: Para um service que fornece os serviços para alunos, nomes recomendados seriam:
    * StudentService
    * StudentDataService
    * StudentScheduleService

## Ascpectos importantes
1. O integrator, fornece aos provider a possibilidade de usarem o motor de ia, cuja chave deve ser fornecida no application.properties
2. O integrador estabelece padrões de prompts para solicitações feitas a ia, sendo visto como o meio pelo qual tanto pipa quando o provider se beneficiam
3. O integrator disponibiliza interfaces que facilitam os providers a fornecerem possíveis serviços comuns para instituições de ensino.
