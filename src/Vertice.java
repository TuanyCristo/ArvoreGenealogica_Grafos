
public class Vertice {
    private String pessoa;
    private GrauParentesco parentesco;

        public Vertice() {
    }

    public Vertice(String pessoa, GrauParentesco parentesco) {
        this.pessoa = pessoa;
        this.parentesco = parentesco;
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

    

    

}
