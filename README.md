# SpringBoot 3 - Microserviços

Este repositório contém o código-fonte do microserviço desenvolvido com Java, utilizando Spring 3, Kubernetes (K8S), Docker, Kafka, API Gateway, e outros componentes essenciais.

Este projeto demonstra a arquitetura de microserviços, onde cada serviço é independente e pode ser desenvolvido, implantado e escalado individualmente. Os principais componentes do projeto incluem:

- **Spring 3**: Framework principal para a construção do microserviço.
- **Kubernetes (K8S)**: Orquestração de contêineres para implantação e gerenciamento de microserviços.
- **Docker**: Contêinerização dos microserviços para garantir a consistência entre diferentes ambientes.
- **Kafka**: Sistema de mensagens distribuído usado para comunicação entre microserviços.
- **API Gateway**: Gerenciamento de entradas e controle de tráfego entre os microserviços.
- **MongoDB**: Banco de dados NoSQL usado para armazenamento de dados flexível e escalável.
- **PostgreSQL**: Banco de dados relacional usado para armazenamento de dados transacionais.
- **Keycloak**: Solução de identidade e acesso para gerenciar autenticação e autorização.
- **Grafana**: Plataforma de análise e monitoramento usada para visualizar métricas.
- **Prometheus**: Sistema de monitoramento e alerta usado para coletar métricas e enviar alertas.
- **Zipkin**: Sistema de rastreamento distribuído usado para monitorar a latência e o fluxo de chamadas entre serviços.
- **Broker**: Middleware de mensagens que facilita a comunicação entre microserviços.
- **Circuit Breaker**: Padrão de design usado para aumentar a resiliência dos microserviços contra falhas.
- **Event Driven**: Arquitetura orientada a eventos para facilitar a comunicação assíncrona entre microserviços.

## Pré-requisitos

Certifique-se de ter os seguintes softwares instalados em seu ambiente de desenvolvimento:

- Java 17+
- Maven 3.6+
- Docker
- Kubernetes (kubectl)
- Kafka
- Docker Compose
- MongoDB
- PostgreSQL
- Keycloak
- Prometheus
- Grafana
- Zipkin

## Como Executar a Aplicação

### Usando Docker

1. Compile os serviços e crie as imagens Docker localmente:
   ```sh
   mvn clean package -DskipTests
   
2. Inicie os serviços usando Docker Compose:
   ```sh
   docker-compose up -d

### Sem Docker

1. Compile os serviços individualmente:
   ```sh
    cd order-service
    mvn clean verify -DskipTests
    cd inventory-service
    mvn clean verify -DskipTests
    cd /api-gateway
    mvn clean verify -DskipTests

2. Inicie os serviços individualmente:
   ```sh
    cd order-service
    mvn spring-boot:run
    cd inventory-service
    mvn spring-boot:run
    cd /api-gateway
    mvn spring-boot:run

## Comunicação entre Microserviços

Os microserviços se comunicam através do Kafka, onde as mensagens são publicadas e consumidas para garantir a troca de informações de maneira assíncrona. Além disso, utilizamos uma arquitetura orientada a eventos para facilitar a comunicação assíncrona entre os serviços.


## Autenticação e Autorização
A autenticação e autorização são gerenciadas pelo Keycloak, que fornece uma solução completa para gerenciamento de identidades.

## Monitoramento e Logs
As métricas e logs dos microserviços são gerenciados usando ferramentas de monitoramento como Prometheus e Grafana, integradas ao Kubernetes. O Zipkin é usado para rastreamento distribuído, monitorando a latência e o fluxo de chamadas entre serviços.

## Resiliência
Para aumentar a resiliência dos microserviços, utilizamos o padrão de Circuit Breaker, que ajuda a proteger os serviços de falhas cascata.

## Contribuição
Se você deseja contribuir com o projeto, por favor, faça um fork do repositório, crie um branch com suas alterações e envie um pull request. Toda contribuição é bem-vinda!