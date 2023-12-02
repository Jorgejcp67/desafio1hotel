import java.util.ArrayList;

import model.Endereco;
import model.Pessoa;


public class App {
   public static void main(String[] args) {

      System.out.println("Desafio 1");
      System.out.println("Backend");
      System.out.println();
      
      Endereco endereco1 = new Endereco("Av pink floyd", 25, "centro", "3 rios", "casa01");

      Endereco endereco2 = new Endereco("Est. do metalica", 27, "rock", "Rio de janeiro", "cobertura");

      ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
      enderecos.add(endereco1);
      enderecos.add(endereco2);

      System.out.println("Pessoa 1");
      Pessoa pessoa1 =new Pessoa("jorge", "536378", "64849393", "masculino", endereco1);
      pessoa1.apertarAm();
      System.out.println("----------------------");
      System.out.println();
      
      System.out.println("Pessoa 2");
      Pessoa pessoa2 =new Pessoa("camila", "56483939", "6464839", "feminino", endereco2);
      pessoa1.apertarAm();
      System.out.println("----------------------");
      System.out.println();
      
      System.out.println("Pessoa 3");
      Pessoa pessoa3 =new Pessoa("Aian", "532909202", "6486678888", "masculino", endereco1);
      pessoa1.apertarAm();
      System.out.println("----------------------");
      System.out.println();
      
      ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
      pessoas.add(pessoa1);
      pessoas.add(pessoa2);
      pessoas.add(pessoa3);
      
      pessoas.stream().count();
      pessoas.size();
       
      pessoas.stream()
      .limit(3)
      .forEach(c->System.out.println(c.getNome()));
      System.out.println("até  3");
      System.out.println("Pessoas");
      System.out.println("----------------------");
      
      enderecos.stream()
      .limit(3)
      .forEach(c->System.out.println(c.getRua()));
      System.out.println("até  3");
      System.out.println("endereços");
      System.out.println("----------------------");
     
      pessoas.stream()
      .filter(c->c.getNome().contains("camila"))
      .forEach(c->System.out.println(c.getNome()));
      System.out.println("----------------------");
      System.out.println(" é o nome buscado ");
      System.out.println("----------------------");
   }
      
}
