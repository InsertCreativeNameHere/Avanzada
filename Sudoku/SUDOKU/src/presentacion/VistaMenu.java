package presentacion;

import javax.swing.JButton;

public class VistaMenu extends javax.swing.JFrame {
//ATRIBUTOS

    private Modelo modeloUno;
    private Controlador controladorUno;

//CONSTRUCTORES
    public VistaMenu(Modelo m) {
        modeloUno = m;
        initComponents();
        capturareventos();
    }
//MÉTODOS 

    public void capturareventos() {
        getBtnInicio().addActionListener(getControladorUno());
    }

    public Modelo getModeloUno() {
        return modeloUno;
    }

    public Controlador getControladorUno() {
        if (controladorUno == null) {
            controladorUno = new Controlador(this);
        }
        return controladorUno;
    }

    public JButton getBtnInicio() {
        return btnInicio;
    }

//LA VENTANA CREADA CON JFRAME
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInicio.setText("INICIAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    // End of variables declaration//GEN-END:variables
}
