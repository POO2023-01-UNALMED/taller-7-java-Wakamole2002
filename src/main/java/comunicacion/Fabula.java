package comunicacion;

public class Fabula extends Escrito {
    String ensenanza;
    String interpretacion;
    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }
    //getters and setters
    public String getEnsenanza() {
        return ensenanza;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    //metodos ---------------
    @Override
    public int palabrasTotales(int palabrasPagina) {
        return palabrasPagina * getPaginas() * 1;
    }
    @Override
    public String interpretacion() {
        return interpretacion;
    }
    @Override
    public String toString() {
        return  getOrigen()+"\n"+
                getTitulo()+"\n"+
                getAutor()+"\n"+
                getPaginas()+"\n"+
                ensenanza;
    }
}
