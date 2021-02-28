package cola_alge;
import java.util.LinkedList;
import java.util.Queue;
/**@author Gustavo_Castillo*/
public class Cola_Alge {
    public static void main(String[] args) {
        System.out.println("     "  +"COLA ALGEBRAICA");
        System.out.println("");
        String cad = "(Cadena () (()(())))";
        String cad2 = "(Cadena )(()()))";
        String cad3 = "(Cadena () (()(()))) ";
        String cad4 = "(Cadena )(()())) ";
        String cad5 = "(Cadena )(()())) ";
        System.out.println("(123*4)+((12-1)*(1+2))");
        System.out.println(verificarParentesis(cad));
        System.out.println("(123*4)+((12-1)*+1+2))");
        System.out.println(verificarParentesis(cad2));
        System.out.println("((pila.size()==0)&&(flag))");
        System.out.println(verificarParentesis(cad3));
        System.out.println("((pila.size)==0)&&(flag))");
        System.out.println(verificarParentesis(cad4));
        System.out.println("((pila.size()==0)&&(flag)");
        System.out.println(verificarParentesis(cad5));
    }
    public static boolean verificarParentesis(String cadena)  {
        Queue <String> cola = new LinkedList <String>();       int i = 0;
            while (i<cadena.length()) {  
                if(cadena.charAt(i)=='(') {cola.add("(");}
                else if  (cadena.charAt(i)==')') {  
                            if (!cola.isEmpty()){ cola.poll(); } 
                            else { cola.add(")"); break; } 
                }
                i++;
            }
            if(cola.isEmpty()){ return true; } else { return false; }
    }
}