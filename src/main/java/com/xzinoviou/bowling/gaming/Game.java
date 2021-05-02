package com.xzinoviou.bowling.gaming;

public class Game {

  private int itsScore = 0;
  private int[] itsThrows = new int[21];
  private int itsCurrentThrow = 0;
  private int itsCurrentFrame = 0;
  private boolean firstThrow = true;

  public void add(int pins) {
    this.itsThrows[itsCurrentThrow++] = pins;
    this.itsScore += pins;

    if (firstThrow == true) {
      firstThrow = false;
      itsCurrentFrame++;
    } else {
      firstThrow = true;
    }
  }

  public int score() {
    return itsScore;
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
