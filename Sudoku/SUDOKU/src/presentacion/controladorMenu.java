package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controladorMenu implements ActionListener {
//ATRIBUTOS

    private VistaMenu ventana;
//CONSTRUCTOR

    controladorMenu(VistaMenu aThis) {
        ventana = aThis;
    }
//MÉTODOS

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ventana.getBtnInicio())) {
            ventana.getModeloUno().iniciarPartida();
        }
        if (e.getSource().equals(ventana.getBtnSalir())) {
            ventana.getModeloUno().salir();
        }
    }
}
