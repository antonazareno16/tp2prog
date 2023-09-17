package sit3;

public class PersonalNoDocenteServicio extends Empleado implements UnidadAdministrativa{
    
    public PersonalNoDocenteServicio(Integer NumeroAgente, String Nombre, String Direccion){
        super(NumeroAgente, Nombre, Direccion);
    }

    @Override
    public void inscribir(){
        System.out.println("INSCRIPCION");
    }
}
