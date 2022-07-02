import java.util.Scanner;
import java.util.ArrayList;
public class gimnasioxyz {
    private String [] nombre = new String [10];
    private float [] precio = new float [5];
    private int [] numero = new int [10];
    private String [] correo = new String [20];

    public void setArray_nombre(String[] nombre){
        this.nombre=nombre;
    }

    public String[]getArray_nombre(){
        return nombre;
    }

    public void setArray_precio(float[] precio){
        this.precio=precio;
    }

    public float[]getArray_precio(){
        return precio;
    }

    public void setArray_numero(int[] numero){
        this.numero=numero;
    }

    public int[]getArray_numero(){
        return numero;
    }

    public void setArray_(String[] correo){
        this.correo=correo;
    }

    public String[]getArray_correo(){
        return correo;
    }

    public void menu(){
        int opc=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("introduzca la opcion del sistema a usar: ");
        opc = sc.nextInt();
        switch(opc){
            case 1:
            System.out.println("Catálogo (Mantenimiento – crear, modificar, eliminar)");

            break;
        }
    }

    public void submenu(){
        int opc=0;
        String[] nombre = new String [5];
        gimnasioxyz ob = new gimnasioxyz();
        Scanner sc = new Scanner (System.in);
        System.out.println("que va a hacer?: ");
        opc = sc.nextInt();
        switch(opc){
            case 1:
            System.out.println("Crear entrenador?");
            nombre = ob.ingresar_nombres();
            submenu();
            break;
            case 2:
            System.out.println("eliminar entrenador");
            eliminado = 
            submenu();
            break;
        }
    }

    public void elimar (String nombre){
        

    }
    /*Catálogo (Mantenimiento – crear, modificar, eliminar)
a. Instructor
b. Planes de subscripción
c. Clientes */

    public String[] ingresar_nombres(){ //introduccion de nombres para cliente o entrenador, clase reutilizable
        int i,  cant;
        String nombres="";
        String [] nombre = new String [3];
        Scanner sc = new Scanner (System.in);
        System.out.println("cuantas personas desea introducir?");
        cant = sc.nextInt();
        for(i=0;i<cant;i++){
            System.out.println("Ingrese el nombre del entrenador");
            nombres = sc.nextLine();
            nombre[i] = nombres;
        }
        setArray_nombre(nombre);
        return nombre;
    }
}
