/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  Controle;

import java.util.List;
import javax.swing.JOptionPane;
import Modelo.Estudante;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import Util.HibernateUtil;
import org.hibernate.Query;

/**
 * Classe responsavel pelo controle do estudante.
 * @author 
 * @version 1.0
 */
public class EstudanteDAO {
    /**
     * Grava os objectos na base de dados.
     * @param estudante
     * @return 
     */
      public boolean gravar(Estudante estudante){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.save(estudante);
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
       * Actualiza o objecto na base de dados.
       * @param estudante
       * @return 
       */
    public boolean atualizar(Estudante estudante){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.update(estudante);
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
     * remove o objecto na base dados de uma forma fisica.
     * @param estudante
     * @return 
     */
    public boolean remover(Estudante estudante){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.delete(estudante);
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
     * Consulta o objecto na base de dados.
     * @return a lista dos objectos consultados na base dados;
     */
     public List<Estudante> consular(){
      SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        
         Query c = sec.createQuery("from estudante");
        List<Estudante> list = c.list();
    
            return c.list();
      
    }
     
     
}
