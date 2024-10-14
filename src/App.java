import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();
        int [] arreglo = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        metodosBusqueda.printArreglo(arreglo);
        System.out.println("");

        int [] arregloNuevo = new int [100000];
        for( int  i = 0; i < 100000; i++){
            arregloNuevo[i] = i;
        }
        int valorBuscado = 50418;
        int posicion = metodosBusqueda.busquedaSecuencial(arregloNuevo, valorBuscado);
        int position = metodosBusqueda.busquedaBinaria(arregloNuevo, valorBuscado);

        if(posicion != -1){
            System.out.println("El valor " + valorBuscado + " Se encuentra en la posicion " + posicion);
        } else{
            System.out.println("El valor " + valorBuscado + " no se ha encontrado 404");
        }

        if(position != -1){
            System.out.println("El valor " + valorBuscado + " Se encuentra en la posicion " + position);
        } else{
            System.out.println("El valor " + valorBuscado + " no se ha encontrado 404");
        }
    }
}
