package com.xzinoviou.bowling.gaming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

  @Test
  public void testOneThrow() {
    Game game = new Game();
    game.add(5);
    assertEquals(5, game.score());
  }

  @Test
  public void testTwoThrowsNoMark() {
    Game game = new Game();
    game.add(5);
    game.add(4);
    assertEquals(9, game.score());
  }

  @Test
  public void testFourThrowsNoMark() {
    Game game = new Game();
    game.add(5);
    game.add(5);
    game.add(7);
    game.add(2);
    assertEquals(18, game.score());
    assertEquals(9, game.scoreForFrame(1));
    assertEquals(18, game.scoreForFrame(2));
  }
}
