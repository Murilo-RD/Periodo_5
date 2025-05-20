/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ConexaoHibernate;
import org.hibernate.HibernateException;
/**
 *
 * @author 2023122760220
 */
public class GerDominio {
     public GerDominio() throws java.lang.ExceptionInInitializerError, HibernateException {
        // ConexaoMySQL.obterConexao();
        ConexaoHibernate.getSessionFactory().openSession();
     }
    
}
