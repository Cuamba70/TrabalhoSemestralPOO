/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Computador;
import Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Classe responsavel pelo controle do computador.
 * @author 
 * @version 1.0
 */
public class ComputadorDAO {
    /**
     * Grava os objectos na base de dados.
     * @param computador computador
     * @return computador gravado
     */
    public boolean gravar(Computador computador){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.save(computador);
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
     * @param computador computador
     * @return computador actualizado
     */
    public boolean atualizar(Computador computador){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.update(computador);
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
     * @param computador
     * @return 
     */
    public boolean remover(Computador computador){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();
        
        try {
            sec.delete(computador);
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
     public List<Computador> consular(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        
         Query c = sec.createQuery("from computador");
        List<Computador> list = c.list();
     
            return c.list();
    }
    
}
