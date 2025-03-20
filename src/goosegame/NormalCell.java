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

    /**
     * Put a player into a cell
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
        return this.index;
    }

    /**
     * Get the player of the cell if he exists
     * @return the index of the cell
     */
    public int getIndex(){
        return this.index;
    }

    /**
     * Get the type of the cell
     * @return the type of this cell
     */
    public String getType(){
        return "NormalCell";
    }

    /**
     * Get the number of round to wait for 
     * @return the string about how much round to wait for
     */
    public String getWaitingTime(){
        return "";
    }

}
      