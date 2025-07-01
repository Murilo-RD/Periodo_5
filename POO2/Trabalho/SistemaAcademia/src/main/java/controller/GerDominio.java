/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ConexaoHibernate;
import dao.GenericDAO;
import dao.AlunoDAO;
import dao.ExercicioDAO;
import dao.PersonalDAO;
import domain.Aluno;
import domain.Exercicio;
import domain.Personal;
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
      private PersonalDAO personalDAO;
      private ExercicioDAO exercicioDAO;
    
     public GerDominio() throws java.lang.ExceptionInInitializerError, HibernateException {
        // ConexaoMySQL.obterConexao();
        ConexaoHibernate.getSessionFactory().openSession();
        genDAO = new GenericDAO();
        alunoDAO = new AlunoDAO();
        personalDAO = new PersonalDAO();
        exercicioDAO = new ExercicioDAO();
     }
     
    public void inserir(Object obj){
        genDAO.inserir(obj);
    }
     
    public List listar(Class classe) throws HibernateException {
        return genDAO.listar(classe);      
    }
    
    public void excluir(Object obj) throws HibernateException {
        genDAO.excluir(obj);
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
    public List<Aluno> pesquisarAlunoPorNome(String nome) throws HibernateException{
        return alunoDAO.pesquisarAlunoPorNome(nome);
    }
    public List<Personal> pesquisarPersonalPorNome(String nome) throws HibernateException {
        return personalDAO.pesquisarPersonalPorNome(nome);
    }
    
    public List<Exercicio> pesquisarExercicioPorNome(String nome) throws HibernateException {
        return exercicioDAO.pesquisarExercicioPorNome(nome);
    }
    
    
}
