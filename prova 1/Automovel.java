class Automovel {
    
    String nome;
    double litrosTanque; // litros que ainda estão no tanque
    double litrosKm; // consumo de litros por km
    
    Automovel(String nome, double litrosTanque, double litrosKm) {
        this.nome = nome;
        this.litrosTanque = litrosTanque;
        this.litrosKm = litrosKm;
    }

    // dado uma distância em km, calcula os litros utilizados
    public double litrosUtilizados(double km) {
        double litros = km * this.litrosKm;
        consumirTanque(litros);
        return litros;
    }
    
    // consome a gasolina do tanque
    public void consumirTanque(double litros) {
        this.litrosTanque = this.litrosTanque - litros; 
    }
    
}
