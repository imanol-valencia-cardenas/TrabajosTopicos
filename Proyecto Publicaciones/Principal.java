package publicacion;
import java.util.Scanner;
public class Principal{

    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int ctrlpub = 0, op=0, tipo=0, num, year, np;
        String issn, isbn, tit, ed, au, edi, secci;
        double pre;
        Object publicaciones [] = new Object[10];
        
        do{
         System.out.println("\n*MENU*");
         System.out.println("[1]Alta   [2]Mostrar todo   [3]Salir");
         System.out.print("Ingrese la opcion deseada: ");
         op = leer.nextInt();
         switch (op){
            case 1:
              System.out.println("\nTipo de publicacion");
              System.out.println("[1]Revista  [2]Libro  [3]Periodico");
              tipo = leer.nextInt();
              if(tipo==1){
                //Revista
                Revista revista = new Revista();
                leer.nextLine();
                System.out.println("ISSN:");
                issn=leer.nextLine();
                revista.setISSN(issn);
                System.out.println("Titulo:");
                tit=leer.nextLine();
                revista.setTitulo(tit);
                System.out.println("Precio:");
                pre=leer.nextDouble();
                revista.setPrecio(pre);
                System.out.println("Numero:");
                num=leer.nextInt();
                revista.setNumero(num);
                System.out.println("Anio:");
                year=leer.nextInt();
                revista.setAnio(year);
                System.out.println("Numero de pagina:");
                np=leer.nextInt();
                revista.setNumpag(np);
                publicaciones[ctrlpub] = revista;
                ctrlpub++;
              }
              else if(tipo==2){
                //Libro
                Libro libro = new Libro();
                leer.nextLine();
                System.out.println("ISBN:");
                isbn=leer.nextLine();
                libro.setISBN(isbn);
                System.out.println("Titulo:");
                tit=leer.nextLine();
                libro.setTitulo(tit);
                System.out.println("Edicion:");
                ed=leer.nextLine();
                libro.setEdicion(ed);
                System.out.println("Autor:");
                au=leer.nextLine();
                libro.setAutor(au);
                System.out.println("Precio:");
                pre=leer.nextDouble();
                libro.setPrecio(pre);
                System.out.println("Numero de pagina:");
                np=leer.nextInt();
                libro.setNumpag(np);
                publicaciones [ctrlpub] = libro;
                ctrlpub++;
              }
              else if(tipo==3){
                //Periodico
                Periodico periodico = new Periodico();
                leer.nextLine();
                System.out.println("Secciones:");
                secci=leer.nextLine();
                periodico.setSecciones(secci);
                System.out.println("Titulo:");
                tit=leer.nextLine();
                periodico.setTitulo(tit);
                System.out.println("Precio:");
                pre=leer.nextDouble();
                periodico.setPrecio(pre);
                leer.nextLine();
                System.out.println("Editor:");
                edi=leer.nextLine();
                periodico.setEditor(edi);
                System.out.println("Numero de pagina:");
                np=leer.nextInt();
                periodico.setNumpag(np);
                publicaciones[ctrlpub] = periodico;
                ctrlpub++;
              }
            break;
            case 2:
               //Mostrar el arreglo
               System.out.println("");
               for(int i = 0; i < ctrlpub; i ++ ){
                 System.out.println("  " + publicaciones [i].getClass());
                  if(publicaciones[i] instanceof Revista){
                       Revista rev1 = new Revista();
                       rev1 = (Revista)publicaciones[i];
                        System.out.println("\n----REVISTA----");
                        System.out.println("ISSN: " + rev1.getISSN());
                        System.out.println("      " + rev1.getTitulo());
                        System.out.println("     $" + rev1.getPrecio());
                        System.out.println("   No." + rev1.getNumero());
                        System.out.println("      " + rev1.getAnio());
                        System.out.println("N/P:  " + rev1.getNumpag());
                  }
                  else if (publicaciones [i] instanceof Libro ){
                      Libro lib = new Libro();
                      lib = (Libro)publicaciones[i];
                      System.out.println("\n---LIBRO---");
                      System.out.println("ISBN:  " + lib.getISBN());
                      System.out.println("       " + lib.getTitulo());
                      System.out.println("" + lib.getEdicion() + "Edicion");
                      System.out.println("Autor: " + lib.getAutor());
                      System.out.println("      $" + lib.getPrecio());
                      System.out.println("N/P:   " + lib.getNumpag());
                  }
                  else if(publicaciones[i] instanceof Periodico){
                       Periodico peri = new Periodico();
                       peri = (Periodico)publicaciones[i];
                       System.out.println("\n----PERIODICO----");
                       System.out.println("Seccion de: " + peri.getSecciones());
                       System.out.println("     " + peri.getTitulo());
                       System.out.println("    $" + peri.getPrecio());
                       System.out.println("Edicion: " + peri.getEditor());
                       System.out.println("N/P: " + peri.getNumpag());
                  }
               }
            break; 
            case 3:
                System.out.println("\nProgramado por Valencia Cardenas Gustavo Imanol");
                System.out.println("Cerrando Programa...");
                System.exit(0);
            break;
            default:
            System.out.println("Favor de igresar una opcion que sea correcta\n"); 
         }          
      }while(op!=3);
   }
}