import java.util.ArrayList;

public class Grafo {
    private ArrayList<Vertice> vertices;
    private ArrayList<Aresta> arestas;


    public Grafo() {
        this.vertices = new ArrayList<Vertice>();
        this.arestas = new ArrayList<Aresta>();
    }

    public void adicionarVertice(Vertice v){
        this.vertices.add(v);
    }

    public void adicionarAresta(Vertice a, Vertice b){
        Vertice inicio = this.getVertice(a);
        
    }


    
}
