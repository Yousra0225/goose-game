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

}