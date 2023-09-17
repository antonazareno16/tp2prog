package sit3;

public class PersonalNoDocenteAdministrativo extends Empleado implements UnidadAdministrativa{

    public PersonalNoDocenteAdministrativo(Integer NumeroAgente, String Nombre, String Direccion){
        super(NumeroAgente, Nombre, Direccion);
    }
    
    @Override
    public void inscribir(){
        System.out.println("INSCRIPCION");
    }
}
