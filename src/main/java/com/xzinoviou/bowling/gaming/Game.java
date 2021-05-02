package com.xzinoviou.bowling.gaming;

public class Game {

  private int itsScore = 0;
  private int[] itsThrows = new int[21];
  private int itsCurrentThrow = 0;

  public void add(int pins) {
    this.itsThrows[itsCurrentThrow++] = pins;
    this.itsScore += pins;
  }

  public int score() {
    return itsScore;
  }

  public int getCurrentFrame() {
    return 1 + (itsCurrentThrow - 1) / 2;
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
