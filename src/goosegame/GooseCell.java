package goosegame;

/**
  * Class for GooseCell
  */
public class GooseCell extends NormalCell {

    /**
     * Constructor of GooseCell class
    * @param i index number of this cell
    */
    public GooseCell(int i) {
        super(i);
    }

    /**
    * Get the index of the final cell
    * @param dt the value of the roll of the dice
    * @return the index of the final cell
    */
    public int getFinalCell(int dt){
        return this.index + dt;
    }

    /**
        * Get the type of this cell
        * @return the type of this cell
        */
    public String getType(){
        return "GooseCell";
    }

    /**
        * Get the nb of round to wait for
        * @return the string about how much round to wait for
        */
    public String getWaitingTime(){
        return "";
  }

}
 