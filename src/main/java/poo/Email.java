package poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    private HashMap<String,String> dadosEmail = new HashMap<>();

    public Email() {
    }

    public boolean add(String rotulo, String email){
        if (verificador(email)){
            dadosEmail.put(rotulo, email);
            return true;
        }

        else{
            return false;
        }
    }
//
//    public boolean remove(String rotulo){
//
//    }
//
//    public boolean update(String rotulo, String email){
//
//    }
//
    public boolean verificador(String email){
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher m = p.matcher(email);
        boolean matchFound = m.matches();

        if (matchFound){
            return true;
        }

        else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder();
        dadosEmail.forEach((chave,valor)-> {
            aux.append(chave + ": " + valor + "\n");
        } );
        return aux.toString();
    }
}
