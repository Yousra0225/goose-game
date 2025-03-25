package goosegame;

/**
  * Class for ClassicalBoard
  */
public class ClassicalBoard extends Board {
  private static final int NBOFCELLS = 63;
  public static final Board BOARD = new ClassicalBoard();

  /**
  * Constructor of ClassicalBoard class
  */
  private ClassicalBoard() {
    super(NBOFCELLS);
  }

  /**
  * initialization of the table and its special cells
  */
  protected void initBoard() {
    for(int i=1; i < NBOFCELLS+1; i++){
      this.theCells[i] = new NormalCell(i);
    }
    for(int i=9; i < NBOFCELLS; i= i+9){
      this.theCells[i] = new GooseCell(i);
    }
    this.theCells[31] = new TrapCell(31);
    this.theCells[52] = new TrapCell(52);
    this.theCells[19] = new WaitCell(19,2);
    this.theCells[6] = new TeleportCell(6,12);
    this.theCells[42] = new TeleportCell(42,30);
    this.theCells[58] = new TeleportCell(58,1);

  }


}