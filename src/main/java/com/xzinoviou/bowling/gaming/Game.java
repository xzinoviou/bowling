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

  public int scoreForFrame(int frame) {
    var score = 0;
    for (int ball = 0; frame > 0 && (ball < itsCurrentThrow); ball += 2, frame--) {
      score += itsThrows[ball] + itsThrows[ball + 1];
    }
    return score;
  }
}
