public class Time {

    String nome;
    String cidade;
    int golsRecebidos;
    int golsMarcados;

    public Time(String nome, String cidade, int golsRecebidos, int golsMarcados) {
        this.nome = nome;
        this.cidade = cidade;
        this.golsRecebidos = golsRecebidos;
        this.golsMarcados = golsMarcados;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getGolsRecebidos(){
        return this.golsRecebidos;
    }

    public void setGolsRecebidos(int gols){
        this.golsRecebidos = gols;
    }

    public int getGolsMarcados(){
        return this.golsMarcados;
    }

    public void setGolsMarcados(int gols){
        this.golsMarcados = gols;
    }

    public int saldoGols() {
        return this.golsMarcados - this.golsRecebidos;
    }
}