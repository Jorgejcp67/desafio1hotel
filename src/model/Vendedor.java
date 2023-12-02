package model;
import interfaces.Aperhends;

public class Vendedor extends Pessoa implements Aperhends {
    
    public Vendedor(String nome, String telefone, String cpf,String sexo,Endereco endereco) {
        super(nome,telefone,cpf,sexo,endereco);
    }

    
@Override
    public void apertarAm() {
    System.out.println("sou o vendedor");
}

}
