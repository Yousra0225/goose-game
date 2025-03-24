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
}
