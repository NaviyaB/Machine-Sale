/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinesale;

import connection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Naviya
 */
public class MachineSalePanel extends javax.swing.JPanel {

    /**
     * Creates new form MachineSale
     */
    
    public MachineSalePanel() {
        initComponents();
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        name = new java.awt.TextField();
        address = new java.awt.TextField();
        phone = new java.awt.TextField();
        warrenty = new java.awt.TextField();
        machine = new java.awt.TextField();
        serial = new java.awt.TextField();
        insertGen = new javax.swing.JButton();
        day = new com.toedter.calendar.JCalendar();
        price = new java.awt.TextField();
        InvoiceId = new java.awt.Label();
        invoiceId = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        model = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setRequestFocusEnabled(false);

        label1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        label1.setText("Customer Name");

        label2.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        label2.setText("Address");

        label3.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        label3.setText("Phone Number");

        label4.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        label4.setText("Warrenty Period");

        label5.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        label5.setText("Date");

        label6.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        label6.setText("Machine Number");

        label7.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        label7.setText("Serial Number");

        label8.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        label8.setText("Model");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        insertGen.setBackground(new java.awt.Color(255, 255, 255));
        insertGen.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        insertGen.setText("Insert & Generate Invoice");
        insertGen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertGenMouseClicked(evt);
            }
        });
        insertGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertGenActionPerformed(evt);
            }
        });

        InvoiceId.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        InvoiceId.setText("Invoice ID");

        invoiceId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceIdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel1.setText("Price");

        model.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toshiba", "RICOH" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InvoiceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(invoiceId, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(day, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                                .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(phone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(warrenty, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(10, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(serial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                        .addComponent(machine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(insertGen, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoiceId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InvoiceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(warrenty, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(machine, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(serial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(insertGen, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    
    
    private void invoiceIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoiceIdActionPerformed

    private void insertGenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertGenMouseClicked
        // TODO add your handling code here:
        SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd");     
        
        String in = invoiceId.getText();
        String na = name.getText();
        String  ad = address.getText();
        String  ph =phone.getText();
        String  wa = warrenty.getText();
        String  da = sdf.format(day.getDate()).toString();
        String  ma = machine.getText();
        String  se = serial.getText();
        String  mo = (String) model.getSelectedItem();
        String  pr = price.getText();
        
        String addCustomerQuery = "INSERT INTO customer_details VALUES(?,?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        
        //delete when click
        if(se.equals(mo)){
            
            
              try{
          DefaultTableModel Model = (DefaultTableModel) jTable1.getModel(); 
        try{
        int SelectedRowIndex = jTable1.getSelectedRow();
        Model.removeRow(SelectedRowIndex);
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        String invoiceiD = serial.getText();
        
        
        
         //String delete = "DELETE FROM  customer_details WHERE InvoiceID = ?";
         String delete = "DELETE FROM  machinemg WHERE machineid = ?";
            
            PreparedStatement ps = DBConnection.getDBconnection().prepareStatement(delete);
            
            ps.setString(1,invoiceiD);
            
            ps.executeUpdate();
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateDeletePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeletePanel.class.getName()).log(Level.SEVERE, null, ex);
            
        }
              
        }
          
        try {
            
            PreparedStatement ps = DBConnection.getDBconnection().prepareStatement(addCustomerQuery);
            ps.setString(1, in);
            ps.setString(2, na);
            ps.setString(3, ad);
            ps.setString(4, ph);
            ps.setString(5, wa);
            ps.setString(6, da);
            ps.setString(7, ma);
            ps.setString(8, se);
            ps.setString(9, mo);
            ps.setString(10, pr);
            
            ps.executeUpdate();
            
             JOptionPane.showMessageDialog(null, "Customer added successfully!",
                    "Confirmation Message", JOptionPane.PLAIN_MESSAGE);
                    
            ps.executeUpdate();
        } catch (Exception e) {
           
            e.printStackTrace();
           
        }
    
        if(na.isEmpty() || ( na == "")){
            JOptionPane.showMessageDialog(null,"Enter Name !");
        }
        
        if(ad.isEmpty() ||( ad == "")){
            JOptionPane.showMessageDialog(null,"Enter Address !");
        }
         if(ph.isEmpty() ||( ph == "")){
            JOptionPane.showMessageDialog(null,"Enter Phone Number !");
        }
         if (ph.length() > 10){
         JOptionPane.showMessageDialog(null,"Check Phone Number");
         }
         
          if(wa.isEmpty() ||( wa == "")){
            JOptionPane.showMessageDialog(null,"Enter Warrenty Period !");
        }
           if(da.toString().isEmpty() ||( da.toString() == "")){
            JOptionPane.showMessageDialog(null,"Enter Date !");
        }
            if(ma.isEmpty() ||( ma == "")){
            JOptionPane.showMessageDialog(null,"Enter Machine Number !");
        }
             if(se.isEmpty() ||( se == "")){
            JOptionPane.showMessageDialog(null,"Enter Serial Number !");
        }
              if(mo.isEmpty() ||( mo == "")){
            JOptionPane.showMessageDialog(null,"Enter Machine Model !");
        }
               if(pr.isEmpty() ||( pr == "")){
            JOptionPane.showMessageDialog(null,"Enter Price !");
        }
                     if(na.isEmpty() || ( na == "") && ph.isEmpty() ||( ph == "") && ad.isEmpty() ||( ad == "") && wa.isEmpty() ||( wa == "") && da.toString().isEmpty() ||( da.toString() == "") &&  ma.isEmpty() ||( ma == "") && se.isEmpty() ||( se == "")  && mo.isEmpty() ||( mo == "")  &&  pr.isEmpty() ||( pr == "")){
                     }else{
                     InvoiceFrame invoice = new InvoiceFrame();
                     invoice.setVisible(true);
                     }
    }//GEN-LAST:event_insertGenMouseClicked

    private void insertGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertGenActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_insertGenActionPerformed

               

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label InvoiceId;
    private java.awt.TextField address;
    private com.toedter.calendar.JCalendar day;
    private javax.swing.JButton insertGen;
    private java.awt.TextField invoiceId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.TextField machine;
    private javax.swing.JComboBox<String> model;
    private java.awt.TextField name;
    private java.awt.TextField phone;
    private java.awt.TextField price;
    private java.awt.TextField serial;
    private java.awt.TextField warrenty;
    // End of variables declaration//GEN-END:variables
}