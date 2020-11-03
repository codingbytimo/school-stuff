import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class Aufgabe14 extends JavaKaraProgram {
    
    
  private void diagonaleRechts(int schritte) {
      for (int i=0; i<schritte; i++) {
          kara.move();
          kara.turnRight();
          kara.move();
          kara.putLeaf();
          //kara.move();
          kara.turnLeft();
      }
      kara.move();
  }
  
  private void diagonaleLinks(int schritte) {
      for (int i=0; i<schritte; i++) {
          kara.putLeaf();
          kara.move();
          kara.turnLeft();
          kara.move();
          kara.turnRight();
      }
  }
  
  private void laufe(int schritte) {
      for (int i=0; i<=schritte; i++) {
          kara.move();
      }
  }
    
  public void myProgram() {
    world.clearAll();
    world.setSize(24, 24);
    kara.setPosition(5, 15); //da startet Kara
    kara.turnLeft();
    diagonaleRechts(5); //eigene Methode für rechte Diagonale
    kara.turnRight();
    laufe(3); //eigene Methode, damit Kara mehrere Schritte läuft
    kara.turnLeft();
    diagonaleLinks(5); //eigene Methode für linke Diiagonale
    tools.showMessage("Kara ist jetzt fertig.");
  }
}

        