public static class Main {
  public static void main(String[] args) {
    cavestuff work = new cavestuff();
    while (!work.game_over) {
      work.setname();
      work.Intro();
      work.bossIntro();
    }
  }
}