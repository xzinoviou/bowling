package com.xzinoviou.bowling.gaming;

public class Game {

  private int itsScore = 0;
  private int[] itsThrows = new int[21];
  private int itsCurrentThrow = 0;

  public void add(int pins) {
    this.itsScore += pins;
  }

  public int score() {
    return itsScore;
  }

  public int scoreForFrame(int theFrame) {
    var score = 0;
    var ball = 0;
    for (int currentFrame = 0; currentFrame < theFrame; currentFrame++) {
      score += itsThrows[ball++] + itsThrows[ball++];
    }
    return score;
  }
}
