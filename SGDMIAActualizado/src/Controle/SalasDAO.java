/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Salas;
import Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Classe responsavel pelo controle das salas ddos docentes.
 * @author 
 * @version 1.0
 */
public class SalasDAO {
    /**
     * Grava os objectos na base de dados.
     * @param salasdocentes
     * @return 
     */
     public boolean gravar(Salas salasdocentes){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.save(salasdocentes);
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
      * actualiza os objectos na base de dados.
      * @param salasDocentes
      * @return 
      */
    public boolean atualizar(Salas salasDocentes){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.update(salasDocentes);
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
     * @param salasDocentes
     * @return 
     */
    public boolean remover(Salas salasDocentes){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.delete(salasDocentes);
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
     * @return 
     */
     public List<Salas> consular(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        
         Query c = sec.createQuery("from salasdocentes");
        List<Salas> list = c.list();

            return c.list();
      
    }
    
    
}
