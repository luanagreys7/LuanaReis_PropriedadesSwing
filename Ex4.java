import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class Ex4 extends JFrame {

    public Ex4() {

        // Propriedades do frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centraliza o frame na tela


        // Cria o painel 
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(2,1)); // Define o layout do painel como GridLayout com 2 linhas e 1 coluna);

        // Label para o campo de data
        JLabel labelData = new JLabel("Data de Nascimento: ");

        // Crio o campo formatado como null para criá-llo dentro do try-catch
        JFormattedTextField campoData = null;
        try {
            // Define a máscara "dd/mm/aaaa"
            MaskFormatter mascaraData = new MaskFormatter("##/##/####");
            mascaraData.setPlaceholderCharacter('_'); // Define o caractere de espaço reservado
            campoData = new JFormattedTextField(mascaraData);
            campoData.setColumns(10);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Adiciona o label e o campo de data ao painel
        painel.add(labelData);
        painel.add(campoData);

        // Adiciona o painel na janela
        add(painel);

        // Torna o frame visível
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ex4());
    }
}

/*
Tarefa: "Como a formatação é aplicada?" 
O MaskFormatter aplica a formatação através de uma máscara ##/##/####,
onde cada # representa um dígito obrigatório e as barras / são fixas. 
Caracteres inválidos são rejeitados, e os placeholders (_) guiam o usuário.
Isso garante que o usuário só digite números no formato especificado
('dd/mm/aaaa'), validando a entrada em tempo real.
    */
