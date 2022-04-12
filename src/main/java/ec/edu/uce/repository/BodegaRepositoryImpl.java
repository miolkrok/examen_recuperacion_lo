package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Bodega;
@Repository
@Transactional
public class BodegaRepositoryImpl implements IBodegaRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.entityManager.persist(bodega);
	}

	@Override
	public void actualizar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.entityManager.merge(bodega);
	}

	@Override
	public Bodega buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Bodega.class, id);
	}

	@Override
	public void borrarPorId(Integer id) {
		// TODO Auto-generated method stub
		Bodega borrar = this.buscarPorId(id);
		this.entityManager.remove(borrar);
	}

}
