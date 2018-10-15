/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Zireael
 */
public class CuentaBancaria {
  
    String ccc, nombre, apellido1, apellido2, direccion;
    Date fnac;
    float saldo;

    public CuentaBancaria(String ccc, String nombre, String apellido1, String apellido2, String direccion, Date fnac, float saldo) {
        this.ccc = ccc;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.fnac = fnac;
        this.saldo = saldo;
    }
    
    public String getOficina(){
        return "";
    }
    
    public String getSucursal(){
        return "";
    }
    
    public String getCodigoCuenta(){
        return "";
    }
    
    public void validateFnac(){
        
    }
    
    public void validateTransaction(){
        
    }

    public String getCcc() {
        return ccc;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFnac() {
        return fnac;
    }

    public void setFnac(Date fnac) {
        this.fnac = fnac;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
