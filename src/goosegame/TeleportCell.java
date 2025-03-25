package goosegame;

/**
  * Class for TeleportCell
  */
public class TeleportCell extends NormalCell {
  protected int dest;

  /**
  * Constructor of TeleportCell class
  * @param initial index number of initial cell
  * @param destination index number of final cell
  */
  public TeleportCell(int initial, int destination) {
    super(initial);
    this.dest = destination;
  }

  /**
    * Get the index of the final cell
    * @param dt the value of the roll of the dice
    * @return the index of the final cell
    */
    public int getFinalCell(int dt){
        return this.dest;
      }
    
    /**
    * Get the type of this cell
    * @return the type of this cell
    */
    public String getType(){
        return "TeleportCell";
    }

    /**
    * Get the nb of round to wait for
    * @return the string about how much round to wait for
    */
    public String getWaitingTime(){
        return "";
    }
}