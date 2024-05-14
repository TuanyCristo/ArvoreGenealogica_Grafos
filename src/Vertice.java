import java.util.ArrayList;

public class Vertice {
    private String pessoa;
    private GrauParentesco parentesco;
    private ArrayList<Aresta> entrada;
    private ArrayList<Aresta> saida;

    public Vertice(String pessoa, GrauParentesco parentesco) {
        this.pessoa = pessoa;
        this.parentesco = parentesco;
        this.entrada = new ArrayList<Aresta>();
        this.saida = new ArrayList<Aresta>();
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public GrauParentesco getParentesco() {
        return parentesco;
    }

    public void setParentesco(GrauParentesco parentesco) {
        this.parentesco = parentesco;
    }

    public ArrayList<Aresta> getEntrada() {
        return entrada;
    }

    public void setEntrada(ArrayList<Aresta> entrada) {
        this.entrada = entrada;
    }

    public ArrayList<Aresta> getSaida() {
        return saida;
    }

    public void setSaida(ArrayList<Aresta> saida) {
        this.saida = saida;
    }

    public void adicionarArestaEntrada(Aresta aresta){
        this.entrada.add(aresta);
    }
    public void adicionarArestaSaida(Aresta aresta){
        this.saida.add(aresta);
    }


    

    

}
