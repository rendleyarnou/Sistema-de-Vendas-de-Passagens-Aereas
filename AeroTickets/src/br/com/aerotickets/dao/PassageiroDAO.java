package br.com.aerotickets.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import br.com.aerotickets.entidade.Passageiro;
import br.com.aerotickets.repository.PassageiroRepository;

public class PassageiroDAO extends DaoConnect implements PassageiroRepository{

	@Override
	public void alterar(Passageiro passageiro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Passageiro passageiro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existe(Passageiro passageiro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void inserir(Passageiro passageiro) {
		try {
			Connection conexao = getConexao();
			PreparedStatement ps = conexao.prepareStatement("Insert into passageiro (id, nome, sexo, email, tel, data-nasc) values (?,?,?,?,?,?)");	
			
			ps.setLong(1, passageiro.getId());
			ps.setString(2, passageiro.getNome());
			ps.setString(3, passageiro.getSexo());
			ps.setString(4, passageiro.getEmail());
			ps.setString(5, passageiro.getTel());
			ps.setDate(6, new java.sql.Date( passageiro.getDataNasc().getTime()));
			
			ps.execute();
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public List<Passageiro> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passageiro consultar(Passageiro passageiro) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
