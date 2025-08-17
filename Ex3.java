import javax.swing.*;
import java.awt.*;

public class Ex3 extends JFrame {

    public Ex3() {

        // Propriedades do frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Cria o JTextArea dentro de um JScrollPane para rolagem
        JTextArea textArea = new JTextArea("Digite suas dúvidas aqui. ", 5, 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true); // Quebra de linha por palavra
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Barra de rolagem vertical sempre visível

        // Cria o painel principal
        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout()); // Define o layout do painel como BorderLayout 


        // Torna o frame visível
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ex2());
    }

    
}


