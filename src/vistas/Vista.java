package vistas;

import controladores.ControladorBD;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import modelos.FormaPago;
import modelos.Prestamo;
import modelos.Recibo;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Loren Baucas
 */
public class Vista extends javax.swing.JFrame {

    DefaultTableModel modeloPrestamo, modeloRecibo;
    ControladorBD con;
    List<Prestamo> listaPrestamos;
    List<FormaPago> listaFormaPago;
    
    public Vista() {
        con = new ControladorBD();
        initComponents();
        listaFormaPago = con.getFormasPago();
        listaPrestamos = con.getPrestamos();
        modeloPrestamo = (DefaultTableModel) jTablePrestamos.getModel();
        modeloRecibo = (DefaultTableModel) jTableRecibos.getModel();
        mostrarFormasPago();
        mostrarPrestamos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePrestamos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRecibos = new javax.swing.JTable();
        lTituloRecibos = new javax.swing.JLabel();
        lTituloPrestamos = new javax.swing.JLabel();
        lPrestamo = new javax.swing.JLabel();
        lFecha = new javax.swing.JLabel();
        lImporte = new javax.swing.JLabel();
        tPrestamo = new javax.swing.JTextField();
        lFormaPago = new javax.swing.JLabel();
        cbFormaPago = new javax.swing.JComboBox<>();
        tFecha = new javax.swing.JFormattedTextField();
        tImporte = new javax.swing.JFormattedTextField();
        bAnadir = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bActualizar = new javax.swing.JButton();
        bJSON = new javax.swing.JButton();
        bPagar = new javax.swing.JButton();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LorenzoPracticaR02");
        setResizable(false);

        jTablePrestamos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTablePrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Prestamo", "Fecha", "Importe", "Importe Pagado", "Forma de Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePrestamos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTablePrestamos.getTableHeader().setReorderingAllowed(false);
        jTablePrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePrestamosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePrestamos);
        jTablePrestamos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTablePrestamos.getColumnModel().getColumnCount() > 0) {
            jTablePrestamos.getColumnModel().getColumn(0).setResizable(false);
            jTablePrestamos.getColumnModel().getColumn(1).setResizable(false);
            jTablePrestamos.getColumnModel().getColumn(2).setResizable(false);
            jTablePrestamos.getColumnModel().getColumn(3).setResizable(false);
            jTablePrestamos.getColumnModel().getColumn(4).setResizable(false);
        }

        jTableRecibos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Recibo", "Fecha", "Importe", "Fecha de pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRecibos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableRecibos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableRecibos);
        if (jTableRecibos.getColumnModel().getColumnCount() > 0) {
            jTableRecibos.getColumnModel().getColumn(0).setResizable(false);
            jTableRecibos.getColumnModel().getColumn(1).setResizable(false);
            jTableRecibos.getColumnModel().getColumn(2).setResizable(false);
        }

        lTituloRecibos.setText("RECIBOS");

        lTituloPrestamos.setText("PRESTAMOS");

        lPrestamo.setText("Nº Prestamo");

        lFecha.setText("Fecha");

        lImporte.setText("Importe");

        tPrestamo.setEditable(false);
        tPrestamo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tPrestamo.setEnabled(false);

        lFormaPago.setText("Forma de pago");

        cbFormaPago.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tFecha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        tImporte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tImporte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        bAnadir.setText("Añadir");
        bAnadir.setMaximumSize(new java.awt.Dimension(80, 32));
        bAnadir.setMinimumSize(new java.awt.Dimension(80, 32));
        bAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnadirActionPerformed(evt);
            }
        });

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        bActualizar.setText("Actualizar");
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

        bJSON.setText("Generar JSON");
        bJSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJSONActionPerformed(evt);
            }
        });

        bPagar.setText("Pagar");
        bPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lFormaPago)
                                .addComponent(lImporte)
                                .addComponent(lFecha)
                                .addComponent(lPrestamo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tFecha)
                                .addComponent(cbFormaPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(tImporte))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bJSON, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(bPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lTituloPrestamos)
                        .addGap(251, 251, 251))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lTituloRecibos)
                        .addGap(262, 262, 262))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lTituloPrestamos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lTituloRecibos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bEliminar)
                            .addComponent(bActualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lPrestamo)
                            .addComponent(tPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lFecha)
                            .addComponent(tFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lImporte)
                            .addComponent(tImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lFormaPago)
                            .addComponent(cbFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bPagar)
                        .addGap(14, 14, 14)
                        .addComponent(bJSON)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePrestamosMouseClicked
        if (jTablePrestamos.getSelectedRow() != -1) {
            Prestamo p = (Prestamo) jTablePrestamos.getValueAt(jTablePrestamos.getSelectedRow(), 0);
            mostrarRecibos(p);
            tPrestamo.setText(p.getNPrestamo().toString());
            tFecha.setText(p.getFecha().toString());
            tImporte.setText(p.getImporte().toString());
            cbFormaPago.setSelectedItem((FormaPago)p.getFormaPago());
        }
    }//GEN-LAST:event_jTablePrestamosMouseClicked

    private void bAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnadirActionPerformed
        if (!tFecha.getText().isEmpty() && !tImporte.getText().isEmpty()) {
            BigDecimal id = new BigDecimal(con.getProximoPrestamo(listaPrestamos));
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = new Date();
            try {
                fecha = formatter.parse(tFecha.getText());
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Introduce la fecha en el siguiente formato: yyyy-MM-dd", "Error", JOptionPane.ERROR_MESSAGE);
            }
            BigDecimal importe = new BigDecimal(tImporte.getText().replace(",", "."));
            FormaPago fp = (FormaPago) cbFormaPago.getSelectedItem();
            Prestamo p = new Prestamo(id, fp, fecha, importe, new BigDecimal(0));
            if (con.addPrestamo(p)) {
                listaPrestamos = con.getPrestamos();
                mostrarPrestamos();
                modeloRecibo.setRowCount(0);
            } else {
                JOptionPane.showMessageDialog(this, "Error al añadir el prestamo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Introduce fecha e importe", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bAnadirActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        if (jTablePrestamos.getSelectedRow() != -1) {
            Prestamo p = (Prestamo) jTablePrestamos.getValueAt(jTablePrestamos.getSelectedRow(), 0);
            con.deletePrestamo(p);
            for (Prestamo prestamo : listaPrestamos) {
                if (prestamo.getNPrestamo() == p.getNPrestamo()) {
                    listaPrestamos.remove(prestamo);
                }
            }
            mostrarPrestamos();
            modeloRecibo.setRowCount(0);
        }else{
            JOptionPane.showMessageDialog(this, "Selecciona el prestamo que desea borrar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        if (!tFecha.getText().isEmpty() && !tImporte.getText().isEmpty() && !tPrestamo.getText().isEmpty()) {
            BigDecimal id = new BigDecimal(tPrestamo.getText().replace(",", "."));
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = new Date();
            try {
                fecha = formatter.parse(tFecha.getText());
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Introduce la fecha en el siguiente formato: yyyy-MM-dd", "Error", JOptionPane.ERROR_MESSAGE);
            }
            BigDecimal importe = new BigDecimal(tImporte.getText().replace(",", "."));
            FormaPago fp = (FormaPago) cbFormaPago.getSelectedItem();
            Prestamo p = new Prestamo(id, fp, fecha, importe, new BigDecimal(0));
            if (con.updatePrestamo(p)) {
                listaPrestamos = con.getPrestamos();
                mostrarPrestamos();
                modeloRecibo.setRowCount(0);
            } else {
                JOptionPane.showMessageDialog(this, "Error al modificar el prestamo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Rellena todos los campos para eliminarlo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bActualizarActionPerformed

    private void bPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPagarActionPerformed
        if (jTableRecibos.getSelectedRow() != -1) {
            Recibo r = (Recibo) jTableRecibos.getValueAt(jTableRecibos.getSelectedRow(), 0);
            if (r.getFechaPagado() == null) {
                Date date = new Date(System.currentTimeMillis());
                r.setFechaPagado(date);
                Prestamo p = r.getPrestamo();
                if (!p.getRecibos().isEmpty()) {
                    Iterator i = p.getRecibos().iterator();
                    while (i.hasNext()) {
                        Recibo recibo = (Recibo) i.next();
                        if (recibo.getId() == r.getId()) {
                            p.getRecibos().remove(recibo);
                            p.getRecibos().add(r);
                            BigDecimal importePagado = new BigDecimal(Double.parseDouble(p.getImportePagado().toString()));
                            BigDecimal importe = new BigDecimal(Double.parseDouble(r.getImporte().toString()));
                            importePagado = importePagado.add(importe);
                            p.setImportePagado(importePagado);
                            break;
                        }
                    }
                }
                con.updatePrestamo(p);
                for (Prestamo prestamo : listaPrestamos) {
                    if (prestamo.getNPrestamo() == p.getNPrestamo()) {
                        listaPrestamos.remove(prestamo);
                        listaPrestamos.add(p);
                    }
                }
                mostrarPrestamos();
                mostrarRecibos(p);
            } else {
                JOptionPane.showMessageDialog(this, "Ya estaba pagado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un recibo de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bPagarActionPerformed

    private void bJSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJSONActionPerformed
        try {
            FileWriter fw = new FileWriter(new File("datosRecibos.json"));
            fw.write("[\n");

            int numRecibos = jTableRecibos.getRowCount();

            for (int i = 0; i < numRecibos; i++) {
                String nRecibo = jTableRecibos.getValueAt(i, 0).toString();
                String fecha = jTableRecibos.getValueAt(i, 1).toString();
                String importe = jTableRecibos.getValueAt(i, 2).toString();
                String fechaPagado = "";
                try {
                    fechaPagado = jTableRecibos.getValueAt(i, 3).toString();
                } catch (Exception e) {
                    fechaPagado = "null";
                }

                String nPrestamo = jTablePrestamos.getValueAt(jTablePrestamos.getSelectedRow(), 0).toString();

                String jsonString = String.format("{\"nRecibo\": \"%s\", \"fecha\": \"%s\", \"importe\": \"%s\", \"fechaPagado\": \"%s\", \"nPrestamo\": \"%s\"}",
                    nRecibo, fecha, importe, fechaPagado, nPrestamo);

                if (i < numRecibos - 1) {
                    jsonString += ",";
                }

                jsonString += "\n";
                fw.write(jsonString);
            }

            fw.write("]\n");
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Debe de haber al menos un recibo en la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bJSONActionPerformed

    private void mostrarPrestamos() {
        modeloPrestamo.setRowCount(0);
        for (Prestamo p : listaPrestamos) {
            modeloPrestamo.addRow(new Object[]{p, new SimpleDateFormat("yyyy-MM-dd").format(p.getFecha()), p.getImporte(), p.getImportePagado(), p.getFormaPago().getCodigo()});
        }
    }

    private void mostrarRecibos(Prestamo p) {
        modeloRecibo.setRowCount(0);
        if (!p.getRecibos().isEmpty()) {
            Iterator i = p.getRecibos().iterator();
            while (i.hasNext()) {
                Recibo r = (Recibo) i.next();
                modeloRecibo.addRow(new Object[] {r, new SimpleDateFormat("yyyy-MM-dd").format(r.getFecha()), r.getImporte(), r.getFechaPagado()});
            }
        }
    }

    private void mostrarFormasPago() {
        cbFormaPago.removeAllItems();
        for (FormaPago fp : listaFormaPago) {
            cbFormaPago.addItem(fp);
        }
    }

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bAnadir;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bJSON;
    private javax.swing.JButton bPagar;
    private javax.swing.JComboBox<FormaPago> cbFormaPago;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePrestamos;
    private javax.swing.JTable jTableRecibos;
    private javax.swing.JLabel lFecha;
    private javax.swing.JLabel lFormaPago;
    private javax.swing.JLabel lImporte;
    private javax.swing.JLabel lPrestamo;
    private javax.swing.JLabel lTituloPrestamos;
    private javax.swing.JLabel lTituloRecibos;
    private javax.swing.JFormattedTextField tFecha;
    private javax.swing.JFormattedTextField tImporte;
    private javax.swing.JTextField tPrestamo;
    // End of variables declaration//GEN-END:variables
}
