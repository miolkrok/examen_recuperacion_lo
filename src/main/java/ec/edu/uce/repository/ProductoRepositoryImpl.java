package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import ec.edu.uce.modelo.Producto;
@Repository
@Transactional
public class ProductoRepositoryImpl implements IProductoRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}

	@Override
	public Producto buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Producto.class, id);
	}

	@Override
	public void borrarPorId(Integer id) {
		// TODO Auto-generated method stub
		Producto borrar = this.buscarPorId(id);
		this.entityManager.remove(borrar);
	}

	@Override
	public List<Producto> buscarProductoTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Producto> myQuery = this.entityManager
				.createQuery("SELECT p FROM Producto p", Producto.class);

		

		return myQuery.getResultList();
	}

	@Override
	public Producto buscarProductoPorCodigoBarrasMaestro(String codigoBarrasMaestro) {
		// TODO Auto-generated method stub

		TypedQuery<Producto> myQuery = this.entityManager
				.createQuery("SELECT p FROM Producto p WHERE p.codigoBarrasMaestro=:codigoBarrasMaestro", Producto.class);

		myQuery.setParameter("codigoBarrasMaestro", codigoBarrasMaestro);

		return myQuery.getSingleResult();
	}



}
