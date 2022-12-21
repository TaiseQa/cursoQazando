package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;


public class DescontoSteps extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @Dado("^que estou no site da qazando")
    public void acessar_site_quazando() {
        homePage.acessarPublicacao();
    }

    @Quando("^eu preeencho meu e-mail$")
    public void eu_preeencho_meu_e_mail() throws InterruptedException {
        homePage.scrollPage();
        homePage.preencheEmail();
    }

    @Quando("^clico em ganhar cupom de desconto$")
    public void clico_em_ganhar_cupom_de_desconto() {
        homePage.clicoEmGanharDesconto();
    }

    @Entao("^e vejo o codigo de desconto$")
    public void e_vejo_o_codigo_de_desconto() {
        homePage.verificarCupomDEDesconto();
    }


    @Dado("que eu tenho cupom gerado")
    public void queEuTenhoCupomGerado() throws InterruptedException {
        homePage.acessarPublicacao();
        homePage.scrollPage();
        homePage.preencheEmail();
        homePage.clicoEmGanharDesconto();
        homePage.verificarCupomDEDesconto();

    }

    @Quando("eu falho")
    public void euFalho() {
       homePage.euFalho();
}
}
