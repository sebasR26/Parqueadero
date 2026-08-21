import java.util.Scanner;

public class metodos {
    public objmatriz[][] llenarMatriz(objmatriz[][] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.println("ingrese vehiculo: ");
                String vehiculo = sc.next();
                System.out.println("ingrese dueño: ");
                String dueño = sc.next();
                System.out.println("ingrese tipo: ");
                int tipo = sc.nextInt();
                System.out.println("ingrese plan: ");
                int plan = sc.nextInt();
                System.out.println("ingrese precio: ");
                Double precio = sc.nextDouble();
                System.out.println("ingrese descuento: ");
                Double descuento = sc.nextDouble();
                System.out.println("ingrese total: ");
                Double total = sc.nextDouble();

                objmatriz o = new objmatriz(vehiculo, dueño, tipo, plan, precio, descuento, total);
                a[i][j] = o;

            }
        }

        return a;
    }

    public void mostrarMatriz(objmatriz[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Vehiculo: " + a[i][j].getVehiculo());
                System.out.println("Dueño: " + a[i][j].getDueño());
                System.out.println("Tipo: " + a[i][j].getTipo());
                System.out.println("Plan: " + a[i][j].getPlan());
                System.out.println("Precio: " + a[i][j].getPrecio());
                System.out.println("Descuento: " + a[i][j].getDescuento());
                System.out.println("Total: " + a[i][j].getTotal());
            }
        }
    }
    
}
