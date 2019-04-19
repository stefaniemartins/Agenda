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
        // Testes do método remove.
        assertEquals("Erro ao remover e-mail", true, email.remove("pessoal"));
        assertEquals("Erro, removeu e-mail inválido", false, email.remove("carro"));
        // Testes do método update.
        email.add("empresarial","stefanie@ifsc.com");
        assertEquals("Erro ao dar update no e-mail", true, email.update("empresarial","stefanie@outlook.com"));
        assertEquals("Erro, update em um rótulo inválido",false,email.update("carro","stefanie@outlook.com"));
    }
}
