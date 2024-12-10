import org.code.theater.*;

/*
 * A scene visualizing the size of each US State
 */
public class StateScene extends Scene {

  private String[] states;     // The 1D array of state names
  private int[] population;        // The 1D array containing the name of each state's population 

  /*
   * Initializes states and populations to the specified 1D array of
   * state names and population of each state in population
   */
  public StateScene(String[] states, int[] population) {
    this.states = states;
    this.population = population;
  }

  /*
   * Returns the size to draw each image
   */
  public int chooseSize(int population) {
 
 int size = 0;

    if (population > 38332521) {
      size = 80;
    }
    else if (population < 38332521) {
      size = 50;
    }
    else {
      size = 25;
    }

    return size;
  }

  /*
   * Creates the scene by drawing the state image based on
   * the area of each state of population
   */
  public void drawResult() {    
    for (int i = 0; i < population.length; i++) {
      int x = (int) (Math.random() * getWidth());
      int y = (int) (Math.random() * getHeight());
      int size = chooseSize(population[i]);
      drawImage("thumb-1920-687665-1-.jpg", x, y, size);
    }
  }



}







  

