import java.util.ArrayList;

public class Fruit {
     /** 
     * Abstracción de una fruta y sus característics fundamentales
     * @ author Aljendro Aguilera W
     */

    //atributos
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;
    /**
     * Constructor de la clase Fruta
     * @param name nombre de la fruta
     * @param averageWeight peso promedio de la fruta
     * @param colors color de la fruta
     */    

    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }
    // getters and setters
    /**
     * Método para obtener el nombre de la fruta
     * @return
     */
    public String getName() {
        return name;
    }
    /**
     * Método para configurar el nombre de la fruta
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Método para obtener el peso promedio de la fruta
     * @return
     */
    public float getAverageWeight() {
        return averageWeight;
    }
    /**
     * Método para configurar el peso promedio de la fruta
     * @param averageWeight
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
    /**
     * Método para obtener el arreglo de colores de la fruta
     * @return
     */
    public ArrayList<String> getColors() {
        return colors;
    }
    /**
     * Método para configurar el arreglo de colores de la fruta
     * @param colors
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }   
}
