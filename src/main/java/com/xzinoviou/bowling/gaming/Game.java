package com.xzinoviou.bowling.gaming;

public class Game {

  private int itsScore = 0;
  private int[] itsThrows = new int[21];
  private int itsCurrentThrow = 0;
  private int itsCurrentFrame = 1;
  private boolean firstThrow = true;

  public void add(int pins) {
    this.itsThrows[itsCurrentThrow++] = pins;
    this.itsScore += pins;
    adjustCurrentFrame();
  }

  private void adjustCurrentFrame() {
    if (firstThrow) {
      firstThrow = false;
    } else {
      firstThrow = true;
      itsCurrentFrame++;
    }
  }

  public int score() {
    return scoreForFrame(getCurrentFrame() - 1);
  }

  public int getCurrentFrame() {
    return itsCurrentFrame;
  }

  public int scoreForFrame(int theFrame) {
    var score = 0;
    var ball = 0;
    for (int currentFrame = 0; currentFrame < theFrame; currentFrame++) {
      int firstThrow = itsThrows[ball++];
      int secondThrow = itsThrows[ball++];

      int frameScore = firstThrow + secondThrow;

      if (frameScore == 10) {
        score += frameScore + itsThrows[ball];
      } else {
        score += frameScore;
      }
    }
    return score;
  }
}
