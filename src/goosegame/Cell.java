package goosegame;

/**
  * interface for Cell
  */
public interface Cell {

/**
  * Know if the cell is occupied
  * @return true if the cell is occupied, false otherwize
  */
  public boolean isOccupied();

/**
  * Know if player can be left the cell
  * @return true if player can play, false otherwize
  */
  public boolean canBeLeft();

/**
  * Put a player in a cell
  * @param the player we want to put into the cell
  */
  public void welcomePlayer(Player p);

/**
  * Get the index of the final cell
  * @param dt the value of the roll of the dice
  * @return the index of the final cell
  */
  public int getFinalCell(int dt);

/**
  * Get the player of the cell if he exists
  * @return the player of the cell
  */
  public Player getPlayer();

/**
  * Get the index of the cell
  * @return the index of the cell
  */
  public int getIndex();

/**
  * Get the type of this cell
  * @return the type of this cell
  */
  public String getType();

/**
  * Get the number of round to wait for
  * @return the string about how much round to wait for
  */
  public String getWaitingTime();

  public Player removePlayerAtCell();
}
