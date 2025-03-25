package goosegame;

/**
  * Class for WaitCell
  */
public class WaitCell extends NormalCell {
  protected int timeToWait;
  protected int timeRemaining;

  /**
  * Constructor of WaitCell class
  * @param i index number of this cell
  * @param timeWait time to wait to play
  */
  public WaitCell(int i, int timeWait) {
    super(i);
    this.timeToWait = timeWait;
    this.timeRemaining = timeWait;
  }
}