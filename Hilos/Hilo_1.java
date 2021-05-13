public class Hilo_1 extends Thread{

    public void run(int arreglo[]){
        int sum = 0;
        
        for(int i = 0; i < arreglo.length; i++){
            sum += arreglo[i];
        }
        System.out.println("\n      >>Hilo 1<<");
        System.out.printf("%d + %d + %d + %d = %d\n",arreglo[0], arreglo[1], arreglo[2], arreglo[3], sum);
    }
}