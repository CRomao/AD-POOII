package estrutural.ExemploFacade;

/**
 *
 * @author Romao
 */
public class App {

    public static void main(String[] args) {
        System.out.println("##### Configurando subsistemas #####");
        SistemasFacade fachada = new SistemasFacade();
        fachada.inicializarSubsistemas();

        System.out.println("##### Utilizando subsistemas #####");
        fachada.iniciarVentilacao();
        fachada.iniciarIluminacao();
    }
}
