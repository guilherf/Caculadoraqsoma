# Calculadora de Soma (JavaFX)

Aplicação desktop em **JavaFX** com uma janela simples que soma dois números inteiros.

## Para que serve

É um projeto de estudo de interface gráfica em Java: mostra como ligar uma tela desenhada em **FXML** a uma classe **controller** que reage ao clique de um botão.

## Como funciona

- A janela (600 × 400, sem opção de maximizar) tem dois campos de texto, o símbolo `+` entre eles e um botão `=`.
- Ao clicar em `=`, o controller lê os dois números, soma e mostra o resultado no topo da tela, abaixo do título **RESULTADO**.
- Só aceita **números inteiros**.

## Estrutura

| Arquivo | Papel |
|---|---|
| `src/java/net/bifewagyu/Main.java` | Inicia o JavaFX, carrega o FXML e abre a janela "Soma dos numeros". |
| `src/java/net/bifewagyu/MainController.java` | Método `somaDosnumeros`, chamado pelo botão `=`. |
| `src/resources/calculandosoma.fxml` | Layout da tela (campos, rótulos e botão). |

## Como executar

Pré-requisitos: **JDK 21** e o **JavaFX SDK 21**.

O projeto é um módulo do IntelliJ IDEA (`Caculadoraqsoma.iml`):

1. Abra a pasta no IntelliJ IDEA.
2. Adicione o JavaFX SDK como biblioteca do projeto.
3. Nas opções de execução da classe `Main`, inclua os módulos do JavaFX:
   `--module-path /caminho/do/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml`
4. Execute `Main`.

## Autor

Guilherme Ferreira — [@guilherf](https://github.com/guilherf)
