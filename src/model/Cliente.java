package model;

import interfaces.Aperhends;


public class Cliente extends Pessoa implements Aperhends{
   
    public Cliente(String nome, String telefone, String cpf,String sexo, Endereco endereco){ 
        super(nome,telefone,cpf,sexo,endereco);
} 
@Override
public void apertarAm(){
    System.out.print("Prazer sou o cliente");
}

}
