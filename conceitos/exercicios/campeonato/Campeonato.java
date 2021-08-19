public class Campeonato {
    
    // Crie uma classe Time que inclua quatro variáveis de instância - um nome (tipo String),
    // uma cidade (tipo String) e a quantidade de gols marcados e recebidos no ano (tipo inteiro).
    // Forneça um construtor que inicializa as quatro variáveis de instância. Forneça um método set e
    // um get para cada variável de instância. Deve criar também um método que calcule o saldo de gols.
    // Escreva um aplicativo de teste chamado Campeonato que demonstre as capacidades da classe Time.
    // Crie quatro objetos Time e exiba o total de gols e a cidade de cada um deles.
    // Ao fim deve dizer qual deles tem o maior saldo de gols.

    public static void main(String[] args) {
        
        Time paysandu = new Time("Paysandu", "Belém", 20, 25);
        Time remo = new Time("Remo", "Belém", 30, 2);
        Time tuna = new Time("Tuna Luso", "Belém", 25, 20);
        Time castanhal = new Time("Castanhal", "Castanhal", 23, 23);

        Time[] times = {paysandu, remo, tuna, castanhal};
        for (int i = 0 ; i < times.length ; i++){
            System.out.println(times[i].nome + " " + times[i].golsMarcados + " " + times[i].cidade);
        }
        System.out.println();

        Time maior = times[0];
        for (Time time : times) {
            if (time.saldoGols() > maior.saldoGols() ) {
                maior = time;
            }
        }

        System.out.println(maior.nome + " " + maior.saldoGols() + " " + maior.cidade);
    }
}
