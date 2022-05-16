public class Autor {
    String nome;
    String email;
    String cpf;

    void mostrarDetalhes(){
        System.out.println("Informações sobre o Autor");
        System.out.println("Autor: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
    }

}
