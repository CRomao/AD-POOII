package comportamental.state;

/**
 *
 * @author Romao
 */

//Interface para servir como base para a situação do ventilador: ligado ou desligado, onde
//as classes que implementarem terão que implementar esse método.
public interface Situacao {

    public String situacao();

}
