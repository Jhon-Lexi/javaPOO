/*
Crear un package llamado Models dentro de src.
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. 
**Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */

 import Models.Libro;

 public class App {
     public static void main(String[] args) throws Exception {
         
         Libro leer = new Libro();
         
         Libro libro2 = new Libro("ARTURO ELIAS","ELNEGOCIADOR",379,5561829);
         
         leer.setTitulo("IT");
         leer.setAutor("Stephn king");
         leer.setPag(500);
         leer.setIsbn(3566345);
         
         libro2.setTitulo("El Hombre Equivocado");
         libro2.setAutor("John katzenbach");
         libro2.setPag(500);
         libro2.setIsbn(776645687);
 
         System.out.println("Titulo: "+leer.getTitulo());
         System.out.println("Autor: "+leer.getAutor());
         System.out.println("Num.Paginas: "+leer.getPag());
         System.out.println("ISBN: "+leer.getIsbn());
         
         System.out.println("Titulo: "+libro2.getTitulo());
         System.out.println("Autor: "+libro2.getAutor());
         System.out.println("Num.Paginas: "+libro2.getPag());
         System.out.println("ISBN: "+libro2.getIsbn());
 
 
     }
 }
 ;