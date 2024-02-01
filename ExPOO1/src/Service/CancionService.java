package Service;
import Models.Cancion;
import java.util.Scanner;

public class CancionService {
    
    Cancion ms= new Cancion();
    public void crearCancion(){
    Scanner tem= new Scanner(System.in);
    
    System.out.println("Ingresa el titulo de la cancion: ");
    String titulo=tem.nextLine();
    ms.setTitulo(titulo);
    
    System.out.println("Ingresa el autor de la cancion que ingresaste: ");
    String autor=tem.nextLine();
    ms.setAutor(autor);



}

public void infoCancion(){

    System.out.println("Cancion : "+ms.getTitulo());
    System.out.println("Autor : "+ms.getAutor());
}



}
