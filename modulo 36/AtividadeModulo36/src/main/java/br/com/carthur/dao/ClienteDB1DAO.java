package br.com.carthur.dao;

import javax.persistence.Query;

import br.com.carthur.dao.generic.GenericDB1DAO;
import br.com.carthur.domain.Cliente;

public class ClienteDB1DAO extends GenericDB1DAO<Cliente, Long> implements IClienteDAO {
	
	public ClienteDB1DAO() {
		super(Cliente.class);
	}
	
	@Override
	public void excluir(Cliente cliente) {
		try {
			// Excluir as vendas associadas ao cliente
			excluirVendasDeCliente(cliente);
			super.excluir(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void excluirVendasDeCliente(Cliente cliente) {
		openConnection();
		Query query = em.createQuery("DELETE FROM Venda v WHERE v.cliente = :cliente");
		query.setParameter("cliente", cliente);
		query.executeUpdate();
		closeConnection();
	}

}
