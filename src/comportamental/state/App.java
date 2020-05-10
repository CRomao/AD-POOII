package comportamental.state;

/**
 *
 * @author Romao
 */
public class App {

    public static void main(String[] args) {
        
        Ventilador ventilador = new Ventilador(new SituacaoLigado());
        System.out.println(ventilador.situacao());
        
        ventilador.setVentilador(new SituacaoDesligado());
        System.out.println(ventilador.situacao());
    }
}
