package model;

public   class Endereco {
    protected String rua;

    protected Integer numero;

    protected String bairro;

    protected String cidade;

    protected String complemento;

    public Endereco(String rua,Integer numero,String bairro,String cidade,String complemento ){
        this.rua = rua;
         this.numero = numero;
          this.bairro = bairro;
           this.cidade = cidade;
            this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
}
