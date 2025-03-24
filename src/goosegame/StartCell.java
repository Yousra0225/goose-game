package goosegame;

package goosegame;

/**
  * Class for StartCell
  */
public class StartCell implements Cell {

  protected int index;
  protected Player player;

  /**
  * Constructor of StartCell class
  */
  public StartCell() {
    this.index = 0;
    this.player = null;
  }

  /**
    * Know if the cell is occupied
    * @return true if the cell is occupied, false otherwize
    */
  public boolean isOccupied(){
    return this.player != null;
  }

  /**
    * Know if player can be left the cell
    * @return true if player can play, false otherwize
    */
  public boolean canBeLeft(){
    return true;
  }

  /**
    * Put a player in a cell
    * @param the player we want to put into the cell
    */
  public void welcomePlayer(Player p){
    this.player = p;
  }

  /**
    * Get the index of the final cell
    * @param dt the value of the roll of the dice
    * @return the index of the final cell
    */
  public int getFinalCell(int dt){
      return dt;
  }
    

    

}
