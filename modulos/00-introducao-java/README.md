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

## Aula 2: JVM, JSR e JEP

**O que é o Bytecode (.class)?**
- Quando compilamos um arquivo `.java`, ele vira um `.class`.
- Esse arquivo não tem texto legível, é um código binário chamado **Bytecode**, feito para a JVM entender.
- Podemos "espiar" esse código usando o comando `javap -c NomeDaClasse` no terminal.

**A JVM é uma Plataforma (não só para Java):**
- A Máquina Virtual Java (JVM) executa o bytecode. Por isso o Java é "Write Once, Run Anywhere".
- Como ela executa o bytecode, outras linguagens também podem rodar nela! (Ex: Kotlin, Scala, Groovy, Clojure).

**Como o Java evolui (JCP e JEP):**
- **JSR:** Pedidos de especificação (mais lentos).
- **JEP (JDK Enhancement Proposals):** Propostas de melhoria (mais ágeis). É por causa delas que o Java tem uma versão nova a cada 6 meses!
- **Preview Features:** Recursos que saem antes da versão final para a comunidade testar (foi o que usamos no `void main()`).