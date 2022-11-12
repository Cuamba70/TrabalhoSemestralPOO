/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Funcionario;
import Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 * Classe responsavel pelo controle do funcionario.
 * @author 
 * @version 1.0
 */
public class FuncionarioDAO {
    /**
     * Grava os objectos na base de dados.
     * @param funcionario
     * @return 
     */
    public boolean gravar(Funcionario funcionario){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.save(funcionario);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
    
    /**
     * Actualiza os objectos na base de dados.
     * @param funcionario
     * @return 
     */
    public boolean atualizar(Funcionario funcionario){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.update(funcionario);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
    
    /**
     * remove os objectos na base de dados de uma forma fisica.
     * @param funcionario
     * @return 
     */
    public boolean remover(Funcionario funcionario){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.delete(funcionario);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally{
            sec.close();
        }
    }
  
    /**
     * consulta os objectos na base de dados. 
     * @return o funcionario consultado
     */
     public List<Funcionario> consular(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        
         Query c = sec.createQuery("from funcionario");
        List<Funcionario> list = c.list();
       
            return c.list();
        
    }
    
}
