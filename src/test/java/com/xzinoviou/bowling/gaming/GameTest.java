package com.xzinoviou.bowling.gaming;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

  private Game game;

  @Before
  public void setUp() {
    this.game = new Game();
  }

  @After
  public void tearDown() {
    this.game = null;
  }

  @Test
  public void testOneThrow() {
    game.add(5);
    assertEquals(5, game.score());
  }

  @Test
  public void testTwoThrowsNoMark() {
    game.add(5);
    game.add(4);
    assertEquals(9, game.score());
  }

  @Test
  public void testFourThrowsNoMark() {
    game.add(5);
    game.add(4);
    game.add(7);
    game.add(2);
    assertEquals(18, game.score());
    assertEquals(9, game.scoreForFrame(1));
    assertEquals(18, game.scoreForFrame(2));
  }

  @Test
  public void testSimpleSpare() {
    game.add(3);
    game.add(7);
    game.add(3);
    assertEquals(13, game.scoreForFrame(1));
  }


  @Test
  public void testSimpleFrameAfterSpare() {
    game.add(3);
    game.add(7);
    game.add(3);
    game.add(2);
    assertEquals(13, game.scoreForFrame(1));
    assertEquals(18, game.score());
  }
}
