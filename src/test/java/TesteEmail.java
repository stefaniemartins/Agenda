import org.junit.Test;
import poo.Email;

import static junit.framework.TestCase.assertEquals;

public class TesteEmail {

    Email email = new Email();

    @Test
    public void testeEmail(){
        // Testes do método add.
        assertEquals("Erro, add e-mail sem @ e domínio",false,email.add("pessoal","stefanie"));
        assertEquals("Erro, add e-mail sem domínio",false,email.add("pessoal","stefanie@"));
        assertEquals("Erro, add e-mail com domínio incompleto",false,email.add("pessoal","stefanie@gmail"));
        assertEquals("Erro ao add e-mail",true,email.add("pessoal","stefanie@gmail.com"));
    }
}
