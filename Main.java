public class Main {
  public static void main(String[] args) {
  
  Movie m1 = new Movie();
  m1.title = "The Conjuring";
  m1.genre = "Horror";
  m1.duration = 120;
  m1.displayInfo();
  
  Movie m2 = new Movie();
  m2.title = "Taken";
  m2.genre = "Action";
  m2.duration = 60;
  m2.displayInfo();
  
  Movie m3 = new Movie();
  m3.title = "Frozen";
  m3.genre = "Fantasy";
  m3.duration = 2;
  m3.displayInfo();
  }
}
