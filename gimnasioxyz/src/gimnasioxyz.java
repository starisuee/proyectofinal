package proyectofinal;

import java.util.Arrays;
import java.util.Scanner;

public class gimnasioxyz {
    private String[] nombreI = new String[3];
    private String[] nombrec = new String[5];
    private int[] idc = new int[5];
    private String[] correo = new String[5];
    private int[] tel = new int[5];
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
        int i = 0;
        String si_no = ""; // esto se reemplaza por un caracter 's' o 'n'
        int j = 0;
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Catálogo(Mantenimiento - crear, modificar, eliminar)");
            System.out.println("--------------------------------");
            System.out.println("2. Registro de ingreso por mes"); // los precios deben de ser fijos
            System.out.println("--------------------------------");
            System.out.println("3. Reportes o consultas");
            System.out.println("- Listado de clientes por instructor");
            System.out.println("- Listado de ingresos por mes");
            System.out.println("- Listar el total (dinero) de las suscripciones por mes.");
            System.out.println("- Listar el promedio de ingresos para los tres meses");
            System.out.println("- Listar los meses en los que el ingreso fue mayor al promedio");
            System.out.println("- Listar los meses en los que el ingreso fue menor al promedio"); // Aún no los quito
                                                                                                  // del menú principal
                                                                                                  // porque no están
                                                                                                  // hechos
            System.out.println("--------------------------------");
            System.out.println("4. Salir");

            System.out.println("Introduzca la opcion deseada (1-3)"); // son 3 opciones, no 4 como estaba definido
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("");
                    System.out.println("Seleccione su siguiente opción:");
                    System.out.println("1. Administrar instructores ");
                    System.out.println("2. Administrar planes de subscripción ");
                    System.out.println("3. Administrar clientes");// solo cambiar los precios, puede sr un arreglo de
                                                                  // flotantes con los precios
                    j = sc.nextInt();
                    switch (j) {
                        case 1:
                            administrar_instructor();
                            break;
                        case 2:
                            administrar_planes();
                            break;
                        case 3:
                            administrar_cliente();
                            break;
                        default:
                            System.out.println("Opción inválida");
                            break;
                    }
                    menu();
                    break;
                case 2:
                    menu();
                    break;
                case 3:
                    menu();
                    break;
                case 4:
                    System.out.println("¿Está seguro que desea salir? S/N");
                    si_no = sc.nextLine();
                    switch (si_no) {
                        case "s":
                        case "S":
                            System.exit(0);
                            break;
                        case "n":
                        case "N":
                            menu();
                    }
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (i < 4);

