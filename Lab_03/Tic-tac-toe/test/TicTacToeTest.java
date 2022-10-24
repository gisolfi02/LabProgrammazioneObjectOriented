import org.junit.Assert;
import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void horizontalWinTest() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.set(0,0,TicTacToe.player1);
        ticTacToe.set(0,1,TicTacToe.player1);
        ticTacToe.set(0,2,TicTacToe.player1);
        Assert.assertEquals(TicTacToe.player1,ticTacToe.getWinner());
    }

    @Test
    public void verticalWinTest() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.set(0,0,TicTacToe.player1);
        ticTacToe.set(1,0,TicTacToe.player1);
        ticTacToe.set(2,0,TicTacToe.player1);
        Assert.assertEquals(TicTacToe.player1, ticTacToe.getWinner());
    }

    @Test
    public void firstDiagonalWinTest() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.set(0,0,TicTacToe.player2);
        ticTacToe.set(1,1,TicTacToe.player2);
        ticTacToe.set(2,2,TicTacToe.player2);
        Assert.assertEquals(TicTacToe.player2,ticTacToe.getWinner());
    }

    @Test
    public void secondDiagonalWinTest() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.set(2,0,TicTacToe.player2);
        ticTacToe.set(1,1,TicTacToe.player2);
        ticTacToe.set(0,2,TicTacToe.player2);
        Assert.assertEquals(TicTacToe.player2, ticTacToe.getWinner());
    }
}