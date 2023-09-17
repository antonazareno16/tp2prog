package sit3;

public abstract class Empleado extends Universitario {
    private Integer NumeroAgente;

    public Empleado(Integer NumeroAgente, String Nombre, String Direccion){
        super(Nombre, Direccion);
        this.NumeroAgente=NumeroAgente;
        
    }

    public Integer tramitarNumeroAgente(){
        return NumeroAgente;
    }
}
