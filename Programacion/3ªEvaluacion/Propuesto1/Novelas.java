package Propuesto1;

public class Novelas extends Libro{

    enum TipoNovela{
        HISTORICA, ROMANTICA, POLICIACA, REALISTA, CIENCIAFICCION, ACENTURA
    }

    private TipoNovela tipoNovela;

    public Novelas(String titulo, String autor, float precio, TipoNovela tipoNovela) {
        super(titulo, autor, precio);
        this.tipoNovela = tipoNovela;
    }

    public Novelas(String titulo, String autor, TipoNovela tipoNovela) {
        super(titulo, autor);
        this.tipoNovela = tipoNovela;
    }

    public TipoNovela getTipoNovela() {
        return tipoNovela;
    }

    public void setTipoNovela(TipoNovela tipoNovela) {
        this.tipoNovela = tipoNovela;
    }

    @Override
    public String toString() {
        return super.toString() + "Novelas [tipoNovela=" + tipoNovela + "]";
    }

    
    
}
