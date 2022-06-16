import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InterfaceGrafica {
    public static void main(String[] args) {
        String nome = null;
        int resposta;
        
        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        System.out.println(nome);

        resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome +"?");
        if (resposta == JOptionPane.YES_OPTION) {
        // verifica se o usuário clicou no botão YES
            JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
        } else {
            JOptionPane.showMessageDialog(null, "Seu nome não é " + nome, "Atenção", JOptionPane.WARNING_MESSAGE);
        }

        int continuar = JOptionPane.showConfirmDialog(null,
            "Deseja continuar?",
            "Uma questão simples",
            JOptionPane.YES_NO_OPTION);

        System.out.println(continuar);
        
        String[] options = {"Sim", "Não", "Cancelar"};
        int n = JOptionPane.showOptionDialog(null,
            "Selecione uma das opções abaixo:",
            "Uma questão simples",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);

        String[] escolhas = {"Avançar", "Esperar", "Voltar"};
        String s = (String)JOptionPane.showInputDialog(
            null,
            "Escolha uma das opções",
            "Seleção simples",
            JOptionPane.PLAIN_MESSAGE,
            null,
            escolhas,
            "Avançar");

        JFrame f = new JFrame();  
        
        JButton b = new JButton("clique"); // criando instância de JButton  
        b.setBounds(130,100,100, 40); // define limites - x, y, largura e altura
                    
        f.add(b); // adicionando o botão ao frame
                    
        f.setSize(400,500); // tamanho do frame
        f.setLayout(null); // sem gerenciador de layout   
        f.setVisible(true);  
    }   
}
