/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relatorios;

import Controle.ComputadorDAO;
import Modelo.Computador;
import Visao.TelaPrincipal;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class RelatorioComputador extends javax.swing.JFrame {

    /**
     * Creates new form Relatorio_Material
     */
    public RelatorioComputador() {
        initComponents();
    }

    private void gerarComputadorPDF() {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("Computador.pdf"));
            document.open();

            document.add(new Paragraph("                     Relatório dos Computadores!", FontFactory.getFont(FontFactory.TIMES_BOLD, 24, Font.BOLD, BaseColor.BLACK)));

            document.add(new Paragraph("  "));
            document.add(new Paragraph("  "));
            document.add(new Paragraph("Data de emissão:  " + new Date().toString()));
            document.add(new Paragraph("  "));
            document.add(new Paragraph("  "));
            document.add(new Paragraph("  "));

            PdfPTable tabela = new PdfPTable(4);
            PdfPCell celula = new PdfPCell(new Paragraph("Lista de Computadores Cadastrados", FontFactory.getFont(FontFactory.TIMES_BOLD, 18, Font.BOLD, BaseColor.WHITE)));
            celula.setHorizontalAlignment(Element.ALIGN_CENTER);
            celula.setBorder(PdfPCell.NO_BORDER);
            celula.setBackgroundColor(new BaseColor(51, 51, 51));
            celula.setColspan(4);
            tabela.addCell(celula);

            tabela.addCell("Codigo");
            tabela.addCell("Componentes");
            tabela.addCell("Descrição");
            tabela.addCell("Data");

            ComputadorDAO dao = new ComputadorDAO();
            for (Computador c : dao.consular()) {
                  if (c.getEstado().equalsIgnoreCase("Vigor")){
                    tabela.addCell(c.getCodigo());
                    tabela.addCell(c.getComponentes().toString());
                    tabela.addCell(c.getDescricao());
                    tabela.addCell(c.getData().toString());

                }
            }
            document.add(tabela);

            document.close();

        } catch (DocumentException ex) {
            Logger.getLogger(RelatoriosController.class.getName()).log(Level.SEVERE, null, ex);

        } catch (FileNotFoundException ex) {
            System.out.println("aquela falha");
            Logger.getLogger(RelatoriosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Desktop.getDesktop().open(new File("Computador.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(RelatoriosController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void gerarComputadorAvariadoPDF() {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("Computador.pdf"));
            document.open();

            document.add(new Paragraph("                     Relatório dos Computadores!", FontFactory.getFont(FontFactory.TIMES_BOLD, 24, Font.BOLD, BaseColor.BLACK)));

            document.add(new Paragraph("  "));
            document.add(new Paragraph("  "));
            document.add(new Paragraph("Data de emissão:  " + new Date().toString()));
            document.add(new Paragraph("  "));
            document.add(new Paragraph("  "));
            document.add(new Paragraph("  "));

            PdfPTable tabela = new PdfPTable(4);
            PdfPCell celula = new PdfPCell(new Paragraph("Lista de Computadores Cadastrados", FontFactory.getFont(FontFactory.TIMES_BOLD, 18, Font.BOLD, BaseColor.WHITE)));
            celula.setHorizontalAlignment(Element.ALIGN_CENTER);
            celula.setBorder(PdfPCell.NO_BORDER);
            celula.setBackgroundColor(new BaseColor(51, 51, 51));
            celula.setColspan(4);
            tabela.addCell(celula);

            tabela.addCell("Codigo");
            tabela.addCell("Componentes");
            tabela.addCell("Descrição");
            tabela.addCell("Data");

            ComputadorDAO dao = new ComputadorDAO();
            for (Computador c : dao.consular()) {
                  if (c.getEstado().equalsIgnoreCase("Avariado")){
                    tabela.addCell(c.getCodigo());
                    tabela.addCell(c.getComponentes());
                    tabela.addCell(c.getDescricao());
                    tabela.addCell(c.getData().toString());
                }
            }
            document.add(tabela);

            document.close();

        } catch (DocumentException ex) {
            Logger.getLogger(RelatoriosController.class.getName()).log(Level.SEVERE, null, ex);

        } catch (FileNotFoundException ex) {
            System.out.println("aquela falha");
            Logger.getLogger(RelatoriosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Desktop.getDesktop().open(new File("Computador.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(RelatoriosController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
        private void gerarComputadorRemovidosPDF() {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("Computador.pdf"));
            document.open();

            document.add(new Paragraph("                     Relatório dos Computadores!", FontFactory.getFont(FontFactory.TIMES_BOLD, 24, Font.BOLD, BaseColor.BLACK)));

            document.add(new Paragraph("  "));
            document.add(new Paragraph("  "));
            document.add(new Paragraph("Data de emissão:  " + new Date().toString()));
            document.add(new Paragraph("  "));
            document.add(new Paragraph("  "));
            document.add(new Paragraph("  "));

            PdfPTable tabela = new PdfPTable(4);
            PdfPCell celula = new PdfPCell(new Paragraph("Lista de Computadores Cadastrados", FontFactory.getFont(FontFactory.TIMES_BOLD, 18, Font.BOLD, BaseColor.WHITE)));
            celula.setHorizontalAlignment(Element.ALIGN_CENTER);
            celula.setBorder(PdfPCell.NO_BORDER);
            celula.setBackgroundColor(new BaseColor(51, 51, 51));
            celula.setColspan(4);
            tabela.addCell(celula);

            tabela.addCell("Codigo");
            tabela.addCell("Componentes");
            tabela.addCell("Descrição");
            tabela.addCell("Data");

            ComputadorDAO dao = new ComputadorDAO();
            for (Computador c : dao.consular()) {
                  if (c.getEstado().equalsIgnoreCase("Removido")){
                    tabela.addCell(c.getCodigo());
                    tabela.addCell(c.getComponentes());
                    tabela.addCell(c.getDescricao());
                    tabela.addCell(c.getData().toString());
                }
            }
            document.add(tabela);

            document.close();

        } catch (DocumentException ex) {
            Logger.getLogger(RelatoriosController.class.getName()).log(Level.SEVERE, null, ex);

        } catch (FileNotFoundException ex) {
            System.out.println("aquela falha");
            Logger.getLogger(RelatoriosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Desktop.getDesktop().open(new File("Computador.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(RelatoriosController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelDeCima = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JToggleButton();
        painelDeBaixo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbVigor = new javax.swing.JLabel();
        GerarEmVigor = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbAvariados = new javax.swing.JLabel();
        GerarAvariados = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbAbatidos = new javax.swing.JLabel();
        btnGerarRemovidos = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("REQUISIÇÕES");
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        painelPrincipal.setLayout(new java.awt.BorderLayout());

        painelDeCima.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RELATÓRIOS DE COMPUTADORES");
        painelDeCima.add(jLabel1);

        btnVoltar.setBackground(new java.awt.Color(102, 102, 102));
        btnVoltar.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        painelDeCima.add(btnVoltar);

        painelPrincipal.add(painelDeCima, java.awt.BorderLayout.PAGE_START);

        painelDeBaixo.setBackground(new java.awt.Color(255, 255, 255));
        painelDeBaixo.setLayout(new java.awt.GridLayout(3, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbVigor.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        lbVigor.setText("EM VIGOR ");
        jPanel1.add(lbVigor);

        GerarEmVigor.setBackground(new java.awt.Color(102, 102, 102));
        GerarEmVigor.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        GerarEmVigor.setText("Gerar");
        GerarEmVigor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarEmVigorActionPerformed(evt);
            }
        });
        jPanel1.add(GerarEmVigor);

        painelDeBaixo.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbAvariados.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        lbAvariados.setText("AVARIADOS");
        jPanel2.add(lbAvariados);

        GerarAvariados.setBackground(new java.awt.Color(102, 102, 102));
        GerarAvariados.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        GerarAvariados.setText("Gerar");
        GerarAvariados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarAvariadosActionPerformed(evt);
            }
        });
        jPanel2.add(GerarAvariados);

        painelDeBaixo.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lbAbatidos.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        lbAbatidos.setText("Removidos");
        jPanel3.add(lbAbatidos);

        btnGerarRemovidos.setBackground(new java.awt.Color(102, 102, 102));
        btnGerarRemovidos.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        btnGerarRemovidos.setText("Gerar");
        btnGerarRemovidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRemovidosActionPerformed(evt);
            }
        });
        jPanel3.add(btnGerarRemovidos);

        painelDeBaixo.add(jPanel3);

        painelPrincipal.add(painelDeBaixo, java.awt.BorderLayout.CENTER);

        getContentPane().add(painelPrincipal);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GerarEmVigorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarEmVigorActionPerformed
        this.gerarComputadorPDF();
    }//GEN-LAST:event_GerarEmVigorActionPerformed

    private void GerarAvariadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarAvariadosActionPerformed
        this.gerarComputadorAvariadoPDF();
    }//GEN-LAST:event_GerarAvariadosActionPerformed

    private void btnGerarRemovidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRemovidosActionPerformed
       this.gerarComputadorRemovidosPDF();
    }//GEN-LAST:event_btnGerarRemovidosActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaPrincipal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RelatorioComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioComputador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GerarAvariados;
    private javax.swing.JButton GerarEmVigor;
    private javax.swing.JToggleButton btnGerarRemovidos;
    private javax.swing.JToggleButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbAbatidos;
    private javax.swing.JLabel lbAvariados;
    private javax.swing.JLabel lbVigor;
    private javax.swing.JPanel painelDeBaixo;
    private javax.swing.JPanel painelDeCima;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
