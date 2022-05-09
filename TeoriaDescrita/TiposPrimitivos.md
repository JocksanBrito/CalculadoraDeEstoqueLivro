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


