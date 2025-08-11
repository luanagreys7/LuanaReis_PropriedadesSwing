import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Ex1 extends JFrame {
    
    public Exercicio1Painel() {

        // Propriedades do frame
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Cria o painel e define sua cor de fundo
        JPanel painel = new JPanel();
        painel.setBackground(Color.GREEN);

        // Define uma borda com título ao painel
        Border borda = BorderFactory.createTitledBorder("Meu Painel");
        painel.setBorder(borda);

        // Cria um botão
        JButton botao = new JButton("Clique Aqui"); 
        setBackground(Color.YELLOW);

        // Adiciona o botão ao painel
        painel.add(botao);

        // Adiciona o painel ao frame
        add(painel);

        // Torna o frame visível
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Exercicio1Painel());
    }
}