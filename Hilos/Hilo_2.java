public class Hilo_2 extends Thread{

    public void run(int arreglo[]){
        int cuadrado = 0, sum = 0;
        for(int i = 0; i < arreglo.length; i++){
            cuadrado = (int)Math.pow(arreglo[i], 2);
            sum += cuadrado;
        }
        System.out.println("\n      >>Hilo 2<<");
        System.out.printf("La suma de los cuadrados es: %d\n",sum);
    }
}