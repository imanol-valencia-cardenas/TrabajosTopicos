public class Hilo_3 extends Thread{

    public void run(int arreglo[]){
        int sum = 0;
        float med = 0;
        
        for(int i = 0; i < arreglo.length; i++)
            sum += arreglo[i];
            
        med = (float)sum / arreglo.length;
        System.out.println("\n      >>Hilo 3<<");
        System.out.printf("La media del vector es: %.2f\n\n",med);
    }
}