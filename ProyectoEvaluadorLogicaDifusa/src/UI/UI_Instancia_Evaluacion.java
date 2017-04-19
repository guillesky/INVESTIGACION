
package UI;

import java.sql.Date;
import java.sql.SQLException;

import java.text.ParseException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import modelo.Alumno;
import modelo.Asignatura;
import modelo.Cursada;
import modelo.Instancia_Evaluacion;
import modelo.Modelo;
import modelo.Parcial;

import util.Fecha;

/**
 *
 * @author Raquel
 */
public class UI_Instancia_Evaluacion extends javax.swing.JInternalFrame
{
    /** Creates new form UI_Instancia_Evaluacion */
    private Modelo modelo;
    private DefaultListModel listModel_cursadas = new DefaultListModel();
    private DefaultListModel listModel_asignaturas = new DefaultListModel();
    private DefaultListModel listModel_parciales = new DefaultListModel();
    private DefaultListModel listModel_alumnos_en_cursada = new DefaultListModel();
    private DefaultListModel listModel_alumnos_evaluados = new DefaultListModel();
    private Asignatura asignatura_en_uso = null;
    private Cursada cursada_en_uso = null;
    private Parcial parcial_en_uso;


    public UI_Instancia_Evaluacion(Modelo m)
    {
        this.modelo = m;
        initComponents();
        this.jList_asignaturas.setModel(listModel_asignaturas);
        this.jList_cursadas.setModel(listModel_cursadas);
        this.jList_parciales.setModel(listModel_parciales);
        this.jList_Alumnos_Cursada.setModel(listModel_alumnos_en_cursada);
        this.jList_al_evaluados.setModel(listModel_alumnos_evaluados);


        this.actualizar_jList_asignaturas();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents()//GEN-BEGIN:initComponents
    {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_asignaturas = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList_cursadas = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_parciales = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList_Alumnos_Cursada = new javax.swing.JList();
        jButton_Agrega = new javax.swing.JButton();
        jButton_Quita = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList_al_evaluados = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jButtonGuardar = new javax.swing.JButton();
        jText_Parcial = new javax.swing.JTextField();
        jText_Descripcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jText_Fecha = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Alta de Evaluciones");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione Asignatura, Cursada y Parcial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jList_asignaturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Asignaturas"));
        jList_asignaturas.setModel(new javax.swing.AbstractListModel()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList_asignaturas.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jList_asignaturasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList_asignaturas);

        jPanel1.add(jScrollPane2);

        jList_cursadas.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Cursadas"));
        jList_cursadas.setModel(new javax.swing.AbstractListModel()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList_cursadas.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jList_cursadasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList_cursadas);

        jPanel1.add(jScrollPane3);

        jList_parciales.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Parciales"));
        jList_parciales.setModel(new javax.swing.AbstractListModel()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList_parciales.setFocusable(false);
        jList_parciales.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jList_parcialesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList_parciales);

