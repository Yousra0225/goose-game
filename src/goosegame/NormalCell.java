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

