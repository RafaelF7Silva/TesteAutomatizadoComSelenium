package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CadastroPage;
import runner.RunTest;

public class stepsCadastroTela extends RunTest {

    CadastroPage cadastroPage = new CadastroPage(driver);

    String nome = "João";
    String sobrenome = "Silva";

     @Quando("^preencho o formulario$")
    public void preencho_o_formulario()  {
         cadastroPage.selectTitle(1);
         cadastroPage.preencherNome(nome);
         cadastroPage.preencherSobreNome(sobrenome);
         cadastroPage.preencherPassword("123355");
         cadastroPage.preencherCampoData(11,11,"1988");
         cadastroPage.preencherEndereco("Rua 2");
         cadastroPage.preencherCidade("São Bernardo do Campo");
         cadastroPage.escolherEstado("Colorado");
         cadastroPage.preencherCodigoCidade("88800");
         cadastroPage.preencherFoneHome("+559595665323");
         cadastroPage.preencherFone("+55048956652325");




    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar()  {
        cadastroPage.botaoRegistro();
    }

    @Então("^vejo  a mensagem  de cadastro concluido$")
    public void vejo_a_mensagem_de_cadastro_concluido()  {
         cadastroPage.validaCadastro(nome,sobrenome);

    }



}
