package br.com.carthur.domain;

import java.math.BigDecimal;

import br.com.carthur.annotation.ColunaTabela;
import br.com.carthur.annotation.Tabela;
import br.com.carthur.annotation.TipoChave;

@Tabela("TB_PRODUTO")
public class Produto implements Persistente {
	
	@ColunaTabela(dbName= "id", setJavaName = "setId")
	private Long id;
	@TipoChave("getCodigo")
	@ColunaTabela(dbName= "codigo", setJavaName = "setCodigo")
	private String codigo;
	@ColunaTabela(dbName= "nome", setJavaName = "setNome")
	private String nome;
	@ColunaTabela(dbName= "categoria", setJavaName = "setCategoria")
	private String categoria;
	@ColunaTabela(dbName= "descricao", setJavaName = "setDescricao")
	private String descricao;
	@ColunaTabela(dbName= "valor", setJavaName = "setValor")
	private BigDecimal valor;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
