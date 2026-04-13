# Explicação Java 

## Como configurar java no computador 


O primeiro passo para progamar em java é instalar  o **JDK (Java Development Kit)**, que contém as ferramentas necessárias para escrever, compilar e executar programas Java.

## 1. Baixar o JDK

1. Acesse o site oficial do Java.
2. Procure pela opção **Download do JDK**.
3. Baixe a versão mais recente compatível com seu sistema operacional (Windows, Linux ou Mac).

## 2. Instalar o Java

Depois de baixar o instalador:

1. Abra o arquivo baixado.
2. Siga as instruções do instalador clicando em **Avançar (Next)**.
3. Aguarde até que a instalação seja concluída.

## 3. Verificar a instalação

Depois de  instalar, é importante verificar se o Java foi instalado corretamente.

1. Abra o **Prompt de Comando (cmd)** no Windows.
2. Digite o seguinte comando:
Se o Java estiver instalado corretamente, aparecerá a versão instalada do Java no computador.

## 4. Configurar variáveis de ambiente (caso necessário)

As vezes é necessário configurar a variável **PATH**.

Passos:

1. Abra as **Configurações do Sistema**.
2. Entre em **Variáveis de Ambiente**.
3. Edite a variável **Path**.
4. Adicione o caminho da pasta **bin** do Java.

Exemplo de caminho:


---

# Regras básicas do Java

Algumas regras são fundamentais para escrever programas corretamente em Java.

 ##1. Todo código deve estar dentro de uma classe

Em Java, o programa sempre precisa estar dentro de uma classe.

Exemplo:

```java
public class Programa {

}

### 2. O programa começa pelo método main

O ponto de entrada de um programa Java é o método main.
public static void main(String[] args) {

}

## 3. Java diferencia letras maiúsculas e minúsculas

Java é uma linguagem case sensitive, ou seja, diferencia letras maiúsculas de minúsculas.

Exemplo:
nome
Nome
NOME

## 4. Cada comando termina com ponto e vírgula

Em Java, a maioria das instruções termina com ;

Exemplo:int idade = 18;

## 5. O nome do arquivo deve ser igual ao nome da classe
Se a classe se chama:public class HelloWorld
O arquivo precisa se chamar:

HelloWorld.java


# Como o java funciona 

##1. Escrita do código

Primeiro o programador escreve o código em um arquivo com extensão .java.

Exemplo:

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
    }

}

##2. Compilação

Depois o código precisa ser compilado usando o compilador Java.

Comando:

javac HelloWorld.java

##3. Execução

O bytecode é executado pela JVM (Java Virtual Machine).

Comando:

java HelloWorld

A JVM interpreta o bytecode e executa o programa no sistema operacional.

## Explicação com as minhas palavras
O java é uma linguagem bastante verbosa que exige código para realizar tarefas simples.Isso acontece porque ele prioriza a clareza,organização e a segurança,ele utiliza estruturas como classes,metódos e tipos bem definidos,por mais que pareça maior para escrever essas exigencias tornam o código mais legives estruturadio e fácil de entender 



# Aula 04
== -> igual
=== -> Estritamente igual
=> ou <= -> maior igual ou menor igual 
 (pipe)|| -> ou
 &&->e
 0 || 1-> 1bit
 8 bits = 1 byte 
 
