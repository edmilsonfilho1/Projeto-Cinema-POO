public class Bilhete {
    private String user;
    private String cpf;
    private String sala;
    private String sessao;
    private Filme filme; //Acredito que tenhamos que trazer a classe Filme para cá, para então realizarmos o que se pede.
    private double valor;
    private String cadeiraComprada;

    public Bilhete(String user, String cpf, String sala, String sessao, Filme filme, double valor, String cadeiraComprada) {
        this.user = user;
        this.cpf = cpf;
        this.sala = sala;
        this.sessao = sessao;
        this.filme = filme;
        this.valor = valor;
        this.cadeiraComprada = cadeiraComprada;
    }

    private void valor() {
        double taxaSala = 0.0;
        if(this.sala.equals("IMAX")) {
            taxaSala = 15.0;
        }

        this.valor = this.filme.getValorIngresso() + taxaSala; //pegando o valor do ingresso.
    }

    public String getUser() {
        return user;
    }

    public String getSala() {
        return sala;
    }

    public String getSessao() {
        return sessao;
    }

    public double getValor() {
        return valor;
    }

    public String getCadeiraComprada() {
        return cadeiraComprada;
    }

    public String getCpf() {
        return cpf;
    }

}
