/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.RequisitarMaterial;
import Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Classe responsavel pelo controle dos materias requisitados
 * e a requisitar.
 * @author 
 * @version 1.0
 */
public class RequisitarMaterialDAO {
    /**
     * Grava o objectos na base de dados.
     * @param requisitarMaterial
     * @return 
     */
         public boolean gravar(RequisitarMaterial requisitarMaterial){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.save(requisitarMaterial);
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
     * @param requisitarMaterial
     * @return 
     */ 
    public boolean atualizar(RequisitarMaterial requisitarMaterial){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.update(requisitarMaterial);
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
     * @param requisitarMaterial
     * @return 
     */
    public boolean remover(RequisitarMaterial requisitarMaterial){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.delete(requisitarMaterial);
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
     public List<RequisitarMaterial> consultar(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        
         Query c = sec.createQuery("from requisitarmaterial");
        List<RequisitarMaterial> list = c.list();
   
            return c.list();  
    }
    
}
