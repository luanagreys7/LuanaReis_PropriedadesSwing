import javax.swing.*;
import java.awt.*;

public class Ex2 extends JFrame {

    public Ex2() {

        // Propriedades do frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Cria o JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Aba 1 - título e JLabel
        JPanel aba1 = new JPanel();
        aba1.add(new JLabel("Bem-vindo às Configurações!"));
        tabbedPane.addTab("Configurações", aba1);

        // Aba 2 - título, ícone, fundo azul e JTextField
        JPanel aba2 = new JPanel();
        aba2.setBackground(Color.BLUE); // Define o fundo azul
        JLabel labelAba2 = new JLabel("Nome:");
        labelAba2.setForeground(Color.WHITE); // Define a cor do texto como branco
        aba2.add(labelAba2);
        aba2.add(new JTextField(20)); // Adiciona um JTextField (Campo de texto)
        
        // Ícone padrão do sistema
        Icon icon2 = UIManager.getIcon("OptionPane.informationIcon"); // Ícone padrão do sistema
        tabbedPane.addTab("Perfil", icon2, aba2);

        // Aba 3 - título e JTextArea
        JPanel aba3 = new JPanel();
        
        // JTextArea 
        JTextArea textArea = new JTextArea("Digite suas dúvidas aqui. ",5, 20);
        textArea.setLineWrap(true); // Permite quebra de linha automática
        textArea.setWrapStyleWord(true); // Quebra de linha por palavra
        
        // Adiciona JTextArea dentro de um JScrollPane para rolagem
        aba3.add(new JScrollPane(textArea)); 
        
        tabbedPane.addTab("Ajuda", aba3);

        // Adiciona o JTabbedPane ao frame
        add(tabbedPane);

        // Torna o frame visível
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ex2());
    }

    
}
