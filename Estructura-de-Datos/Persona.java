public class Persona {
      private String nombre;
    private int edad;
    private String tipoDoc;
    private String numDoc;
    private String estadoCivil;

    public Persona(int edad, String estadoCivil, String nombre, String numDoc, String tipoDoc) {
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.nombre = nombre;
        this.numDoc = numDoc;
        this.tipoDoc = tipoDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", tipoDoc=").append(tipoDoc);
        sb.append(", numDoc=").append(numDoc);
        sb.append(", estadoCivil=").append(estadoCivil);
        sb.append('}');
        return sb.toString();
    }

}

