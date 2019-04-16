import org.junit.Test;
import poo.Telefone;

import static junit.framework.TestCase.assertEquals;

public class TesteTelefone {

    Telefone telefone = new Telefone();
    @Test
    public void testaTelefone(){
    assertEquals("Erro, add número com caracteres inválidos",false,telefone.add("casa","0t83342g683"));
    assertEquals("Erro ao add o telefone fixo",true,telefone.add("casa","04833428683"));
    assertEquals("Erro, add o telefone fixo com ddd inválido", false,telefone.add("casa","4833428683"));
    assertEquals("Erro, add o telefone fixo sem ddd", false,telefone.add("casa","33428683"));
    assertEquals("Erro, add o telefone fixo com tamanho maior que o aceitável", false,telefone.add("casa","048333428683"));
    assertEquals("Erro, add o telefone fixo com tamanho menor que o aceitável", false,telefone.add("casa","0483428683"));
    assertEquals("Erro ao add o telefone móvel",true,telefone.add("celular","048996948370"));
    assertEquals("Erro, add o telefone móvel com ddd inválido", false,telefone.add("celular","48996948370"));
    assertEquals("Erro, add o telefone móvel sem ddd", false,telefone.add("celular","996948370"));
    assertEquals("Erro, add o telefone móvel com tamanho maior que o aceitável", false,telefone.add("celular","0489996948370"));
    assertEquals("Erro, add o telefone móvel com tamanho menor que o aceitável", false,telefone.add("celular","04896948370"));
    }
}
