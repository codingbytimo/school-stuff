import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class Aufgabe15 extends JavaKaraProgram {

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
    kara.setPosition(10, 15); //da startet Kara
    kara.turnLeft();
    diagonaleRechts(5); //eigene Methode f�r rechte Diagonale
    kara.turnRight();
    kara.turnLeft();
    diagonaleLinks(4); //eigene Methode f�r linke Diiagonale
    kara.turnLeft();
    diagonaleLinks(4);
    kara.turnLeft();
    kara.turnLeft();
    diagonaleRechts(3);
    kara.move();
    kara.turnRight();
    kara.move();
    kara.turnLeft();
    tools.showMessage("Kara ist jetzt fertig.");
  }
  
}



        