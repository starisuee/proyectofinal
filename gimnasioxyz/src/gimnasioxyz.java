import java.util.Arrays;
import java.util.Scanner;

public class gimnasioxyz {
    private String[] nombreI = new String[3];
    private String[] nombrec = new String[5];
    private int[] idc = new int[5];
    private String[] correo= new String[5];
    private int [] tel = new int[5];
    private double[] ingresos = new double[5];
    private int[] meses = new int[4];
    private double[][] ventas_mensuales = new double[5][4];

    public String[] getNombrec() {
        return nombrec;
    }

    public void setNombrec(String[] nombrec) {
        this.nombrec = nombrec;
    }

    public String[] getNombreI() {
        return nombreI;
    }

    public void setNombreI(String[] nombreI) {
        this.nombreI = nombreI;
    }

    public double[] getIngresos() {
        return ingresos;
    }

    public void setIngresos(double[] ingresos) {
        this.ingresos = ingresos;
    }

    public int[] getIdc() {
        return idc;
    }

    public int[] getMeses() {
        return meses;
    }

    public void setId(int[] idc) {
        this.idc = idc;
    }

    public void setMeses(int[] meses) {
        this.meses = meses;
    }

    public double[][] getVentas_mensuales() {
        return ventas_mensuales;
    }

    public void setVentas_mensuales(double[][] ventas_mensuales) {
        this.ventas_mensuales = ventas_mensuales;
    }

    public int[] getTel() {
        return tel;
    }

    public String[] getCorreo() {
        return correo;
    }

    public void setCorreo(String[] correo) {
        this.correo = correo;
    }

    public void setIdc(int[] idc) {
        this.idc = idc;
    }

    public void setTel(int[] tel) {
        this.tel = tel;
    }

