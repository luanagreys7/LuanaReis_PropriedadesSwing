import javax.swing.*;
import java.awt.*;

public class Ex3 extends JFrame {

    public Ex3() {

        // Propriedades do frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Cria o painel
        JPanel painel = new JPanel();
        
        // Texto longo inicial
        String texto = "Java Swing é usado para criar interfaces gráficas em Java. "
                     + "Ele fornece componentes como botões, caixas de texto, "
                     + "menus, tabelas, áreas de texto e muito mais. "
                     + "Com o Swing, é possível desenvolver aplicações "
                     + "desktop de forma rápida e organizada.";

        // JTextArea 
        JTextArea textArea = new JTextArea(texto,10, 30);
        textArea.setBackground(Color.LIGHT_GRAY); // Define a cor de fundo
        textArea.setFont(new Font("Arial", Font.PLAIN, 12)); // Define a fonte
        textArea.setLineWrap(true); // Permite quebra de linha automática
        textArea.setWrapStyleWord(true); // Quebra de linha por palavra
        
        // Adiciona JTextArea dentro de um JScrollPane para rolagem
        painel.add(new JScrollPane(textArea)); 
        
        // Adiciona o painel na janela
        add(painel);

        // Torna o frame visível
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ex3());
    }

    
}


