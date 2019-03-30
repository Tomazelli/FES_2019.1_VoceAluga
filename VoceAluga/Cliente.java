
import java.util.*;

/**
 * @author Felipe Tomazelli Crespo
 */
public class Cliente extends PessoaFisica {
	
	// 0 = String nome, 1 = int cpf, 2 = int contato, 3 = int endereco, 4 = Date dataDeNascimento
	// 5 = int cartao, 6 = int habilitacao, 7 = string carroAlugado
	private ArrayList<Object> dadosCliente = new ArrayList<Object>();
	
    public Cliente(String nome, long cpf, long contato, long endereco, Date dataDeNascimento, long cartao, long habilitacao) {
    	super(cpf, contato, endereco, nome, dataDeNascimento);
    	this.dadosCliente = this.getDados();
    	this.dadosCliente.add(cartao);
    	this.dadosCliente.add(habilitacao);
    	String carroAlugado = "";
    	this.dadosCliente.add(carroAlugado);
    	this.setDados(dadosCliente);
    }

    /**
     * 
     */
    //public int cartao;
    //public int habilitacao;
    //public String carroAlugado;
    
    
    public void AlugaCarro(String carro) {
    	this.dadosCliente.set(7, carro);
        this.setDados(dadosCliente);
    }
    
    public void DevolveCarro() {
    	this.dadosCliente.set(7, "");
    	this.setDados(dadosCliente);
    }

}