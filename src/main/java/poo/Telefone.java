package poo;

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

//    public boolean remove(String rotulo){
//
//    }
//
//    public boolean update(String rotulo, String nome){
//
//    }

    public boolean verificador(String numero){
        int i;
        for (i = 0; i < numero.length(); i++) {
            if ((numero.charAt(i) < '0') || (numero.charAt(i) > '9')){
                return false;
            }
        }

        if (i == numero.length()){
            if (numero.length() == 11) {
                if (numero.charAt(3) == '3') {
                    if (numero.charAt(0) == '0') {
                        return true;
                    } else {
                        return false;
                    }
                }
            }

            else if (numero.length() == 12){
                if (numero.charAt(3) == '9'){
                    if (numero.charAt(0) == '0')
                    {
                        return true;
                    }

                    else{
                        return false;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Telefone{}";
    }
}
