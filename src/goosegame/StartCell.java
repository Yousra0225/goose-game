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
    

}
