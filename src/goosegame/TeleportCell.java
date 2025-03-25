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
  
}