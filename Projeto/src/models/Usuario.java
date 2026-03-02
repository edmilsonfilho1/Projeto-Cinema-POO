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
}