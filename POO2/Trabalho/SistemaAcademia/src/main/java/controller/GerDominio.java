/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ConexaoHibernate;
import dao.GenericDAO;
import java.util.List;
import org.hibernate.HibernateException;
/**
 *
 * @author 2023122760220
 */
public class GerDominio {
      private GenericDAO genDAO;
    
     public GerDominio() throws java.lang.ExceptionInInitializerError, HibernateException {
        // ConexaoMySQL.obterConexao();
        ConexaoHibernate.getSessionFactory().openSession();
        genDAO = new GenericDAO();
     }
     
     public List listar(Class classe) throws HibernateException {
        return genDAO.listar(classe);      
    }
    
    public void excluir(Object obj) throws HibernateException {
        genDAO.excluir(obj);
    }
    
}
