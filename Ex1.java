import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Ex1 extends JFrame {
    
    public Ex1 () {

        // Propriedades do frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o aplicativo ao fechar a janela
        setSize(300, 200); // Define o tamanho da janela
        setLocationRelativeTo(null); // Centraliza o frame na tela

        // Cria o painel
        JPanel painel = new JPanel();

        // Define a cor de fundo do painel
        painel.setBackground(Color.GREEN);

        // Define uma borda com título ao painel
        Border borda = BorderFactory.createTitledBorder("Painel de Controle");
        painel.setBorder(borda);

        // Cria um botão
        JButton botao = new JButton("Clique Aqui"); 
        botao.setBackground(Color.YELLOW);

        // Adiciona o botão ao painel
        painel.add(botao);

        // Adiciona o painel na janela
        add(painel);

        // Torna o frame visível
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ex1());
    }
}