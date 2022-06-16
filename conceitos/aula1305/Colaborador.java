class Colaborador {
    
    private String pNome;
    private String uNome;
    private double salario;

    Colaborador() {

    }

    public Colaborador(String pNome, String uNome, double salario) {
        this.pNome = pNome;
        this.uNome = uNome;
        this.salario = salario;
    }

    public String getPNome() {
        return this.pNome;
    }

    public void setPNome(String pNome) {
        this.pNome = pNome;
    }

    public String getUNome() {
        return this.uNome;
    }

    public void setUNome(String uNome) {
        this.uNome = uNome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Salario negativo");
        }
    }

}