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
        int si_no=0; //esto se reemplaza por un caracter 's' o 'n'
        int opc=0;
        Scanner sc = new Scanner (System.in);
        do{
                System.out.println("(1) Administrar instructores ");
                System.out.println("(1) Administrar clientes ");
                System.out.println("(1) Administrar planes de servicio "); //solo cambiar los precios, puede sr un arreglo de flotantes con los precios
                System.out.println("(2) Registro de precios (prueba)");
                System.out.println("(3) Listado de clientes por instructor");
                System.out.println("(4) Listado de ingresos por mes");
                System.out.println("(5) Listar el total (dinero) de las suscripciones por mes.");
                System.out.println("(6) Listar el promedio de ingresos para los tres meses");
                System.out.println("(7) Listar los meses en los que el ingreso fue mayor al promedio");
                System.out.println("(8) Listar los meses en los que el ingreso fue menor al promedio");
                System.out.println("(1) Administrar perfiles ");

            System.out.println("introduzca la opcion deseada (1-8)");
            opc = sc.nextInt();
            switch(opc){
                case 1:
                administrar_instructor();
                menu();
                case 2:
                administrar_cliente();
                menu();
                case 3:
                administrar_planes();
                menu();
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                }
                System.out.println("Desea continuar en el sistema? S/N");
        }while(si_no==7);
    }

    public void administrar_instructor(){
        int opc=0;
        String[] nombre = new String [5];
        gimnasioxyz ob = new gimnasioxyz();
        Scanner sc = new Scanner (System.in);
        System.out.println("////Administrar entrenador////");
        System.out.println("(1) Agregar entrenadores");
        System.out.println("(2) Modificar entrenadores");
        System.out.println("(3) Eliminar entrenadores");
        System.out.println("Introduzca la opcion deseada (1-3)");
        opc = sc.nextInt();
        switch(opc){
            case 1:
            System.out.println("Crear entrenador?");
            nombre = ob.ingresar_instructor();
            menu();
            break;
            case 2:
            System.out.println("modificar entrenador");
            nombre = ob.modificar_instructor(nombre);
            menu();
            break;
            case 3:
            System.out.println("eliminar entrenador");
            nombre = ob.modificar_instructor(nombre);
            menu();
        }
    }

    public void administrar_cliente(){
        int opc=0;
        String[] nombre = new String [5];
        gimnasioxyz ob = new gimnasioxyz();
        Scanner sc = new Scanner (System.in);
        System.out.println("////Administrar perfiles////");
        System.out.println("Agregar entrenadores");
        System.out.println("Modificar entrenadores");
        System.out.println("Eliminar entrenadores");
        System.out.println("Introduzca la opcion deseada (1-3)");
        opc = sc.nextInt();
        switch(opc){
            case 1:
            System.out.println("Crear entrenador?");
            nombre = ob.ingresar_instructor(); // aqui se guarda un arreglo con 3 nombres de instructores
            menu();
            break;
            case 2:
            System.out.println("modificar entrenador");
            nombre = ob.modificar_instructor(nombre);
            menu();
            break;
            case 3:
            System.out.println("eliminar entrenador");
            //nombre = ob.eliminar_instructor(nombre);
            menu();
        }
    }

    public void administrar_planes(){

    }

    public String[] ingresar_instructor(){ //introduccion de nombres para instructor (max 3)
        int i,  cant;
        String nombres="";
        String [] nombre = new String [3];
        Scanner sc = new Scanner (System.in);
        for(i=0;i<3;i++){
            System.out.println("Ingrese el nombre del instructor" + i+1);
            nombres = sc.nextLine();
            nombre[i] = nombres;
        }
        setArray_nombre(nombre);
        return nombre;
    }

    public String[] modificar_instructor (String [] nombrex){
        String[] modificado = new String[3];
        modificado = nombrex;
        int i=0;
        int mod =0;
        String nombre_n = "";
        Scanner sc = new Scanner (System.in);
        System.out.println("que instructor desea modificar?");
        for(i=0;i<modificado.length;i++){
            System.out.println(modificado[i]);
        }//aqui estoy mostrando todos los nombres en el arreglo para decidir cual voy a modificar
        System.out.println("cual desea modificar? ingrese el numero del (0-2)");
        mod = sc.nextInt();
        System.out.println("Introduzca el nombre del nuevo instructor");
        nombre_n = sc.nextLine();
        modificado[mod] = nombre_n;
        return modificado;
    }

    public String eliminar_instructor(String [] nombrex){
        String m="hola";
        return m;
    }

    public void ingresar_cliente(){

    }

    public void modificar_cliente(){

    }

    public void eliminar_cliente(){

    }

    public void planes(){

    }
}
