package cola_html;
import java.util.LinkedList;
import java.util.Queue;
/**@author Gustavo_Castillo*/
public class Cola_HTML {
    public static void main(String[] args) {
        System.out.println("COLA HTML");
        System.out.println("");
        String cad = "<Cadena <> <<><<>>>>";
        String cad2 = "<Cadena ><<><>>>";
        String cad3 = "<Cadena ><<><>>>";
        System.out.println("<b><i>Hola Uac</i></b>");
        System.out.println(verificarParentesis(cad));
        System.out.println("<b><i>Hola FI</i>/b>");
        System.out.println(verificarParentesis(cad2));
        System.out.println("<b><i>Hola ISC</i></b");
        System.out.println(verificarParentesis(cad3));
    }
    public static boolean verificarParentesis(String cadena)  {
        Queue<String> cola = new LinkedList <String>();       int i = 0;
            while (i<cadena.length()) {  
                if(cadena.charAt(i)=='<') {cola.add("<");} //inserta un objeto
                else if  (cadena.charAt(i)=='>') {  
                            if (!cola.isEmpty()){ cola.poll(); } //poll extrae
                            else { cola.add(">"); break; } //isEmpty devuelve
                }
                i++;
            }
            if(cola.isEmpty()){ return true; } else { return false; }
    }
}