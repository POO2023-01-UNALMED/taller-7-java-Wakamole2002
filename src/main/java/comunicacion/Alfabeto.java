package comunicacion;

public class Alfabeto extends Pictograma{
    String [] letras;
    String interpretacion;
    //constructor
    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }
    //getters and setters
    public void setLetras(String[] letras) {
        this.letras = letras;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public String[] getLetras() {
        return letras;
    }
    public String getInterpretacion() {
        return interpretacion;
    }

    //metodos ------------

    public int cantidadLetras(){
        int tam = letras.length;
        return tam;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }
    @Override
    public String toString() {
        return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
    }
    
    
}
