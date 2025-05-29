/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;


public class GenericDAO {

    public void inserir(Object obj) throws HibernateException {
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            sessao.save(obj);            
            
            sessao.getTransaction().commit();
            sessao.close();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
       
        
    }
    
    
    
    public void alterar(Object obj) throws HibernateException {
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            sessao.update(obj);
            
            sessao.getTransaction().commit();
            sessao.close();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }        
        
            
    }
    
        
    public void excluir(Object obj) throws HibernateException {
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            sessao.delete(obj);
            
            sessao.getTransaction().commit();
            sessao.close();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }       
        
    }
      
    
    public List listar( Class classe) throws HibernateException {
        
        List lista = null;        
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            CriteriaQuery consulta = sessao.getCriteriaBuilder().createQuery(classe);
            consulta.from( classe );
            lista = sessao.createQuery(consulta).getResultList();
            
            
            sessao.getTransaction().commit();
            sessao.close();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }

        return lista;
    }


    // -----------------------------------------------
    // Se não existir no banco retorna NULL
    // -----------------------------------------------
    public Object get(Class classe, int id) throws HibernateException {
        Session sessao = null;
        Object objReturn = null;
        try   {
          sessao = ConexaoHibernate.getSessionFactory().openSession();
          sessao.getTransaction().begin();

          objReturn = sessao.get(classe, id );

          sessao.getTransaction().commit();
          sessao.close();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        return objReturn;

    }
    
}
