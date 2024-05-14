public enum GrauParentesco {
    PAIS(1),
    FILHOS(2),
    AVOS(3),
    NETOS(4),
    TIOS(5),
    PRIMOS(6),
    CONJUNGES(7);
    private final int valor;
    
    GrauParentesco(int valor) {
        this.valor = valor;
    }
    
    public int getValor() {
         return valor;
    }
}
