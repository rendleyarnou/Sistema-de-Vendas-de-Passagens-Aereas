package br.com.aerotickets.repository;

import java.util.List;

import br.com.aerotickets.entidade.Passageiro;

public interface PassageiroRepository {
	
	public void alterar(Passageiro passageiro);
	
	public void excluir(Passageiro passageiro);
	
	public boolean existe(Passageiro passageiro);
	
	public void inserir(Passageiro passageiro);
	
	public List<Passageiro> listar();
	
	public Passageiro consultar(Passageiro passageiro);
}
