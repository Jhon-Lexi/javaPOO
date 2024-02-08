package Models;

public class Libro {
    private String autor;
    private String titulo;
    private int pag;
    private int isbn;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Libro() {
        System.out.println("Soy El Metodo Constructor Vacio");
    }

    public Libro(String Autor, String titulo, int pag, int isbn) {

        System.out.println("Metodo Constructor Con Parametros ");
      
    }
    
    @Override
    public String toString() {
       
        return "Libro ===>  "+titulo+", Autor="+autor+", Paginas="+pag+", ISBN="+isbn;
    }


   
}