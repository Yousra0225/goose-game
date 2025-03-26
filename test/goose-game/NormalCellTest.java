package goosegame;

import static org.junit.Assert.*;
import org.junit.Test;

public class NormalCellTest{

  @Test
  public void createNormalCell() {
    Cell nCell = new NormalCell(1);
    assertEquals(nCell.getType(),"NormalCell");
    assertEquals(nCell.getIndex(),1);
    assertEquals(nCell.getPlayer(),null);
    assertEquals(nCell.getWaitingTime(),"");
  }

  @Test
  public void youCanWelcomePlayerInCell() {
    Cell nCell = new NormalCell(1);
    Player player = new Player("Toto");
    assertEquals(nCell.getPlayer(),null);
    nCell.welcomePlayer(player);
    assertTrue(nCell.getPlayer() != null);
    assertEquals(nCell.getPlayer(),player);
  }

  @Test
  public void NormalCellIsOccupied() {
    Cell nCell = new NormalCell(1);
    Player player = new Player("Toto");
    assertEquals(nCell.isOccupied(),false);
    assertEquals(nCell.getPlayer(),null);
    nCell.welcomePlayer(player);
    assertEquals(nCell.isOccupied(),true);
    assertTrue(nCell.getPlayer() != null);
  }

  @Test
  public void playerCanBeLeftTheCell() {
    Cell nCell = new NormalCell(1);
    assertTrue(nCell.canBeLeft());
  }

  @Test
  public void getFinalCellOfThePlayer() {
    Cell nCell = new NormalCell(1);
    Player player = new Player("Toto");
    assertEquals(nCell.getFinalCell(78),1);
  }

// ---Pour permettre l'exécution des test----------------------
 public static junit.framework.Test suite() {
    return new junit.framework.JUnit4TestAdapter(goosegame.NormalCellTest.class);
 }

}
