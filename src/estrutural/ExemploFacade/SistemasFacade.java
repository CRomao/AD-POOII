package estrutural.ExemploFacade;

/**
 *
 * @author Romao
 */
//Classe Facade para que possa separar a parte que seria implementada no cliente,
//para que não ficasse com muita informação lá, e que possa ocultar as informações dele.
//Neste exemplo, seria a comunicação com um subsistema de ventilação e iluminação de algum evento.
public class SistemasFacade {

    protected SistemaDeVentilacao ventilacao;
    protected SistemaDeIluminacao iluminacao;

    public void inicializarSubsistemas() {
        System.out.println("-=-=-=ILUMINAÇÃO-=-=-=");
        iluminacao = new SistemaDeIluminacao();
        iluminacao.configurarIluminacao();
        iluminacao.configurarIntensidade();
        iluminacao.testarQualidade();
        
        System.out.println("\n-=-=-=VENTILAÇÃO-=-=-=");
        ventilacao = new SistemaDeVentilacao();
        ventilacao.configurarVelocidade();
        ventilacao.configurarInicio();
        ventilacao.configurarTermino();
        
        System.out.println("");
    }

    public void iniciarVentilacao() {
        ventilacao.iniciarVentilacao();
    }

    public void iniciarIluminacao() {
        iluminacao.iniciarIluminacao();
    }

}
