import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private List<Vertice> vertices;
    private List<Aresta> arestas;


    public Grafo() {
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
    }

    public void adicionarVertice(Vertice v){
        this.vertices.add(v);
    }

    public void adicionarAresta(Aresta a){
        //adiciona aresta a lista
        arestas.add(a);
        //adiciona uma aresta ao vértice de inicio
        a.getAncestral().adicionarArestaEntrada(a);
        //adiciona uma aresta ao vertice de saída
        a.getDescendente().adicionarArestaSaida(a);
     
    }

    public List<Vertice> getVertices() {
        return vertices;
    }

    public void imprimirGrafo() {
        System.out.println("Arvore Genealógica:");
        for (int i = 0; i < vertices.size(); i++) {
            Vertice vertice = vertices.get(i);
            System.out.println("Vértice: " + vertice.getPessoa());
            System.out.println("Arestas de entrada:");
            for (Aresta aresta : vertice.getEntrada()) {
                System.out.println("- " + aresta.getAncestral().getPessoa() + " -> " + aresta.getDescendente().getPessoa());
            }
            System.out.println("Arestas de saída:");
            for (Aresta aresta : vertice.getSaida()) {
                System.out.println("- " + aresta.getAncestral().getPessoa() + " -> " + aresta.getDescendente().getPessoa());
            }
            System.out.println();
        }
    }
    
}
