/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Exercicio;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
/**
 *
 * @author Xacar
 */
public class ExercicioDAO {
    public List<Exercicio> pesquisarExercicioPorNome(String nome) throws HibernateException {
    List<Exercicio> lista = null;
    Session sessao = null;

    try {
        
        sessao = ConexaoHibernate.getSessionFactory().openSession();
        sessao.beginTransaction();

     
        CriteriaBuilder builder = sessao.getCriteriaBuilder();
        CriteriaQuery<Exercicio> consulta = builder.createQuery(Exercicio.class);
        Root<Exercicio> tabela = consulta.from(Exercicio.class);

       
        Predicate restricao = builder.like(tabela.get("nome"), nome + '%');
        
        consulta.where(restricao);
        
        consulta.orderBy(builder.asc(tabela.get("nome")));

        
        lista = sessao.createQuery(consulta).getResultList();

     
        sessao.getTransaction().commit();
    } catch (HibernateException ex) {
       
        if (sessao != null && sessao.getTransaction().isActive()) {
            sessao.getTransaction().rollback();
        }
       
        throw new HibernateException("Erro ao pesquisar exercício por nome: " + ex.getMessage());
    } finally {
        
        if (sessao != null) {
            sessao.close();
        }
    }

    return lista;
}
    
}
