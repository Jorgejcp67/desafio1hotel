package model;

import interfaces.Aperhends;

public class Pintor extends Pessoa implements Aperhends{
    public Pintor(String nome, String telefone, String cpf, String sexo, Endereco endereco) {
        super(nome, telefone, cpf, sexo, endereco);
        //TODO Auto-generated constructor stub
    }
    private double salario;

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario =salario;
    }
    @Override
    public void apertarAm(){
        System.out.println("apertar a mão");
    }
}