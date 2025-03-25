package goosegame;
import java.util.*;
/**
 * Class for game
 */
public class Game {
    protected List<Player> thePlayers;
    protected Board board;
    protected Iterator<Player> it;
    /**
     * Constructor of Game class
     * @param b
     */
    public Game(Board b){
        this.board = b;
        this.thePlayers = new ArrayList<>();
        this.it = thePlayers.iterator();
    }   

    /**
    * Get the board of this game
    * @return the board
    */
    public Board getBoard() {
        return this.board;
      }
  
    /**
    * Add a player in this game
    * @param p player we want to add in this game
    */
    public void addPlayer(Player p){
        this.thePlayers.add(p);
        Cell cell = new StartCell();
        p.changeCell(cell);
        cell.welcomePlayer(p);
    }
  
    /**
    * know if the game is finished
    * @return true if the game is finish otherwize false
    */
    public boolean isFinished() {
        return this.board.getCell(this.board.getNbOfCells()).isOccupied();
    }
  
  /**
    * Get the next player who has to play
    * @return the next Player
    */
    public Player nextPlayer(){
        if( !this.it.hasNext() )
        this.it = this.thePlayers.iterator();
        return this.it.next();
    }
  

}