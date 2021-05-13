public class Datos extends Thread{

    public void run(int tama){
      Hilo_1 hilo_1 = new Hilo_1();
      Hilo_2 hilo_2 = new Hilo_2();
      Hilo_3 hilo_3 = new Hilo_3();
      int arreglo[] = new int[tama];
      
      System.out.println("Verificacion de datos");
      for(int i = 0; i < arreglo.length; i++){
          arreglo[i] = (int)(Math.random() * 30 + 10);
          System.out.printf("[%d] = %d\n",i, arreglo[i]);
      }
      hilo_1.run(arreglo);
      hilo_2.run(arreglo);
      hilo_3.run(arreglo);
    }
}