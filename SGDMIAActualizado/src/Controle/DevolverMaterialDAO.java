/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.DevolverMaterial;
import Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Classe responsavel pelo controle dos materias devolvidos
 * @author
 * @version 1.0
 */
public class DevolverMaterialDAO {
    /**
     * Grava o objectos na base de dados.
     * @param devolverMaterial
     * @return 
     */
         public boolean gravar(DevolverMaterial devolverMaterial){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.save(devolverMaterial);
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
     * @param devolverMaterial
     * @return 
     */ 
    public boolean atualizar(DevolverMaterial devolverMaterial){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.update(devolverMaterial);
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
     * remove os objectos na base de dados.
     * @param devolverMaterial
     * @return 
     */
    public boolean remover(DevolverMaterial devolverMaterial){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.delete(devolverMaterial);
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
     public List<DevolverMaterial> consultar(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        
         Query c = sec.createQuery("from devolvermaterial");
        List<DevolverMaterial> list = c.list();
      
            return c.list();
      
    }
    
}
