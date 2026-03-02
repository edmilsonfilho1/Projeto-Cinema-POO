public class Usuario{

    private String user; 
    private String cpf; 
    private String senha; 
    private String sexo; 
    private String email; 
    private String nomeCartao; 
    private String numeroCartao; 
    private String codigoCartao; 
    private int idade; 

    public Usuario(String user, String cpf, String senha, String sexo, String email, String nomeCartao, String numeroCartao, String codigoCartao, int idade){

        this.user = user;
        this.cpf = cpf;
        this.senha = senha;
        this.sexo = sexo;
        this.email = email;
        this.nomeCartao = nomeCartao;
        this.numeroCartao = numeroCartao;
        this.codigoCartao = codigoCartao;
        this.idade = idade;
    }

    public String getUser(){
        return user; 
    }

    public String getCpf(){
        return cpf; 
    }

    public String getSenha(){
        return senha; 
    }

    public String getSexo(){
        return sexo; 
    }

    public String getEmail(){
        return email; 
    }

    public String getNomeCartao(){
        return nomeCartao; 
    }

    public String getNumeroCartao(){
        return numeroCartao; 
    }

    public String getCodigoCartao(){
        return codigoCartao; 
    }

    public int getIdade(){
        return idade; 
    }

    public void setUser(){
        this.user = user;
    }

     public void setCpf(){
        this.cpf = cpf;
    }

    public void setSenha(){
        this.senha = senha; 
    }

    public void setSexo(){
        this.sexo = sexo; 
    }

    public void setEmail(){
        this.email = email; 
    }

    public void setNomeCartao(){
        this.nomeCartao = nomeCartao; 
    }

    public void setNumeroCartao(){
        this.numeroCartao = numeroCartao; 
    }

    public void setCodigoCartao(){
        this.codigoCartao = codigoCartao; 
    }

    public void setIdade(){
        this.idade = idade; 
    }

}