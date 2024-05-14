public class App {
    public static void main(String[] args) {
        // Pessoas
        Vertice vEu = new Vertice("Isa Hikaru Tanisue", GrauParentesco.FILHOS);
        Vertice vFilha = new Vertice("Sofia Akemi Tanisue", GrauParentesco.FILHOS);
        Vertice vPai = new Vertice("Allysson Toshio de Souza Dias", GrauParentesco.PAIS);
        Vertice vMae = new Vertice("Sonia Hirome da Silva Tanisue", GrauParentesco.PAIS);
        Vertice vAvôPaterno = new Vertice("Valdomiro Watanabe Dias", GrauParentesco.AVOS);
        Vertice vAvóPaterna = new Vertice("Maria Lucia de Souza Dias", GrauParentesco.AVOS);
        Vertice vAvôMaterno = new Vertice("Hiroshi Tanisue", GrauParentesco.AVOS);
        Vertice vAvóMaterna = new Vertice("Maria Jose Moreira da Silva", GrauParentesco.AVOS);
        Vertice vBisavôMaterno1 = new Vertice("Brasilino de Castro Alves", GrauParentesco.NETOS);
        Vertice vBisavóMaterna1 = new Vertice("Domingas Moreira da Silva", GrauParentesco.NETOS);
        Vertice vTataravóMaterna = new Vertice("Maria Antonia da Silva", GrauParentesco.NETOS);
        Vertice vBisavôMaterno2 = new Vertice("Nome ficticio 1", GrauParentesco.NETOS);
        Vertice vBisavóMaterna2 = new Vertice("Nome ficticio 2", GrauParentesco.NETOS);
        Vertice vTataravóMaterna2 = new Vertice("Nome ficticio 3", GrauParentesco.NETOS);

        // Arestas
        Aresta aEuMae = new Aresta(vMae, vEu);
        Aresta aEuPai = new Aresta(vPai, vEu);
        Aresta aFilhaEu = new Aresta(vEu, vFilha);
        Aresta aPaiAvôPaterno = new Aresta(vAvôPaterno, vPai);
        Aresta aPaiAvóPaterna = new Aresta(vAvóPaterna, vPai);
        Aresta aMaeAvôMaterno = new Aresta(vAvôMaterno, vMae);
        Aresta aMaeAvóMaterna = new Aresta(vAvóMaterna, vMae);
        Aresta aAvóMaternaBisavôMaterno1 = new Aresta(vBisavôMaterno1, vAvóMaterna);
        Aresta aAvóMaternaBisavóMaterna1 = new Aresta(vBisavóMaterna1, vAvóMaterna);
        Aresta aBisavóMaterna1TataravóMaterna = new Aresta(vTataravóMaterna, vBisavóMaterna1);
        Aresta aAvóMaternaBisavôMaterno2 = new Aresta(vBisavôMaterno2, vAvóMaterna);
        Aresta aAvóMaternaBisavóMaterna2 = new Aresta(vBisavóMaterna2, vAvóMaterna);
        Aresta aBisavóMaterna2TataravóMaterna2 = new Aresta(vTataravóMaterna2, vBisavóMaterna2);

        // Iniciando grafo
        Grafo grafo = new Grafo();

        // Adiconando os vertices ao grafo
        grafo.adicionarVertice(vEu);
        grafo.adicionarVertice(vFilha);
        grafo.adicionarVertice(vPai);
        grafo.adicionarVertice(vMae);
        grafo.adicionarVertice(vAvôPaterno);
        grafo.adicionarVertice(vAvóPaterna);
        grafo.adicionarVertice(vAvôMaterno);
        grafo.adicionarVertice(vAvóMaterna);
        grafo.adicionarVertice(vBisavôMaterno1);
        grafo.adicionarVertice(vBisavóMaterna1);
        grafo.adicionarVertice(vTataravóMaterna);
        grafo.adicionarVertice(vBisavôMaterno2);
        grafo.adicionarVertice(vBisavóMaterna2);
        grafo.adicionarVertice(vTataravóMaterna2);

        // Adicionando as arestas ao grafo
        grafo.adicionarAresta(aEuMae);
        grafo.adicionarAresta(aEuPai);
        grafo.adicionarAresta(aFilhaEu);
        grafo.adicionarAresta(aPaiAvôPaterno);
        grafo.adicionarAresta(aPaiAvóPaterna);
        grafo.adicionarAresta(aMaeAvôMaterno);
        grafo.adicionarAresta(aMaeAvóMaterna);
        grafo.adicionarAresta(aAvóMaternaBisavôMaterno1);
        grafo.adicionarAresta(aAvóMaternaBisavóMaterna1);
        grafo.adicionarAresta(aBisavóMaterna1TataravóMaterna);
        grafo.adicionarAresta(aAvóMaternaBisavôMaterno2);
        grafo.adicionarAresta(aAvóMaternaBisavóMaterna2);
        grafo.adicionarAresta(aBisavóMaterna2TataravóMaterna2);

        // Exibindo informações do grafo
        grafo.imprimirGrafo();
    }
}
