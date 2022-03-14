public class nodo {
    private nodo ant;
    private String info;
    private nodo sig;

    public nodo(String info) {
        this.sig = null;
        this.info = info;
        this.ant = null;

    }

    public nodo getAnt() {
        return ant;
    }
    public void setAnt(nodo ant) {
        this.ant = ant;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public nodo getSig() {
        return sig;
    }
    public void setSig(nodo sig) {
        this.sig = sig;
    }


}
