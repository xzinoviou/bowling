package com.xzinoviou.bowling.gaming;

public class Game {

  private int score;

  public void add(int pins) {
    this.score += pins;
  }

  public int score() {
    return score;
  }
}