    public int menu() {
        int i = 0, si_no = 0; //esto se reemplaza por un caracter 's' o 'n'
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-----CATALOGO-----");
            System.out.println("(1) Administrar instructores ");
            System.out.println("(2) Administrar clientes ");
            System.out.println("(3) Administrar planes de servicio ");//solo cambiar los precios, puede sr un arreglo de flotantes con los precios
            System.out.println("--------------------------------");
            System.out.println("(4) Registro de ingreso por mes"); // los precios deben de ser fijos
            System.out.println("--------------------------------");
            System.out.println("Reportes o consultas");
            System.out.println("(5) Listado de clientes por instructor");
            System.out.println("(6) Listado de ingresos por mes");
            System.out.println("(7) Listar el total (dinero) de las suscripciones por mes.");
            System.out.println("(8) Listar el promedio de ingresos para los tres meses");
            System.out.println("(9) Listar los meses en los que el ingreso fue mayor al promedio");
            System.out.println("(10) Listar los meses en los que el ingreso fue menor al promedio");
            System.out.println("--------------------------------");
            System.out.println("(11) Salir");


            System.out.println("introduzca la opcion deseada (1-8)");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    administrar_instructor();
                    menu();
                    break;
                case 2:
                    administrar_cliente();
                    menu();
                    break;
                case 3:
                    administrar_planes();
                    menu();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    System.exit(0);
                    break;
            }
            System.out.println("Desea continuar en el sistema? S/N");
        } while (i < 11);

        return opc;
    }

    public int administrar_instructor() {
        int opc = 0;
        String[] nombre = new String[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("////Administrar entrenador////");
        System.out.println("(1) Agregar entrenadores");
        System.out.println("(2) Modificar entrenadores");
        System.out.println("(3) Eliminar entrenadores");
        System.out.println("Introduzca la opcion deseada (1-3)");
        opc = sc.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Crear entrenador?");
                ingresar_instructor();
                menu();
                break;
            case 2:
                System.out.println("modificar entrenador");
                modificar_instructor();
                menu();
                break;
            case 3:
                System.out.println("eliminar entrenador");
                eliminar_instructor();
                menu();
        }
        return opc;
    }

    public int administrar_cliente() {
        int opc = 0;
        String[] nombre = new String[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("////Administrar perfiles////");
        System.out.println("(1) Ingresar cliente");
        System.out.println("(2) Agregar entrenadores");
        System.out.println("Modificar entrenadores");
        System.out.println("Eliminar entrenadores");
        System.out.println("Introduzca la opcion deseada (1-4)");
        opc = sc.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Crear entrenador?");
                ingresar_instructor(); // aqui se guarda un arreglo con 3 nombres de instructores
                menu();
                break;
            case 2:
                System.out.println("modificar entrenador");
                modificar_instructor();
                menu();
                break;
            case 3:
                System.out.println("eliminar entrenador");
                eliminar_instructor();
                menu();
        }
        return opc;
    }

    public void administrar_planes() {

    }

    public String[] ingresar_instructor() {
        int i;
        String nombres = "";
        String[] nombre = new String[3];
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < nombreI.length; i++) {
            System.out.println("Ingrese el nombre del instructor" + i);
            nombres = sc.nextLine();
            nombre[i] = nombres;
        }
        setNombreI(nombre);

        System.out.println(Arrays.toString(nombre));
        return nombre;
    }

    public String[] modificar_instructor() {
        String[] modificado = new String[3];
        modificado = nombreI;
        int i = 0;
        String mod = "", nombre_n;

        Scanner sc = new Scanner(System.in);

        System.out.println("que instructor desea modificar?");
        for (i = 0; i < modificado.length; i++) {
            System.out.println("instructor " + modificado[i]);
        }
        System.out.println("Escriba el nombre del instructor: ");
        mod = sc.next();
        for (i = 0; i < modificado.length; i++) {
            if (modificado[i].equalsIgnoreCase(mod)) {
                System.out.println("Escriba el nuevo nombre: ");
                nombre_n = sc.next();
                modificado[i] = nombre_n;
                System.out.println("Se actualizo el nombre correctamente");

            }
        }
        for (i = 0; i < modificado.length; i++) {
            System.out.println("instructor " + modificado[i]);
        }

        return modificado;
    }

    public String[] eliminar_instructor() {
        int i;
        String[] eliminado = new String[3];
        eliminado = nombreI;
        String elim = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("que instructor desea eliminar?");
        for (i = 0; i < eliminado.length; i++) {
            System.out.println("instructor " + eliminado[i]);
        }
        System.out.println("Escriba el nombre del instructor: ");
        elim = sc.next();
        for (i = 0; i < eliminado.length; i++) {
            if (eliminado[i].equalsIgnoreCase(elim)) {

                eliminado[i] = "null";
                System.out.println("Se elimino el nombre correctamente");

            }
        }
        for (i = 0; i < eliminado.length; i++) {
            System.out.println("instructor " + eliminado[i]);
        }

        return eliminado;
    }

    public String[] ingresar_cliente() {
        int i, id, tele;
        String nombres = "";
        String[] nombre = new String[5];
        int [] ids = new int[5];
        int [] telf = new int[5];
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < nombrec.length; i++) {
            System.out.println("Ingrese el nombre del cliente" + i);
            nombres = sc.nextLine();
            nombre[i] = nombres;
        }
        for (i=0; i<idc.length; i++){
            System.out.println("ingrese la id del cliente");
            id = sc.nextInt();
            ids[i] = id;
        }
        for (i=0;i<tel.length; i++){
            System.out.println("Ingrese el numero de telefono del cliente");
            tele = sc.nextInt();
            telf[i] = tele;
        }
        setNombrec(nombre);
        setId(ids);
        setTel(telf);

        System.out.println(Arrays.toString(nombre));
        System.out.println(Arrays.toString(ids));
        System.out.println(Arrays.toString(telf));
        return nombre;
    }

    public String[] modificar_cliente() {
        String[] modificado = new String[5];
        modificado = nombrec;
        int i = 0;
        String mod = "", nombre_n;

        Scanner sc = new Scanner(System.in);

        System.out.println("que cliente desea modificar?");
        for (i = 0; i < modificado.length; i++) {
            System.out.println("instructor " + modificado[i]);
        }// aqui muestro el contenido del arreglo para que se ingrese cual se desea modificar
        System.out.println("Escriba el nombre del cliente: ");
        mod = sc.next();
        for (i = 0; i < modificado.length; i++) {
            if (modificado[i].equalsIgnoreCase(mod)) {//aqui se utiliza un metodo que compara el dato a modificar para poder actualizarlo
                System.out.println("Escriba el nuevo nombre: ");
                nombre_n = sc.next();
                modificado[i] = nombre_n;
                System.out.println("Se actualizo el nombre correctamente");

            }
        }
        for (i = 0; i < modificado.length; i++) {
            System.out.println("instructor " + modificado[i]);
        }

        return modificado;
    }

    public String[] eliminar_cliente() {
        int i;
        String[] eliminado = new String[3];
        eliminado = nombreI;
        String elim = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("que instructor desea eliminar?");
        for (i = 0; i < eliminado.length; i++) {
            System.out.println("instructor " + eliminado[i]);
        }// aqui muestro el contenido del arreglo para que se ingrese cual se desea eliminar
        System.out.println("Escriba el nombre del instructor: ");
        elim = sc.next();
        if (eliminado[i].equalsIgnoreCase(elim)) {// aqui se utiliza un metodo que compara el dato a eliminar para poder actualizarlo

            eliminado[i] = "null";
            System.out.println("Se elimino el cliente correctamente");

        }
        for (i = 0; i < eliminado.length; i++) {
            System.out.println("cliente " + eliminado[i]);
        }

        return eliminado;
    }


}





