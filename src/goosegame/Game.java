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
  
    /**
     * Check if the index is valid, if is upper than nbOfCells, you go to last cell and then you walk back the rest
    * @param i the index to check
    * @return the valid index
    */
    public int caseValid(int i) {
        int res = i;
        int nbDeCases = this.board.getNbOfCells();
        if( i > nbDeCases ){
            int walkBack = i - nbDeCases ;
            res = nbDeCases - walkBack;
        }
        return res;
    }

/** Move the player to one cell
* @param player the player who want to move
* @param valeur the value on the dice
*/
public void movePlayer(Player joueur, int valeur ){
    Cell caseDepart = joueur.getCell();
    int indiceCaseDepart = caseDepart.getIndex();

    int indiceCaseArrive = this.caseValid(indiceCaseDepart + valeur) ;
    Cell caseArrive = this.board.getCell(indiceCaseArrive);

    int indiceCaseFinale = this.caseValid(caseArrive.getFinalCell(valeur));
    Cell caseFinale = this.board.getCell(indiceCaseFinale);

    String res = "";
    if( caseFinale.isOccupied() ){
        Player occupentPlayer = caseFinale.getPlayer();
        caseDepart.welcomePlayer(occupentPlayer);
        occupentPlayer.changeCell(caseDepart);
        res = " cell is busy ! "+occupentPlayer.toString()+ " is sent to cell "+indiceCaseDepart;
    }
    else {
        caseDepart.removePlayerAtCell();
    }

    if( caseArrive.getType() == "NormalCell" )
        System.out.println(joueur.toString() + " is in cell " +indiceCaseDepart+ ", " +joueur.toString()+" throws " +valeur+" and reaches "+indiceCaseArrive+res);

    if( caseArrive.getType() == "GooseCell" || caseArrive.getType() == "TeleportCell" )
        System.out.println(joueur.toString() + " is in cell " +indiceCaseDepart+ ", " +joueur.toString()+" throws " +valeur+" and reaches "+indiceCaseArrive+" ("+caseArrive.getType()+") and jumps to cell "+indiceCaseFinale+" ("+caseArrive.getType()+")"+res);

    caseFinale.welcomePlayer(joueur);
    joueur.changeCell(caseFinale);
}
}