package logic;

public class App {

//ATRIBUTOS
    private Sudoku sudokuUno;
//CONSTRUCTOR

    public App() {
        sudokuUno = new Sudoku();
    }
//MÉTODOS 

    public void iniciarJuego() {
        sudokuUno.generar();
    }
}
