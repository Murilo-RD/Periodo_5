/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Aluno;
import domain.Treino;
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
public class AlunoDAO {
    
    public List<Treino> carregarTreino(Aluno aluno)  throws HibernateException{
        Session sessao = null;
        List<Treino> lista = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery<Treino> consulta = builder.createQuery(Treino.class);

            Root<Treino> tabelaTreino = consulta.from(Treino.class);
            Join<Treino, Aluno> joinAluno = tabelaTreino.join("aluno", JoinType.INNER);

            consulta.select(tabelaTreino).where(builder.equal(joinAluno.get("idUsuario"), aluno.getIdUsuario()));

            lista = sessao.createQuery(consulta).getResultList();

        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        sessao.close();
        aluno.setTreinos(lista);
        return lista;
    }
    
    public List<Aluno> pesquisarAlunoPorNome(String nome) throws HibernateException {
    List<Aluno> lista = null;
    Session sessao = null;

    try {
        sessao = ConexaoHibernate.getSessionFactory().openSession();
        sessao.beginTransaction();

        
        CriteriaBuilder builder = sessao.getCriteriaBuilder();
        CriteriaQuery<Aluno> consulta = builder.createQuery(Aluno.class);
        Root<Aluno> tabela = consulta.from(Aluno.class);

       
        Predicate restricao = builder.like(tabela.get("nome"), nome + '%');
        
        consulta.where(restricao);
        
        
        consulta.orderBy(builder.asc(tabela.get("nome")));

        lista = sessao.createQuery(consulta).getResultList();

        sessao.getTransaction().commit();
    } catch (HibernateException ex) {
        if (sessao != null && sessao.getTransaction().isActive()) {
            sessao.getTransaction().rollback();
        }
        throw new HibernateException("Erro ao pesquisar aluno por nome: " + ex.getMessage());
    } finally {
        if (sessao != null) {
            sessao.close();
        }
    }

    return lista;
}
}
                

