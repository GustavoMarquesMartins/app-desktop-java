/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.faculdade.imepac.UI.cadastro;

import br.com.faculdade.imepac.UI.commons.CommonMethods;
import br.com.faculdade.imepac.UI.commons.InitializeFields;
import br.com.faculdade.imepac.UI.commons.MaskFormatterFilter;
import br.com.faculdade.imepac.infraestrutura.Persistence;
import br.com.faculdade.imepac.entidade.pessoa.DadosProfissao;
import br.com.faculdade.imepac.entidade.pessoa.Funcionario;
import br.com.faculdade.imepac.entidade.pessoa.PeriodoDia;
import br.com.faculdade.imepac.entidade.projeto.Projeto;
import br.com.faculdade.imepac.entidade.relacionamento.Relacionamento;
import br.com.faculdade.imepac.infraestrutura.JPAUtil;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author gusta
 */
public class FormDadosProfissao extends javax.swing.JPanel {

    private Funcionario funcionario;
    private JFrame frame;
    private Projeto projeto;
    private Relacionamento relacionamento = new Relacionamento();

    /**
     * Creates new form FormDadosProfissao
     */
    public FormDadosProfissao(Funcionario funcionario, Projeto projeto, JFrame frame) {
        this.frame = frame;
        this.funcionario = funcionario;
        this.projeto = projeto;
        initComponents();
        inicializaFormulario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCadastroDeFuncionario1 = new javax.swing.JLabel();
        jLabelPeriodo = new javax.swing.JLabel();
        jComboBoxPeriodo = new javax.swing.JComboBox<>();
        jLabelCargo = new javax.swing.JLabel();
        jFormattedTextFieldSalario = new javax.swing.JFormattedTextField();
        jLabelSalario = new javax.swing.JLabel();
        jSpinnerCargaHoraria = new javax.swing.JSpinner();
        jLabelCargaHoaria = new javax.swing.JLabel();
        jCheckBoxVoluntario = new javax.swing.JCheckBox();
        jTextFieldCargo = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jCheckBoxAcolhido1 = new javax.swing.JCheckBox();

        jLabelCadastroDeFuncionario1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabelCadastroDeFuncionario1.setText("Dados profissão");

        jLabelPeriodo.setText("Período");

        jComboBoxPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelCargo.setText("Cargo");

        jFormattedTextFieldSalario.setName("FormattedFieldCpf"); // NOI18N
        jFormattedTextFieldSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldSalarioActionPerformed(evt);
            }
        });

        jLabelSalario.setText("Salário");

        jLabelCargaHoaria.setText("Carga Horária");

        jCheckBoxVoluntario.setText("Voluntário");
        jCheckBoxVoluntario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxVoluntarioActionPerformed(evt);
            }
        });

        jTextFieldCargo.setName("JTextFieldNome"); // NOI18N
        jTextFieldCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCargoActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salvar.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setBorder(null);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jCheckBoxAcolhido1.setText("Já foi acolhido");
        jCheckBoxAcolhido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAcolhido1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadastroDeFuncionario1)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCargo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSalario)
                                    .addComponent(jFormattedTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinnerCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCargaHoaria)
                                    .addComponent(jCheckBoxAcolhido1))))
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxVoluntario))
                    .addComponent(jComboBoxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPeriodo))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCadastroDeFuncionario1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCargaHoaria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabelCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxAcolhido1)
                    .addComponent(jCheckBoxVoluntario))
                .addGap(18, 18, 18)
                .addComponent(jLabelPeriodo)
                .addGap(4, 4, 4)
                .addComponent(jComboBoxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldSalarioActionPerformed

    }//GEN-LAST:event_jFormattedTextFieldSalarioActionPerformed

    private void jCheckBoxVoluntarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxVoluntarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxVoluntarioActionPerformed

    private void jTextFieldCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCargoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jCheckBoxAcolhido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAcolhido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAcolhido1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBoxAcolhido1;
    private javax.swing.JCheckBox jCheckBoxVoluntario;
    private javax.swing.JComboBox<String> jComboBoxPeriodo;
    private javax.swing.JFormattedTextField jFormattedTextFieldSalario;
    private javax.swing.JLabel jLabelCadastroDeFuncionario1;
    private javax.swing.JLabel jLabelCargaHoaria;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelPeriodo;
    private javax.swing.JLabel jLabelSalario;
    private javax.swing.JSpinner jSpinnerCargaHoraria;
    private javax.swing.JTextField jTextFieldCargo;
    // End of variables declaration//GEN-END:variables

    /**
     * Inicializa o formulário.
     */
    private void inicializaFormulario() {
        this.formataFields(); // Formata os campos de texto formatados
        this.initializeComboBoxOptions(); // Inicializa as opções dos ComboBox
        this.saveFuncionario(); // Configura a ação do botão salvar
        this.addActions(); // Verifica se o campo voluntário esta selecionado caso esteja ele bloqueia interação com o salário
    }

    /**
     * Formata os campos de texto formatados.
     */
    private void formataFields() {
        MaskFormatterFilter.formatTextField(jFormattedTextFieldSalario, "R$ #.###,##");
        SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 8, 1);
        jSpinnerCargaHoraria.setModel(model);
    }

    /**
     * Inicializa as opções dos ComboBox.
     */
    private void initializeComboBoxOptions() {
        var initializeComboBox = new InitializeFields();
        initializeComboBox.addEnumValuesToComboBox(jComboBoxPeriodo, PeriodoDia.class);

    }

    /**
     * Define os valores do funcionário com base nos campos do formulário.
     */
    public void setValues() throws Exception {
        EntityManager em = JPAUtil.getEntityManager();
        Persistence ps = new Persistence(em);
        em.getTransaction().begin();

        var voluntario = jCheckBoxVoluntario.isSelected();
        var salario = CommonMethods.removeSpecialCharacters(jFormattedTextFieldSalario.getText());
        var cargo = jTextFieldCargo.getText();
        var cargaHorario = jSpinnerCargaHoraria.getValue();
        var acolhido = jCheckBoxVoluntario.isSelected();
        PeriodoDia periodoDia = (PeriodoDia) jComboBoxPeriodo.getSelectedItem();

        var dadosProfissao = new DadosProfissao();
        dadosProfissao.setAcolhido(acolhido);
        dadosProfissao.setVoluntario(voluntario);
        dadosProfissao.setSalario(salario);
        dadosProfissao.setCargo(cargo);
        dadosProfissao.setCargaHoraria(Integer.parseInt(cargaHorario.toString()));
        dadosProfissao.setAcolhido(acolhido);
        dadosProfissao.setPeriodo(periodoDia);
        dadosProfissao.setFuncionario(funcionario);
        funcionario.setDadosProfissao(dadosProfissao);

        funcionario.getRelacionamentos().add(relacionamento);

        this.relacionamento.setProjeto(ps.getEntity(Projeto.class, projeto.getId()));
        this.relacionamento.setFuncionario(funcionario);
        this.relacionamento.setDataInicio(LocalDate.now());

        em.close();

    }

    /**
     * Configura a ação do botão salvar.
     */
    public void saveFuncionario() {
        jButtonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    setValues(); // Define os valores do funcionário

                    EntityManager em = JPAUtil.getEntityManager();
                    Persistence persistence = new Persistence(em); // Corrigindo a declaração da variável

                    em.getTransaction().begin();

                    persistence.save(relacionamento);
                    persistence.save(funcionario); // Salva o funcionário no banco de dados
                    em.getTransaction().commit();
                    em.close();

                    JOptionPane.showMessageDialog(null, "Funcionário salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    CommonMethods.goToNewPage(frame, new FormDadosFuncionario(frame));

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro! " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

                }

            }
        });
    }

    public void blockInteraction() {
        jCheckBoxVoluntario.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    jFormattedTextFieldSalario.setEditable(false);
                    jFormattedTextFieldSalario.setDisabledTextColor(Color.GRAY);
                    jFormattedTextFieldSalario.setBackground(Color.LIGHT_GRAY);
                } else {
                    jFormattedTextFieldSalario.setEditable(true);
                    jFormattedTextFieldSalario.setDisabledTextColor(null);
                    jFormattedTextFieldSalario.setBackground(null);
                }
            }
        });
    }

    private void addActions() {
        blockInteraction();
    }
}
