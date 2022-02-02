import java.sql.Date;

public class Student {
    /**
     * Abstracción del concepto estudiante y sus principales características
     * @author Alejandro Aguilera W
     */

    //atributos
    public int code;
    public long id;
    public String LastName;
    public String firstName;
    private String gender;
    public String faculty;
    private Date dateBirth;

 
    /**
     * Constructor de la clase estudiante
     * @param code  código de estudiante
     * @param id    documento de identidad del estudiante
     * @param lastName Primer apellido del estudiante
     * @param firstName Primer nombre del estudiante
     * @param gender    género con el que se identifica el estudiante
     * @param faculty   facultad en la quew está inscrito el estudiante
     * @param dateBirth fecha de nacimiento del estudiante
     */
    public Student(int code, long id, String lastName, String firstName, String gender, String faculty,
            Date dateBirth) {
        this.code = code;
        this.id = id;
        LastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
    }

    //getters and setters
    /**
     * Método para obtener el código de estudiante
     * @return código de estudiante
     */
    public int getCode() {
        return code;
    }
    /**
     * Método para configurar el código de estudiante
     * @param code
     */

    public void setCode(int code) {
        this.code = code;
    }
    /**
     * Método para obtener el código de identidad del estudiante
     * @return
     */

    public long getId() {
        return id;
    }
    /**
     * Método para configurar el códido de identidad del estudiante
     * @param id
     */

    public void setId(long id) {
        this.id = id;
    }
    /**
     * Método para obtener el primer apellido del estudiante
     * @return
     */

    public String getLastName() {
        return LastName;
    }
    /**
     * Método para configurar el apellido del estudiante
     * @param lastName
     */

    public void setLastName(String lastName) {
        LastName = lastName;
    }
    /**
     * Método para obtener el primer nombre del estudiante
     * @return
     */

    public String getFirstName() {
        return firstName;
    }
    /**
     * Método para confifurar el primer nombre del estudiante
     * @param firstName
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Método para configurar el género con el que se identifica el estudiante
     * @return
     */

    public String getGender() {
        return gender;
    }
    /**
     * Método para configurar el género con el que se identifica el estudiante
     * @param gender
     */

    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * Método para obtener la facultad a la que pertenece el estudiante
     * @return
     */

    public String getFaculty() {
        return faculty;
    }
    /**
     * Método para configurar la facultad a la que pertenece el estudiante
     * @param faculty
     */

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    /**
     * Método para obtener la fecha de nacimiento del estudiante
     * @return
     */

    public Date getDateBirth() {
        return dateBirth;
    }
    /**
     * Método para configurar la fecha de nacimiento del estudiante
     * @param dateBirth
     */

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
}
