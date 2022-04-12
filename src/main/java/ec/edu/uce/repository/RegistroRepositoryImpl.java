package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import ec.edu.uce.modelo.Registro;
@Repository
@Transactional
public class RegistroRepositoryImpl implements IRegistroRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Registro registro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(registro);
	}

	@Override
	public void actualizar(Registro registro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(registro);
	}

	@Override
	public Registro buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Registro.class, id);
	}

	@Override
	public void borrarPorId(Integer id) {
		// TODO Auto-generated method stub
		Registro borrar = this.buscarPorId(id);
		this.entityManager.remove(borrar);
	}

}
