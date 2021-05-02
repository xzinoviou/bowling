package com.xzinoviou.bowling.gaming;

import org.junit.Test;

public class GameTest {

  @Test
  public void testOneThrow() {
    Game game = new Game();
    game.add(5);
    assertEquals(5, game.score());
  }
}
