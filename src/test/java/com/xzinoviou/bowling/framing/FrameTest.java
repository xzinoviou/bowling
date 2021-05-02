package com.xzinoviou.bowling.framing;

import org.junit.Test;

public class FrameTest {

  @Test
  public void testScoreNoThrows() {
    Frame frame = new Frame();
    assertEquals(0, frame.getScore());
  }
}
