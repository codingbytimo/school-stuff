import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class Aufgabe15b extends JavaKaraProgram {

  private void diagonaleRechts(int schritte) {
      for (int i=0; i<=schritte; i++) {
          kara.move();
          kara.turnRight();
          kara.move();
          kara.putLeaf();
          //kara.move();
          kara.turnLeft();
      }
      //kara.move();
  }
  
  private void diagonaleLinks(int schritte) {
      for (int i=0; i<=schritte; i++) {
          //kara.putLeaf();
          kara.move();
          kara.turnLeft();
          kara.move();
          kara.turnRight();
          kara.putLeaf();
      }
  }
    
  public void myProgram() {
    world.clearAll();
    world.setSize(24, 24);
    kara.setPosition(0, 15); //da startet Kara
    kara.turnLeft();
    diagonaleRechts(3); //eigene Methode für rechte Diagonale
    kara.turnRight();
    kara.turnRight();
    diagonaleLinks(2);
    kara.turnLeft();
    kara.turnLeft();
    diagonaleRechts(2);
    kara.turnRight();
    diagonaleRechts(2);
    diagonaleLinks(2);
    diagonaleRechts(2);
    kara.turnRight();
    tools.showMessage("Kara ist jetzt fertig.");
    
  }
  
}

        