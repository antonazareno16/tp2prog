package sit3;

public class Alumno  extends Universitario implements CentroEstudiantil{
    private Integer Matricula;


    public Alumno(Integer Matricula, String Nombre, String Direccion){
        super(Nombre, Direccion);
        this.Matricula = Matricula;

    }

    public Integer getMatricula() {
        return Matricula;
    }

    public void setMatricula(Integer matricula) {
        Matricula = matricula;
    }

    @Override
    public void matricular() {
        
        System.out.println("'matricular'");
    }

    
    

}
