import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Creates a 1D array of state names from a text file
    String[] names = FileReader.toStringArray("states.txt");

    // Creates a 1D array containing the areas from a text file
    int[] population = FileReader.toIntArray("population.txt");

    // Creates a StateScene object
    StateScene scene = new StateScene(names, population);

    // Calls the drawResult() method
    scene.drawResult();

    // Plays the scene
    Theater.playScenes(scene);
    
  }
}