/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FrmLancamentoVendas extends javax.swing.JFrame {
    
    private String strCaminhoArquivo;

    public FrmLancamentoVendas() {
        initComponents();
        configurarTabela();
        
        // CAMINHO PARA SALVAR NO "BANCO DE DADOS" NO ARQUIVO DADOS_LANC_VENDAS.txt
        this.strCaminhoArquivo = "C:\\Users\\ACER\\OneDrive\\Documentos\\NetBeansProjects\\Trabalho1_Desktop\\CadastroLoja\\src\\main\\java\\DADOS.TXT\\DADOS_LANC_VENDAS.txt";
     
        //  configurarTabela();
        //  carregarDados(strCaminhoArquivo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtDataVenda = new javax.swing.JFormattedTextField();
        txtValorTotal = new javax.swing.JTextField();
        cbFormaPag = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btVoltarMenu = new javax.swing.JButton();
        SPVendas = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Lançamento de Vendas");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(153, 153, 153), java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel2.setText("Cliente : *");

        jLabel3.setText("Produto : *");

        jLabel4.setText("Quantidade : *");

        jLabel5.setText("Data da Venda : *");

        jLabel6.setText("Forma de Pagamento : *");

        jLabel7.setText("Valor Total : *");

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });

        txtQuantidade.setToolTipText("");
        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        try {
            txtDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataVendaActionPerformed(evt);
            }
        });

        txtValorTotal.setText("R$ ");
        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });

        cbFormaPag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Pix", "Dinheiro em Espécie", "Cartão de Crédito ", "Cartão de Débito", "Boleto Bancário", "Transferência Bancária ", "Cheque", " " }));
        cbFormaPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFormaPagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProduto)
                    .addComponent(cbFormaPag, 0, 201, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(txtValorTotal))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFormaPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        btSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\OneDrive\\Documentos\\NetBeansProjects\\Trabalho1_Desktop\\CadastroLoja\\src\\main\\java\\imagens_botao\\btSalvar.png")); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\OneDrive\\Documentos\\NetBeansProjects\\Trabalho1_Desktop\\CadastroLoja\\src\\main\\java\\imagens_botao\\btEditar.png")); // NOI18N
        btEditar.setText("EDITAR");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\OneDrive\\Documentos\\NetBeansProjects\\Trabalho1_Desktop\\CadastroLoja\\src\\main\\java\\imagens_botao\\btExcluir.png")); // NOI18N
        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\OneDrive\\Documentos\\NetBeansProjects\\Trabalho1_Desktop\\CadastroLoja\\src\\main\\java\\imagens_botao\\btLimpar.png")); // NOI18N
        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btVoltarMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btVoltarMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\OneDrive\\Documentos\\NetBeansProjects\\Trabalho1_Desktop\\CadastroLoja\\src\\main\\java\\imagens_botao\\btVoltarMenu.png")); // NOI18N
        btVoltarMenu.setText("VOLTAR AO MENU");
        btVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btVoltarMenu)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Produto", "Quantidade", "Data da Venda", "Forma de Pagamento", "Valor total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVendasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVendas);

        SPVendas.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SPVendas))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SPVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private boolean validarCampos() { // VALIDAÇÃO DOS CAMPOS NA TELA DE CADASTRO DE PRODUTOS.
    if (txtCliente.getText().trim().isEmpty()) {
        mostrarErro("Cliente", txtCliente);
        return false;
    }
    if (txtProduto.getText().trim().isEmpty()) {
        mostrarErro("Produto", txtProduto);
        return false;
    }
    if (txtQuantidade.getText().trim().isEmpty()) {
        mostrarErro("Quantidade", txtQuantidade);
        return false;
    }
    if (txtDataVenda.getText().trim().isEmpty() || isCampoMascaradoVazio(txtDataVenda)) {
        mostrarErro("Data da Venda", txtDataVenda);
        return false;
    }
    if (isComboBoxInvalida(cbFormaPag)) {
        mostrarErro("Forma de Pagamento", cbFormaPag);
        return false;
    }
    if (txtValorTotal.getText().replace("R$", "").trim().isEmpty()) {
    mostrarErro("Valor Total", txtValorTotal);
    return false;
    }

    return true;
}

// Verifica se o campo de máscara está vazio
private boolean isCampoMascaradoVazio(JFormattedTextField campo) {
    String texto = campo.getText().replaceAll("[^0-9A-Za-z]", "").trim();
    return texto.isEmpty();
}

// Verifica se a ComboBox tem valor inválido
private boolean isComboBoxInvalida(JComboBox<?> comboBox) {
    Object selectedItem = comboBox.getSelectedItem();
    // Verifica se não tem nada selecionado ou se o valor é "Selecione"
    return selectedItem == null || selectedItem.toString().trim().isEmpty() || selectedItem.toString().equalsIgnoreCase("Selecione");
}

