

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import javax.swing.JOptionPane;



public class Frame extends javax.swing.JFrame {

  
    ArbolBinario ab = new ArbolBinario();
    public Frame() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txDato = new javax.swing.JTextField();
        insertar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        limpiar = new javax.swing.JButton();
        preOrden = new javax.swing.JButton();
        inOrden = new javax.swing.JButton();
        postOrden = new javax.swing.JButton();
        nivel = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arbol binarito bonitito ;)");
        setResizable(false);

        jPanel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        txDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDatoActionPerformed(evt);
            }
        });

        insertar.setText("Insertar");
        insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        preOrden.setText("Preorden");
        preOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preOrdenActionPerformed(evt);
            }
        });

        inOrden.setText("Inorden");
        inOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inOrdenActionPerformed(evt);
            }
        });

        postOrden.setText("Postorden");
        postOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postOrdenActionPerformed(evt);
            }
        });

        nivel.setText("Por Nivel");
        nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar Dato");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        borrar.setText("Eliminar dato");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txDato)
                            .addComponent(insertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(preOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(postOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(borrar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(limpiar)
                            .addComponent(preOrden)
                            .addComponent(postOrden))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertar)
                            .addComponent(inOrden)
                            .addComponent(nivel)
                            .addComponent(Buscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(borrar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDatoActionPerformed
        try {
            int dato = Integer.parseInt(txDato.getText());
            txDato.setText("");
            ab.insertar(dato);
            paint(jPanel2.getGraphics());
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, "Error al Insertar el Dato");
        }
    }//GEN-LAST:event_txDatoActionPerformed

    private void insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarActionPerformed
        try {
            int dato = Integer.parseInt(txDato.getText());
            txDato.setText("");
            ab.insertar(dato);
            paint(jPanel2.getGraphics());
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, "Error al Insertar el Dato");
        }
    }//GEN-LAST:event_insertarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        ab = null;
        ab = new ArbolBinario();
        paint(jPanel2.getGraphics());
    }//GEN-LAST:event_limpiarActionPerformed

    private void preOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preOrdenActionPerformed
        LinkedList rec = new LinkedList();
        ab.preorden(ab.getRaiz(), rec);
        String cad = "Recorrido Preorden:\n";
        for (Object rec1 : rec) {
            cad += rec1 + "  ";
        }
        jTextArea1.setText(cad);
    }//GEN-LAST:event_preOrdenActionPerformed

    private void inOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inOrdenActionPerformed
        LinkedList rec = new LinkedList();
        ab.inorden(ab.getRaiz(), rec);
        String cad = "Recorrido Inorden:\n";
        for (Object rec1 : rec) {
            cad += rec1 + "  ";
        }
        jTextArea1.setText(cad);
    }//GEN-LAST:event_inOrdenActionPerformed

    private void postOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postOrdenActionPerformed
        LinkedList rec = new LinkedList();
        ab.postorden(ab.getRaiz(), rec);
        String cad = "Recorrido Postorden:\n";
        for (Object rec1 : rec) {
            cad += rec1 + "  ";
        }
        jTextArea1.setText(cad);
    }//GEN-LAST:event_postOrdenActionPerformed

    private void nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelActionPerformed
        LinkedList rec = new LinkedList();
        ab.porNivel(ab.getRaiz(), rec);
        String cad = "Recorrido Por Nivel:\n";
        for (Object rec1 : rec) {
            cad += rec1 + "  ";
        }
        jTextArea1.setText(cad);
    }//GEN-LAST:event_nivelActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        try {
            int dato = Integer.parseInt(JOptionPane.showInputDialog(this,"Dato a buscar"));
            JOptionPane.showMessageDialog(this,ab.buscar(dato)? "Si Existe el Dato":"No Existe el dato");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this,"Error al buscar el dato");
        }
        
    }//GEN-LAST:event_BuscarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
         try {
            int dato = Integer.parseInt(JOptionPane.showInputDialog(this,"Dato a eliminar"));
            JOptionPane.showMessageDialog(this,ab.borrar(dato) + "Dato eliminado");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this,"Error al buscar el dato");
        }
    }//GEN-LAST:event_borrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton borrar;
    private javax.swing.JButton inOrden;
    private javax.swing.JButton insertar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton nivel;
    private javax.swing.JButton postOrden;
    private javax.swing.JButton preOrden;
    private javax.swing.JTextField txDato;
    // End of variables declaration//GEN-END:variables

private void pintaArbol(Graphics g, Nodo n, int x, int y,int xoff,int yoff,int nivel){
     if (n == null) return;
     g.setColor(Color.red);
     if(n.getIzq()!= null){
         g.drawLine(x, y, x - xoff+(nivel*2), y + yoff);
     }
     if(n.getDer()!= null){
         g.drawLine(x, y, x + xoff-(nivel*2), y + yoff);
     }
     
     g.fillOval(x-10, y-20, 30, 30);
     
     g.setColor(Color.white);
     g.drawString(n.getDato()+"", x , y );
     
     pintaArbol(g, n.getIzq(), (int)(x - xoff), (y + yoff),xoff+nivel*2,yoff,nivel+1);
     pintaArbol(g, n.getDer(), (int)(x + xoff), (y + yoff),xoff-nivel*2,yoff,nivel+1);
     
}

    @Override
    public void paint(Graphics g){
        jPanel2.revalidate();
        super.paint(g);
        int X = (getWidth()/5)*ab.getAltura();
        int X2 = (getWidth()/12);
        int Y = getHeight()/12;
        pintaArbol(jPanel2.getGraphics(), ab.getRaiz(), jPanel2.getWidth()/2, Y, X2, Y,1);
        
    }
    
   
}
