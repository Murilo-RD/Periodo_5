/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import domain.Aluno;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class AlunoDAO {
    
    public List<Aluno> listar(){
        Session session = null;
        try{
            session = ConexaoHibernate.getSessionFactory().openSession();
            session.getTransaction().begin();
            
            Criteria consulta =  session.


            session.getTransaction().commit();
            session.close();
        }catch(HibernateException e){
            if(session != null){
                session.getTransaction().rollback();
                session.close();
            }
            throw new HibernateException(e);
        }
        return null;
    }
    
    
}

