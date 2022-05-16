public class Calculadora {
    public static void main(String[] args) {

        Livro livro10Desc = new Livro();
        livro10Desc.valor = 89.90;
        System.out.println("Valor atual: " + livro10Desc.valor);

         livro10Desc.valor -= livro10Desc.valor * 0.1;

        System.out.println("Valor com desconto: " + livro10Desc.valor );

        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@gmail.com";
        autor.cpf = "066.554.848.48";


        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos de linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";

        livro.autor = autor;

       livro.mostrarDetalhes();

        Autor autor1 = new Autor();
        autor.nome = "Paulo Silveira";
        autor.email = "pauloalurasilveira@gmail.com";
        autor.cpf = "066.554.948.55";


        Livro outroLivro = new Livro();
        outroLivro.nome = "Orientação a Objetos e SOLID para Ninjas Projetando classes flexíveis";
        outroLivro.descricao = "Projetando classe flexiveis";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-49-9";

        outroLivro.autor = autor1;

        livro.mostrarDetalhes();


    }
}

