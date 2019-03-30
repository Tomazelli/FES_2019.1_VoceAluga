
import java.util.*;

/**
 * @author Felipe Tomazelli Crespo
 */
public class PessoaFisica {

    /**
     * Default constructor
     */
    public PessoaFisica(long cpf, long contato, long endereco, String nome, Date dataDeNascimento) {
    	//this.cpf = cpf;
    	//this.contato = contato;
    	//this.endereco = endereco;
    	//this.dataDeNascimento = dataDeNascimento;
    	//this.nome = nome;
    	this.dados.add(nome);
    	this.dados.add(cpf);
    	this.dados.add(contato);
    	this.dados.add(endereco);
    	this.dados.add(dataDeNascimento);
    }

    /**
     * 
     */
    //private int cpf;
    //private int contato;
    //private int endereco;
    //private String nome;
    //private Date dataDeNascimento;
    private ArrayList<Object> dados = new ArrayList<Object>();
    
    public ArrayList<Object> getDados() {
    	// 0 = String nome, 1 = int cpf, 2 = int contato, 3 = int endereco, 4 = Date dataDeNascimento
		return dados;
	}

	public void setDados(ArrayList<Object> dados) {
		this.dados = dados;
	}

	/**
     * 
     */
    public ArrayList<Object> ConsultaDados() {
        return dados;
    }
    
    public void PrintaDados() {
    	for (int i =0; i< dados.size(); i++)
			System.out.println(i + " " + dados.get(i));
    }

    /**
     * 
     */
    public void AtualizaDados(ArrayList<Object> novosDados) {
    	for (int i=0; i< this.dados.size(); i++)
    		this.dados.set(i, novosDados.get(i));
    }

}