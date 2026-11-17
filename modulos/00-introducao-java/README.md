# Módulo 0 - Introdução ao Java

## Aula 1: O que é Java?

**Java é um Ecossistema (O Tripé):**
1. **Linguagem:** A sintaxe, as regras que escrevemos.
2. **Plataforma (JVM):** A Máquina Virtual Java que executa o código em qualquer sistema operacional. (Slogan: *Write Once, Run Anywhere*).
3. **Tecnologias:** Ferramentas para trabalhar com Java(JDK vs JRE).

**JDK vs JRE (Muito importante):**
- **JDK (Kit de Desenvolvimento):** É o que instalamos. Contém o compilador (`javac`) e ferramentas para *criar* programas.
- **JRE (Ambiente de Execução):** É o que o usuário final precisa para apenas *rodar* o programa.

**O Fluxo Básico de um Programa Java:**
1. Escrevemos o código em um arquivo `.java`.
2. Compilamos com o comando `javac` (isso gera um arquivo `.class` chamado **Bytecode**).
3. A JVM executa esse Bytecode com o comando `java`.

**Comandos úteis:**
- `System.out.println("Texto");` -> Imprime e pula uma linha.
- `System.out.print("Texto");` -> Imprime e continua na mesma linha.