package com.usal;

/** 
 * Esta clase es muy importante
 */

public class Persona {
    String nombre;
    String apellido;

    /**
     * Esto es un metodo factory y sirve para crear una persona a partir de un string CSV
     * 
     * @param personaString String separado por comas
     * @return retorna una persona o lanza una @illegalArgumentException
     */
    public static Persona fromCSVString(String personaString){
        String [] trozos = personaString.split(",");

        if(trozos.length !=2){
            throw new IllegalArgumentException("Parametros invalidos: "+personaString);
        } else{
            return new Persona(trozos[0], trozos[1]);
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
}
