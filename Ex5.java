import javax.swing.*;

public class Ex5 extends JFrame {

    public Ex5() {

        // Propriedades do frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);


        // Cria o painel principal


        // Torna o frame visível
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ex5());
    }
    
}