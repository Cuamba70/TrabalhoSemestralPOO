/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Docente;
import Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Classe responsavel pelo controle do docente.
 * @author 
 * @version 1.0
 */
public class DocenteDAO {

    /**
     * Grava os objectos na base de dados.
     * @param docente
     * @return
     */
    public boolean gravar(Docente docente) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();

        try {
            sec.save(docente);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally {
            sec.close();
        }
    }

    /**
     * Actualiza o objecto na base de dados.
     *
     * @param docente
     * @return
     */
    public boolean atualizar(Docente docente) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();

        try {
            sec.update(docente);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally {
            sec.close();
        }
    }

    /**
     * remove o objecto na base dados de uma forma fisica.
     *
     * @param docente
     * @return
     */
    public boolean remover(Docente docente) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();
        Transaction tx = sec.beginTransaction();

        try {
            sec.delete(docente);
            tx.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        } finally {
            sec.close();
        }
    }

    /**
     * Consulta o objecto na base de dados.
     *
     * @return a lista dos objectos consultados na base dados;
     */
    public List<Docente> consular() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sec = sf.openSession();

        Query c = sec.createQuery("from docente");
        List<Docente> list = c.list();
     
            return c.list();
        
    }

}
