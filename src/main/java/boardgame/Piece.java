package boardgame;

public class Piece {

    /* posição de matriz, garantir que a posição ainda não seja acessada*/
    protected Position position;
    private Board board;

    /*posição de uma peça recem criada, será inicialmente nula*/
    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    /*protected para que somente classes dentro do mesmo pacote ou subclasses acessem*/
    protected Board getBoard() {
        return board;
    }
}
