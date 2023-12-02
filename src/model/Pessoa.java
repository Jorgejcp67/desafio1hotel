package model;

public   class Pessoa  {
    private String nome;
    private String telefone;
    private String cpf;
    private String sexo;
    private Endereco endereco;

   
  
    
    public void apertarAm() {
        System.out.println("Prazer meu nome é");
        System.out.println("----------------------");
        System.out.println();
    }
    
    
    //#region  construction
    public  Pessoa ( String nome,String telefone, String cpf,String sexo,Endereco endereco ) {
        
         this.nome = nome;
          this.telefone = telefone;
          this.cpf = cpf;
           this.sexo=sexo;
           this.endereco = endereco;
    }
    //#endregion
    //#region  getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    //#endregion
    
    
}