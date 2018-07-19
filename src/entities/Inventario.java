/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.abstractclasses.SyncIntId;
import java.util.Date;

/**
 *
 * @author sdx
 */
public class Inventario extends SyncIntId{
    private String nombre;
    private String descripcion;

    public Inventario() {
    }
    
    public Inventario(int id,String nombre, String descripcion,int estado,Date lastUpdate, int lastHour) {
        setId(id);
        setNombre(nombre);
        setDescripcion(descripcion);
        setEstado(estado);
        setLastUpdate(lastUpdate);
        setLastHour(lastHour);
    }

    public void setNombre(String nombre) {
        this.nombre = getToName(nombre);
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = getStr(nombre);
    }

    public String getNombre() {
        return getStr(nombre);
    }

    public String getDescripcion() {
        return getStr(descripcion);
    }
    
}
