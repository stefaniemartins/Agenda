package poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;

public class Telefone {

    private HashMap <String,String> dadosTelefone = new HashMap<>();

    public Telefone() {
    }

    public boolean add(String rotulo, String numero){
        if (verificador(numero)){
            dadosTelefone.put(rotulo, numero);
            return true;
        }

        else{
            return false;
        }
    }

    public boolean remove(String rotulo){
        if (dadosTelefone.size() > 0){
            if (dadosTelefone.containsKey(rotulo)){
                dadosTelefone.remove(rotulo);
                return true;
            }

            else {
                return false;
            }
        }

        else{
            return false;
        }
    }
//
//    public boolean update(String rotulo, String nome){
//
//    }

    /**
     * Método verifica se o número que o usuário deseja add é válido ou não.
     * @param numero recebe o número a ser add a um determinado contado.
     * @return true caso o número seja válido, return false caso o número não seja válido.
     */
    public boolean verificador(String numero){
        int i;
        for (i = 0; i < numero.length(); i++) {
            if ((numero.charAt(i) < '0') || (numero.charAt(i) > '9')){
                return false;
            }
        }

        if (i == numero.length()) {
            if (numero.length() == 11) {
                if (numero.charAt(3) == '9')
                {
                    return false;
                }

                else if (numero.charAt(0) == '0') {
                    return true;
                }

                else {
                    return false;
                }
            }

            else if (numero.length() == 12) {
                if (numero.charAt(3) == '9') {
                    if (numero.charAt(0) == '0') {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public String formata(String valor){
        MaskFormatter mask = null;
        String resultado = "";

        try {
            if (valor.length() == 11){
                mask = new MaskFormatter("(###) ####-####");
                mask.setValueContainsLiteralCharacters(false);
                mask.setPlaceholderCharacter('_');
                resultado = mask.valueToString(valor);
            }

            else {
                mask = new MaskFormatter("(###) # ####-####");
                mask.setValueContainsLiteralCharacters(false);
                mask.setPlaceholderCharacter('_');
                resultado = mask.valueToString(valor);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder();
        dadosTelefone.forEach((chave,valor)-> {
            aux.append(chave + ": " + formata(valor) + "\n");
        } );
        return aux.toString();
    }
}