        return opc;
    }

    public int administrar_instructor() {
        int opc = 0;
        String[] nombre = new String[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("////Administrar entrenador////");
        System.out.println("1. Agregar entrenadores");
        System.out.println("2. Modificar entrenadores");
        System.out.println("3. Eliminar entrenadores");
        System.out.println("Introduzca la opción deseada (1-3)");
        opc = sc.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Crear entrenador");
                ingresar_instructor(); // aqui se guarda un arreglo con 3 nombres de instructores
                menu();
                break;
            case 2:
                System.out.println("Modificar entrenador");
                modificar_instructor();
                menu();
                break;
            case 3:
                System.out.println("Eliminar entrenador");
                eliminar_instructor();
                menu();
        }
        return opc;
    }

    public int administrar_cliente() {
        int opc = 0;
        String[] nombre = new String[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("////Administrar perfiles////");
        System.out.println("1. Ingresar cliente");
        System.out.println("2. Modificar cliente");
        System.out.println("3. Eliminar cliente");
        System.out.println("Introduzca la opcion deseada (1-3)");
        opc = sc.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Crear cliente");
                ingresar_cliente();
                menu();
                break;
            case 2:
                System.out.println("Modificar cliente");
                modificar_cliente();
                menu();
                break;
            case 3:
                System.out.println("Eliminar cliente");
                eliminar_cliente();
                menu();
        }
        return opc;
    }

    public int administrar_planes() {
        int opc = 0;
        String[] plan = new String[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("////Administrar planes////");
        System.out.println("1. Crear planes");
        System.out.println("2. Modificar planes");
        System.out.println("3. Eliminar planes");
        System.out.println("Introduzca la opcion deseada (1-3)");
        opc = sc.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Crear planes");
                crear_plan();
                menu();
                break;
            case 2:
                System.out.println("Modificar planes");
                modificar_plan();
                menu();
                break;
            case 3:
                System.out.println("Eliminar planes");
                eliminar_plan();
                menu();
        }
        return opc;
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

        System.out.println("¿Qué instructor desea modificar?");
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
                System.out.println("Se actualizó el nombre correctamente");

            }
        }
        for (i = 0; i < modificado.length; i++) {
            System.out.println("Instructor " + modificado[i]);
        }

        return modificado;
    }

    public String[] eliminar_instructor() {
        int i;
        String[] eliminado = new String[3];
        eliminado = nombreI;
        String elim = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué instructor desea eliminar?");
        for (i = 0; i < eliminado.length; i++) {
            System.out.println("Instructor " + eliminado[i]);
        }
        System.out.println("Escriba el nombre del instructor: ");
        elim = sc.next();
        for (i = 0; i < eliminado.length; i++) {
            if (eliminado[i].equalsIgnoreCase(elim)) {

                eliminado[i] = "null";
                System.out.println("Se eliminó el nombre correctamente");

            }
        }
        for (i = 0; i < eliminado.length; i++) {
            System.out.println("Instructor " + eliminado[i]);
        }

        return eliminado;
    }

    public void ingresar_cliente() {
        int i, id, tele;
        String nombres = "", correo = "";
        String[] nombre = new String[5];
        String[] correos = new String[5];
        int[] ids = new int[5];
        int[] telf = new int[5];
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < nombrec.length; i++) {
            System.out.println("Ingrese el nombre del cliente" + i);
            nombres = sc.nextLine();
            nombre[i] = nombres;
        }
        for (i = 0; i < idc.length; i++) {
            System.out.println("Ingrese la id del cliente");
            id = sc.nextInt();
            ids[i] = id;
        }
        for (i = 0; i < tel.length; i++) {
            System.out.println("Ingrese el número de teléfono del cliente");
            tele = sc.nextInt();
            telf[i] = tele;
        }
        for (i = 0; i < correos.length; i++) {
            System.out.println("Ingrese el correo electronico del cliente");
            correo = sc.next();
            correos[i] = correo;
        }
        selecionar_plan();

        setNombrec(nombre);
        setId(ids);
        setTel(telf);
        setCorreo(correos);

        System.out.println(Arrays.toString(nombre));
        System.out.println(Arrays.toString(ids));
        System.out.println(Arrays.toString(telf));
        System.out.println(Arrays.toString(correos));

    }

    public String[] modificar_cliente() {
        String[] modificado = new String[5];
        modificado = nombrec;
        int i = 0;
        String mod = "", nombre_n;

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué cliente desea modificar?");
        for (i = 0; i < modificado.length; i++) {
            System.out.println("instructor " + modificado[i]);
        } // aqui muestro el contenido del arreglo para que se ingrese cual se desea
          // modificar
        System.out.println("Escriba el nombre del cliente: ");
        mod = sc.next();
        for (i = 0; i < modificado.length; i++) {
            if (modificado[i].equalsIgnoreCase(mod)) {// aqui se utiliza un metodo que compara el dato a modificar para
                                                      // poder actualizarlo
                System.out.println("Escriba el nuevo nombre: ");
                nombre_n = sc.next();
                modificado[i] = nombre_n;
                System.out.println("Se actualizó el nombre correctamente");

            }
        }
        for (i = 0; i < modificado.length; i++) {
            System.out.println("Instructor " + modificado[i]);
        }

        return modificado;
    }

    public String[] eliminar_cliente() {
        int i;
        String[] eliminado = new String[3];
        eliminado = nombreI;
        String elim = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Qué instructor desea eliminar?");
        for (i = 0; i < eliminado.length; i++) {
            System.out.println("Instructor " + eliminado[i]);
        } // aqui muestro el contenido del arreglo para que se ingrese cual se desea
          // eliminar
        System.out.println("Escriba el nombre del instructor: ");
        elim = sc.next();
        if (eliminado[i].equalsIgnoreCase(elim)) {// aqui se utiliza un metodo que compara el dato a eliminar para poder
                                                  // actualizarlo

            eliminado[i] = "null";
            System.out.println("Se eliminó el cliente correctamente");

        }
        for (i = 0; i < eliminado.length; i++) {
            System.out.println("Cliente " + eliminado[i]);
        }

        return eliminado;
    }

    public int[] selecionar_plan() { // metodo para selecionar el plan y instructor del cliente
        int i, j;
        String instru = "";
        int[] selecionar = new int[3];
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            System.out.println("Selecione el plan para " + nombrec[i]);
            System.out.println("(0) Plan basico ");
            System.out.println("(1) Plan intermedio ");
            System.out.println("(2) Plan avanzado ");
            System.out.println("Escoja del 0-2");
            selecionar[i] = sc.nextInt();

            if (selecionar[i] == 0) {
                System.out.println("Plan basico inlcuye:");
                System.out.println("-9 hora de uso de gimnasio semanal");
                System.out.println("- No incluye instructor ");
                System.out.println("- Precio: 22.00 $");
            }
            if (selecionar[i] == 1) {
                System.out.println("Plan intermedio inlcuye:");
                System.out.println("-14 hora de uso de gimnasio semanal");
                System.out.println("- Incluye instructor");
                System.out.println("- Precio: 27.70 $");

                for (i = 0; i < nombreI.length; i++) {
                    System.out.println(nombreI[i]);
                }
                System.out.println("Escoja el instructor");
                instru = sc.next();
                System.out.println("Plan intermedio inlcuye:");
                System.out.println("-14 hora de uso de gimnasio semanal");
                System.out.println("- Instructor " + instru);
                System.out.println("- Precio: 27.70 $");

            }
            if (selecionar[i] == 2) {
                System.out.println("Plan avanzado inlcuye:");
                System.out.println("-921 hora de uso de gimnasio semanal");
                System.out.println("- Incluye Instructor ");
                System.out.println("- Precio: 22.00 $");

                for (i = 0; i < nombreI.length; i++) {
                    System.out.println(nombreI[i]);
                }
                System.out.println("Escoja el instructor");
                instru = sc.next();
                System.out.println("Plan avanzado inlcuye:");
                System.out.println("-14 hora de uso de gimnasio semanal");
                System.out.println("- Instructor " + instru);
                System.out.println("- Precio: 30.00 $");
            }
        }
        return selecionar;
    }

    public String[] crear_plan() {
        String[] planes = new String[3];
        return planes;
    }

    public String[] modificar_plan() {
        String[] modificar = new String[3];
        return modificar;
    }

    public String[] eliminar_plan() {
        String[] eliminar = new String[3];
        return eliminar;
    }

    public float promedio(float[] ejem) { // esto se debe cambiar por el arreglo real
        float sumt[] = new int[3];
        float sum = 0;
        float prom = 0;
        sumt = ejem;
        for (int i = 0; i < sumt.length; i++) {
            sum = sum + sumt[i];
        }
        prom = sum / 3;
        return prom;
    }

    public void menor_prome(float[] ejem, float prom) {
        float meses[] = new int[3];
        meses = ejem;
        int prome = prom;
        System.out.println("meses con ganacias por debajo del promedio");
        for (int i = 0; i < meses.length; i++) {
            if (meses[i] < prome) {
                System.out.println("-" + meses[i]);
            }
        }
    }

    public void mayorprome(float[] ejem, float prom) {
        float meses[] = new int[3];
        meses_ar = ejem;
        int promeu = prom;
        System.out.println("meses con ganacias por arriba del promedio");
        for (int i = 0; i < meses_ar.length; i++) {
            if (meses_ar[i] < promeu) {
                System.out.println("-" + meses_ar[i]);
            }
        }
    }
}
