package goosegame;

/**
  * Class for NormalCell
  */
public class NormalCell implements Cell{
  protected int index;
  protected Player player;

  /**
  * Constructor of NormalCell class
  * @param i index number of this cell
  */
    public NormalCell(int i) {
        this.index = i;
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
      