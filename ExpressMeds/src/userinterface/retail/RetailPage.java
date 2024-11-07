/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface.retail;

import dbconnection.JdbcConnect;
import java.awt.Window;
import javax.swing.SwingUtilities;
import model.enterprise.Enterprise;
import model.enterprise.EnterpriseCatalog;
import userinterface.admin.AdminPage;
import userinterface.admin.Dashboard;
import userinterface.customer.RetailOrdersCatalog;
import userinterface.delivery.RetialSupplierOrder;
import userinterface.hospital.HospitalOrderCatalogR;
import userinterface.login.HomePageMainJF;
import userinterface.retail.ManageEmployee;


/**
 *
 * @author nehajoisher
 */
public class RetailPage extends javax.swing.JFrame {

    /**
     * Creates new form RetailPage1
     */
    JdbcConnect con;
    String retail_name;
     JdbcConnect connect;
    Enterprise entp;
    Enterprise supplier;

    String username;

    EnterpriseCatalog suppliercata;
    public RetailPage() {
        initComponents();
        con = new JdbcConnect();
        connect = new JdbcConnect();
        loadDataIndropdown();
        
        ///dhfhfhfh
        ///asfasf
    }
    void init(String username)
    {
    this.username=username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnsupordercat = new javax.swing.JButton();
        btncustordercata = new javax.swing.JButton();
        btnemployees = new javax.swing.JButton();
        btnplaceorder = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnintcat = new javax.swing.JButton();
        btnempmgmt = new javax.swing.JButton();
        btnManageOrganization = new javax.swing.JButton();
        jcentname = new javax.swing.JComboBox<>();
        btncustordermgmt = new javax.swing.JButton();
        btnhospordermgmt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnlogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(975, 650));
        setPreferredSize(null);

        jSplitPane1.setDividerLocation(250);

        jPanel1.setBackground(new java.awt.Color(219, 247, 252));

