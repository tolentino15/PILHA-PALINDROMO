
package stack1;

public class LDENode {      //nome errado, é uma LSE
    
    private char info;
    private LDENode prox;
   
    public LDENode (char value) {
        this.info = value;
    }
    
    public void setInfo (char value) {
        this.info = value;
    }
    
    public char getInfo() {
        return this.info;
    }
    
    public void setProx (LDENode novoProx) {
        this.prox = novoProx;
    }
    
    public LDENode getProx () {
        return this.prox;
        
    }
}
