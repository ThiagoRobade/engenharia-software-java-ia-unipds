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

## Aula 4: Arrays e Laços de Repetição

**Por que usar Arrays?**
- Criar variáveis para cada item (`preco1`, `preco2`, `preco3`...) não escala.
- Um **Array** agrupa vários valores do mesmo tipo em uma única estrutura, acessíveis por índices (que começam em 0). O tamanho é fixo.

**Laços de Repetição:**
- **`while`:** Verifica a condição *antes* de executar. (Pode executar 0 vezes).
- **`do-while`:** Executa o bloco *pelo menos uma vez* e depois verifica a condição.
- **`for`:** Ideal quando sabemos o número de repetições (inicialização; condição; incremento).
- **`for-each`:** A forma mais limpa e moderna de percorrer um array inteiro quando não precisamos do índice.

**Controle de Fluxo (break e continue):**
- **`break`:** Quebra o laço imediatamente (sai dele).
- **`continue`:** Pula a iteração atual e vai para a próxima, sem executar o resto do código daquele bloco.

## Aula 5: Classes, Atributos e Objetos

**O Problema:** Criar variáveis soltas para cada item (`nomeItem1`, `precoItem1`, `nomeItem2`...) é desorganizado e não escala. Os dados de um mesmo item ficam espalhados.

**A Solução (POO):**
- **Classe:** É o "molde" ou "planta" de algo. Ex: a classe `ItemCardapio` define que todo item tem nome, preço, etc.
- **Atributos:** São as variáveis dentro da classe (as características do objeto). Ex: `String nome; double preco;`
- **Objeto:** É a "materialização" da classe (a coisa de verdade). Criamos com a palavra `new`. Ex: `var item1 = new ItemCardapio();`
- **Notação de Ponto (`.`):** Usamos para acessar ou alterar os dados do objeto. Ex: `item1.nome = "Refresco";`