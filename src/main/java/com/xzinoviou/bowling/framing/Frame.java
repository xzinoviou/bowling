package com.xzinoviou.bowling.framing;

public class Frame {

  private int score;

  public int getScore() {
    return score;
  }

  public void add(int pins) {
    this.score += pins;
  }
}
