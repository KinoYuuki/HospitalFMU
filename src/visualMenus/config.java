/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualMenus;

import classes.dadosDAO;
import classes.funcionario;
import classes.usuario;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kino
 */
public class config extends javax.swing.JFrame {

    /**
     * Creates new form config
     */
    URL iconURL = getClass().getResource("/img/config.png");
    ImageIcon icon = new ImageIcon(iconURL);
    public config() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        atualizarTabelaFunc();
        atualizarTabelaSenha();
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
        changePassTab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        funcionarioLabel = new javax.swing.JLabel();
        funcionarioField = new javax.swing.JTextField();
        pesquisarFuncionarioBtn = new javax.swing.JButton();
        nomeRdBtn = new javax.swing.JRadioButton();
        cpfRdBtn = new javax.swing.JRadioButton();
        idRdBtn = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaFunc = new javax.swing.JTable();
        atualizarTabelaFuncBtn = new javax.swing.JButton();
        createUserBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        userField = new javax.swing.JTextField();
        usuarioLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSenha = new javax.swing.JTable();
        pesquisarUsuarioBtn = new javax.swing.JButton();
        atualizarTabelaSenhaBtn = new javax.swing.JButton();
        resetarSenhaBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(icon.getImage());

        funcionarioLabel.setText("Procurar funcionário:");

