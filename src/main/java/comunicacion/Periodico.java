package comunicacion;

public class Periodico extends Escrito {
    
    String fecha;
    String primicia;
    String interpretacion;
    //constructor 
    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia,
            String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }
    //setters and getters
    public String getFecha() {
        return fecha;
    }
    public String getPrimicia() {
        return primicia;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    //metodos ------------
    @Override
    public int palabrasTotales(int palabrasPagina) {
        return palabrasPagina * getPaginas() * 10;
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
                fecha+"\n"+
                primicia;
    }
    
}
