public class Principal_Hilos {

    public static void main(String[] args) {
      int tamaño = 4;

        Datos datos = new Datos(); 
        datos.run(tamaño);
        Hilo_1 hilo_1 = new Hilo_1();
        Hilo_2 hilo_2 = new Hilo_2();
        Hilo_3 hilo_3 = new Hilo_3();
        datos.start();
        hilo_1.start();
        hilo_2.start();
        hilo_3.start();
      System.out.println("Programado por Valencia Cardenas Gustavo Imanol");
      System.out.println("Saliendo...");
    }
}