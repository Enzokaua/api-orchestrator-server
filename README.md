# Orquestrador de serviços (Eureka Server)

Este projeto implementa o modelo de alta disponibilidade de micro serviços gerenciados com um orquestrador usando Eureka. O Eureka vai atuar como um servidor na qual os serviços tem acesso, assim, quando eles estiverem stateless eles solicitam um registro e ficam mandando "health checks" para o servidor do Eureka constantemente para manter sua conexao ativa.
Isso permite que os serviços sejam auto-gerenciados, nao demandando conhecimento prévio de onde ele está alocado para realizar chamadas laterais

---

## 🛠️ Tecnologias Utilizadas

- **Java**: Versão 21
- **Spring Framework**: Versão 3.2.X
- **Maven**: Para gerenciamento de dependências

---

## 🚀 Funcionalidades

1. Orquestrar chamadas laterais capturando a URL do registry do Eureka
2. Realizar as chamadas com base no ingress do serviço no servidor do Eureka.
---

## 📋 Como Executar
1- Clone este repositório:
```bash
git clone https://github.com/enzokaua/api-orchestrator-server.git
```

2- Navegue até a pasta do projeto:
```bash
cd api-orchestrator-server
```

3- Compile o projeto com Maven:
```bash
mvn clean install
```

4- Execute a interface gráfica:
```bash
java -jar target/api-orchestrator-server-1.0.0-SNAPSHOT.jar
```
