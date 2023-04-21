
package com.emergentes.jsp02;

public class registro {
    private String nombre;
    private String telefono;
    private String email;
    public registro(){
    
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        this.nombre=nom;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono (String telefono){
        this.telefono=telefono;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    @Override
    public String toString(){
        return "Registro("+"nombre"+nombre+"telefono"+telefono+"email"+email+")";
    }
}
