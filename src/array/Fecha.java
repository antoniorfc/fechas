/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 * empiezan a contar por la posicion 0
 *
 * @author antonio
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anno;

//public boolean comprobarFecha() los metodos estaticos no pueden modificar las propiedades de la clase
    /**
     * int [] diasMes= new int [12]; instanciar en el new diasMes[0]=31;
     * diasMes[1]=28;
     */
    //atributo estatico porque todas las clases vana  compratir esa información, solo la información de febrero tendrian que verificar.
    /*
     boolean resultado=true;
     int[]diasMes={31,28,...31}
     if(a<0)
     resultado=false;
     else
     diasMes[1]=bisiesto(a);
     if(mes<1||mes>12)
     {
     resultado=false;
     }else{
     }
     if(d<1||d >diasMes[//con que elemento quiero trabajar m(posicion-1])
     {
     resultado=false;
     }else{
     }
     }
     return resultado
     */
    /* año bisiesto 
    
     int bisiesto(int a)
     {
     int dias;
     if((anno%4==0&&anno%100!=0)|| ano%400==0)
     dias=29;
     else 
     dias=28;
     return dias;
     }
     */
    //boleean true si es con fecha y falso si no lo es
    public Fecha() {

    }

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

    public int bisiesto(int anno) {
        int dias = 28;
        if ((anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0) {
            dias = 29;
        }
        return dias;
    }

    public boolean comprobarFecha(int d, int m, int a) {
        boolean resultado = true;
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (a < 0) {
            resultado = false;
        } else {
            diasMes[1] = bisiesto(a);
            if (d < 1 || d > diasMes[m - 1]) {
                resultado = false;
            }
        }
        return resultado;

    }
    
    public int calcularNumeroOrden ()
    {
        
        int orden=0;
       int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int m=0 ; m< mes-1;m++){
            orden=orden +diasMes[m];
            orden=orden+dia;}
    
    return dia;
}
}
