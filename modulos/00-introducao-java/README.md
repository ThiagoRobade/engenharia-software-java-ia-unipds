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

## Aula 3: Variáveis, Operadores e Condicionais

**Tipos de Dados (Java é fortemente tipada):**
- `String`: Texto. Ex: "Sanduíche".
- `boolean`: `true` ou `false`.
- `double`: Números decimais (padrão). Ex: `3.50`.
- `float`: Decimal menor (precisa de 'f'). Convenção é usar `double`.
- `long`: Inteiros gigantes (precisa de 'L'). Ex: `3000000000L`.
- `int`: Inteiros padrão.
- **`var`**: Inferência de tipo (Java 10+). O Java "adivinha" o tipo. Ex: `var nome = "Chaves";`

**Operadores e Precedência:**
- `+`, `-`, `*`, `/`, `%` (módulo/resto).
- Multiplicação/divisão vêm antes de soma/subtração. Use `( )` para forçar a ordem.
- **Divisão de Inteiros:** `11 / 2` resulta em `5` (corta os decimais). O resto é `1` (`11 % 2`).

**Estruturas Condicionais:**
- `if / else if / else`: Avalia em sequência e para na primeira condição verdadeira.
- `switch-case`: Compara uma variável com vários valores. **IMPORTANTE:** usar `break;` no final de cada `case` para evitar que ele execute o próximo sem querer. `default` é o `else`.

**Novidade JDK 25:**
- Uso da classe `IO.println()` para imprimir no console (substitui o antigo `System.out.println`).
- O método `main` pode ser simplificado para apenas `void main()`.