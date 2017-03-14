package model;

import java.util.Calendar;
import java.util.Date;

import javax.naming.directory.InvalidAttributeValueException;

/**
 * Classe para criação de produtos
 * 
 * @author Marcelo Lino
 * @version 1.0
 * @category Model
 * @since 14/03/17
 */

public class Produto {
	private String nome;
	private String descricao;
	private int quantidade;
	private String tipo;
	private Date dataCompra;
	private double precoCompra;
	private double precoVenda;
	private double lucro;
	private Date dataUltimaVenda;

	/**@author Marcelo Lino
	 * @return nome String - Retorna o nome do produto*/
	public String getNome() {
		return nome;
	}

	/**@author Marcelo Lino
	 * @param nome String - Nome do produto*/
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**@author Marcelo Lino
	 * @return descricao String - Retorna a descrição do produto*/
	public String getDescricao() {
		return descricao;
	}

	/**@author marcelo
	 * @param descricao String - Descrição do produto*/
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**@author marcelo
	 * 
	 * @return quantidade int - Retorna a quantidade de produtos
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**@author marcelo
	 * 
	 * @param quantidade int - Quantidade de produtos adcionados maior que zero
	 *
	 */
	public void setQuantidade(int quantidade) {
		if(quantidade<=0){
			try {
				throw new InvalidAttributeValueException("Valor menor que zero");
			} catch (InvalidAttributeValueException e) {
				e.printStackTrace();
			}
		}
		this.quantidade = quantidade;
	}


	/**@author marcelo
	 * 
	 * @return tipo String - Retorna o tipo do produto
	 */
	public String getTipo() {
		return tipo;
	}

	/**@author marcelo
	 * 
	 * @param tipo String - Tipo do produto
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**@author marcelo
	 * 
	 * @return dataCompra Date - Retorna a data da compra
	 */
	public Date getDataCompra() {
		return dataCompra;
	}

	/**@author marcelo
	 * 
	 */
	public void setDataCompra() {
		Calendar c = Calendar.getInstance();
		this.dataCompra = c.getTime();
	}

	/**@author marcelo
	 * 
	 * @return precoCompra double - Retorna o preço pago pelo produto
	 */
	public double getPrecoCompra() {
		return precoCompra;
	}

	/**@author marcelo
	 * 
	 * @param precoCompra double - Adciona o valor pago pelo produto
	 */
	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	/**@author marcelo
	 * 
	 * @return precoVenda double - Retorna o valor do produto
	 */
	public double getPrecoVenda() {
		return precoVenda;
	}

	/**@author marcelo
	 * 
	 * @param precoVenda double - Adciona o valor de venda do produto com acrescimo de porcentagem baseado no lucro pré determinado
	 */
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = (this.precoCompra * (this.lucro/100) + this.precoCompra);
	}
	
	/**@author marcelo
	 * 
	 * @return lucro double - Retorna a porcentagem de lucro do produto
	 */
	public double getLucro() {
		return lucro;
	}

	/**@author marcelo
	 * 
	 * @param lucro double - Adciona a porcentagem de lucro maior que zero 
	 */
	public void setLucro(double lucro) {
		if(lucro<=0){
			try {
				throw new InvalidAttributeValueException("Valor zerado ou negativo");
			} catch (InvalidAttributeValueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.lucro = lucro;
	}

	/**@author marcelo
	 * 
	 * @return Date dataUltimaVenda - Retorna a data da última venda do produto
	 */
	public Date getDataUltimaVenda() {
		return dataUltimaVenda;
	}

	/**@author marcelo
	 * 
	 * @param dataUltimaVenda Date - Adciona a data da última venda
	 */
	public void setDataUltimaVenda(Date dataUltimaVenda) {
		this.dataUltimaVenda = dataUltimaVenda;
	}

}
