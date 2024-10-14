public class MetodosBusqueda {  

    public int busquedaSecuencial(int[] arreglo, int valorBuscar){
        long startTime = System.nanoTime();
        System.out.println("Busqueda Secuencial inicia en " + startTime + " nanosegundos");
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo [i] == valorBuscar){
                System.out.println("BS Comparaciones: " + i);
                long endTime = System.nanoTime();
                long tiempoEjecucion = startTime - endTime;
                System.out.println("Busqueda Secuencial finaliza en " + endTime + " nanosegundos");
                System.out.println("Busqueda Secuencial tiene una duracion de  " + tiempoEjecucion + " nanosegundos");
                
                return i;
            }
            
        }
        
        return -1;
    }

    
   

    public int busquedaBinaria(int[] arr, int value){
        int inicio = 0;
        int fin = arr.length -1;
        int cont = 1; 
        long startTime = System.nanoTime();
        System.out.println("Busqueda Binaria inicia en " + startTime + " nanosegundos");
        while(inicio <= fin){
            int medio = inicio + (fin - inicio) / 2;
            if (arr[medio] == value){
                //Elemento encontrado
                System.out.println("BB Comparaciones: " + cont);
                long endTime = System.nanoTime();
                long tiempoEjecucion = startTime - endTime;
                System.out.println("Busqueda Binaria finaliza en " + endTime + " nanosegundos");
                System.out.println("Busqueda Binaria tiene una duracion de  " + tiempoEjecucion + " nanosegundos");
                return medio;
            }
            if (arr[medio] < value){
                inicio = medio +1;//Buscar ne la mitad de la derecha
            } else {
                fin = medio - 1; //Buscar ne la mitad de la izquierda
            }
            cont++;
        }
        return -1;
    }

    public void printArreglo(int[] arreglo){
        for(int elem: arreglo){
            System.out.print(elem + " ");
        }
    }
}
