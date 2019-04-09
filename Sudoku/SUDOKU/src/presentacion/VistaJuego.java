/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import javax.swing.JTextField;

/**
 *
 * @author Estudiantes
 */
public class VistaJuego extends javax.swing.JFrame {

    private JTextField[][] matrizInterfaz;
    private int[][] sudoku;
    
    
    public VistaJuego() {
        initComponents();
    }
    public VistaJuego(Modelo m) {
        initComponents();
        generarCampos();
        imprmirCampos();
    }
    
    

    public void generarCampos(){
       matrizInterfaz  = new JTextField[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrizInterfaz[i][j] = new JTextField();
                matrizInterfaz[i][j].setSize(35, 35);
                matrizInterfaz[i][j].setText(String.valueOf(sudoku[i][j]));
            }
        }
    }

    public void setSudoku(int[][] sudoku) {
        this.sudoku = sudoku;
    }
    
    

    public JTextField[][] getMatrizInterfaz() {
        return matrizInterfaz;
    }

    public void setMatrizInterfaz(JTextField[][] matrizInterfaz) {
        this.matrizInterfaz = matrizInterfaz;
    }
    
    
    public void imprmirCampos(){
        int y,x;
        for ( int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                x = (50 +j*(35+1));
                y = (50 + i*(35+1));
                this.matrizInterfaz[i][j].setLocation(x, y);
                this.getContentPane().add(this.matrizInterfaz[i][j]);
            }
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        lblTiempo = new javax.swing.JLabel();
        btnComprobar = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        lblTiempoCambiante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(450, 450));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblTiempo.setText("Tiempo:");

        btnComprobar.setText("Comprobar");

        btnReiniciar.setText("Reiniciar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTiempo)
                .addGap(18, 18, 18)
                .addComponent(lblTiempoCambiante, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnReiniciar)
                .addGap(62, 62, 62)
                .addComponent(btnComprobar)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(lblTiempo)
                    .addComponent(lblTiempoCambiante, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReiniciar)
                    .addComponent(btnComprobar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprobar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTiempoCambiante;
    // End of variables declaration//GEN-END:variables
}
