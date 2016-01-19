/*
 * Clase que comprueba si una fecha es correcta o no
 */
package Fecha;

/**
 *
 * @author
 */
public class Fecha1 {

    /**
     * dia del mes
     */
    private int dia;
    /**
     * mes
     */
    private int mes;
    /**
     * año
     */
    private int anno;

    /**
     * Constructor que inicializa los valores por defecto
     */
    public Fecha1() {
    }

    /////////////////////GETS Y SETS////////////////////////////
    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the anno
     */
    public int getAnno() {
        return anno;
    }

    /**
     * @param anno the anno to set
     */
    public void setAnno(int anno) {
        this.anno = anno;
    }

    ////////////////////METODOS////////////////////
    /**
     * Metodo que comprueba si el año es bisiesto o no, para saber los dias que
     * tiene el mes de febrero
     *
     * @return devuelve si el mes de febrero tiene 28 o 29 dias
     */
    public int bisiesto() {
        int dias = 28;
        if ((anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0) {
            dias = 29;

        }
        return dias;
    }

    /**
     * Metodo que comprueba si el año es bisiesto o no, para saber los dias que
     * tiene el mes de febrero
     *
     * @param a usa el atributo año
     * @return devuelve si el mes de febrero tiene 28 o 29 dias
     */
    public int bisiesto(int a) {
        int dias = 28;
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            dias = 29;

        }
        return dias;
    }

    public int diasAño(int a) {
        int dias = 365;
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            dias = 366;

        }
        return dias;
    }

    public int diasAño() {
        int dias = 365;
        if ((anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0) {
            dias = 366;

        }
        return dias;
    }

    /**
     * Metodo que comprueba si la fecha es correcta o no
     *
     * @param d usa el atributo dia
     * @param m usa el atributo mes
     * @param a usa el atributo año
     * @return devuelve si la fecha es correcta o no(true o false)
     */
    public boolean comprobarFecha(int d, int m, int a) {
        boolean resultado = true;
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//declaramos un array. Lo ponemos asi pq sabemos todos los datos
        /*
         tambien se puede poner el array de esta forma:
         int[]diasMes=new int[12];
         diasMes[0]=31;
         diasMes[1]=28;
         diasMes[2]=31;
         .
         .
         .
         .
         diasMes[11]=31;
         */

        if (a < 0) {//año menor que 0
            resultado = false;
        }//año menor que 0
        else {//año no menor que 0
            if (m < 1 || m > 12) {//mes menor q 1 o mayor q 12
                resultado = false;
            }//mes menor q 1 o mayor q 12
            else {//mes no menor q 1 o mayor q 12
                diasMes[1] = bisiesto(a);//la posicion 1 es febrero pq los arrays siempre empiezan por el 0
                if (d < 1 || d > diasMes[m - 1])//se pone m-1 pq los meses estan guardados como array y este empieza
                //a guardar posiciones desde 0, por eso al mes q se introduzca hay q restarle una posicion
                {//dia menor q 1 o mayor q los dias guardados en ese mes
                    resultado = false;
                }//dia menor q 1 o mayor q los dias guardados en ese mes
            }//mes no menor q 1 o mayor q 12
        }//año no menor que 0
        return resultado;
    }

    /**
     * Metodo que calcula la posicion q ocupa
     *
     * @return devuelve el dia
     */
    public int calcularNumeroDeOrden() {
        int orden = 0;
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        diasMes[1] = bisiesto();//usa el metodo bisiesto para comprobar si el año es bisiesto
        for (int m = 0; m < mes - 1; m++) {
            orden = orden + diasMes[m];
            orden = orden + dia;
        }
        /**
         * tambien se puede poner el for asi: for(int m=1; m<mes; m++){
         * orden=orden+diasMes[m-1]; orden=orden+dia; }
         */
        return dia;
    }

    /**
     * public static void cambiar(int[] diasMes){//lo cambia en los dos objetos
     * diasMes[1]=88888; }
     *
     */
    public int diasFinAño() {
        int dias;
        dias = diasAño() - calcularNumeroDeOrden();
        return dias;
    }
/**
 * Le introducimos una variable f para luego poder calcular el metodo calculardistancias
 * @param f
 * @return 
 */
        public int calcularNumeroDeOrden(Fecha1 f) { 
        int orden = 0;
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        diasMes[1] = bisiesto();//usa el metodo bisiesto para comprobar si el año es bisiesto
        
        for (int m = 0; m < f.getMes() - 1; m++) {
            orden = orden + diasMes[m];
            orden = orden + f.getDia();
        }
        return dia;
        }
        
    public int compararFechas(Fecha1 fecha) {
        int resultado;
        if (anno < fecha.getAnno()) {
            resultado = 1;
        } else {
            if (this.anno > fecha.getAnno()) {
                resultado = 2;
            } else {
                if (mes < fecha.getMes()) {
                    resultado = 1;
                } else {
                    if (mes > fecha.getMes()) {
                        resultado = 2;
                    } else {
                        if (dia < getDia()) {
                            resultado = 1;
                        } else {
                            if (dia > getDia()) {
                                resultado = 2;

                            } else {
                                resultado = 0;

                            }

                        }
                    }
                }
            }
        }
        return resultado;
    }
/**Método para calcular el numero de dias transcurridos entre dichas fechas,
 * Introduzcir dos fechas y calcular la distancia en días (número de días transcurridos entre dichas fechas).
 * @param f2
 * @return 
 * Declaramos las variables de dias,y mes para luego poder calcular el sumatorio
 * Realizamos dos condiciones para el mes y para el dia en fecha2. 
 * 
 */
    public int calcularDistancias(Fecha1 f2) {

        int dias, mes; //declaramos el dia y el mes
        int m = mes = 0; 
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        int SumatorioDias=0;
        int x, y;

        if (mes == f2.getMes()) { //si el mes es igual al mes de la segunda fecha.
            dias = f2.getDia() - dia; //si el dia es igual al dia de la segunda fecha menos el dia actual.
        } else {
            dias = diasMes[mes - 1] - dia; //conjunto dias mes menos el dia en el que estas
        }

        while (m < f2.getMes() - 1) { //mientras el mes sea menor que el mes de la fecha 2 menos 1 porque se empieza desde 0
            dias = dias + diasMes[m]; //si se cumple de anterior se suma los dias mas los dias del mes y se añade mas 1
            m++;
        }
        dias = dias + f2.getDia();
        
        /**
         * sumar el número total de dias a partir de dos variables asignadas
         * Hecho mediante ecuación de igualación
         */
        x=diasFinAño();
        y=calcularNumeroDeOrden(f2);
        
                SumatorioDias=x+y;


        return dias;             
    }
public int calcularDistanciasMesDiferente(Fecha1 f2)
{
     int dias, mes;
     int m = mes = 0; 
     int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
 

}
}
