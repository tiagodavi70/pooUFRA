package questao4;

public class Quarto {
 
    int ventiladores;
    int tomadas;
    boolean armario;

    Quarto(int ventiladores, int tomadas, boolean armario) {
        this.ventiladores = ventiladores;
        this.tomadas = tomadas;
        this.armario = armario;
    }

    public int getVentiladores() {
        return this.ventiladores;
    }

    public void setVentiladores(int ventiladores) {
        this.ventiladores = ventiladores;
    }

    public int getTomadas() {
        return this.tomadas;
    }

    public void setTomadas(int tomadas) {
        this.tomadas = tomadas;
    }

    public boolean getArmario() {
        return this.armario;
    }

    public void setArmario(boolean armario) {
        this.armario = armario;
    }

    @Override
    public String toString() {
        return "Ventiladores: " + this.ventiladores + "\n" +
                "Tomadas: " + this.tomadas + "\n" +
                "Armario: " + this.armario;
    }
}