// Mostra erro e foca no campo
private void mostrarErro(String campo, java.awt.Component componente) {
    JOptionPane.showMessageDialog(this, "O campo " + campo + " é obrigatório!", "Erro", JOptionPane.ERROR_MESSAGE);
    componente.requestFocus();
}

private void gravarDados() {
    String strCaminhoArquivo = "C:\\Users\\ACER\\OneDrive\\Documentos\\NetBeansProjects\\Trabalho1_Desktop\\CadastroLoja\\src\\main\\java\\DADOS.TXT\\DADOS_LANC_VENDAS.txt";
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(strCaminhoArquivo, true))) {
        writer.newLine();
        writer.write("====================");
        writer.newLine();
        writer.write("Clientes: " + txtCliente.getText());
        writer.newLine();
        writer.write("Produto: " + txtProduto.getText());
        writer.newLine();
        writer.write("Quantidade: " + txtQuantidade.getText());
        writer.newLine();
        writer.write("Data da Venda: " + txtDataVenda.getText());
        writer.newLine();
        writer.write("Forma de Pagamento: " + cbFormaPag.getSelectedItem().toString());
        writer.newLine();
        writer.write("Valor Total: " + txtValorTotal.getText());
        writer.newLine();
        writer.write("------------------------------------------------------");  // Marca o fim do cadastro
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao salvar os dados: " + ex.getMessage());
    }
}


private void limpar (){ // BOTÃO LIMPAR.
    // LIMPA OS DADOS DIGITADOS NA TELA DE LANÇAMENTOS DE VANDAS, É ACIONADO NO BOTÃO DE LIMPAR.
    try{
        txtCliente.setText("");
        txtProduto.setText("");
        txtQuantidade.setText("");
        txtDataVenda.setText("");
        cbFormaPag.setSelectedIndex(0);
        txtValorTotal.setText("");
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, "Erro ao limpar os campos" , "Erro!" , JOptionPane.ERROR_MESSAGE);
    }
}

private void editar(String caminhoArquivo) throws IOException {
    List<String> linhas = new ArrayList<>();
    String nomeEditado = txtCliente.getText();
    boolean encontrado = false;

    try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
        String linha;
        while ((linha = br.readLine()) != null) {
            if (linha.startsWith("Clientes:") && linha.contains(nomeEditado)) {
                encontrado = true;
                // Adiciona os novos dados do cadastro
                linhas.add("Clientes: " + txtCliente.getText());
                linhas.add("Produto: " + txtProduto.getText());
                linhas.add("Quantidade: " + txtQuantidade.getText());
                linhas.add("Data da Venda: " + txtDataVenda.getText());
                linhas.add("Forma de Pagamento: " + cbFormaPag.getSelectedItem().toString());
                linhas.add("Valor Total: " + txtValorTotal.getText());
                linhas.add("------------------------------------------------------");  // Marca o fim do cadastro
            } else {
                linhas.add(linha);
            }
        }
    }

    // Se encontrado, escreve o novo arquivo com os dados editados
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
        for (String linha : linhas) {
            bw.write(linha);
            bw.newLine();
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}


private void excluir(String caminhoArquivo, String nomeExcluir) throws IOException {
    List<String> linhas = new ArrayList<>();
    boolean excluir = false;

    try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
        String linha;
        while ((linha = br.readLine()) != null) {
            if (linha.startsWith("Clientes:") && linha.contains(nomeExcluir)) {
                excluir = true;  // Encontrou o registro a ser excluído
            }
            if (excluir) {
                if (linha.startsWith("------------------------------------------------------")) {
                    excluir = false;  // Marca o fim do registro a ser excluído
                    continue;
                }
            } else {
                linhas.add(linha);  // Mantém as linhas não excluídas
            }
        }
    }

    // Reescreve o arquivo com os registros restantes
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
        for (String linha : linhas) {
            bw.write(linha);
            bw.newLine();
        }
        JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}


