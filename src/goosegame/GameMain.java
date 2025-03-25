package goosegame;

/**
  * Class for GameMain
  */
public class GameMain {

  public static void main(String[] args) {

    if(args.length < 1) {
        System.out.println("You can't play alone, find some friends !");
        System.exit(-1);
    }
    else {
        Game game = new Game(ClassicalBoard.BOARD);
        for(int i=0; i < args.length; i++) {
            game.addPlayer(new Player(args[i]));
        }
        game.play();
    }
  }
}
