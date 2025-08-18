import javax.swing.*;
import java.awt.*;

public class Ex6 extends JFrame {

    public Ex6() {

        // Propriedades do frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);


        // Painel esquerdo (vermelho)
        JPanel painelEsquerdo = new JPanel();
        painelEsquerdo.setBackground(Color.RED);
        painelEsquerdo.add(new JLabel("Esquerda", SwingConstants.CENTER));

        // Painel direito (azul)
        JPanel painelDireito = new JPanel();
        painelDireito.setBackground(Color.BLUE);
        painelDireito.add(new JLabel("Direita", SwingConstants.CENTER));

        JSplitPane splitPane = new JSplitPane(
            JSplitPane.HORIZONTAL_SPLIT, // Divisão vertical (esqerda/direita)
            painelEsquerdo, 
            painelDireito
        );

        // Divisória é posicionada a 40% da largura da janela
        splitPane.setDividerLocation(0.4); 
        splitPane.setResizeWeight(0.4); // Redimensiona proporcionalmente
        splitPane.setDividerSize(10); // Espessura da divisória
        

        // Adiciona o JSplitPane ao frame
        add(splitPane);

        // Torna o frame visível
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ex6());
    }
}