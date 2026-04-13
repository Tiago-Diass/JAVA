public class Modulos {

    private String modulo;
    private int nota = 20;

    public Modulos() {
    }
    public String getModulo() {
        return modulo;
    }
    public Modulos(String modulo, int nota) {
        this.modulo = modulo;
        this.nota = nota;
    }
   
    public void setModulo(String modulo) {
        this.modulo = modulo;
    }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }

}
