import javax.swing.*;

public class Ex2 extends JFrame {

    public Ex2() {

        // Propriedades do frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Cria o JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Aba 1
        JPanel aba1 = new JPanel();
        aba1.add(new JLabel("Bem-vindo às Configurações!"));
        tabbedPane.addTab("Configurações", aba1);

        // Aba 2
        JPanel aba2 = new JPanel();
        aba2.add(new JLabel(0,
        Icon icon2 = UIManager.getIcon("OptionPane.informationIcon"); // Ícone padrão do sistema
        tabbedPane.addTab("Perfil", icon2, aba2);

        // Aba 3
        JPanel aba3 = new JPanel();
        aba3.add(new JLabel("Conteúdo da Aba 3"));
        Icon icon3 = UIManager.getIcon("OptionPane.warningIcon"); // Ícone padrão do sistema
        tabbedPane.addTab("Aba 3", icon3, aba3, "Esta é a terceira aba com um ícone de aviso");

        // Adiciona o JTabbedPane ao frame
        add(tabbedPane);

        // Torna o frame visível
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ex2());
    }

    
}
