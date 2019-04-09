package presentacion;

import logic.App;

public class Modelo {

    //ATRIBUTOS
    private VistaMenu ventanaDeInicio;
    private VistaJuego ventanaJuego;
    private App juego;

    //MÉTODOS
    public void iniciarVentana() {
        getVentanaDeInicio().setTitle("SUDOKU");
        getVentanaDeInicio().setResizable(false);
        getVentanaDeInicio().setLocationRelativeTo(null);
        getVentanaDeInicio().setVisible(true);
    }

    
    
    public void iniciarPartida(){
        getVentanaDeInicio().setVisible(false);
        getVentanaJuego().setTitle("SUDOKU");
        getVentanaJuego().setResizable(false);
        getVentanaJuego().setLocationRelativeTo(null);
        getVentanaJuego().setVisible(true);
    }

    public void hacerJuego() {
        getJuego().iniciarJuego();
    }

    public VistaJuego getVentanaJuego() {
        if (ventanaJuego == null) {
            ventanaJuego.setSudoku(getJuego().getSudokuUno().getSudoku());//crear constructor con este parametro
            ventanaJuego = new VistaJuego(this);
            
        }
        return ventanaJuego;
    }
   public void salir(){
      System.exit(0);
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
