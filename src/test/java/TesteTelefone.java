import org.junit.Test;
import poo.Telefone;

import static junit.framework.TestCase.assertEquals;

public class TesteTelefone {

    Telefone telefone = new Telefone();

    @Test
    public void testeTelefone(){
    // Testes do método add.
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
    // Testes do método remove.
    assertEquals("Erro ao remover número", true, telefone.remove("casa"));
    assertEquals("Erro, removeu número inválido", false, telefone.remove("carro"));
    // Testes do método update.
    assertEquals("Erro ao dar update no número", true, telefone.update("celular","048999419560"));
    assertEquals("Erro, update em um rótulo inválido",false,telefone.update("carro","04833428683"));
    }
}
