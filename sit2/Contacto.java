package sit2;

public class Contacto{
    private String Nombre;
    private String CorreoElectronico;
    private Integer NumeroCel;

    public Contacto(String Nombre, String CorreoElectronico, Integer NumeroCel){
        this.Nombre= Nombre;
        this.CorreoElectronico= CorreoElectronico;
        this.NumeroCel= NumeroCel;

    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public String getNombre() {
        return Nombre;
    }

    public Integer getNumeroCel() {
        return NumeroCel;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setNumeroCel(Integer numeroCel) {
        NumeroCel = numeroCel;
    }

}