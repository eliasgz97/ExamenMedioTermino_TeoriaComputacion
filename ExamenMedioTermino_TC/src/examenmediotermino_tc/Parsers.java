package examenmediotermino_tc;

public class Parsers {
    public boolean Parser_2 (String input){
        int contador_A = 0;
        int contador_B = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != 'a' && input.charAt(i) != 'b' && input.charAt(i) != 'c'){
                contador_A = 0;
                contador_B = 0;
                break;
            }
            if (input.charAt(i) == 'a'){
                contador_A++;
            }else if (input.charAt(i) == 'b') {
                contador_B++;
            }   
        }
        if (contador_A > 0 && contador_B > 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean Parser_3(String input){
        int contador_1s = 0;
        int contador_0s = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '1' && input.charAt(i) != '0'){
                contador_1s = 0;
                contador_0s = 0;
                break;
            }
            if (input.charAt(i) == '1'){
                contador_1s++;
            }else if (input.charAt(i) == '0') {
                contador_0s++;
            }   
        }
        if ((contador_1s > 0 && contador_0s > 0) && (contador_0s == contador_1s)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean Parser_4(String input){
        boolean retorno = false;
        if ((input.charAt(input.length()-1) == '1') && (input.charAt(input.length()-2) == '0') && (input.charAt(input.length()-3) == '1')) {
            retorno = true;
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '1' && input.charAt(i) != '0'){
                retorno = false;
                break;
            }
        }
        return retorno;
    }
}
