package goosegame;

import static org.junit.Assert.*;
import org.junit.Test;

public class ClassicalBoardTest{

  @Test
  public void createBoardInitTest(){
    assertEquals(63, ClassicalBoard.BOARD.getNbOfCells());
    assertEquals(ClassicalBoard.BOARD.getCell(9).getType(),"GooseCell");
    assertEquals(ClassicalBoard.BOARD.getCell(0).getType(),"StartCell");
    assertEquals(ClassicalBoard.BOARD.getCell(31).getType(),"TrapCell");
    // ...
  }


// ---Pour permettre l'exécution des test----------------------
 public static junit.framework.Test suite() {
    return new junit.framework.JUnit4TestAdapter(goosegame.ClassicalBoardTest.class);
 }

}
