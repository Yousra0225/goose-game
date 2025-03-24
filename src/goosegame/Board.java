package goosegame;

/**
  * Class for Board
  */
public abstract class Board {
  protected final int NB_OF_CELLS;
  protected Cell[] theCells;

  /**
  * Constructor of Board abstract class
  * @param nbOfCells number of cells in this board
  */
  public Board(int nbOfCells) {
    this.NB_OF_CELLS = nbOfCells;
    this.theCells = new Cell[nbOfCells + 1];
    this.theCells[0] = new StartCell();
    this.initBoard();
  }

  /**
  * initialization of the table and its special cells
  */
  abstract protected void initBoard();

}