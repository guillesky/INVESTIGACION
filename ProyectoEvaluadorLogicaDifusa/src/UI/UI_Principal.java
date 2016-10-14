
package UI;

import java.awt.Dimension;

import java.beans.PropertyVetoException;

import modelo.Modelo;


/**
 *
 * @author leonel
 */
public class UI_Principal extends javax.swing.JFrame
{
    Modelo modelo;

    /** Creates new form UI_Principal */
    public UI_Principal()
    {
        initComponents();
        modelo = new Modelo();
        
        this.setSize(UI_Dimensiones.ANCHO,UI_Dimensiones.ALTO);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents()//GEN-BEGIN:initComponents
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel_ppal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Asignaturas = new javax.swing.JMenu();
        jMenuItem_ABM_Asignatuas = new javax.swing.JMenuItem();
        JM_Cohortes = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jM_Evaluaciones = new javax.swing.JMenu();
        jMenuitem_alta_evaluacion = new javax.swing.JMenuItem();
        jMenuitem_actualizacion_evaluaciones = new javax.swing.JMenuItem();
        jMenuItem_borrar_evaluacion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.textInactiveText);
        setMinimumSize(new java.awt.Dimension(1100, 850));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1100, 850));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1100, 850));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1100, 850));

        jPanel_ppal.setMaximumSize(new java.awt.Dimension(1100, 850));
        jPanel_ppal.setMinimumSize(new java.awt.Dimension(1100, 850));
        jPanel_ppal.setPreferredSize(new java.awt.Dimension(1100, 850));

        javax.swing.GroupLayout jPanel_ppalLayout = new javax.swing.GroupLayout(jPanel_ppal);
        jPanel_ppal.setLayout(jPanel_ppalLayout);
        jPanel_ppalLayout.setHorizontalGroup(
            jPanel_ppalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jPanel_ppalLayout.setVerticalGroup(
            jPanel_ppalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel_ppal);

        jMenuBar1.setMaximumSize(new java.awt.Dimension(1100, 770));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(1100, 770));

        jMenu_Asignaturas.setText("Asignaturas");

        jMenuItem_ABM_Asignatuas.setText("ABM");
        jMenuItem_ABM_Asignatuas.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem_ABM_AsignatuasActionPerformed(evt);
            }
        });
        jMenu_Asignaturas.add(jMenuItem_ABM_Asignatuas);

        jMenuBar1.add(jMenu_Asignaturas);

        JM_Cohortes.setText("Alumnos");

        jMenuItem2.setText("ABM");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem2ActionPerformed(evt);
            }
        });
        JM_Cohortes.add(jMenuItem2);

        jMenuBar1.add(JM_Cohortes);

        jMenu3.setText("Cursadas");

        jMenuItem3.setText("Altas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Consultas y Bajas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Parciales");
        jMenu1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Altas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jM_Evaluaciones.setText("Evaluaciones");

        jMenuitem_alta_evaluacion.setText("Alta Evaluación");
        jMenuitem_alta_evaluacion.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuitem_alta_evaluacionActionPerformed(evt);
            }
        });
        jM_Evaluaciones.add(jMenuitem_alta_evaluacion);

        jMenuitem_actualizacion_evaluaciones.setText("Actualización de Evaluaciones");
        jMenuitem_actualizacion_evaluaciones.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuitem_actualizacion_evaluacionesActionPerformed(evt);
            }
        });
        jM_Evaluaciones.add(jMenuitem_actualizacion_evaluaciones);

        jMenuItem_borrar_evaluacion.setText("Borrar Evaluación");
        jMenuItem_borrar_evaluacion.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem_borrar_evaluacionActionPerformed(evt);
            }
        });
        jM_Evaluaciones.add(jMenuItem_borrar_evaluacion);

        jMenuBar1.add(jM_Evaluaciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }//GEN-END:initComponents

    private void jMenuitem_alta_evaluacionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuitem_alta_evaluacionActionPerformed
    {//GEN-HEADEREND:event_jMenuitem_alta_evaluacionActionPerformed
        // TODO add your handling code here:
        UI_Alta_Eval ui_Alta_Evaluacion = new UI_Alta_Eval(modelo);
        this.jPanel_ppal.add(ui_Alta_Evaluacion);
        ui_Alta_Evaluacion.setVisible(true);
        try
        {
            ui_Alta_Evaluacion.setMaximum(true);
        }
        catch (PropertyVetoException e)
        {
        }
    }//GEN-LAST:event_jMenuitem_alta_evaluacionActionPerformed

    private void jMenuitem_actualizacion_evaluacionesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuitem_actualizacion_evaluacionesActionPerformed
    {//GEN-HEADEREND:event_jMenuitem_actualizacion_evaluacionesActionPerformed
        // TODO add your handling code here:
        UI_Correccion ui_Correccion = new UI_Correccion(modelo);
        this.jPanel_ppal.add(ui_Correccion);
        ui_Correccion.setVisible(true);
        try
        {
            ui_Correccion.setMaximum(true);
        }
        catch (PropertyVetoException e)
        {
        }
    }//GEN-LAST:event_jMenuitem_actualizacion_evaluacionesActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        // TODO add your handling code here:

        UI_Alta_Alumno ui_al = new UI_Alta_Alumno(modelo);
        this.jPanel_ppal.add(ui_al);
        ui_al.setVisible(true);
        try
        {
            ui_al.setMaximum(true);
        }
        catch (PropertyVetoException e)
        {
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        UI_Cursada_Altas ui_cur = new UI_Cursada_Altas(modelo);
        this.jPanel_ppal.add(ui_cur);
        ui_cur.setVisible(true);
        try
        {
            ui_cur.setMaximum(true);
        }
        catch (PropertyVetoException e)
        {
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        UI_Cursada_BM ui_curbm = new UI_Cursada_BM(modelo);
        this.jPanel_ppal.add(ui_curbm);
        ui_curbm.setVisible(true);
        try
        {
            ui_curbm.setMaximum(true);
        }
        catch (PropertyVetoException e)
        {
        }


    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem_borrar_evaluacionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem_borrar_evaluacionActionPerformed
    {//GEN-HEADEREND:event_jMenuItem_borrar_evaluacionActionPerformed
        // TODO add your handling code here:
        UI_BM_Eval ui_bm_eval = new UI_BM_Eval(modelo);
        this.jPanel_ppal.add(ui_bm_eval);
        ui_bm_eval.setVisible(true);
        try
        {
            ui_bm_eval.setMaximum(true);
        }
        catch (PropertyVetoException e)
        {
        }
    }//GEN-LAST:event_jMenuItem_borrar_evaluacionActionPerformed

    private void jMenuItem_ABM_AsignatuasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem_ABM_AsignatuasActionPerformed
    {//GEN-HEADEREND:event_jMenuItem_ABM_AsignatuasActionPerformed
        // TODO add your handling code here:
        lanzar_UI_Asignaturas();
    }//GEN-LAST:event_jMenuItem_ABM_AsignatuasActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenu1ActionPerformed
    {//GEN-HEADEREND:event_jMenu1ActionPerformed
       
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem1ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem1ActionPerformed
        System.out.println("hola");
        UI_Parcial ui_par = new UI_Parcial(modelo);
        this.jPanel_ppal.add(ui_par);
        ui_par.setVisible(true);
        try
        {
            ui_par.setMaximum(true);
        }
        catch (PropertyVetoException e)
        {
        }// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(UI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                                                                                 ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(UI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                                                                                 ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(UI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                                                                                 ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(UI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                                                                                 ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new UI_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JM_Cohortes;
    private javax.swing.JMenu jM_Evaluaciones;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem_ABM_Asignatuas;
    private javax.swing.JMenuItem jMenuItem_borrar_evaluacion;
    private javax.swing.JMenu jMenu_Asignaturas;
    private javax.swing.JMenuItem jMenuitem_actualizacion_evaluaciones;
    private javax.swing.JMenuItem jMenuitem_alta_evaluacion;
    private javax.swing.JPanel jPanel_ppal;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


    public void lanzar_UI_Asignaturas()
    {
        UI_Asignatura ui_Asignatura = new UI_Asignatura(modelo);
        this.jPanel_ppal.add(ui_Asignatura);
        ui_Asignatura.setVisible(true);


        /* try
        {
            ui_Asignatura.setMaximum(true);
        }
        catch (PropertyVetoException e)
        {
        } */
        ui_Asignatura.setPreferredSize(new Dimension(UI_Dimensiones.ANCHO_INTERNO,UI_Dimensiones.ALTO_INTERNO));
        ui_Asignatura.setSize(UI_Dimensiones.ANCHO_INTERNO,UI_Dimensiones.ALTO_INTERNO);


    }
}
