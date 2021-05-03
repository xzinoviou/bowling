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
  public void testTwoThrowsNoMark() {
    game.add(5);
    game.add(4);
    assertEquals(9, game.score());
    assertEquals(2, game.getCurrentFrame());
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
    assertEquals(3, game.getCurrentFrame());
  }

  @Test
  public void testSimpleSpare() {
    game.add(3);
    game.add(7);
    game.add(3);
    assertEquals(13, game.scoreForFrame(1));
    assertEquals(2, game.getCurrentFrame());
  }


  @Test
  public void testSimpleFrameAfterSpare() {
    game.add(3);
    game.add(7);
    game.add(3);
    game.add(2);
    assertEquals(13, game.scoreForFrame(1));
    assertEquals(18, game.scoreForFrame(2));
    assertEquals(18, game.score());
    assertEquals(3, game.getCurrentFrame());
  }

  @Test
  public void testSimpleStrike() {
    game.add(10);
    game.add(3);
    game.add(6);
    assertEquals(19, game.scoreForFrame(1));
    assertEquals(28, game.score());
    assertEquals(3, game.getCurrentFrame());
  }

  @Test
  public void testPerfectGame() {
    for
    (int i = 0; i < 12; i++) {
      game.add(10);
    }
    assertEquals(300, game.score());
    assertEquals(10, game.getCurrentFrame());
  }

  @Test
  public void testEndOfArray() {
    for (int i = 0; i < 9; i++) {
      game.add(0);
      game.add(0);
    }

    game.add(2);
    game.add(8);

    game.add(10);
    assertEquals(20, game.score());
  }

  @Test
  public void testSampleGame() {
    game.add(1);
    game.add(4);

    game.add(4);
    game.add(5);

    game.add(6);
    game.add(4);

    game.add(5);
    game.add(5);

    game.add(10);

    game.add(0);
    game.add(1);

    game.add(7);
    game.add(3);

    game.add(6);
    game.add(4);

    game.add(10);

    game.add(2);
    game.add(8);

    game.add(6);

    assertEquals(133, game.score());
  }

  @Test
  public void testHeartBreak() {
    for (int i = 0; i < 11; i++) {
      game.add(10);
    }
    game.add(9);

    assertEquals(299, game.score());
  }

  @Test
  public void testTenthFrameSpare() {
    for (int i = 0; i < 9; i++) {
      game.add(10);
    }
    game.add(9);
    game.add(1);
    game.add(1);

    assertEquals(270, game.score());
  }
}
