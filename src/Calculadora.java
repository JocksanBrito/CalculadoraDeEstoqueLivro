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
        outroLivro.nome = "Orientação a Objetos e SOLID para Ninjas Projetando classes flexíveis";
        outroLivro.descricao = "Projetando classe flexiveis";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-49-9";

        System.out.println("O nome do livro é: " + outroLivro.nome);
        System.out.println("Descrição: " + outroLivro.descricao);
        System.out.println("O livro custa: " + outroLivro.valor);
        System.out.println("Isbn: " + outroLivro.isbn);




    }
}