        funcionarioField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                funcionarioFieldKeyPressed(evt);
            }
        });

        pesquisarFuncionarioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        pesquisarFuncionarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarFuncionarioBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(nomeRdBtn);
        nomeRdBtn.setSelected(true);
        nomeRdBtn.setText("Nome");

        buttonGroup1.add(cpfRdBtn);
        cpfRdBtn.setText("CPF");

        buttonGroup1.add(idRdBtn);
        idRdBtn.setText("ID");

        tabelaFunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Data de nascimento", "Sexo", "Telefone fixo", "Ramal", "Celular", "CEP", "Cargo", "Turno", "Salário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaFunc);

        atualizarTabelaFuncBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        atualizarTabelaFuncBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarTabelaFuncBtnActionPerformed(evt);
            }
        });

        createUserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Adicionar.png"))); // NOI18N
        createUserBtn.setText("Criar login para funcionário");
        createUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(funcionarioLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funcionarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisarFuncionarioBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeRdBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpfRdBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idRdBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atualizarTabelaFuncBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(createUserBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(funcionarioLabel)
                                .addComponent(funcionarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(atualizarTabelaFuncBtn)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeRdBtn)
                            .addComponent(cpfRdBtn)
                            .addComponent(idRdBtn))
                        .addComponent(pesquisarFuncionarioBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createUserBtn))
        );

        changePassTab.addTab("Adicionar um usário", jPanel1);

        userField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userFieldKeyPressed(evt);
            }
        });

        usuarioLabel.setText("Procurar usuário:");

        tabelaSenha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Login", "Senha", "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaSenha);

        pesquisarUsuarioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        pesquisarUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarUsuarioBtnActionPerformed(evt);
            }
        });

        atualizarTabelaSenhaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        atualizarTabelaSenhaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarTabelaSenhaBtnActionPerformed(evt);
            }
        });

        resetarSenhaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        resetarSenhaBtn.setText("Resetar senha");
        resetarSenhaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetarSenhaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(usuarioLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisarUsuarioBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atualizarTabelaSenhaBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(resetarSenhaBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atualizarTabelaSenhaBtn)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(usuarioLabel)
                                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(pesquisarUsuarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetarSenhaBtn))
        );

        changePassTab.addTab("Reset de senha", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(changePassTab)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(changePassTab)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarFuncionarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarFuncionarioBtnActionPerformed
        // TODO add your handling code here:
        if (!funcionarioField.equals("")){
            try {
                atualizarTabelaFunc();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao pesquisar: " + ex, "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campo de pesquisa vazio!\nPor favor, insira o usuário.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_pesquisarFuncionarioBtnActionPerformed

    private void atualizarTabelaFuncBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarTabelaFuncBtnActionPerformed
        // TODO add your handling code here:
        try {
            atualizarTabelaFunc();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar: " + ex, "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_atualizarTabelaFuncBtnActionPerformed

    private void createUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserBtnActionPerformed
        try {
            // TODO add your handling code here:
            criarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createUserBtnActionPerformed

    private void pesquisarUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarUsuarioBtnActionPerformed
        // TODO add your handling code here:
        if (!userField.equals("")){
            try {
                atualizarTabelaSenha();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao pesquisar: " + ex, "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campo de pesquisa vazio!\nPor favor, insira um nome, CPF ou ID.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_pesquisarUsuarioBtnActionPerformed

    private void atualizarTabelaSenhaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarTabelaSenhaBtnActionPerformed
        // TODO add your handling code here:
        try {
            atualizarTabelaSenha();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar: " + ex, "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_atualizarTabelaSenhaBtnActionPerformed

    private void resetarSenhaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetarSenhaBtnActionPerformed
        try {
            // TODO add your handling code here:
            resetarSenha();
        } catch (SQLException ex) {
            Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_resetarSenhaBtnActionPerformed

    private void funcionarioFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_funcionarioFieldKeyPressed
        // TODO add your handling code here:
        if(enterKey(evt)){
            pesquisarFuncionarioBtn.doClick();
        }
        
    }//GEN-LAST:event_funcionarioFieldKeyPressed

    private void userFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userFieldKeyPressed
        // TODO add your handling code here:
        if(enterKey(evt)){
            pesquisarUsuarioBtn.doClick();
        }
    }//GEN-LAST:event_userFieldKeyPressed

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
            java.util.logging.Logger.getLogger(config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new config().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarTabelaFuncBtn;
    private javax.swing.JButton atualizarTabelaSenhaBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTabbedPane changePassTab;
    private javax.swing.JRadioButton cpfRdBtn;
    private javax.swing.JButton createUserBtn;
    private javax.swing.JTextField funcionarioField;
    private javax.swing.JLabel funcionarioLabel;
    private javax.swing.JRadioButton idRdBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton nomeRdBtn;
    private javax.swing.JButton pesquisarFuncionarioBtn;
    private javax.swing.JButton pesquisarUsuarioBtn;
    private javax.swing.JButton resetarSenhaBtn;
    private javax.swing.JTable tabelaFunc;
    private javax.swing.JTable tabelaSenha;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabelaSenha() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) tabelaSenha.getModel();
        model.setNumRows(0);
        dadosDAO dados = new dadosDAO();
        String pesquisa = userField.getText().toUpperCase();
        for (usuario user : dados.readUsuarios()){
            if (!userField.getText().equals("")){
                if (nomeRdBtn.isSelected()){
                    if (user.getNome().contains(pesquisa)) {
                        model.addRow(new Object[]{
                            user.getId_user(),
                            user.getLogin(),
                            user.getSenha(),
                            nomeProprio(user.getNome()),
                            user.getCpf()
                        });
                    }
                } else if (cpfRdBtn.isSelected()) {
                    if (funcionarioField.getText().equals(user.getCpf())){
                        model.addRow(new Object[]{
                            user.getId_user(),
                            user.getLogin(),
                            user.getSenha(),
                            nomeProprio(user.getNome()),
                            user.getCpf()
                        });
                    }
                } else {
                    if (funcionarioField.getText().equals(String.valueOf(user.getId_user()))){
                        model.addRow(new Object[]{
                            user.getId_user(),
                            user.getLogin(),
                            user.getSenha(),
                            nomeProprio(user.getNome()),
                            user.getCpf()
                        });
                    }
                }
            } else {
                model.addRow(new Object[]{
                    user.getId_user(),
                    user.getLogin(),
                    user.getSenha(),
                    nomeProprio(user.getNome()),
                    user.getCpf()
                });
            }
        }
    }

    private void atualizarTabelaFunc() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) tabelaFunc.getModel();
        model.setNumRows(0);
        dadosDAO dados = new dadosDAO();
        String pesquisa = funcionarioField.getText().toUpperCase();
        for (funcionario func : dados.readFuncionarios()){
            if (!funcionarioField.getText().equals("")){
                if (nomeRdBtn.isSelected()){
                    if (func.getNome().contains(pesquisa)){
                        model.addRow(new Object[]{
                            func.getId_func(),
                            nomeProprio(func.getNome()),
                            func.getCpf(),
                            func.getDt_nascimento(),
                            func.getSexo(),
                            func.getTelfix(),
                            func.getRamal(),
                            func.getTelcel(),
                            func.getCep(),
                            func.getCargo(),
                            func.getTurno(),
                            func.getSalario()
                        });
                    }
                } else if (cpfRdBtn.isSelected()){
                    if (funcionarioField.getText().equals(func.getCpf())) {
                        model.addRow(new Object[]{
                            func.getId_func(),
                            nomeProprio(func.getNome()),
                            func.getCpf(),
                            func.getDt_nascimento(),
                            func.getSexo(),
                            func.getTelfix(),
                            func.getRamal(),
                            func.getTelcel(),
                            func.getCep(),
                            func.getCargo(),
                            func.getTurno(),
                            func.getSalario()
                        });
                    }
                } else {
                    if (funcionarioField.getText().equals(String.valueOf(func.getId_func()))){
                        model.addRow(new Object[]{
                            func.getId_func(),
                            nomeProprio(func.getNome()),
                            func.getCpf(),
                            func.getDt_nascimento(),
                            func.getSexo(),
                            func.getTelfix(),
                            func.getRamal(),
                            func.getTelcel(),
                            func.getCep(),
                            func.getCargo(),
                            func.getTurno(),
                            func.getSalario()
                        });
                    }
                }
            } else {
                model.addRow(new Object[]{
                    func.getId_func(),
                    nomeProprio(func.getNome()),
                    func.getCpf(),
                    func.getDt_nascimento(),
                    func.getSexo(),
                    func.getTelfix(),
                    func.getRamal(),
                    func.getTelcel(),
                    func.getCep(),
                    func.getCargo(),
                    func.getTurno(),
                    func.getSalario()
                });
            }
        }
    }
    
    public String nomeProprio(String nome){
        char[] letras = nome.toLowerCase().toCharArray();
        boolean inicial = true;
        for (int i = 0; i < letras.length; i++){
            if (inicial && Character.isLetter(letras[i])){
                letras[i] = Character.toUpperCase(letras[i]);
                inicial = false;
            } else if (Character.isWhitespace(letras[i])) {
                inicial = true;
            }
        }
        return String.valueOf(letras);
    }

    private void criarUsuario() throws SQLException {
        String id_pesquisa = null;
        String cargo = null;
        dadosDAO dados = new dadosDAO();
        usuario user = new usuario();
        try {
            id_pesquisa = String.valueOf(tabelaFunc.getValueAt(tabelaFunc.getSelectedRow(), 0));
            cargo = String.valueOf(tabelaFunc.getValueAt(tabelaFunc.getSelectedRow(), 9));
            user.setId_user(Integer.parseInt(id_pesquisa));
            if(dados.searchLoginByID(user) == null){
                if (cargo.equals("CEO") || cargo.equals("Vice-presidente") || cargo.equals("Recepcionista") ||
                    cargo.equals("Recrutador")){
                    funcionario func = new funcionario();
                    func.setId_func(Integer.parseInt(id_pesquisa));
                    dados.searchFuncionarioByID(func);
                    user.setId_user(func.getId_func());
                    user.setNome(func.getNome());
                    user.setCpf(func.getCpf());
                    String newLogin = criarUsername(func.getNome());
                    user.setLogin(newLogin);
                    user.setSenha("fmu.123");
                    dados.createLogin(user);
                    JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro na criação de login!\nCriação de login indisponível para cargo do funcionário.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário já existe!", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Funcionário não selecionado!\nPor favor, seleciona o funcionário", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } finally {
            atualizarTabelaFunc();
            atualizarTabelaSenha();
        }        
    }
    
    private String criarUsername (String nomeCompleto) {
        String primeiro = null;
        String ultimo = null;
        
        for (int i = 0; i < nomeCompleto.length(); i++){
            if (nomeCompleto.charAt(i) == ' '){
                primeiro = nomeCompleto.substring(0, i);
                break;
            }
        }
        for (int i = nomeCompleto.length()-1; i > 0; i--){ //Bianca de Sá Santos
            if (nomeCompleto.charAt(i) == ' '){
                ultimo = nomeCompleto.substring(i+1, nomeCompleto.length());
                break;
            }
        }
        return primeiro.toLowerCase() + "." + ultimo.toLowerCase();
    }

    private void resetarSenha() throws SQLException {
        String login = null;
        
        try {
            login = (String) tabelaSenha.getValueAt(tabelaSenha.getSelectedRow(), 1);
            dadosDAO dados = new dadosDAO();
            usuario user = new usuario();
            user.setLogin(login);
            dados.readLogin(user);
            user.setSenha("fmu.123");
            dados.updateLogin(user);
            JOptionPane.showMessageDialog(null, "Senha resetada com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            atualizarTabelaSenha();
        }
    }

    private boolean enterKey(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            return true;
        } else {
            return false;
        }
    }
}
