import java.sql.Date;

public class Person {
     /** 
     * Abstracción del concepto de persona y sus característics fundamentales
     * @ author Aljendro Aguilera W
     */
    //atributos
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    /**
     * Constructor de la clase Persona
     * @param name nombre completo de la persona
     * @param lastName1 primer apellido de la persona
     * @param lastName2 segundo apellido de la persona
     * @param dateBirth fecha de nacimiento de la person    
     * @param height altura de la persona
     */

    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    //getters and setters
    /**
     * Método para obtener el nombre de la persona
     * @return
     */
    public String getName() {
        return name;
    }
    /**
     * Método para configurar el nombre de la persona
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Método para obtener el primer apellido de la persona
     * @return
     */
    public String getLastName1() {
        return lastName1;
    }
    /**
     * Método para configurar el primer apellido de la persona
     * @param lastName1
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }
    /**
     * Método para obtener el segundo apellido de la persona
     * @return
     */
    public String getLastName2() {
        return lastName2;
    }
    /**
     * Método para configurar el segundo apellido de la persona
     * @param lastName2
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
    /**
     * Método para obtener la fecha de nacimiento de la persona
     * @return
     */
    public Date getDateBirth() {
        return dateBirth;
    }
    /**
     * Método para configurar la fecha de nacimiento de la persona
     * @param dateBirth
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    /**
     * Método para obtener la estatura de la persona
     * @return
     */
    public float getHeight() {
        return height;
    }
    /**
     * Método para configurar la estatura de la persona
     * @param height
     */
    public void setHeight(float height) {
        this.height = height;
    }


    


}