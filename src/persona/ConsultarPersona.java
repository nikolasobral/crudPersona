/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Timer;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
/**
 *
 * @author isael
 */
public class ConsultarPersona extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditarPersona
     */
    public JLabel label = new JLabel(); 
    private JDesktopPane containerPrincipal;
        public ConsultarPersona(JDesktopPane container) {
        initComponents();
        containerPrincipal = container ; 
        java.util.Date dataSistema = new java.util.Date();
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//NÃO EXIBE A HORA SENDO ATUALIZADA
        txtData.setText(dataFormatada.format(dataSistema));
        //Timer hora = new Timer(1000, new hour());     
       
    }

       
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        txtPesquisar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPersona = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        txtHoras = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Personas");

        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputActionPerformed(evt);
            }
        });

        txtPesquisar.setText("Pesquisar");
        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        tabelaPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "EMAIL", "TEL.", "GÊNERO", "PROFISSÃO", "SALÁRIO", "BAIRRO", "CIDADE", "ESTADO", "HOBBIES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPersona.setRowHeight(35);
        tabelaPersona.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaPersona);
        if (tabelaPersona.getColumnModel().getColumnCount() > 0) {
            tabelaPersona.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaPersona.getColumnModel().getColumn(6).setPreferredWidth(50);
            tabelaPersona.getColumnModel().getColumn(9).setPreferredWidth(50);
            tabelaPersona.getColumnModel().getColumn(10).setPreferredWidth(100);
        }

        jScrollPane2.setViewportView(jScrollPane1);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\isael\\Downloads\\logo_persona.jpg")); // NOI18N

        jLabel1.setText("Data");

        txtData.setText("txtData");

        txtHoras.setText("txtHoras");

        jLabel2.setText("Horas:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoras)
                            .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btNovo)
                            .addComponent(btnEditar)
                            .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(139, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtData))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtHoras))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputActionPerformed
       
       
    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:

        try{
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/persona","root","");
            String consultarSQL = "SELECT * FROM persona";
            //AQUI FAZ A BUSCA NA TABELA POR NOME,ALTERANDO  SQL PARA CASO O CAMPO DE PESQUISA TENHA VALOR DIFERENTE DE VAZIO
            if(!txtInput.getText().equals(""))
            consultarSQL = consultarSQL + " WHERE Nome LIKE ? ";
            PreparedStatement stmt = conexao.prepareStatement(consultarSQL);
            //AQUI ELE PASSA NOME DIGITADO PARA DENTRO DA CONEXAO
            if(!txtInput.getText().equals(""))
            stmt.setString(1, "%"+txtInput.getText()+"%");
            ResultSet valoresEncontrados = stmt.executeQuery();//armazena os valores encontrados no banco
            DefaultTableModel modeloDaTabela = (DefaultTableModel) tabelaPersona.getModel(); //criando uma tabela
            modeloDaTabela.setNumRows(0);// SETANDO OS VALORES DENTRO DE CADA LINHA DA TABELA
            while (valoresEncontrados.next()){
                String[] linhaDaTabela = { valoresEncontrados.getString("Id"),valoresEncontrados.getString("Nome"),valoresEncontrados.getString("Email"),
                    valoresEncontrados.getString("Telefone"),valoresEncontrados.getString("Genero"), valoresEncontrados.getString("Profissao"),
                    valoresEncontrados.getString("Salario"),valoresEncontrados.getString("Bairro"),
                    valoresEncontrados.getString("Cidade"),valoresEncontrados.getString("Estado"), valoresEncontrados.getString("Hobbies")};
                modeloDaTabela.addRow(linhaDaTabela);
            }
            stmt.close();
            conexao.close();
        }catch(SQLException excecao){
            JOptionPane.showMessageDialog(this,excecao);
        }
    }//GEN-LAST:event_txtPesquisarActionPerformed
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = this.tabelaPersona.getSelectedRow();//pega a o número da linha selecionada da tabela
        int idAlter = Integer.parseInt(tabelaPersona.getValueAt(linhaSelecionada,0).toString());//pega o valor da linha e converte em string dps p/inteiro
        CadastrarPersona cadastrarPersona = new CadastrarPersona(idAlter);//instancio uma nova janela de cadastar persona passando o valor do id como parametro
        containerPrincipal.add(cadastrarPersona);//adiciona minha instancia na janela principal
        cadastrarPersona.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        // TODO add your handling code here:
        CadastrarPersona cadastrarPersona = new CadastrarPersona();
        containerPrincipal.add(cadastrarPersona);
        cadastrarPersona.setVisible(true);

    }//GEN-LAST:event_btNovoActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
        try{
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/persona","root", "");
            String deletarPersonaSQL = "DELETE FROM persona WHERE id = ?";
            PreparedStatement stmt = conexao.prepareStatement(deletarPersonaSQL);
            int linhaSelecionada = this.tabelaPersona.getSelectedRow();
            stmt.setInt(1,Integer.parseInt(this.tabelaPersona.getValueAt(linhaSelecionada,0).toString()));
            stmt.execute();
            stmt.close();
            conexao.close();
            DefaultTableModel modeloDaTabelaPersona = (DefaultTableModel) tabelaPersona.getModel();
            modeloDaTabelaPersona.removeRow(linhaSelecionada);
            JOptionPane.showMessageDialog(this,"Persona Excluída!");
            this.setClosable(true);
        }catch(SQLException excecao){
             JOptionPane.showMessageDialog(this,excecao);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaPersona;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtHoras;
    private javax.swing.JTextField txtInput;
    private javax.swing.JButton txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
