
package stack1;

public class pilha {
    private LDENode topo;
    //private int limite;
    //private int qtd;
    
    /*public pilha(){
    this.limite = 10; (exemplo)
    }
    */
    
    public boolean isEmpty() {                      // VERIFICA LISTA VAZIA
        
        if (this.topo == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isFull(){
        /*if(qtd == limite){
        return true;
        } else {
        return false;
        }
        */
        return false;
    }
    
    public void push (char valor){                  //EMPILHA (INSERE NO TOPO)
        
        LDENode novo = new LDENode (valor);
        
        if(this.isEmpty()== true){
            topo = novo;
        } else {
            novo.setProx(this.topo);
            this.topo = novo;
        }
        //qtd++
    }
    
    public char pop (){                             //DESEMPILHA
        
        char valor;
        valor = topo.getInfo();
        topo = topo.getProx();
        //qtd--;
        return valor; 
        
    }
    
}