        btnsupordercat.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnsupordercat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/retail/fast-delivery.png"))); // NOI18N
        btnsupordercat.setText("Supplier Order Catalog");
        btnsupordercat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsupordercatActionPerformed(evt);
            }
        });

        btncustordercata.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btncustordercata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/retail/checkout.png"))); // NOI18N
        btncustordercata.setText("Customer Order Catalog");
        btncustordercata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustordercataActionPerformed(evt);
            }
        });

        btnemployees.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnemployees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/retail/employee.png"))); // NOI18N
        btnemployees.setText("Employees");
        btnemployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnemployeesActionPerformed(evt);
            }
        });

        btnplaceorder.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnplaceorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/retail/checkout.png"))); // NOI18N
        btnplaceorder.setText("Place an Order");
        btnplaceorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplaceorderActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/supplier/back.png"))); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnintcat.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnintcat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/retail/inventory.png"))); // NOI18N
        btnintcat.setText("Inventory Catalog");
        btnintcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnintcatActionPerformed(evt);
            }
        });

        btnempmgmt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnempmgmt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/retail/employee.png"))); // NOI18N
        btnempmgmt.setText("Employee Management");
        btnempmgmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempmgmtActionPerformed(evt);
            }
        });

        btnManageOrganization.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnManageOrganization.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/supplier/inventory.png"))); // NOI18N
        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });

        jcentname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcentnamejCentnameActionPerformed(evt);
            }
        });

        btncustordermgmt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btncustordermgmt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/retail/checkout.png"))); // NOI18N
        btncustordermgmt.setText("Customer Order Mgmt");
        btncustordermgmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustordermgmtActionPerformed(evt);
            }
        });

        btnhospordermgmt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnhospordermgmt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/retail/checkout.png"))); // NOI18N
        btnhospordermgmt.setText("Hospital Order Mgmt");
        btnhospordermgmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhospordermgmtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnback)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnempmgmt, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnsupordercat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncustordercata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnemployees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnplaceorder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnintcat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageOrganization, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcentname, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncustordermgmt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnhospordermgmt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcentname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnManageOrganization)
                .addGap(18, 18, 18)
                .addComponent(btnintcat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsupordercat)
                .addGap(18, 18, 18)
                .addComponent(btnplaceorder)
                .addGap(18, 18, 18)
                .addComponent(btncustordercata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncustordermgmt)
                .addGap(13, 13, 13)
                .addComponent(btnhospordermgmt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnemployees)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnempmgmt)
                .addGap(95, 95, 95))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(219, 247, 252));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(219, 247, 252));

        btnlogout.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome Retail Admin");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Click any of the Features");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnintcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnintcatActionPerformed
        // TODO add your handling code here:
        RetailInventoryCatalog retint = new RetailInventoryCatalog(entp);
        jSplitPane1.setRightComponent(retint);
                
    }//GEN-LAST:event_btnintcatActionPerformed

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed
        // TODO add your handling code here:

        ManageRetOrg mgorg = new ManageRetOrg(retail_name);
        jSplitPane1.setRightComponent(mgorg);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void jcentnamejCentnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcentnamejCentnameActionPerformed
        // TODO add your handling code here:
        retail_name = jcentname.getSelectedItem().toString();
        entp =loadentname (retail_name);
        jSplitPane1.setRightComponent(null);
    }//GEN-LAST:event_jcentnamejCentnameActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
        
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnplaceorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplaceorderActionPerformed
        // TODO add your handling code here:
        RetialSupplierOrder mgorg = new RetialSupplierOrder(entp,username);
        jSplitPane1.setRightComponent(mgorg);
    }//GEN-LAST:event_btnplaceorderActionPerformed


    private void btnemployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnemployeesActionPerformed
        // TODO add your handling code here:
        EmployeeRegistration empRegister = new EmployeeRegistration();
        jSplitPane1.setRightComponent(empRegister);
        
    }//GEN-LAST:event_btnemployeesActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        
        dispose();
        HomePageMainJF home = new HomePageMainJF();
        home.setVisible(true);
        
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnsupordercatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsupordercatActionPerformed
        // TODO add your handling code here:
        SupplierOrderCatalogR mgorg = new SupplierOrderCatalogR(entp,username);
        jSplitPane1.setRightComponent(mgorg);
                
    }//GEN-LAST:event_btnsupordercatActionPerformed

    private void btnempmgmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempmgmtActionPerformed
        // TODO add your handling code here:
        ManageEmployee manageEmployee=new ManageEmployee(entp);
         jSplitPane1.setRightComponent(manageEmployee);
    }//GEN-LAST:event_btnempmgmtActionPerformed

    private void btncustordercataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustordercataActionPerformed
        // TODO add your handling code here:
        RetailOrdersCatalog manageEmployee=new RetailOrdersCatalog(entp,username);
         jSplitPane1.setRightComponent(manageEmployee);
    }//GEN-LAST:event_btncustordercataActionPerformed

    private void btncustordermgmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustordermgmtActionPerformed
        // TODO add your handling code here:
        RetailOrderMgmt  manageEmployee=new RetailOrderMgmt(entp,username);
         jSplitPane1.setRightComponent(manageEmployee);
    }//GEN-LAST:event_btncustordermgmtActionPerformed

    private void btnhospordermgmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhospordermgmtActionPerformed
        // TODO add your handling code here:
        HospitalOrderMgmt  manageEmployee=new HospitalOrderMgmt(entp,username);
         jSplitPane1.setRightComponent(manageEmployee);
    }//GEN-LAST:event_btnhospordermgmtActionPerformed


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
            java.util.logging.Logger.getLogger(RetailPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RetailPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RetailPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RetailPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetailPage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncustordercata;
    private javax.swing.JButton btncustordermgmt;
    private javax.swing.JButton btnemployees;
    private javax.swing.JButton btnempmgmt;
    private javax.swing.JButton btnhospordermgmt;
    private javax.swing.JButton btnintcat;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnplaceorder;
    private javax.swing.JButton btnsupordercat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JComboBox<String> jcentname;
    // End of variables declaration//GEN-END:variables

    public void loadDataIndropdown() {

        try {
            con.connect();
            // Prepare Statement

            con.pet = con.con.prepareStatement("Select e.name from enterprise e where e.ent_type='Retails'");
            con.myRs = con.pet.executeQuery();

            while (con.myRs.next()) {
                jcentname.addItem(con.myRs.getString("name"));
            }

        } catch (Exception et) {
            System.out.println(et.toString());

        }
    }
    
        Enterprise loadentname(String name){
    //String ent_type =jCentname.getSelectedItem().toString();
    //String s;
    Enterprise t;
    try{
    connect.connect();
            // Prepare Statement
               
            connect.pet = connect.con.prepareStatement("Select * from enterprise e where e.ent_type='Retails' and name= ? ");
           connect.pet.setString(1, name);
           
            connect.myRs = connect.pet.executeQuery();
            if (connect.myRs.next()) {
                //jcentname.addItem(connect.myRs.getString("name"));
                t = new Enterprise(connect.myRs.getInt("ent_id"), connect.myRs.getString("ent_type"),
                        connect.myRs.getString("name"), connect.myRs.getString("email"), connect.myRs.getInt("add_id"));
                return t;
            }
            
            
    }
     catch (Exception et) {
            System.out.println(et.toString());
            return new Enterprise();
        }
    return new Enterprise();
}

}