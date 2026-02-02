# 📚 Exercicio Spring 1 - DevSuperior

Este repositório contém a resolução do **primeiro exercício** do curso **Java Spring Professional** da [DevSuperior](https://devsuperior.com.br).

## 🎯 Objetivo
O exercício tem como propósito:
- Praticar conceitos iniciais do **Spring Boot**.
- Aplicar **injeção de dependência** entre serviços.
- Separar responsabilidades em classes (`OrderService` e `ShippingService`).
- Executar a aplicação via **CommandLineRunner**, recebendo dados pelo terminal.

## 🛠️ Tecnologias utilizadas
- **Java 25**
- **Spring Boot 4.0.2**
- **Maven**
- **IntelliJ IDEA** (IDE utilizada no desenvolvimento)

## 📂 Estrutura do projeto
- `model/Order` → Representa os dados do pedido (código, valor básico, desconto).
- `services/ShippingService` → Calcula o valor do frete conforme regras do exercício.
- `services/OrderService` → Calcula o valor total do pedido (aplicando desconto + frete).
- `ExercicioSpring1Application` → Classe principal que executa o programa e interage com o usuário.

## ▶️ Como executar
1. Clone este repositório:
   ```bash
   git clone git@github.com:giuliano6943/exercicio-spring1.git
2. Entre na pasta do projeto:
   ```bash
   cd exercicio-spring1
3.Compile e rode:
  ```bash
  mvn spring-boot:run

Digite os dados solicitados no terminal:

Código do pedido

Valor básico

Percentual de desconto

O programa exibirá o código do pedido e o valor total calculado.
