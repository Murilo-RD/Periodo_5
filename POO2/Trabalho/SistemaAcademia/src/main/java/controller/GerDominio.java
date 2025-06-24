/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ConexaoHibernate;
import dao.GenericDAO;
import dao.AlunoDAO;
import domain.Aluno;
import domain.Treino;
import java.util.List;
import org.hibernate.HibernateException;
/**
 *
 * @author 2023122760220
 */
public class GerDominio {
      private GenericDAO genDAO;
      private AlunoDAO alunoDAO;
    
     public GerDominio() throws java.lang.ExceptionInInitializerError, HibernateException {
        // ConexaoMySQL.obterConexao();
        ConexaoHibernate.getSessionFactory().openSession();
        genDAO = new GenericDAO();
        alunoDAO = new AlunoDAO();
     }
     
    public void inserir(Object obj){
        genDAO.inserir(obj);
    }
     
    public List listar(Class classe) throws HibernateException {
        return genDAO.listar(classe);      
    }
    
    public List<Treino> carregarTreino(Aluno alun) throws HibernateException {
        return alunoDAO.carregarTreino(alun);      
    }
    
    public Object get(Class classe,int id) throws HibernateException {
        return genDAO.get(classe,id);      
    }
    
    public void alterar(Object obj) throws HibernateException {
        genDAO.alterar(obj);      
    }
    
    public void excluir(Object obj) throws HibernateException {
        genDAO.excluir(obj);
    }
    
}
