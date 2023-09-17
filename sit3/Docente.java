package sit3;

public class Docente extends Empleado implements DepartamentoDocente {
    
    public Docente(Integer NumeroAgente, String Nombre, String Direccion){
        super(NumeroAgente, Nombre, Direccion);
    }

    @Override
    public void inscribir(){
        System.out.println("INSCRIPCION");
    }
}
