package Student_Managment;

import User_Account_Management.welcome;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class lessons extends javax.swing.JPanel {

    private JFrame frame;

    public lessons(String name) {
        initComponents();
        jLabel1.setText(name);

    }

    @Override
    public void setVisible(boolean f) {
        if (f) {
            frame = new JFrame("Search and Update Student");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.getContentPane().add(this);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        jSeparator1 = new javax.swing.JSeparator();
        jDialog5 = new javax.swing.JDialog();
        jDialog6 = new javax.swing.JDialog();
        jButton5 = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        EDIT_TABLE = new javax.swing.JScrollPane();
        lessons = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        updateButton1 = new javax.swing.JButton();
        updateButton2 = new javax.swing.JButton();
        updateButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog6Layout = new javax.swing.GroupLayout(jDialog6.getContentPane());
        jDialog6.getContentPane().setLayout(jDialog6Layout);
        jDialog6Layout.setHorizontalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog6Layout.setVerticalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(153, 153, 153));

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("LOGOUT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(102, 102, 102));
        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("mark as completed");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel11.setText("lessons");

        lessons.setAutoCreateRowSorter(true);
        lessons.setBackground(new java.awt.Color(102, 102, 102));
        lessons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lessons.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lessons.setForeground(new java.awt.Color(255, 255, 255));
        lessons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"COMP", "non"},
                {null, "non"},
                {null, "non"}
            },
            new String [] {
                "title", "completed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lessons.setToolTipText("MMM");
        lessons.setFillsViewportHeight(true);
        lessons.setGridColor(new java.awt.Color(255, 255, 255));
        lessons.setShowGrid(true);
        lessons.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lessonsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lessons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lessonsMouseClicked(evt);
            }
        });
        lessons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lessonsKeyPressed(evt);
            }
        });
        EDIT_TABLE.setViewportView(lessons);
        lessons.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("course_name");

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        updateButton1.setBackground(new java.awt.Color(102, 102, 102));
        updateButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateButton1.setForeground(new java.awt.Color(255, 255, 255));
        updateButton1.setText("Description");
        updateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton1ActionPerformed(evt);
            }
        });

        updateButton2.setBackground(new java.awt.Color(102, 102, 102));
        updateButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateButton2.setForeground(new java.awt.Color(255, 255, 255));
        updateButton2.setText("view optional resources");
        updateButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton2ActionPerformed(evt);
            }
        });

        updateButton3.setBackground(new java.awt.Color(102, 102, 102));
        updateButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateButton3.setForeground(new java.awt.Color(255, 255, 255));
        updateButton3.setText("view content");
        updateButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(updateButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(updateButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(updateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(EDIT_TABLE, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EDIT_TABLE, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
           new welcome().setVisible(true);
           frame.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int row = lessons.getSelectedRow();
       if (row == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row first!");
        return;
    }

    Object st = lessons.getValueAt(row, 1);
    if ((st.toString()).equals("completed")) {
        JOptionPane.showMessageDialog(this, "This lesson is already completed!");
        return; 
    }
    int result = JOptionPane.showConfirmDialog(
        this,
        "Are you sure this lesson is completed?",
        "Confirm Completion",
        JOptionPane.YES_NO_OPTION
    );

    if (result == JOptionPane.YES_OPTION) {
        lessons.setValueAt("Completed", row, 1);
    }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void lessonsAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lessonsAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lessonsAncestorAdded

    private void lessonsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lessonsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lessonsMouseClicked

    private void lessonsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lessonsKeyPressed
   
    }//GEN-LAST:event_lessonsKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new Enrolled_courses().setVisible(true);
        frame.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void updateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButton1ActionPerformed

    private void updateButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButton2ActionPerformed

    private void updateButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane EDIT_TABLE;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable lessons;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton updateButton1;
    private javax.swing.JButton updateButton2;
    private javax.swing.JButton updateButton3;
    // End of variables declaration//GEN-END:variables
}
