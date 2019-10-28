/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualFormularios;

import classes.dadosDAO;
import classes.funcionario;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Kino
 */
public class cadFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFuncionario
     */
    URL iconURL = getClass().getResource("/img/HospitalFMU.png");
    ImageIcon icon = new ImageIcon(iconURL);
    public cadFuncionario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBtnSexo = new javax.swing.ButtonGroup();
        grupoBtnTurno = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        cpfLabel = new javax.swing.JLabel();
        nascimentoLabel = new javax.swing.JLabel();
        generoLabel = new javax.swing.JLabel();
        femininoBtn = new javax.swing.JRadioButton();
        masculinoBtn = new javax.swing.JRadioButton();
        outrosBtn = new javax.swing.JRadioButton();
        telFixLabel = new javax.swing.JLabel();
        telCelLabel = new javax.swing.JLabel();
        cepLabel = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        cpfField = new javax.swing.JFormattedTextField();
        telFixField = new javax.swing.JFormattedTextField();
        telCelField = new javax.swing.JFormattedTextField();
        cepField = new javax.swing.JFormattedTextField();
        concluirBtn = new javax.swing.JButton();
        dtNascField = new javax.swing.JFormattedTextField();
        ramalLabel = new javax.swing.JLabel();
        ramalField = new javax.swing.JFormattedTextField();
        cargoLabel = new javax.swing.JLabel();
        turnoLabel = new javax.swing.JLabel();
        matutinoBtn = new javax.swing.JRadioButton();
        noturnoBtn = new javax.swing.JRadioButton();
        integralBtn = new javax.swing.JRadioButton();
        salarioLabel = new javax.swing.JLabel();
        cargoCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hospital FMU - Cadastro do funcionário");
        setIconImage(icon.getImage());

        tituloLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ficha.png"))); // NOI18N
        tituloLabel.setText("Ficha de cadastro do funcionário");

        nomeLabel.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        nomeLabel.setText("Nome:");

        cpfLabel.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        cpfLabel.setText("CPF:");

        nascimentoLabel.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        nascimentoLabel.setText("Data de nascimento:");

        generoLabel.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        generoLabel.setText("Sexo:");

        grupoBtnSexo.add(femininoBtn);
        femininoBtn.setText("Feminino");

        grupoBtnSexo.add(masculinoBtn);
        masculinoBtn.setText("Masculino");

        grupoBtnSexo.add(outrosBtn);
        outrosBtn.setText("Outros");

        telFixLabel.setText("Telefone fixo:");

        telCelLabel.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        telCelLabel.setText("Telefone celular:");

        cepLabel.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        cepLabel.setText("CEP:");

        try {
            cpfField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telFixField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telCelField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cepField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        concluirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/concluir.png"))); // NOI18N
        concluirBtn.setText("Concluir");
        concluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirBtnActionPerformed(evt);
            }
        });

        try {
            dtNascField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        ramalLabel.setText("Ramal:");

        try {
            ramalField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cargoLabel.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        cargoLabel.setText("Cargo:");

        turnoLabel.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        turnoLabel.setText("Turno:");

        grupoBtnTurno.add(matutinoBtn);
        matutinoBtn.setText("Matutino");

        grupoBtnTurno.add(noturnoBtn);
        noturnoBtn.setText("Noturno");

        grupoBtnTurno.add(integralBtn);
        integralBtn.setText("Integral");

        cargoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " - Selecione o cargo -", "CEO", "Auxiliar de limpeza", "Cirurgiã (o)", "Controlador de ambulância", "Enfermeiro (a)", "Fisioterapeuta", "Médico (a)", "Nutricionista", "Psicólogo (a)", "Recepcionista", "Recrutador", "Residente (Estagiário)", "Vice-presidente" }));
        cargoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoComboActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel1.setText("Campos em itálico são obrigatórios!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nomeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tituloLabel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cpfLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cepLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cepField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(nascimentoLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dtNascField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(generoLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(femininoBtn)
                                                .addGap(18, 18, 18)
                                                .addComponent(masculinoBtn)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(outrosBtn))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(telCelLabel)
                                            .addComponent(telFixLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(telFixField)
                                            .addComponent(telCelField, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ramalLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ramalField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cargoLabel)
                                            .addComponent(turnoLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cargoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(salarioLabel))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(matutinoBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(noturnoBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(integralBtn)))))
                                .addGap(0, 81, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(concluirBtn)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tituloLabel)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfLabel)
                    .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nascimentoLabel)
                    .addComponent(dtNascField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generoLabel)
                    .addComponent(femininoBtn)
                    .addComponent(masculinoBtn)
                    .addComponent(outrosBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telFixLabel)
                    .addComponent(telFixField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ramalLabel)
                    .addComponent(ramalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telCelLabel)
                    .addComponent(telCelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepLabel)
                    .addComponent(cepField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargoLabel)
                    .addComponent(salarioLabel)
                    .addComponent(cargoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turnoLabel)
                    .addComponent(matutinoBtn)
                    .addComponent(noturnoBtn)
                    .addComponent(integralBtn))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(concluirBtn)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void concluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirBtnActionPerformed
        // TODO add your handling code here:
        if (cadastrarFunc()){
            this.dispose();
        }
    }//GEN-LAST:event_concluirBtnActionPerformed

    private void cargoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoComboActionPerformed
        // TODO add your handling code here:
        int salario = cargoCombo.getSelectedIndex();
        switch (salario) {
            case 0:
                salarioLabel.setText("");
                break;
            case 1:
                salarioLabel.setText("Salário: R$1.000.000,00");
                break;
            case 2:
                salarioLabel.setText("Salário: R$1.200,00");
                break;
            case 3:
                salarioLabel.setText("Salário: R$20.000,00");
                break;
            case 4:
                salarioLabel.setText("Salário: R$3.000,00");
                break;
            case 5:
                salarioLabel.setText("Salário: R$2.500,00");
                break;
            case 6:
                salarioLabel.setText("Salário: R$4.000,00");
                break;
            case 7:
                salarioLabel.setText("Salário: R$15.000,00");
                break;
            case 8:
                salarioLabel.setText("Salário: R$6.000,00");
                break;
            case 9:
                salarioLabel.setText("Salário: R$10.000,00");
                break;
            case 10:
                salarioLabel.setText("Salário: R$1.250,00");
                break;
            case 11:
                salarioLabel.setText("Salário: R$2.269,22");
                break;
            case 12:
                salarioLabel.setText("Salário: R$800,00");
                break;
            case 13:
                salarioLabel.setText("Salário: R$250.000,00");
                break;       
        }
        
    }//GEN-LAST:event_cargoComboActionPerformed

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
            java.util.logging.Logger.getLogger(cadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cargoCombo;
    private javax.swing.JLabel cargoLabel;
    private javax.swing.JFormattedTextField cepField;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JButton concluirBtn;
    private javax.swing.JFormattedTextField cpfField;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JFormattedTextField dtNascField;
    private javax.swing.JRadioButton femininoBtn;
    private javax.swing.JLabel generoLabel;
    private javax.swing.ButtonGroup grupoBtnSexo;
    private javax.swing.ButtonGroup grupoBtnTurno;
    private javax.swing.JRadioButton integralBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton masculinoBtn;
    private javax.swing.JRadioButton matutinoBtn;
    private javax.swing.JLabel nascimentoLabel;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JRadioButton noturnoBtn;
    private javax.swing.JRadioButton outrosBtn;
    private javax.swing.JFormattedTextField ramalField;
    private javax.swing.JLabel ramalLabel;
    private javax.swing.JLabel salarioLabel;
    private javax.swing.JFormattedTextField telCelField;
    private javax.swing.JLabel telCelLabel;
    private javax.swing.JFormattedTextField telFixField;
    private javax.swing.JLabel telFixLabel;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JLabel turnoLabel;
    // End of variables declaration//GEN-END:variables

    private boolean cadastrarFunc() {
        funcionario func = new funcionario();
        dadosDAO dados = new dadosDAO();
        boolean sucesso = false;
        
        getFieldIntoObj(func);
        if (!checkFields(func)) {
            try {
                if (dados.createFuncionario(func)){
                    sucesso = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(cadFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios em branco!\nPor favor, preencha corretamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        return sucesso;
    }
    
    private void getFieldIntoObj(funcionario func){
        int salario;
        func.setNome(nomeField.getText().toUpperCase());
        func.setCpf(cpfField.getText().replaceAll("[.|\\-]", ""));
        func.setDt_nascimento(dtNascField.getText());
        if (femininoBtn.isSelected()){
            func.setSexo(femininoBtn.getText());
        } else if (masculinoBtn.isSelected()) {
            func.setSexo(masculinoBtn.getText());
        } else if (outrosBtn.isSelected()) {
            func.setSexo(outrosBtn.getText());
        }
        if (telFixField.equals("(  )    -    ") || telFixField == null){
            func.setTelfix(null);
        } else {
            func.setTelfix(telFixField.getText().replaceAll("[\\(|\\)|\\-\\s]", ""));
        }
        if (ramalField.equals("") || ramalField == null){
            func.setRamal(null);
        } else {
            func.setRamal(ramalField.getText());
        }
        func.setTelcel(telCelField.getText().replaceAll("[\\(|\\)|\\-\\s]", ""));
        func.setCep(cepField.getText().replaceAll("\\-", ""));
        func.setCargo((String) cargoCombo.getSelectedItem());
        if (matutinoBtn.isSelected()){
            func.setTurno(matutinoBtn.getText());
        } else if (noturnoBtn.isSelected()) {
            func.setTurno(noturnoBtn.getText());
        } else if (integralBtn.isSelected()) {
            func.setTurno(integralBtn.getText());
        }
        salario = cargoCombo.getSelectedIndex();
        switch (salario) {
            case 0:
                func.setSalario("Indefinido");
                break;
            case 1:
                func.setSalario("R$1.000.000,00");
                break;
            case 2:
                func.setSalario("R$1.200,00");
                break;
            case 3:
                func.setSalario("R$20.000,00");
                break;
            case 4:
                func.setSalario("R$3.000,00");
                break;
            case 5:
                func.setSalario("R$2.500,00");
                break;
            case 6:
                func.setSalario("R$4.000,00");
                break;
            case 7:
                func.setSalario("R$15.000,00");
                break;
            case 8:
                func.setSalario("R$6.000,00");
                break;
            case 9:
                func.setSalario("R$10.000,00");
                break;
            case 10:
                func.setSalario("R$1.250,00");
                break;
            case 11:
                func.setSalario("R$2.269,22");
                break;
            case 12:
                func.setSalario("R$800,00");
                break;
            case 13:
                func.setSalario("R$250.000,00");
                break;       
        }
    }

    private boolean checkFields(funcionario func) {
        boolean empty = true;
        try {
            if (func.getNome().equals("") || func.getCpf().equals("") || func.getDt_nascimento().equals("") || 
                    func.getSexo().equals("") || func.getTelcel().equals("") || func.getCep().equals("") ||
                    func.getCargo().equals("") || func.getTurno().equals("") || func.getSalario(). equals("")){
                empty = true;
            } else {
                empty = false;
            }
        } catch (NullPointerException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            return empty;
        }
    }
}