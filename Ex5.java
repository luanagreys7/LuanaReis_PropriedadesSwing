import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex5 extends JFrame {

    public Ex5() {

        // Propriedades do frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);


        // Cria o painel principal
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(5, 1)); // Define o layout do painel como GridLayout com 5 linhas e 1 coluna

        // Cria os JRadioButtons para seleção de gênero
        JRadioButton masculino = new JRadioButton("Masculino");
        JRadioButton feminino = new JRadioButton("Feminino");
        JRadioButton outro = new JRadioButton("Outro");

        // ButtonGroup garantindo que apenas um JRadioButton seja selecionado por vez
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(masculino);
        grupo.add(feminino);
        grupo.add(outro);

        // JLabel para mostrar a opção escolhida ( Atualiza o texto quando o botão é clicado)
        JLabel resultado = new JLabel("Selecione um gênero e clique no botão");

        // Cria o botão para exibir o Jlabel com a opção selecionada
        JButton botao = new JButton("Confirmar");

        // Ação ao clicar no botão com ActionListener
        botao.addActionListener(new ActionListener() {
            @Override
            // Classe anônima implementa (sobescrevendo) o método obrigatório do ActionListener (actionPerformed)
            public void actionPerformed(ActionEvent e) {
                if (masculino.isSelected()) {
                    resultado.setText("Selecionado: Masculino");
                } else if (feminino.isSelected()) {
                    resultado.setText("Selecionado: Feminino");
                } else if (outro.isSelected()) {
                    resultado.setText("Selecionado: Outro");
                } else {
                    resultado.setText("Nenhuma opção selecionada");
                }
            }
        });

        // Adiciona componentes ao painel
        painel.add(masculino);
        painel.add(feminino);
        painel.add(outro);
        painel.add(botao);
        painel.add(resultado);

        // Adiciona o painel na janela
        add(painel);
        

        // Torna o frame visível
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ex5());
    }
    
}