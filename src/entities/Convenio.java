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
public class Convenio extends SyncIntId{
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private int cuotas;
    private int montoMaximo;
    private int montoPp;
    private int maximoClientes;
    private int idDescuento;
    private int idInstitucion;

    public Convenio() {
    }

    public Convenio(int id,String nombre, Date fechaInicio, Date fechaFin, int cuotas, int montoMaximo, int montoPp, int maximoClientes, int idDescuento,int idInstitucion,int estado, Date lastUpdate,int lastHour) {
        setId(id);
        setNombre(nombre);
        setFechaInicio(fechaInicio);
        setFechaFin(fechaFin);
        setCuotas(cuotas);
        setMontoMaximo(montoMaximo);
        setMontoPp(montoPp);
        setMaximoClientes(maximoClientes);
        setIdDescuento(idDescuento);
        setIdInstitucion(idInstitucion);
        setEstado(estado);
        setLastUpdate(lastUpdate);
        setLastHour(lastHour);
    }

    public void setNombre(String nombre) {
        this.nombre = getToName(nombre);
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public void setMontoMaximo(int montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public void setMontoPp(int montoPp) {
        this.montoPp = montoPp;
    }

    public void setMaximoClientes(int maximoClientes) {
        this.maximoClientes = maximoClientes;
    }

    public void setIdDescuento(int idDescuento) {
        this.idDescuento = idDescuento;
    }

    public void setIdInstitucion(int idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public String getNombre() {
        return getToName(nombre);
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public int getCuotas() {
        return cuotas;
    }

    public int getMontoMaximo() {
        return montoMaximo;
    }

    public int getMontoPp() {
        return montoPp;
    }

    public int getMaximoClientes() {
        return maximoClientes;
    }

    public int getIdDescuento() {
        return idDescuento;
    }

    public int getIdInstitucion() {
        return idInstitucion;
    }
    
    
}
