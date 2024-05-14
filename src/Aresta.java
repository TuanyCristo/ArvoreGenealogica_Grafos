public class Aresta {
private Vertice ancestral;
private Vertice descendente;
private int peso; //peso na arvore por grau de parentesco


public Aresta(Vertice ancestral, Vertice descendente, int peso) {
    this.ancestral = ancestral;
    this.descendente = descendente;
    this.peso = calculaPeso(ancestral.getParentesco(), descendente.getParentesco());
}

public Vertice getAncestral() {
    return ancestral;
}


public void setAncestral(Vertice ancestral) {
    this.ancestral = ancestral;
}


public Vertice getDescendente() {
    return descendente;
}


public void setDescendente(Vertice descendente) {
    this.descendente = descendente;
}


public int getPeso() {
    return peso;
}


public void setPeso(int peso) {
    this.peso = peso;
}

//Método para calcular o peso, quanto menor o peso mais próxima a relação
private int calculaPeso(GrauParentesco grau1, GrauParentesco grau2) {
    //Usamos Math abs para obter um número absoluno, não importanto se ele será
    //positivo ou negativo, apenas o próprio número em si.
    int grau = Math.abs(grau1.getValor() - grau2.getValor());
    return grau;
}

    

}