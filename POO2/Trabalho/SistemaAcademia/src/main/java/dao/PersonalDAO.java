/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import domain.Personal;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Xacar
 */
public class PersonalDAO {
    public List<Personal> pesquisarPersonalPorNome(String nome) throws HibernateException {
    List<Personal> lista = null;
    Session sessao = null;

    try {
        sessao = ConexaoHibernate.getSessionFactory().openSession();
        sessao.beginTransaction();

        
        CriteriaBuilder builder = sessao.getCriteriaBuilder();
        CriteriaQuery<Personal> consulta = builder.createQuery(Personal.class);
        Root<Personal> tabela = consulta.from(Personal.class);

        
        Predicate restricao = builder.like(tabela.get("nome"), nome + '%');
        
        consulta.where(restricao);
        
        
        consulta.orderBy(builder.asc(tabela.get("nome")));

        lista = sessao.createQuery(consulta).getResultList();

        sessao.getTransaction().commit();
    } catch (HibernateException ex) {
        if (sessao != null && sessao.getTransaction().isActive()) {
            sessao.getTransaction().rollback();
        }
        throw new HibernateException("Erro ao pesquisar personal por nome: " + ex.getMessage());
    } finally {
        if (sessao != null) {
            sessao.close();
        }
    }

    return lista;
}
}
