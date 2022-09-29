package Examen;

public class TipoMusica {

    private String nombre;
    private String añodenacimiento;
    private String gustosmusicales;

    public TipoMusica() {
        this.nombre = null;
        this.añodenacimiento = null;
        this.gustosmusicales = null;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return añodenacimiento;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = añodenacimiento;
    }

    /**
     * @return the gusto
     */
    public String getGusto() {
        return gustosmusicales;
    }

    /**
     * @param gusto the gusto to set
     */
    public void setGusto(String gusto) {
        this.gustosmusicales= gusto;
    }
    
}