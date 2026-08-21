import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        boolean continuar=true; 
        objmatriz[][] a = new objmatriz[2][2];
        
        while (continuar) {
            System.out.println("\nBienvenido, que quiere?\n");
            System.out.println("1- llenar parqueadero");
            System.out.println("2- mostrar parqueadero");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    a = m.llenarMatriz(a, sc);
                    
                    break;
                case 2:
                    m.mostrarMatriz(a);
            
                default:
                    break;
            }
            
        }
    }
}