private void configurarTabela() { 
    try {
        int totalColunas = tblVendas.getColumnModel().getColumnCount();
        
        if (totalColunas < 6) {
            JOptionPane.showMessageDialog(null, "Erro: Modelo de tabela com colunas insuficientes!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Configura a largura das colunas
        tblVendas.getColumnModel().getColumn(0).setPreferredWidth(150);
        tblVendas.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblVendas.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblVendas.getColumnModel().getColumn(3).setPreferredWidth(150);
        tblVendas.getColumnModel().getColumn(4).setPreferredWidth(150);
        tblVendas.getColumnModel().getColumn(5).setPreferredWidth(150);
        
        // Desativar redimensionamento automático da tabela
        tblVendas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Forçar a rolagem horizontal no JScrollPane
        SPVendas.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        SPVendas.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        SPVendas.setViewportView(tblVendas); 

        // Atualizar o JScrollPane
        SPVendas.revalidate();
        SPVendas.repaint();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao configurar tabela!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}

private void carregarDados(String caminhoArquivo) {
    DefaultTableModel model = (DefaultTableModel) tblVendas.getModel();
    model.setRowCount(0);  // Limpa a tabela antes de carregar os novos dados
    try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(caminhoArquivo), StandardCharsets.UTF_8))) {
        String linha;
        String[] DADOS = new String[6];
        
        while ((linha = br.readLine()) != null) {
            linha = linha.trim();
            if (!linha.isEmpty() && !linha.startsWith("-")) {
                String[] chaveValor = linha.split(":", 2);
                if (chaveValor.length == 2) {
                    String chave = chaveValor[0].trim();
                    String valor = chaveValor[1].trim();
                    
                    switch (chave) {
                        case "Clientes" -> DADOS[0] = valor;
                        case "Produto" -> DADOS[1] = valor;
                        case "Quantidade" -> DADOS[2] = valor;
                        case "Data da Venda" -> DADOS[3] = valor;
                        case "Forma de Pagamento" -> DADOS[4] = valor;
                        case "Valor Total" -> DADOS[5] = valor;
                    }
                }
            } else if (DADOS[0] != null) {
                model.addRow(DADOS);  // Adiciona os dados na tabela
                DADOS = new String[6];  // Reseta para o próximo produto
            }
        }
        
        // Adiciona a última linha se não foi adicionada no loop
        if (DADOS[0] != null) {
            model.addRow(DADOS);
        }
        
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Erro ao carregar os dados!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}



private void carregarDadosNosCampos(int row) {
        try {
            txtCliente.setText((String) tblVendas.getValueAt(row, 0));
            txtProduto.setText((String) tblVendas.getValueAt(row, 1));
            txtQuantidade.setText((String) tblVendas.getValueAt(row, 2));
            txtDataVenda.setText((String) tblVendas.getValueAt(row, 3));
            cbFormaPag.setSelectedItem(tblVendas.getValueAt(row, 4));
            txtValorTotal.setText((String) tblVendas.getValueAt(row, 5));
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados nos campos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
}
    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void txtDataVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataVendaActionPerformed

    private void cbFormaPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFormaPagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFormaPagActionPerformed

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
        // BOTÃO SALVAR DA TELA DE LANÇAMENTOS DE VENDAS.
            if(validarCampos()){
            gravarDados();  
            carregarDados(strCaminhoArquivo);
            limpar();
            }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        // BOTÃO DE EDITAR ALGUM REGISTRO NA TELA DE LANÇAMENTOS DE VANDAS.
            try {
        String nomeEditado = txtCliente.getText();
        if (nomeEditado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o nome do cliente para editar!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;  // Se não tiver nome, não executa a edição
        }
        editar(strCaminhoArquivo);  // Edita o cadastro
        carregarDados(strCaminhoArquivo);  // Atualiza os dados na tabela
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao editar o cadastro!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        // BOTÃO DE EXCLUIR TODO REGISTRO NA TELA DE LANÇAMENTOS DE VANDAS.
        
        try {
        String nomeExcluir = txtCliente.getText();
        if (nomeExcluir.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um registro para excluir", "Erro", JOptionPane.ERROR_MESSAGE);
            return;  // Se não tiver nome, não executa a exclusão
        }
        excluir(strCaminhoArquivo, nomeExcluir);  // Exclui o registro
        carregarDados(strCaminhoArquivo);  // Atualiza os dados na tabela
        limpar();  // Limpa os campos após exclusão
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao excluir registro", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        // BOTÃO DE LIMPAR TODOS OS CAMPOS NA TELA DE LANÇAMENTOS DE VANDAS.
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarMenuActionPerformed
        // TODO add your handling code here:
        // BOTÃO DE VOLTAR A TELA DE MENU.
        
            // Fecha a tela atual
        this.dispose(); 
    
            // Abre a tela do menu principal
        FrmMenu menu = new FrmMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_btVoltarMenuActionPerformed

    private void tblVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVendasMouseClicked
        // TODO add your handling code here:
        tblVendas.addMouseListener(new MouseAdapter() {
        @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int row = tblVendas.getSelectedRow();
                    carregarDadosNosCampos(row);
                }
            }
        });
    }//GEN-LAST:event_tblVendasMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLancamentoVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLancamentoVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLancamentoVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLancamentoVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLancamentoVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane SPVendas;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltarMenu;
    private javax.swing.JComboBox<String> cbFormaPag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVendas;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JFormattedTextField txtDataVenda;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
