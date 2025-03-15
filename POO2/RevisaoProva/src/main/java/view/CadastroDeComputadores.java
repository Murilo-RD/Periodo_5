/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Xacar
 */
public class CadastroDeComputadores extends javax.swing.JFrame {

    /**
     * Creates new form CadastroDeComputadores
     */
    public CadastroDeComputadores() {
        initComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SOButtomGroup = new javax.swing.ButtonGroup();
        HDButtonGroup = new javax.swing.ButtonGroup();
        ProcessadorButtomGroup = new javax.swing.ButtonGroup();
        PainelPrincipal = new javax.swing.JPanel();
        PainelNome = new javax.swing.JPanel();
        NomeLabel = new javax.swing.JLabel();
        NomeTextField = new javax.swing.JTextField();
        PainelSistemaOP = new javax.swing.JPanel();
        WindRadioButton = new javax.swing.JRadioButton();
        LinuxRadioButton = new javax.swing.JRadioButton();
        PainelProcessador = new javax.swing.JPanel();
        IntelRadioButton = new javax.swing.JRadioButton();
        AMDRadioButton = new javax.swing.JRadioButton();
        PainelVersao = new javax.swing.JPanel();
        VersaoLabel = new javax.swing.JLabel();
        VersaoComboBox = new javax.swing.JComboBox<>();
        HDPainel = new javax.swing.JPanel();
        GBaCheckBox = new javax.swing.JCheckBox();
        GBbCheckBox = new javax.swing.JCheckBox();
        TBCheckBox = new javax.swing.JCheckBox();
        PainelCidade = new javax.swing.JPanel();
        CidadeLabel = new javax.swing.JLabel();
        CidadeComboBox = new javax.swing.JComboBox<>();
        PainelMemRAM = new javax.swing.JPanel();
        MemRAMLabel = new javax.swing.JLabel();
        MemRAMScrollPane = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        CadastrarButton = new javax.swing.JButton();
        PainelRelatorio = new javax.swing.JPanel();
        RelatorioScrollPane = new javax.swing.JScrollPane();
        RelatorioTable = new javax.swing.JTable();
        RelatorioLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NomeLabel.setText("Nome");

        NomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelNomeLayout = new javax.swing.GroupLayout(PainelNome);
        PainelNome.setLayout(PainelNomeLayout);
        PainelNomeLayout.setHorizontalGroup(
            PainelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNomeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PainelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelNomeLayout.createSequentialGroup()
                        .addComponent(NomeLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(NomeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelNomeLayout.setVerticalGroup(
            PainelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelSistemaOP.setBorder(javax.swing.BorderFactory.createTitledBorder("Sist. Operacional"));

        SOButtomGroup.add(WindRadioButton);
        WindRadioButton.setText("Windows");
        WindRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WindRadioButtonActionPerformed(evt);
            }
        });

        SOButtomGroup.add(LinuxRadioButton);
        LinuxRadioButton.setText("Linux");
        LinuxRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinuxRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelSistemaOPLayout = new javax.swing.GroupLayout(PainelSistemaOP);
        PainelSistemaOP.setLayout(PainelSistemaOPLayout);
        PainelSistemaOPLayout.setHorizontalGroup(
            PainelSistemaOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelSistemaOPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelSistemaOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WindRadioButton)
                    .addComponent(LinuxRadioButton))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        PainelSistemaOPLayout.setVerticalGroup(
            PainelSistemaOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelSistemaOPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WindRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LinuxRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelProcessador.setBorder(javax.swing.BorderFactory.createTitledBorder("Processador"));

        ProcessadorButtomGroup.add(IntelRadioButton);
        IntelRadioButton.setText("Intel");
        IntelRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntelRadioButtonActionPerformed(evt);
            }
        });

        ProcessadorButtomGroup.add(AMDRadioButton);
        AMDRadioButton.setText("AMD");
        AMDRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMDRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelProcessadorLayout = new javax.swing.GroupLayout(PainelProcessador);
        PainelProcessador.setLayout(PainelProcessadorLayout);
        PainelProcessadorLayout.setHorizontalGroup(
            PainelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProcessadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AMDRadioButton)
                    .addComponent(IntelRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelProcessadorLayout.setVerticalGroup(
            PainelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProcessadorLayout.createSequentialGroup()
                .addComponent(IntelRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AMDRadioButton)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        VersaoLabel.setText("Versão");

        VersaoComboBox.setToolTipText("");
        VersaoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VersaoComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelVersaoLayout = new javax.swing.GroupLayout(PainelVersao);
        PainelVersao.setLayout(PainelVersaoLayout);
        PainelVersaoLayout.setHorizontalGroup(
            PainelVersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelVersaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelVersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelVersaoLayout.createSequentialGroup()
                        .addComponent(VersaoLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(VersaoComboBox, 0, 131, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelVersaoLayout.setVerticalGroup(
            PainelVersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelVersaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VersaoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VersaoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        HDPainel.setBorder(javax.swing.BorderFactory.createTitledBorder("HD"));

        HDButtonGroup.add(GBaCheckBox);
        GBaCheckBox.setText("350 GB");
        GBaCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GBaCheckBoxActionPerformed(evt);
            }
        });

        HDButtonGroup.add(GBbCheckBox);
        GBbCheckBox.setSelected(true);
        GBbCheckBox.setText("500 GB");
        GBbCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GBbCheckBoxActionPerformed(evt);
            }
        });

        HDButtonGroup.add(TBCheckBox);
        TBCheckBox.setText("1 TB");
        TBCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HDPainelLayout = new javax.swing.GroupLayout(HDPainel);
        HDPainel.setLayout(HDPainelLayout);
        HDPainelLayout.setHorizontalGroup(
            HDPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HDPainelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(HDPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GBaCheckBox)
                    .addComponent(GBbCheckBox)
                    .addComponent(TBCheckBox)))
        );
        HDPainelLayout.setVerticalGroup(
            HDPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HDPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GBaCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GBbCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TBCheckBox)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        CidadeLabel.setText("Cidade");

        CidadeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aracruz", "Colatina", "Serra", "Vitória" }));
        CidadeComboBox.setSelectedIndex(1);

        javax.swing.GroupLayout PainelCidadeLayout = new javax.swing.GroupLayout(PainelCidade);
        PainelCidade.setLayout(PainelCidadeLayout);
        PainelCidadeLayout.setHorizontalGroup(
            PainelCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCidadeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CidadeLabel)
                    .addComponent(CidadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        PainelCidadeLayout.setVerticalGroup(
            PainelCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CidadeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CidadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MemRAMLabel.setText("Memória RAM");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Menos que 1GB", "1GB", "2GB", "3BG", "4GB", "Mais que 4GB" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setToolTipText("");
        MemRAMScrollPane.setViewportView(jList1);

        javax.swing.GroupLayout PainelMemRAMLayout = new javax.swing.GroupLayout(PainelMemRAM);
        PainelMemRAM.setLayout(PainelMemRAMLayout);
        PainelMemRAMLayout.setHorizontalGroup(
            PainelMemRAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelMemRAMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelMemRAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MemRAMLabel)
                    .addComponent(MemRAMScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelMemRAMLayout.setVerticalGroup(
            PainelMemRAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelMemRAMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MemRAMLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MemRAMScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CadastrarButton.setText("Cadastrar");
        CadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarButtonActionPerformed(evt);
            }
        });

        RelatorioTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Cidade", "SO", "Versão", "Processador", "HD", "Memória"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RelatorioTable.setToolTipText("");
        RelatorioTable.setGridColor(new java.awt.Color(51, 51, 51));
        RelatorioScrollPane.setViewportView(RelatorioTable);

        RelatorioLabel.setText("Rlatório");

        javax.swing.GroupLayout PainelRelatorioLayout = new javax.swing.GroupLayout(PainelRelatorio);
        PainelRelatorio.setLayout(PainelRelatorioLayout);
        PainelRelatorioLayout.setHorizontalGroup(
            PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RelatorioLabel)
                    .addComponent(RelatorioScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelRelatorioLayout.setVerticalGroup(
            PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelRelatorioLayout.createSequentialGroup()
                .addComponent(RelatorioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RelatorioScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PainelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PainelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PainelRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PainelSistemaOP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PainelProcessador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PainelVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HDPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(CadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(PainelMemRAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PainelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PainelSistemaOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PainelVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HDPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PainelProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addComponent(PainelMemRAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CadastrarButton)))
                .addGap(18, 18, 18)
                .addComponent(PainelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeTextFieldActionPerformed

    private void LinuxRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinuxRadioButtonActionPerformed
        if(LinuxRadioButton.isSelected()){
            VersaoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Ubuntu", "Fedora", "Red Hat", "Suse", "Debian"}));
            VersaoComboBox.setSelectedIndex(0);
            
        }            // TODO add your handling code here:
    }//GEN-LAST:event_LinuxRadioButtonActionPerformed

    private void IntelRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntelRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IntelRadioButtonActionPerformed

    private void AMDRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMDRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AMDRadioButtonActionPerformed

    private void VersaoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VersaoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VersaoComboBoxActionPerformed

    private void CadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastrarButtonActionPerformed

    private void WindRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WindRadioButtonActionPerformed
        if (WindRadioButton.isSelected()){
            VersaoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XP", "Win7","Win8","2003 Server","2008 Server"}));
            VersaoComboBox.setSelectedIndex(2);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_WindRadioButtonActionPerformed

    private void GBaCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GBaCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GBaCheckBoxActionPerformed

    private void GBbCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GBbCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GBbCheckBoxActionPerformed

    private void TBCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TBCheckBoxActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroDeComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeComputadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeComputadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AMDRadioButton;
    private javax.swing.JButton CadastrarButton;
    private javax.swing.JComboBox<String> CidadeComboBox;
    private javax.swing.JLabel CidadeLabel;
    private javax.swing.JCheckBox GBaCheckBox;
    private javax.swing.JCheckBox GBbCheckBox;
    private javax.swing.ButtonGroup HDButtonGroup;
    private javax.swing.JPanel HDPainel;
    private javax.swing.JRadioButton IntelRadioButton;
    private javax.swing.JRadioButton LinuxRadioButton;
    private javax.swing.JLabel MemRAMLabel;
    private javax.swing.JScrollPane MemRAMScrollPane;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JTextField NomeTextField;
    private javax.swing.JPanel PainelCidade;
    private javax.swing.JPanel PainelMemRAM;
    private javax.swing.JPanel PainelNome;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JPanel PainelProcessador;
    private javax.swing.JPanel PainelRelatorio;
    private javax.swing.JPanel PainelSistemaOP;
    private javax.swing.JPanel PainelVersao;
    private javax.swing.ButtonGroup ProcessadorButtomGroup;
    private javax.swing.JLabel RelatorioLabel;
    private javax.swing.JScrollPane RelatorioScrollPane;
    private javax.swing.JTable RelatorioTable;
    private javax.swing.ButtonGroup SOButtomGroup;
    private javax.swing.JCheckBox TBCheckBox;
    private javax.swing.JComboBox<String> VersaoComboBox;
    private javax.swing.JLabel VersaoLabel;
    private javax.swing.JRadioButton WindRadioButton;
    private javax.swing.JList<String> jList1;
    // End of variables declaration//GEN-END:variables
}
