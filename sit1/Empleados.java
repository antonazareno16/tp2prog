

public class Empleados {
    private String Nombre;
    private String Apellido;
    private Integer CostoXHora;

    public Empleados() {

    }

    
    public Integer marcarIngreso(){
        Integer ingreso=0;
        return ingreso;
    }

    public Integer MarcarSalida(){
        Integer salida=0;
        return salida;
    }

    public String getNombre(){
        return Nombre;
    }

    public String getApellido(){
        return Apellido;
    }

    public Integer getCostoxHora(){
        return CostoXHora;
    }


    public void setNombre(String Nombre){
        this.Nombre= Nombre;
    }

    public void setApellido(String Apellido){
        this.Apellido= Apellido;
    }

    public void setCostoxHora(Integer CostoXhora){
        this.CostoXHora= CostoXhora;
    }

}
