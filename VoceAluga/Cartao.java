
/**
 * @author Felipe Tomazelli Crespo
 */
public class Cartao {

    /**
     * Default constructor
     */
    public Cartao(long numero, long agencia, String titular) {
    	this.numero = numero;
    	this.agencia = agencia;
    	this.titular = titular;
    }


    public long numero;
    public long getNumero() {
		return numero;
	}


	public long agencia;
    public String titular;
    
    public void PrintaCartao() {
		System.out.println("numero: " + numero );
		System.out.println("agencia: " + agencia );
		System.out.println("titular: " + titular );
	}


}