        jPanel1.add(jScrollPane1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Alumnos en cursada"));

        jScrollPane4.setViewportView(jList_Alumnos_Cursada);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jButton_Agrega.setText(">");
        jButton_Agrega.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_AgregaActionPerformed(evt);
            }
        });

        jButton_Quita.setText("<");
        jButton_Quita.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_QuitaActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Alumnos evaluados"));

        jScrollPane6.setViewportView(jList_al_evaluados);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva Instancia de Evaluación"));

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jText_Parcial.setEditable(false);
        jText_Parcial.setFocusable(false);

        jText_Descripcion.setEnabled(false);

        jLabel1.setText("Parcial:");

        jLabel2.setText("Descripción:");

        jLabel3.setText("Fecha:");

        jText_Fecha.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_Fecha)
                            .addComponent(jText_Descripcion)
                            .addComponent(jText_Parcial, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_Parcial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jText_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jText_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Quita)
                    .addComponent(jButton_Agrega))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jButton_Agrega)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Quita)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }//GEN-END:initComponents

    private void jList_asignaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_asignaturasMouseClicked
        // TODO add your handling code here:
        if (this.jList_asignaturas.getSelectedValue() != null)
        {
            this.asignatura_en_uso = (Asignatura) jList_asignaturas.getSelectedValue();
            this.cursada_en_uso = null;
            this.actualizar_jList_cursadas();
            this.parcial_en_uso = null;
            this.actualizar_jList_parciales();
            this.actualizar_jList_alumnos_cursadas();
            this.limpiaTextos();
        }
        this.verificaEnabled();
    }//GEN-LAST:event_jList_asignaturasMouseClicked

    private void jList_cursadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_cursadasMouseClicked
        // TODO add your handling code here:
        if (this.jList_cursadas.getSelectedValue() != null)
        {
            this.cursada_en_uso = (Cursada) this.jList_cursadas.getSelectedValue();
            this.parcial_en_uso = null;
            this.actualizar_jList_parciales();
            this.actualizar_jList_alumnos_cursadas();
            this.limpiaTextos();
        }
        this.verificaEnabled();
    }//GEN-LAST:event_jList_cursadasMouseClicked

    private void jList_parcialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_parcialesMouseClicked
        if (this.jList_parciales.getSelectedValue() != null)
        {
            this.parcial_en_uso = (Parcial) this.jList_parciales.getSelectedValue();
            this.jText_Parcial.setText(this.parcial_en_uso.toString());
            this.actualizar_jList_alumnos_cursadas();
        }
        this.verificaEnabled(); //jList_asignaturasMouseClicked();

    }//GEN-LAST:event_jList_parcialesMouseClicked

    private void jButton_AgregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregaActionPerformed
        // TODO add your handling code here:
        List<Alumno> l = this.jList_Alumnos_Cursada.getSelectedValuesList();
        for (int i = 0; i < l.size(); i++)
        {
            this.listModel_alumnos_evaluados.addElement(l.get(i));
            this.listModel_alumnos_en_cursada.removeElement(l.get(i));
        }
        this.verificaEnabled();
    }//GEN-LAST:event_jButton_AgregaActionPerformed

    private void jButton_QuitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_QuitaActionPerformed
        // TODO add your handling code here:
        List<Alumno> l = this.jList_al_evaluados.getSelectedValuesList();
        for (int i = 0; i < l.size(); i++)
        {
            this.listModel_alumnos_en_cursada.addElement(l.get(i));
            this.listModel_alumnos_evaluados.removeElement(l.get(i));
        }
        this.verificaEnabled();
    }//GEN-LAST:event_jButton_QuitaActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonGuardarActionPerformed
    {//GEN-HEADEREND:event_jButtonGuardarActionPerformed
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        try
        {
            Date fecha = Fecha.str2Date(this.jText_Fecha.getText());
            for (int i = 0; i < this.listModel_alumnos_evaluados.size(); i++)
            {
                alumnos.add((Alumno) this.listModel_alumnos_evaluados.get(i));
            }  
            Instancia_Evaluacion instancia_evaluacion=new Instancia_Evaluacion(this.parcial_en_uso.getArbol_podado(),fecha,this.jText_Descripcion.getText(),alumnos);
            this.modelo.getModelo_abm_instanciaEvaluacion().agregaInstanciaEvaluacion(this.parcial_en_uso,instancia_evaluacion);
            this.modelo.recuperarInstanciasEvaluaciones(this.parcial_en_uso);
        } catch (ParseException e)
        {
            JOptionPane.showMessageDialog(this, "Fecha erronea");
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_jButtonGuardarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButton_Agrega;
    private javax.swing.JButton jButton_Quita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList_Alumnos_Cursada;
    private javax.swing.JList jList_al_evaluados;
    private javax.swing.JList jList_asignaturas;
    private javax.swing.JList jList_cursadas;
    private javax.swing.JList jList_parciales;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jText_Descripcion;
    private javax.swing.JTextField jText_Fecha;
    private javax.swing.JTextField jText_Parcial;
    // End of variables declaration//GEN-END:variables
    private void actualizar_jList_cursadas()
    {
        this.listModel_cursadas.clear();
        if (this.asignatura_en_uso != null)
        {
            ArrayList<Cursada> cursadas_actuales = this.asignatura_en_uso.getCursadas();
            for (int i = 0; i < cursadas_actuales.size(); i++)
            {
                this.listModel_cursadas.addElement(cursadas_actuales.get(i));
            }
        }
    }

    private void verificaEnabled()
    {
        boolean habilitar =
            this.asignatura_en_uso != null && this.cursada_en_uso != null && this.parcial_en_uso != null;
        this.jText_Descripcion.setEnabled(habilitar);
        this.jText_Fecha.setEnabled(habilitar);
        
        this.jList_al_evaluados.setEnabled(habilitar);
        this.jList_Alumnos_Cursada.setEnabled(habilitar);
        this.jButton_Agrega.setEnabled(habilitar);
        this.jButton_Quita.setEnabled(habilitar); 
        this.jButtonGuardar.setEnabled(habilitar && !this.listModel_alumnos_evaluados.isEmpty());
        
        
        
       

    }

    private void actualizar_jList_parciales()
    {
        this.listModel_parciales.clear();
        if (this.cursada_en_uso != null)
        {
            ArrayList<Parcial> parciales_actuales = this.cursada_en_uso.getParciales();
            for (int i = 0; i < parciales_actuales.size(); i++)
            {
                this.listModel_parciales.addElement(parciales_actuales.get(i));
            }
        }
    }

    private void actualizar_jList_asignaturas()
    {
        listModel_asignaturas.clear();
        Iterator iterator_asignaturas = modelo.getAsignaturas().values().iterator();
        //Recorrer el contenido del Iterator
        while (iterator_asignaturas.hasNext())
        {
            Asignatura as = (Asignatura) iterator_asignaturas.next();
            listModel_asignaturas.addElement(as);
        }
    }

    private void actualizar_jList_alumnos_cursadas()
    {
        this.listModel_alumnos_en_cursada.clear();
        if (this.cursada_en_uso != null)
        {
            ArrayList<Alumno> alumnos_cursada = this.cursada_en_uso.getAlumnos();
            for (int i = 0; i < alumnos_cursada.size(); i++)
            {
                this.listModel_alumnos_en_cursada.addElement(alumnos_cursada.get(i));
            }
        }
        this.listModel_alumnos_evaluados.clear();
    }
    private void limpiaTextos()
    {
            this.jText_Parcial.setText("");
            this.jText_Fecha.setText("");
            this.jText_Descripcion.setText("");
            }
}
