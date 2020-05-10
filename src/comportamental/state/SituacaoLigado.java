package comportamental.state;

/**
 *
 * @author Romao
 */

//Classe com situação ligado, implementando a interface Situacao e implementando
//o método de situação com retorno ligado.
public class SituacaoLigado implements Situacao {

    @Override
    public String situacao() {
        return "Ventilador Ligado.";
    }

}
