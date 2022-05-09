# Tipos Primitivos

* byte inteiro1 = 10;
* short inteiros = 10;
* int inteiro3 = 10;
* long inteiro4 = 10;

Obs: Mas afinal, quando eu devo utilizar cada uma desses?
* Res: Vai depender do tamanho de cada um desses tipos.
Ex: **_short_** suporta até 2 bytes enquanto um **_long_** suporta até 8 bytes

Tabela de Primitivos em Java
![](../../../Downloads/tabelaPrimitivos.png)

# Tipos não primitivos

Conheceremos outros tipos de(não primitivos) da linguagem Java, mas desde já repare que um texto, assim como qualquer outro valor,
também é um tipo" Esse tipo é conhecido como String

String: 

````     
    String texto = "I am a String"
    System.out.printls(texto)
````

### Casting de valores

Como já vimos, nem todos os valores são compatíveis
Ex: Se tentarmos atribuir um valor de **_double_** para um **_int_**, vai dar um erro de compilação

`````
       public class CalculadoraDeEstoque {
        public static void main(String[] args) {
            double livroJava8 = 60
            double livroTDD = 60;
            
            double soma = livroTDD + livroJava8;
            
            System.out.println("O total em estoque é " + soma)
        }  
    }
`````
No caso acima o código compilará, fazendo um **_casting implícito_**


Outro exemplo:
Observando o Código abaixo onde foi feito uma mudança na saída do tipo mantendo as variáveis intactas, o que temos quando o código for compilado?

````
    public class CalculadoraDeEstoque {
        public static void main(String[] args) {
            int livroJava8 = 60
            int livroTDD = 60;
            
            int soma = livroTDD + livroJava8;
            
            System.out.println("O total em estoque é " + soma)             
        }
 
    }
````
![](../../../Desktop/Captura de Tela 2022-05-06 às 12.02.40.png)

Mesmo arredondando o valor dos livros para um número inteiro (neste caso, 60), um double pode sim guardar esse valor. Portanto, eu posso atribuir valores menores em variáveis com uma capacidade maior; o que eu não posso é o contrário. Uma analogia dev que gosto muito e se encaixa bem aqui é: “Você pode colocar uma formiga na casa de um cavalo, o contrário não daria certo”.


Imagine que o **_double_** seja um animal: Cavalo,
Imagine que um **_int_** também que uma formiga seja uma: Formiga,

Olhando a tabela acima percebemos que existe uma ordem de grandeza proporcional ao que estou escrevendo como possíveis hipóteses, quanto ao tamanho físico dos dois(Formiga e cavalo).
Seguindo essa linha de raciocínio tomo como verdade que: 
 ````
  public class CalculadoraDeEstoque {
        public static void main(String[] args) {
            double livroJava8 = 60
            int livroTDD = 60;
            
            int soma = livroTDD + livroJava8;
            
            System.out.println("O total em estoque é " + soma)             
        }
 
    }
 
 ````
Nesse exemplo de código estamos tentando atribuir um double(um cavalo) em um int (uma formiga). Não importa se o valor que
que atribuímos a este double é um valor inteiro válido. O compilador vai se preocupar com o tipo de suas variáveis, e não
com seus valores, até porque, como o próprio noe indica, esses valores são mutáveis, portanto essa atribuição seria perigosa.

Em algum momento podemos forçar essa conversão de tipos dizendo ao compilador: "*tudo bem, garanto que o valor deste **double** 
pode ser moldado para um número **inteiro***"

### Para isso, utilizamos o casting.

````
int  = (int) livroJava8
````
##Operador ternário:

Como usar? 
Usar de acordo com uma condição booleana.
Ex: 

````
    
double valor = 0;
if (v1 > v2){
    valor = 100;
} else{
    valor = 0;
}
````
Alternativa para o if() acima usando **Operador Ternario**:

````
    double valor = v1 > v2 ? 100: 0;
````

## Loopins e mais loopings:

### Looping While

Considerando que todos os livros têm o preço de 59,90, 
é trabalhoso criar tantas variáveis para que o valor da soma
ultrapasse 2000,00 reais. Para isso podemos criar uma estrutura
de repetição, nessa caso usaremos o **While**:

````
double soma = 0,
int contador = 0,

while (contador < 35) {
    double valorDoLivro = 59,90;
    soma = soma + valorDoLivro;
    contador = contador + 1
}
````
O while é bastante parecido com o if(). A grande diferença é que, enquanto sua expressão
booleana for *true*, o código continuará sendo executado. Neste exemplo temos:

* Soma -> Para acumular o valor total dos livros
* Contador -> Para controlar a quantidade de vezes que queremos iterar
* Contador + parâmentro(35) -> a iteração terá um limite máximo de 35.

### Deixando seu código mais enxuto:

````
    soma = soma + valorDoLivro
    soma += valorDoLivro
````

### Operador unário:

````
    contator ++
````
Código do *while* agora fica da seguinte forma.

````
    while (contador < 35) {
        double valorDoLivro = 59.90;
        soma += valorDoLivro;
        contador ++;
    }
````

### Looping For:

````
    double soma = o;
    for(inicialização, condição, atualização){
        regra
    }
````

#### Testando com código:
````
    Public class CalculadoraDeEstoque {
        public static void main(String[] args){
            double = 0;
            for(double i = 0; i < 35; i++)
            soma += 59.90;
        }
        System.out.println("O total em estoque é " + soma);
    }
````

### Trabalhando com continue Break
### *Continue*
Podemos utilizar a palavra-chave **_continue_** para pular uma interação em nosso looping
e forçar a execução do próximo laço. Veja o código:

