public class FIFO {
    private nodo inicio;

    public FIFO() {
        this.inicio = null;
    }

    public void push(String dato){
        if(this.inicio  == null){
            this.inicio = new nodo(dato);
        }
        else{
            nodo temp = this.inicio;
                while (temp.getSig() != null){
                    temp = temp.getSig();
                }
            nodo nuevo = new nodo(dato);
            temp.setSig(nuevo);
            nuevo.setAnt(temp);

        }
    }
    public String pop (){
        if(this.inicio == null){
            System.out.println("la lista esta vacia");
            return null;
        }
        else{
            nodo temp = this.inicio;
            this.inicio = temp.getSig();
            this.inicio.setAnt(null);
            return (temp.getInfo());
        }
    }
    public void imprimeFIFO(){
        nodo temp = this.inicio;
        while (temp != null){
            System.out.println(temp.getInfo());
            temp = temp.getSig();
        }
    }

}
