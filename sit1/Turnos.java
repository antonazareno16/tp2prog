import java.sql.Date;

public class Turnos {
    private Date Fecha;
    private Integer HoraIngreso;
    private Integer HoraEgreso;

    public Turnos(Date Fecha, Integer HoraIngreso, Integer HoraEgreso){
        this.Fecha=Fecha;
        this.HoraEgreso=HoraEgreso;
        this.HoraIngreso=HoraIngreso;
    }

    public void asignar(){

    }

    public Date getFecha() {
        return Fecha;
    }

    public Integer getHoraEgreso() {
        return HoraEgreso;
    }

    public Integer getHoraIngreso() {
        return HoraIngreso;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public void setHoraEgreso(Integer horaEgreso) {
        HoraEgreso = horaEgreso;
    }

    public void setHoraIngreso(Integer horaIngreso) {
        HoraIngreso = horaIngreso;
    }
}
