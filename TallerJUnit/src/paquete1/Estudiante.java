package paquete1;

public class Estudiante {

    // 1.  Declarar
    // se declaran datos o atributos con visibilidad protegido
    // # nombresEstudiante: Cadena
    protected String nombresEstudiante;
    // # apellidosEstudiante: Cadena
    protected String apellidoEstudiante;
    // # identificacionEstudiante: Cadena
    protected String identificacionEstudiante;
    // # edadEstudiante: Entero
    protected int edadEstudiante;

    public void establecerNombresEstudiante(String nE) {
        nombresEstudiante = nE;
    }

    public void establecerApellidoEstudiante(String aE) {
        apellidoEstudiante = aE;
    }

    public void establecerIdentificacionEstudiante(String iE) {
        identificacionEstudiante = iE;
    }

    public void establecerEdadEstudiante(int eE) {
        edadEstudiante = eE;
    }

    public String obtenerNombresEstudiante() {
        return nombresEstudiante;
    }

    public String obtenerApellidosEstudiante() {
        return apellidoEstudiante;
    }

    public String obtenerIdentificacionEstudiante() {
        return identificacionEstudiante;
    }

    public int obtenerEdadEstudiante() {
        return edadEstudiante;
    }

}
