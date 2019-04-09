package presentacion;

import logic.App;

class Modelo {

    //ATRIBUTOS
    private VistaMenu ventanaDeInicio;
    private App juego;

    //MÉTODOS
    public void iniciarVentana() {
        getVentanaDeInicio().setTitle("SUDOKU");
        getVentanaDeInicio().setVisible(true);
    }

    public void hacerJuego() {
        getJuego().iniciarJuego();
    }

    public VistaMenu getVentanaDeInicio() {
        if (ventanaDeInicio == null) {

            ventanaDeInicio = new VistaMenu(this);
        }
        return ventanaDeInicio;
    }

    public App getJuego() {
        if (juego == null) {
            juego = new App();
        }
        return juego;
    }
}
