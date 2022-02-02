public class Book {
    /**
     * Abstracción del concepto libro y sus principales características
     * @author Alejandro Aguilera W
     */

     //atributos
     public String title;
     public String isbn;
     public String author;
     public String location;
    /**
     * Constructor de clase libro
     * @param title Título del libro
     * @param isbn  identificador número Internacional normalizado para libros
     * @param author Autor del libro
     * @param location Código alfanumérico de ubicación de libro
     */
    public Book(String title, String isbn, String author, String location) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.location = location;
    }
    // getters and setters
    /**
     * método para obtener el título del libro
     * @return título del libro
     */
    public String getTitle() {
        return title;
    }
    /**
     * Método para asignar título del libro
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Método pata obtener el número Internacional normalizado para libros
     * @return isbn
     */
    public String getIsbn() {
        return isbn;
    }
    /**
     * Método para asignar el isbn correspondiente del libro
     * @param isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    /**
     * Método que retorna el autor del libro
     * @return
     */
    public String getAuthor() {
        return author;
    }
    /**
     * Método para asignar el autor del libro
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * Método para obtener la posición del libro 
     * @return
     */
    public String getLocation() {
        return location;
    }
    /**
     * Método para configurar la localización del libro
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }
 
    

     


    
}
