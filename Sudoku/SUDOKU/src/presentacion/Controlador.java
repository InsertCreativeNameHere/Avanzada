package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
//ATRIBUTOS

    private VistaMenu ventana;
//CONSTRUCTOR

    Controlador(VistaMenu aThis) {
        ventana = aThis;
    }
//MÉTODOS

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ventana.getBtnInicio())) {
            ventana.getModeloUno().hacerJuego();
        }
    }
}
