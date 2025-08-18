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
        
        // Texto longo (para forçar o scroll)
        String texto = "Java Swing é usado para criar interfaces gráficas em Java.\n"
                     + "Ele fornece componentes como:\n"
                     + "- JButton (botões)\n"
                     + "- JTextField (campos de texto)\n"
                     + "- JTextArea (áreas de texto)\n"
                     + "- JScrollPane (painel de rolagem)\n"
                     + "- JPanel (painéis genéricos)\n"
                     + "- E muito mais!\n\n"
                     + "Com o Swing, você pode desenvolver aplicações desktop completas.\n"
                     + "Exemplo de uso:\n"
                     + "1. Crie um JFrame para a janela principal.\n"
                     + "2. Adicione componentes como botões e labels.\n"
                     + "3. Use layouts para organizar os componentes.\n"
                     + "4. Adicione listeners para interatividade.\n\n"
                     + "Dica: Sempre use JScrollPane com JTextArea para textos longos!\n"
                     + "Este texto é longo o suficiente para ativar a rolagem vertical e horizontal.";

        // JTextArea com 10 linhas e 30 colunas
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

/*
Tarefa: "Explique por que o JScrollPane é necessário neste cenário."
O JScrollPane é necessário porque encapsula o JTextArea e adiciona barras
de rolagem quando o conteúdo excede o espaço visível. Como o JTextArea
não possuí rolagem própria, o JScrollPane garante que o usário possa
acessar todo o texto, mantendo a interface funcional. Sem o JScrollPane, o
texto que ultrapassar o tamanho visível da área é cortado e fica inacessível.


 */


