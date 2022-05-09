public class Calculadora {
    public static void main(String[] args) {
        /**double livroJava8 = 60;
        double livroTDD = 60;

        double soma = livroJava8 + livroTDD;

        System.out.println("O total em estoque é "+ soma);

       if (soma < 150) {
            System.out.println("Seu estoque está muito baixo");
        } else if (soma >= 2000) {
            System.out.println("Seu estoque está muito alto");
        } else {
            System.out.println("Seu estoque está bom ");
        }
        **/

       double somatoEstoque = 0;
       int contador = 0;

       while (contador < 35) {
           double valorDoLivro = 59.90;
           somatoEstoque = somatoEstoque + valorDoLivro;
           contador = contador + 1;
       }
        System.out.println("O total de estoque é = " + somatoEstoque );

        if (somatoEstoque < 150) {
            System.out.println("O seu estoque está baixo");
        } else if (somatoEstoque >= 2000) {
            System.out.println("Seu estoque está muito alto");
        }
        else {
            System.out.println("Seu estoque está bom");
        }

        for (int i = 0; i <=10 ; i++) {
            if (i == 7) {
                continue;
            }
            System.out.println(i);
        }

        for(int i = 0; i <= 10; i++){
            if(i == 7){
                break;
            }
            System.out.println(i);
        }
    }
}

