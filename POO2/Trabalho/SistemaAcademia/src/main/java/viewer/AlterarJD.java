/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package viewer;

import controller.GerInterGrafica;
import controller.TableModelPersonal;
import domain.Aluno;
import domain.Personal;
import domain.Plano;
import domain.Usuario;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Xacar
 */
public class AlterarJD extends javax.swing.JDialog {
    private TableModelPersonal modelPersonal = new TableModelPersonal();
    private GerInterGrafica gerIG;
    private Usuario usuario;
    /**
     * Creates new form AlterarJD
     */
    public AlterarJD(java.awt.Frame parent, boolean modal,GerInterGrafica gerIG,Usuario usuario) {
        super(parent, modal);
        this.gerIG = gerIG; 
        initComponents();
        modelPersonal.setList(gerIG.getGerDominio().listar(Personal.class));
        personalJT.setModel(modelPersonal);
        setUsuario(usuario);
        pack();
        
    }
    
     public Plano calcularPlano(){
        if (personalJT.getSelectedRow() == -1) {
             // Evita erro se nenhum personal estiver selecionado.
             // Na alteração, um personal já vem pré-selecionado, então isso é mais uma segurança.
             JOptionPane.showMessageDialog(this, "Selecione um personal para calcular o plano.", "Aviso", JOptionPane.WARNING_MESSAGE);
             return null;
         }
        try{
            String plano = (String) planoCB.getSelectedItem();
            int frequenciaSemanal = frequenciaLT.getSelectedIndex() + 2;
            double taxaPersonal = modelPersonal.getPersonal(personalJT.getSelectedRow()).getValorCobrado();
            String turnoTreino = (String) horarioCB.getSelectedItem();
            Plano plan = new Plano(plano,frequenciaSemanal,taxaPersonal,turnoTreino);
            valorLB.setText("R$"+String.format("%.2f",plan.getValor()));
            return plan;
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Erro ao calcular plano: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
     public void setUsuario(Usuario usuario){
        
        alunJP.setVisible(false);
        personalJP.setVisible(false);
        this.usuario = usuario;
        nomeTL.setText(usuario.getNome());
        
        if(this.usuario instanceof Personal){
            personalJP.setVisible(true);
            Personal pers = (Personal) usuario;
            cargoTL.setText("Personal");
            cursoCB.setSelectedItem(pers.getTipoCurso());
            universidadeTF.setText(pers.getUniversidade());
            valorPorAlunSP.setValue(pers.getValorCobrado());
        }else if (this.usuario instanceof Aluno) {
            alunJP.setVisible(true);
            Aluno alun = (Aluno) usuario;
            cargoTL.setText("Aluno");
            
            // Popula dados do aluno
            pesoSP.setValue(alun.getPeso());
            alturaSP.setValue(alun.getAltura());
            
            // Popula dados do plano
            planoCB.setSelectedItem(alun.getPlano().getPlano());
            horarioCB.setSelectedItem(alun.getPlano().getTurnoTreino());
            frequenciaLT.setSelectedIndex(alun.getPlano().getFrequenciaSemanal() - 2);
            
            // Localiza e seleciona o personal do aluno na tabela
            Personal personalDoAluno = alun.getPersonal();
            personalTF.setText(personalDoAluno.getNome());

            for (int i = 0; i < modelPersonal.getRowCount(); i++) {
                if (modelPersonal.getPersonal(i).getIdUsuario() == personalDoAluno.getIdUsuario()) {
                    personalJT.setRowSelectionInterval(i, i);
                    break;
                }
            }
            // Calcula o valor inicial
            calcularPlano();
            
        }
               
    }
      private boolean validarCampos() {
        if (this.usuario instanceof Aluno) {
            if ((double) pesoSP.getValue() <= 0) {
                JOptionPane.showMessageDialog(this, "O campo 'Peso' deve ser maior que zero.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                pesoSP.requestFocus();
                return false;
            }
            if ((int) alturaSP.getValue() <= 0) {
                JOptionPane.showMessageDialog(this, "O campo 'Altura' deve ser maior que zero.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                alturaSP.requestFocus();
                return false;
            }
            if (personalJT.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "É obrigatório selecionar um 'Personal'.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else if (this.usuario instanceof Personal) {
            if (universidadeTF.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "O campo 'Nome da Universidade' é obrigatório.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                universidadeTF.requestFocus();
                return false;
            }
            if ((double) valorPorAlunSP.getValue() <= 0) {
                JOptionPane.showMessageDialog(this, "O 'Valor cobrado' deve ser maior que zero.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                valorPorAlunSP.requestFocus();
                return false;
            }
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        personalJT = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        personalJP = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        universidadeTF = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cursoCB = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        valorPorAlunSP = new javax.swing.JSpinner();
        alunJP = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        frequenciaLT = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        planoCB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        valorLB = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        horarioCB = new javax.swing.JComboBox<>();
        calcularBT = new javax.swing.JButton();
        pesoSP = new javax.swing.JSpinner();
        alturaSP = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        personalTF = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeTL = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cargoTL = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel14.setBackground(new java.awt.Color(0, 51, 51));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        personalJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        personalJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personalJTMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(personalJT);

        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );

        personalJP.setBackground(new java.awt.Color(0, 51, 51));
        personalJP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterar Personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel16.setBackground(new java.awt.Color(0, 51, 51));

        universidadeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                universidadeTFActionPerformed(evt);
            }
        });

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Nome da Universidade:");

        cursoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licenciatura", "Bacharelado" }));
        cursoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursoCBActionPerformed(evt);
            }
        });

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Tipo do Curso:");

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Valor diario cobrado por aluno:");

        valorPorAlunSP.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        valorPorAlunSP.setToolTipText("");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cursoCB, 0, 154, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(universidadeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorPorAlunSP, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valorPorAlunSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(universidadeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cursoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout personalJPLayout = new javax.swing.GroupLayout(personalJP);
        personalJP.setLayout(personalJPLayout);
        personalJPLayout.setHorizontalGroup(
            personalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalJPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        personalJPLayout.setVerticalGroup(
            personalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalJPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        alunJP.setBackground(new java.awt.Color(0, 51, 51));
        alunJP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterar Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(0, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        frequenciaLT.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "2 dias na semana", "3 dias na semana", "4 dias na semana", "5 dias na semana", "6 dias na semana", "Todos os dias da semana" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(frequenciaLT);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Frequencia de Treino:");

        planoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semanal", "Mensal", "Trimestral", "Semestral", "Anual" }));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Planos:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Valor a pagar:");

        valorLB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        valorLB.setForeground(new java.awt.Color(255, 255, 255));
        valorLB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        valorLB.setText("R$ --");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Horario de treino");

        horarioCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino", "Noturno" }));

        calcularBT.setText("Calcular Valor");
        calcularBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(planoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorLB, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(horarioCB, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(calcularBT, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(planoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorLB)
                            .addComponent(horarioCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calcularBT)
                .addGap(27, 27, 27))
        );

        pesoSP.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        alturaSP.setModel(new javax.swing.SpinnerNumberModel());

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Peso(Kg):");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Altura(cm):");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Personal:");

        personalTF.setEnabled(false);
        personalTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalTFActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Obs: Selecionar personal na tabela abaixo.");

        javax.swing.GroupLayout alunJPLayout = new javax.swing.GroupLayout(alunJP);
        alunJP.setLayout(alunJPLayout);
        alunJPLayout.setHorizontalGroup(
            alunJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alunJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alunJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alunJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pesoSP, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addComponent(alturaSP)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(personalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        alunJPLayout.setVerticalGroup(
            alunJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alunJPLayout.createSequentialGroup()
                .addGroup(alunJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(alunJPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesoSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alturaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(personalTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");

        nomeTL.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nomeTL.setForeground(new java.awt.Color(255, 255, 255));
        nomeTL.setText("Fulano da Silva");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cargo:");
        jLabel5.setToolTipText("");

        cargoTL.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cargoTL.setForeground(new java.awt.Color(255, 255, 255));
        cargoTL.setText("Personal ou Aluno");
        cargoTL.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cargoTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alunJP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(personalJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomeTL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cargoTL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alunJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personalJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo Academia Axi (1).jpeg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Alterar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personalTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personalTFActionPerformed

    private void universidadeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_universidadeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_universidadeTFActionPerformed

    private void cursoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursoCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cursoCBActionPerformed

    private void personalJTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personalJTMouseClicked
       personalTF.setText(modelPersonal.getPersonal(personalJT.getSelectedRow()).toString());
       calcularPlano();
    }//GEN-LAST:event_personalJTMouseClicked

    private void calcularBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularBTActionPerformed
        calcularPlano();
    }//GEN-LAST:event_calcularBTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!validarCampos()) {
            return; // Para a execução se a validação falhar
        }

        // 2. Pedir confirmação ao usuário
        int confirma = JOptionPane.showConfirmDialog(this,
            "Deseja realmente salvar as alterações?",
            "Confirmação de Alteração",
            JOptionPane.YES_NO_OPTION);

        if (confirma != JOptionPane.YES_OPTION) {
            return; 
        }

        
        try {
            if (this.usuario instanceof Personal) {
                Personal pers = (Personal) usuario;
                pers.setTipoCurso(cursoCB.getSelectedItem().toString());
                pers.setUniversidade(universidadeTF.getText());
                pers.setValorCobrado((double) valorPorAlunSP.getValue());
                gerIG.getGerDominio().alterar(pers);
            } else {
                Aluno alun = (Aluno) usuario;
                alun.setPeso((double) pesoSP.getValue());
                alun.setAltura((int) alturaSP.getValue());
                alun.setPersonal(modelPersonal.getPersonal(personalJT.getSelectedRow()));
                
                Plano plan = calcularPlano();
                if (plan == null) {
                    
                    JOptionPane.showMessageDialog(this, "Não foi possível calcular o plano para a alteração.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                plan.setIdPlano(alun.getPlano().getIdPlano());
                alun.setPlano(plan);
                
                gerIG.getGerDominio().alterar(alun.getPlano());
                gerIG.getGerDominio().alterar(alun);
            }

            
            JOptionPane.showMessageDialog(this, "Alterações salvas com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this,
                "Ocorreu um erro ao salvar as alterações.\nDetalhes: " + e.getMessage(),
                "Erro Crítico",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner alturaSP;
    private javax.swing.JPanel alunJP;
    private javax.swing.JButton calcularBT;
    private javax.swing.JLabel cargoTL;
    private javax.swing.JComboBox<String> cursoCB;
    private javax.swing.JList<String> frequenciaLT;
    private javax.swing.JComboBox<String> horarioCB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nomeTL;
    private javax.swing.JPanel personalJP;
    private javax.swing.JTable personalJT;
    private javax.swing.JTextField personalTF;
    private javax.swing.JSpinner pesoSP;
    private javax.swing.JComboBox<String> planoCB;
    private javax.swing.JTextField universidadeTF;
    private javax.swing.JLabel valorLB;
    private javax.swing.JSpinner valorPorAlunSP;
    // End of variables declaration//GEN-END:variables
}
