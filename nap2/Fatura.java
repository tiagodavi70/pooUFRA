public class Fatura {
    
    Cliente titular;
    Bandeira bandeira;
    Funcionario funcionario;
    Equipamento equipamento;
    String endereco;
    String mes;
    double consumo;

    public Fatura(Cliente titular, Bandeira bandeira, Funcionario funcionario, Equipamento equipamento, String endereco,
            String mes, double consumo) {
        this.titular = titular;
        this.bandeira = bandeira;
        this.funcionario = funcionario;
        this.equipamento = equipamento;
        this.endereco = endereco;
        this.mes = mes;
        this.consumo = consumo;
    }

    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public Bandeira getBandeira() {
        return bandeira;
    }
    public void setBandeira(Bandeira bandeira) {
        this.bandeira = bandeira;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Equipamento getEquipamento() {
        return equipamento;
    }
    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    public double getConsumo() {
        return consumo;
    }
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    public double valor() {
        double valor = (this.consumo * this.bandeira.getTaxaConsumo() + this.bandeira.getIluminacao());
        return  valor + valor * this.bandeira.getImposto();
    }
    
    @Override
    public String toString() {
        return "Titular: " + this.titular + "\n" +
        this.bandeira + " || " + "Funcionario: " + this.funcionario + "\n" + 
        this.equipamento + "\n" + "Endereco: " + this.endereco + "\n" + 
        "Mes:" + this.mes + " || " + "Consumo:" + this.consumo + "\n" + 
        "Valor Total: " + this.valor();
    }
}
