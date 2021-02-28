package estruct_4_arrays;
import java.util.Scanner;
/**@author Gustavo_Castillo*/
public class Estruct_4_Arrays {
    public static void main(String[] args) {
        System.out.println("             "     +     "             " + "TABLA ASCII");
      System.out.println("");
      System.out.println("");
       String letraCodigo [][] = new String [27][2];
       letraCodigo [0][0] = "a" ;
       letraCodigo [0][1] = "97";
       letraCodigo [1][0] = "b";
       letraCodigo [1][1] = "98";
       letraCodigo [2][0] = "c";
       letraCodigo [2][1] = "99";
       letraCodigo [3][0] = "d";
       letraCodigo [3][1] = "100";
       letraCodigo [4][0] = "e";
       letraCodigo [4][1] = "101";
       letraCodigo [5][0] = "f";
       letraCodigo [5][1] = "102";
       letraCodigo [6][0] = "g";
       letraCodigo [6][1] = "103";
       letraCodigo [7][0] = "h";
       letraCodigo [7][1] = "104";
       letraCodigo [8][0] = "i";
       letraCodigo [8][1] = "105";
       letraCodigo [9][0] = "j";
       letraCodigo [9][1] = "106";
       letraCodigo [10][0] = "k";
       letraCodigo [10][1] = "107";
       letraCodigo [11][0] = "l";
       letraCodigo [11][1] = "108";
       letraCodigo [12][0] = "m" ;
       letraCodigo [12][1] = "109";
       letraCodigo [13][0] = "n";
       letraCodigo [13][1] = "110";
       letraCodigo [14][0] = "o";
       letraCodigo [14][1] = "111";
       letraCodigo [15][0] = "p";
       letraCodigo [15][1] = "112";
       letraCodigo [16][0] = "q";
       letraCodigo [16][1] = "113";
       letraCodigo [17][0] = "r";
       letraCodigo [17][1] = "114";
       letraCodigo [18][0] = "s";
       letraCodigo [18][1] = "115";
       letraCodigo [19][0] = "t";
       letraCodigo [19][1] = "116";
       letraCodigo [20][0] = "u";
       letraCodigo [20][1] = "117";
       letraCodigo [21][0] = "v";
       letraCodigo [21][1] = "118"; 
       letraCodigo [22][0] = "w" ;
       letraCodigo [22][1] = "119";
       letraCodigo [23][0] = "x";
       letraCodigo [23][1] = "120";
       letraCodigo [24][0] = "y";
       letraCodigo [24][1] = "121";
       letraCodigo [25][0] = "z";
       letraCodigo [25][1] = "122";
      System.out.println("----------------------------------------------------------------------");
        System.out.println ("[" + letraCodigo [0][0] + "]" + "[" + letraCodigo [0][1] + "]" +        "           "  
                + "[" + letraCodigo [1][0] + "]" + "[" + letraCodigo [1][1] + "]" + "            " + "[" + letraCodigo [2][0] + "]" + "[" + letraCodigo [2][1] + "]" +     "            " 
                + "[" + letraCodigo [3][0] + "]" + "[" + letraCodigo [3][1] + "]");
        System.out.println(""); 
        System.out.println(""); 
        System.out.println ("[" + letraCodigo [4][0] + "]" + "[" + letraCodigo [4][1] + "]" +        "          " +  
                "[" + letraCodigo [5][0] + "]" + "[" + letraCodigo [5][1] + "]" +   "           " 
                + "[" + letraCodigo [6][0] + "]" + "[" + letraCodigo [6][1] + "]" +       "           " + "[" + letraCodigo [7][0] + "]" + "[" + letraCodigo [7][1] + "]");
        System.out.println(""); 
        System.out.println(""); 
        System.out.println ("[" + letraCodigo [8][0] + "]" + "[" + letraCodigo [8][1] + "]" +   "          " + "[" + letraCodigo [9][0] + "]" + "[" + letraCodigo [9][1] + "]" +     "           "
                + "[" + letraCodigo [10][0] + "]" + "[" + letraCodigo [10][1] + "]" +     "           " + "[" + letraCodigo [11][0] + "]" + "[" + letraCodigo [11][1] + "]");
        System.out.println("");
        System.out.println("");
        System.out.println ("[" + letraCodigo [12][0] + "]" + "[" + letraCodigo [12][1] + "]" + "          " + "[" + letraCodigo [13][0] + "]" + "[" + letraCodigo [13][1] + "]" +   "           " 
                + "[" + letraCodigo [14][0] + "]" + "[" + letraCodigo [14][1] + "]" +     "           " + "[" + letraCodigo [15][0] + "]" + "[" + letraCodigo [15][1] + "]");
        System.out.println("");
        System.out.println("");
        System.out.println ("[" + letraCodigo [16][0] + "]" + "[" + letraCodigo [16][1] + "]" + "          " + "[" + letraCodigo [17][0] + "]" + "[" + letraCodigo [17][1] + "]" +   "           "
                + "[" + letraCodigo [18][0] + "]" + "[" + letraCodigo [18][1] + "]" +     "           " + "[" + letraCodigo [19][0] + "]" + "[" + letraCodigo [19][1] + "]");
        System.out.println("");
        System.out.println("");
        System.out.println ("[" + letraCodigo [20][0] + "]" + "[" + letraCodigo [20][1] + "]" + "          " + "[" + letraCodigo [21][0] + "]" + "[" + letraCodigo [21][1] + "]" +   "           " 
                + "[" + letraCodigo [22][0] + "]"+ "[" + letraCodigo [22][1] + "]" +    "           " + "[" + letraCodigo [23][0] + "]" + "[" + letraCodigo [23][1] + "]");
        System.out.println("");  
        System.out.println(""); 
        System.out.println ("[" + letraCodigo [24][0] + "]"+ "[" + letraCodigo [24][1] + "]" +  "          " + "[" + letraCodigo [25][0] + "]" + "[" + letraCodigo [25][1] + "]");
        System.out.println(""); 
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("FAVOR DE INGRESAR UN NUMERO DE LA TABLA ASCII");
        int numero = sc.nextInt();
        String binario = "";
        if(numero>0){
            while (numero>0){
                if (numero % 2 ==0){
                    binario = "0" + binario;
                }else{
                    binario = "1" + binario;
                }
                numero = (int) numero / 2;
            }
        }else if (numero==0){
            binario = "0";
        } else {
            binario = "Numero no convertido";
        }
        System.out.println("");
    System.out.println("El numero binario es : " + binario);
    }
}