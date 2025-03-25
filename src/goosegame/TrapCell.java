package goosegame;

/**
  * Class for TrapCell
  */
public class TrapCell extends NormalCell {

  /**
  * Constructor of TrapCell class
  * @param i index number of this cell
  */
  public TrapCell(int i) {
    super(i);
  }

  /**
    * Know if player can be left the cell
    * @return true if player can play, false otherwize
    */
  public boolean canBeLeft(){
    return false;
  }

  /**
    * Get the type of this cell
    * @return the type of this cell
    */
  public String getType(){
    return "TrapCell";
  }

  /**
    * Get the nb of round to wait for
    * @return the string about how much round to wait for
    */
  public String getWaitingTime(){
    return "everytime";
  }

}
