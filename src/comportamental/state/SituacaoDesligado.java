package comportamental.state;

/**
 *
 * @author Romao
 */

//Classe com situação desligado, implementando a interface Situacao e implementando
//o método de situação com retorno desligado.
public class SituacaoDesligado implements Situacao {

    @Override
    public String situacao() {
        return "Ventilador Desligado.";
    }

}
