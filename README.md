# 📚 **README - Propriedades - Java Swing**  

Este repositório contém exercícios de **Java Swing**, focados na configuração de propriedades de componentes gráficos, e na organização de interface (com abas, painéis, divisões). Abaixo estão a descrição de cada exercício, com os métodos utilizados, e as respostas às tarefas de explicação (exercícios 3, 4, 6).  

---

## 🏗️ **Estrutura do Projeto**  
Cada exercício está em um arquivo `.java` separado:  
- `Ex1.java` (JPanel e JButton)  
- `Ex2.java` (JTabbedPane)  
- `Ex3.java` (JScrollPane e JTextArea)  
- `Ex4.java` (JFormattedTextField)  
- `Ex5.java` (JRadioButton e ButtonGroup)  
- `Ex6.java` (JSplitPane)  
- `Ex7.java` (JComboBox)  

---

## 🧩 **Descrição dos Exercícios**  

### **Exercício 1: JPanel e JButton**  
**Objetivo**: Criar uma janela com um `JPanel` verde e um `JButton` amarelo.  
**Métodos usados (Tarefa)**:  
| Método | Explicação |  
|--------|------------|  
| `setBackground(Color)` | Define a cor de fundo do componente. |  
| `setBorder(BorderFactory.createTitledBorder())` | Adiciona uma borda com título. | 
| `JButton(String text)` | Cria um botão e define o texto. | 

---

### **Exercício 2: JTabbedPane**  
**Objetivo**: Criar uma área de texto com rolagem automática.  
**Métodos usados**:  
| Método | Explicação |  
|--------|------------|  
| `JScrollPane(Component)` | Adiciona barras de rolagem ao componente. |  
| `setLineWrap(true)` | Ativa quebra de linha automática. |  
| `setWrapStyleWord(true)` | Quebra por palavras inteiras. |  
| `UIManager.getIcon("FileView.directoryIcon")` | Recupera ícone padrão do sistema |  

**Tarefa**:  
O `JScrollPane` é necessário porque o `JTextArea` não tem rolagem nativa. Quando o texto excede o espaço visível, as barras de rolagem aparecem.  

---
### **Exercício 3: JScrollPane e JTextArea**  
**Objetivo**: Criar uma área de texto com rolagem automática.  
**Métodos usados**:  
| Método | Explicação |  
|--------|------------|  
| `setFont(new Font("Arial", Font.PLAIN, 12))` | Altera a fonte usada. |  
| `setLineWrap(true)` | Ativa quebra de linha automática. |  
| `setWrapStyleWord(true)` | Quebra por palavras inteiras. |  

**Tarefa**:  
O `JScrollPane` é necessário porque encapsula o `JTextArea` e adiciona barras de rolagem quando o conteúdo excede o espaço visível. Como o `JTextArea` não possuí rolagem própria, o `JScrollPane` garante que o usário possa acessar todo o texto, mantendo a interface funcional. Sem o `JScrollPane`, o texto que ultrapassar o tamanho visível da área é cortado e fica inacessível.

---

### **Exercício 4: JFormattedTextField**  
**Objetivo**: Criar um campo de texto formatado para datas (dd/mm/aaaa).  
**Métodos usados**:  
| Método | Explicação |  
|--------|------------|  
| `MaskFormatter("##/##/####")` | Define a máscara de formatação. |  
| `setPlaceholderCharacter('_')` | Define o caractere de espaço reservado. |  

**Tarefa**:  "Como a formatação é aplicada?"
O `MaskFormatter` aplica a formatação através de uma máscara `##/##/####`, onde cada `#` representa um dígito obrigatório e as barras `/` são fixas. Caracteres inválidos são rejeitados, e os placeholders (`_`) guiam o usuário. Isso garante que o usuário só digite números no formato especificado ('dd/mm/aaaa'), validando a entrada em tempo real.  

---

### **Exercício 6: JSplitPane**  
**Objetivo**: Criar uma janela dividida verticalmente (40% esquerda, 60% direita).  
**Métodos usados**:  
| Método | Explicação |  
|--------|------------|  
| `setDividerLocation(0.4)` | Posiciona a divisória em 40% da largura. |  
| `setResizeWeight(0.4)` | Mantém a proporção ao redimensionar. |  

**Tarefa**: "Como o metódo `setDividerLocation` funciona?"
O método `setDividerLocation` define a posição inicial da divisória no `JSplitPane`. Utilizando o valor percentual (0.4), a divisória ocupa 40% da largura total, mantendo a proporção ao redimensionar a janela com o `setResizeWeight(0.4)`.

---

## 📌 **Métodos Comuns a Vários Exercícios**  
| Método | Explicação |  
|--------|------------|  
| `setSize(int, int)` | Define o tamanho da janela. |  
| `setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)` | Encerra o programa ao fechar a janela. |  
| `setLocationRelativeTo(null)` | centraliza a janela na tela. | 
| `setVisible(true)` | Torna a janela visível. |  
| `add(Component)` | Adiciona componentes (botões, labels) a um container. | 
| `JTextField(String texto, int colunas)` | Cria campo de texto com texto inicial e largura em colunas. | 
| `JTextArea(String texto, int linhas, int colunas)` | Área de texto com dimensões fixas. |


---
