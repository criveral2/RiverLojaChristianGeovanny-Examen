package examen.consultas;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import examen.jpa.GenericDao;



public  class JPAGenericDao<T, ID> implements GenericDao<T, ID> {
	
	
	private Class<T> persisten;
	protected EntityManager persistenciamanager;
	
	
	public JPAGenericDao( Class<T> persisten) {
		// TODO Auto-generated constructor stub
		this.persisten = persisten;
		this.persistenciamanager= Persistence.createEntityManagerFactory("examen").createEntityManager();
	}



	@Override
	public boolean create(T entity) {
		persistenciamanager.getTransaction().begin();
        try {
            persistenciamanager.persist(entity);
            persistenciamanager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println(">>>>> Error: JPAgenericDao.create "+e);
            if (persistenciamanager.getTransaction().isActive()) {
                persistenciamanager.getTransaction().rollback();
            }
            return false;
        }
	}
	
	

	@Override
	public T read(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(T entity) {
		persistenciamanager.getTransaction().begin();
        try {
            persistenciamanager.merge(entity);
            persistenciamanager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println(">>>>> Error: JPAgenericDao.update "+e);
            if (persistenciamanager.getTransaction().isActive()) {
                persistenciamanager.getTransaction().rollback();
            }
            return false;
        }
	}

	@Override
	public boolean delete(T entity) {
		persistenciamanager.getTransaction().begin();
        try {
            persistenciamanager.remove(entity);
            persistenciamanager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println(">>>>> Error: JPAgenericDao.delete "+e);
            if (persistenciamanager.getTransaction().isActive()) {
                persistenciamanager.getTransaction().rollback();
            }
            return false;
        }
	}

	@Override
	public List<T> find() {
		persistenciamanager.getTransaction().begin();
        List<T> lista = null;
        try {
            javax.persistence.criteria.CriteriaQuery cq = persistenciamanager.getCriteriaBuilder().createQuery();
            cq.select(cq.from(persisten));
            lista = persistenciamanager.createQuery(cq).getResultList();
            persistenciamanager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
	}

	@Override
	public T findById(ID id) {
		return persistenciamanager.find(persisten, id);
	}
	

}
