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

  /**
  * Get the cell of index i in theCells
  * @param i the index of the cell
  * @return the cell of index i
  */
  public Cell getCell(int index) {
    return this.theCells[index];
  }

  /**
  * Get the number of cells in theCells
  * @return the number of cells
  */
  public int getNbOfCells() {
    return this.NB_OF_CELLS;
  }


}