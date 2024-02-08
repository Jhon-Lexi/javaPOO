package Service;
import Models.Libro;
import java.util.Scanner;

public class LibroService { 
    int x;
    Libro tapi =new Libro();
    Scanner lec =new Scanner(System.in);
    public void saberLibro(){
        do {
            System.out.println("Progrema que te permite ingresar nombre de canciones y telas muestar en la terminal");
            System.out.println("Menu");
            System.out.println("Presiona 1 para iniciar programa");
            System.out.println("Presina 2 si desea salir del programa");
            x=lec.nextInt();
            switch (x) {
                case 1:
               
                    regLibro();
                    infoLibro();
                    break;
            
                default:
                    if (x==2) {
                        System.out.println("Adios");
                    } else {
                        System.out.println("Selecione Algo del menu");
                        
                    }
                    break;
            }
        } while (x!=2);


    }

    public void regLibro(){
       
        System.out.println("Ingresa el Nombre del Libro: ");
        String titulo=lec.nextLine();
        tapi.setTitulo(titulo);
        
        System.out.println("Ingresa el nombre del Autor del libro: ");
        String autor=lec.nextLine();
        tapi.setAutor(autor);
        
        System.out.println("Ingresa el numero de pagaginas del libro");
        int pag=lec.nextInt();
        tapi.setPag(pag);
        
        System.out.println("Ingresa el ISBN del libro: ");
        int isbn=lec.nextInt();
        tapi.setIsbn(isbn);
    }
    public void infoLibro(){
        System.out.println("Libro: "+tapi.getTitulo());
        System.out.println("Autor: "+tapi.getAutor());
        System.out.println("Numero de Paginas: "+tapi.getPag());
        System.out.println("ISBN: "+tapi.getIsbn());

    }
}