````
    for(int i = 0; i <=10; i++){
        if(i == 7){
            continue;
        }
        System.out.println(i)
    }
````    
Nesse caso, usando o *continue* o número 7 será pulado e resultado será a sequencia de números 
de: 1,2,3,4,5,6,[7],8,9,10, ou seja, o número 7 será retirado da sequência.

### *Break*

Outra possibilidade comum é parar a execução de um looping da uma determinada condição. Para isso usamos 
a palavra **_break_**

````
    for(int i = 0; i <= 10; i++){
        if(i == 7){
            break
        }
        System.out.println(i)
    }
````
Nesse caso o que será impresso como resposta é a sequência:
1,2,3,4,5,6; 


## Orientação a Obejtos:


````
    public class Livro
````

Para deixar essa classe *livro* mais interessante, vamos criar alguns campos para representar o que um livro tem. Esses são os **atributos** de nossa classe: 

````
    public class livro{
        String nome;
    }
````
Reparamos que em nossa **_calculadoraDeEstoque_** está fazendo todo o trabalho dentro do método *main*, ainda de forma muito precedural. A orientação a objetos propõe uma maneira diferente de fazer isso, vai passa a trabalhar de um jeito diferente de fazer isso, você passa a trabalhar de um jeito mais próximo à realidade humana.
Para cada necessidade importante teremos objetos que interagem entre si e que são compostos por estados (atributos)
e comportamentos(métodos). Ex:

````
    double soma = 0;
    for(double i = 0, i < 35, i++){
     soma += 59.90
    }
````
O valor 59.90 representa o valor do livro; mas, e quanto ao seu nome? descrição? e demais informações? Todas essas informações representam o que o livro tem e são extremamente importantes para nosso sistema. O grande problema do paradigma procedural é que não existe uma forma simples de conectar todos esses elementos, já na orientação a objetos ´podemos fazer isso de um jeito muito simples! Assim como no contexto real, podemos criar um objeto para representar tudo o que um livro tem e o que ele faz.

### Criando um molde de livros

vamos criar uma classe chamada *Livro*. Essa classe será um molde, que representará o que um livro deve ter e como ele deve se comportar em nosso sistema.

### Classes x Objetos:

Uma classe é apenas um molde. Uma especificação que define para a máquina virtual o que um objeto desse tipo deverá ter e como ele deve se comportar. Nossa livraria poderá ter milhares de livros(*Objetos*), mas existirá penas uma classe **livro**(molde). Cada objeto que criarmos do tipo *Livro* terá seus próprios valores, ou seja, cada livro terá o seu próprio nome, sua descrião, um valor e um ISBN.

Criando mais livros em nosso *main* cadastroDeLivros.

````
    public class Calculadora {
    public static void main(String[] args) {
       Livro livro = new Livro();

       livro.nome = "Java 8 Prático";
       livro.descricao = "Novos recursos de linguagem";
       livro.valor = 59.90;
       livro.isbn = "978-85-66250-46-6";

        System.out.println("O nome do livro é: " + livro.nome);
        System.out.println("Descrição: " + livro.descricao);
        System.out.println("O livro custa: " + livro.valor);
        System.out.println("Isbn: " + livro.isbn);
    
        
        Livro outroLivro = new Livro();
        outroLivro.nome = "Lógica de Programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-0";
        System.out.println(outroLivro.nome);
        System.out.println(outroLivro.descricao);
        System.out.println(outroLivro.valor);
        System.out.println(outroLivro.isbn);
    
    }


}

````

Porém, ao observar que até agora nossa classe *Livro* só tem atributos, ou seja, só guarda valores. Vimos que uma classe vai além, ela também pode ter um comportamento(**Métodos**) 
### Criando um novo método;

A todo momento que criamos um novo objeto do tipo *Livro*, estamos imprimindo seus valores. Essa é uma necessidade comum entre todos os livros de nosso sistema, ma da forma como estamos fazendo,toda hora repetimos as mesma 4 linhas de código:

```
    System.out.println(livro.nome);
    System.out.println(livro.decricao);
    System.out.println(livro.valor);
    System.out.println(livro.isbn);
```

A única coisa que muda é o nome da variável, de *livro* para **outroLivro**.

Essa repetição de código sempre temum efeito colateral desagradável, que é a dificuldade de manutenção. Vamos ver? O que acontece se adicionarmos um novo atributo no livro, por exemplo a data de seu lançamento? Para imprimir a data toda vez que criarmos um livro, teremos que mudar 100 partes de nosso código, dado que já tivessemos adicionando em nossa biblioteca 100 livros diferentes. Ou seja, teríamos que mudar 100 (*System.out.println(")*)

Ao invés de deixar essa lógica de impressão toda espalhada, podemos isolar esse comportamento comum entre os livros na classe **Livro**! Para isso, criamos um método. Uma forma seria: 

````
    void mostrarDetalhes(){
    System.out.println(nome);
    System.out.println(decricao);
    System.out.println(valor);
    System.out.println(isbn);
    }
````
Esse método define um comportamento para classe **Livro**. Repare que a sintaxe de um método é um pouco diferente do que estamos acostumados, sua estrutura é:

````
    tipoDeRetorno nomeDoComportamento(){
        //código que será executado
    }
````

Nesse caso, não estamos retornando nada e, sim, apenas executando instruções dentro do método, portanto, seu tipo de retorno é *void*. Essa palavra reservada indica que um método não tem retorno.

Um método também pode ter variáveis declaradas, como: 

```
    void mostrarDetalhes(){
        String mensagem = "Mostrando mensagem do Livro";
        System.out.println(mensagem);
        System.out.println(nome);
        System.out.println(descricao);
        System.out.println(valor);
        System.out.println(isbn);
    }
```






