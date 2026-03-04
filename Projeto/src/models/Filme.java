public class Filme {

    private String nomeFilme; 
    private String duracao; 
    private String sinopse; 
    private int valorIngresso; 



    public Filme(String nomeFilme, String duracao, String sinopse, int valorIngresso){
        this.nomeFilme = nomeFilme; 
        this.duracao = duracao; 
        this.sinopse = sinopse; 
        this.valorIngresso = valorIngresso; 
    }

    public String getNomeFilme(){
        return nomeFilme; 
    }

    public String getDuracao(){
        return duracao; 
    }

    public String getSinopse(){
        return sinopse; 
    }

    public int getValorIngresso() {
        return valorIngresso;
    }

    public void setNomeFilme(){
        this.nomeFilme = nomeFilme;
    }

    public void setDuracao(){
        this.duracao = duracao; 
    }

    public void setSinopse(){
        this.sinopse = sinopse; 
    }

    public void setValorIngresso(){
        this.valorIngresso = valorIngresso;
    }

}


