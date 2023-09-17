package sit3;

public abstract class Universitario {
    private String Nombre;
    private String Direccion;

    public Universitario (String Nombre, String Direccion){
        this.Nombre=Nombre;
        this.Direccion=Direccion;

    }

    public String getDireccion() {
        return Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


}
