
package stack1;
import java.util.Scanner;
public class Stack1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int resp;
        String frase;
        
        do{

            System.out.println("Verificar se a frase é um palindromo.");
            System.out.print("Informe a frase: ");
            frase = in.nextLine();
            
            checkPalin(frase);
            
            System.out.println("Deseja verificar outra frase? (Sim = 1 / Nao = 0)");
            resp = in.nextInt();  
            in.nextLine();
            
        } while(resp != 0);
        
        System.out.println("Obrigado e volte sempre!");
        
    }
        
        public static void checkPalin(String frase){
            
            pilha pilhachar;
            pilhachar = new pilha();
            String novafrase = frase.replace(" ","").toLowerCase();
            
            System.out.print("Frase Original: ");
            System.out.println(novafrase);
            
            if(pilhachar.isFull()==false){
            for(int i = novafrase.length() -1; i>= 0; i--){
                pilhachar.push(novafrase.charAt(i));
                }
            }
            
            System.out.print("Frase inversa: ");
            char[] letraspop = new char[novafrase.length()];
            int i=letraspop.length-1;
            
            while(pilhachar.isEmpty() == false){
               char letra;
               letra  = pilhachar.pop();
               letraspop[i] = letra;
               i--;
            }
            String palindromo = new String(letraspop);
            System.out.println(palindromo);
            
            System.out.print("É um Palindromo? ");
            
            if(palindromo.equals(novafrase)){
            System.out.println("SIM.");
            } else {
            System.out.println("NÃO.");
            }
                    
        }
  
  }
