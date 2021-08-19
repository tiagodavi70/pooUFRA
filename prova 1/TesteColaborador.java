public class TesteColaborador {
    
    // Crie uma classe chamada Colaborador que inclua três variáveis de instância — 
    // um primeiro nome (tipo String), um sobrenome (tipo String) e um salário mensal (double).
    // Forneça um construtor que inicializa as três variáveis de instância. Forneça um método set e um get 
    // para cada variável de instância. Se o salário mensal não for positivo, configure como 0.
    // 
    // Escreva um aplicativo de teste chamado TesteColaborador que demonstra as capacidades da classe Colaborador.
    // Nessa classe crie um vetor com 10 colaboradores, apresente os salários, e escolha o colaborador
    // com o maior salário e apresente em tela. (Não escolha manualmente). 
    // Então dê a cada Colaborador um aumento de 5% e exiba novamente o salário anual de cada Colaborador.

    public static void main(String[] args) {
        
        Colaborador[] colaboradores = {
            new Colaborador("A", "B", 100),
            new Colaborador("C", "D", 200),
            new Colaborador("E", "F", 300),
            new Colaborador("G", "H", 400),
            new Colaborador("I", "J", 500),
            new Colaborador("K", "L", 150),
            new Colaborador("M", "N", 250),
            new Colaborador("O", "P", 350),
            new Colaborador("Q", "R", 450),
            new Colaborador("S", "T", 550)
        };


        for (Colaborador c : colaboradores) {
            System.out.println(c.getNome() + " " + c.getSalario());
        }

        Colaborador maior = colaboradores[0];
        for (Colaborador c : colaboradores) {
            if (c.getSalario() > maior.getSalario())
                maior = c;
        }

        System.out.println("Maior: " + maior.getNome() + " " + maior.getSalario());

        for (int i = 0 ; i < colaboradores.length ; i++) {
            // colaboradores[i].setSalario(colaboradores[i].getSalario() * 1.05);
            colaboradores[i].setSalario(colaboradores[i].getSalario() + 
                                        colaboradores[i].getSalario() * 5/100); // 0.05
        }

        // todo mundo alterado e anual
        for (Colaborador c : colaboradores) {
            System.out.println(c.getNome() + " " + c.getSalario()*12);
        }
    }
}
