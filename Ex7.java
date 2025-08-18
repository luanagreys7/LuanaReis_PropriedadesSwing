import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex7 extends JFrame {

    public Ex7() {

        // Propriedades do frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);


        // Cria o painel principal
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(3, 1)); // Define o layout do painel como GridLayout com 3 linhas e 1 coluna

        // Cria o JComboBox com os países
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Brasil");
        comboBox.addItem("Argentina");
        comboBox.addItem("Chile");
        comboBox.setSelectedIndex(1); // Seleciona o segundo item (Argentina) por padrão
        
        // JLabel para mostrar o país selecionado   
        JLabel labelResultado = new JLabel("País selecionado: Argentina", SwingConstants.CENTER);  // Texto padrão
        
        // Adiciona um ItemListener para atualizar o JLabel quando um país é selecionado
        comboBox.addItemListener(new ItemListener() {
            @Override
            // Método que é chamado quando o estado do item muda (selecionado/desselecionado)
            // classe implementa o método obrigatório do ItemListener (itemStateChanged)
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selecionado = (String) comboBox.getSelectedItem();
                    labelResultado.setText("País selecionado: " + selecionado);
                }
            }
        });

        // Adiciona componentes ao painel
        painel.add(comboBox);
        painel.add(labelResultado);

        
        // Adiciona o painel na janela
        add(painel);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ex7());
    }
    
}