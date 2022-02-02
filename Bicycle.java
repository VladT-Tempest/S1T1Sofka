public class Bicycle {
    /**
     * Abstraccíon del concepto bicicleta y sus principales caracterìsticas
     * @author Alejandro Aguilera
     */
    //atributos
    public String brand;
    public String reference;
    public String color;
    public int gear;
    /**
     * Constructor de la clase Bicicleta
     * @param brand marca de la bicicleta
     * @param reference referencia de la bicicleta
     * @param color color de la bicicleta
     * @param gear cantidad de velocidades
     */
    public Bicycle(String brand, String reference, String color, int gear) {
        this.brand = brand;
        this.reference = reference;
        this.color = color;
        this.gear = gear;
    }
    //getters and setters
    /**
     * Método para obtener la marca de la bicileta
     * @return marca
     */
    public String getBrand() {
        return brand;
    }
    /**
     * Método para configurar la marca de la bicileta
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    /**
     * Método para obtener la referencia de la bicileta
     * @return
     */
    public String getReference() {
        return reference;
    }
    /**
     * Método para configurar la referencia de la bicileta
     * @param reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }
    /**
     * Método para obtener el color de la bicileta
     * @return
     */
    public String getColor() {
        return color;
    }
    /**
     * Método para configurar el color de la bicileta
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Método para obtener las velocidades de la bicileta
     * @return
     */
    public int getGear() {
        return gear;
    }
    /**
     * Método para configurar las velocidades de la bicileta
     * @param gear
     */
    public void setGear(int gear) {
        this.gear = gear;
    }

    

    

}