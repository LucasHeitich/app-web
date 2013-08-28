package com.betha.daos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.betha.business.Pessoa;
import com.betha.util.FabricaSessao;

public class PessoaDAO {
	private List<Pessoa> lista;

	public PessoaDAO() {
		
		
		Session session = FabricaSessao.abrirSessao();
		this.lista = new ArrayList<Pessoa>();
		
		this.lista = session.createCriteria(Pessoa.class).list();
		
	
		
	}

	public Pessoa buscarPorCodigo(Integer codigo) {

		for (int i = 0; i < this.lista.size(); i++) {
			if(this.lista.get(i).getCodigo() == codigo)
				return this.lista.get(i);
		}
		return null;
	}
	public ArrayList<Pessoa> listarTodas(){
		
		return (ArrayList<Pessoa>) this.lista ;
	}
}
