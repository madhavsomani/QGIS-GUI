import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madhav
 */
public class main extends javax.swing.JFrame {

    
    private final String url = "jdbc:postgresql://localhost/postgresqgis";
    private final String user = "postgres";
    private final String password = "madhav";
    public String[] buildingString = {"GardenClub", "MapleSquare", "Richlynn_Apt", "Brazos House", "Arlington Hall","Lipscomb Hall","BSM","Tric","Nedderman Hall"};
    Connection conn = null;

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
    }
    
    public main() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton4.setText("Execute");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Execute");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Execute");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Query 1:");

        jLabel4.setText("Choose the Building Name");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MapleSquare", "Tric", "BSM", "Richlynn_Apt", "GardenClub", "Brazos House", "Thermal Plant", "UTA Planetarium", "Health Center", "College Hall", "Arlington Hall", "University College", "Lipscomb Hall", "Woolf Hall", "GeoScience Building", "Science Laboratory", "Engineering Research Building", "Nedderman Hall", "Texas hall", "Davis Hall", "Nanofab Building", "Campus Center", "Trinity House", "Maverick Activity Center", "A_Meadow_Run5", "A_Swift_Center", "A_Meadow_Run3", "A_Meadow_Run4", "A_Meadow_Run2", "A_Meadow_Run1", "A_Meadow_Run_Post_Box_1", "MEADOW_RUN_A", "MEADOW_RUN_B", "MEADOW_RUN_C", "MEADOW_RUN_D", "ARBOR_OAKS_A", "ARBOR_OAKS_B", "ARBOR_OAKS_C", "ARBOR_OAKS_D", "ARBOR_OAKS_E", "UNIVERSITY_VILLAGE_A", "UNIVERSITY_VILLAGE_B", "UNIVERSITY_VILLAGE_C", "UNIVERSITY_VILLAGE_D", "UNIVERSITY_VILLAGE_E", "UNIVERSITY_VILLAGE_F", "Physical Education", "OffCampus House 1", "OffCampus House 2", "TimberBrookBoundary", "TimberBrook400", "TimberBrook402", "TimberBrook404", "TimberBrook408", "TimberBrook410", " " }));

        jLabel5.setText("Query 2:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MapleSquare", "Tric", "BSM", "Richlynn_Apt", "GardenClub", "Brazos House", "Thermal Plant", "UTA Planetarium", "Health Center", "College Hall", "Arlington Hall", "University College", "Lipscomb Hall", "Woolf Hall", "GeoScience Building", "Science Laboratory", "Engineering Research Building", "Nedderman Hall", "Texas hall", "Davis Hall", "Nanofab Building", "Campus Center", "Trinity House", "Maverick Activity Center", "A_Meadow_Run5", "A_Swift_Center", "A_Meadow_Run3", "A_Meadow_Run4", "A_Meadow_Run2", "A_Meadow_Run1", "A_Meadow_Run_Post_Box_1", "MEADOW_RUN_A", "MEADOW_RUN_B", "MEADOW_RUN_C", "MEADOW_RUN_D", "ARBOR_OAKS_A", "ARBOR_OAKS_B", "ARBOR_OAKS_C", "ARBOR_OAKS_D", "ARBOR_OAKS_E", "UNIVERSITY_VILLAGE_A", "UNIVERSITY_VILLAGE_B", "UNIVERSITY_VILLAGE_C", "UNIVERSITY_VILLAGE_D", "UNIVERSITY_VILLAGE_E", "UNIVERSITY_VILLAGE_F", "Physical Education", "OffCampus House 1", "OffCampus House 2", "TimberBrookBoundary", "TimberBrook400", "TimberBrook402", "TimberBrook404", "TimberBrook408", "TimberBrook410" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Choose the Building Name");

        jLabel7.setText("Enter the Distance");

        jTextField1.setToolTipText("Distance in Km");

        jLabel8.setText("Query 3:");

        jLabel9.setText("Choose the Building Name");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MapleSquare", "Tric", "BSM", "Richlynn_Apt", "GardenClub", "Brazos House", "Thermal Plant", "UTA Planetarium", "Health Center", "College Hall", "Arlington Hall", "University College", "Lipscomb Hall", "Woolf Hall", "GeoScience Building", "Science Laboratory", "Engineering Research Building", "Nedderman Hall", "Texas hall", "Davis Hall", "Nanofab Building", "Campus Center", "Trinity House", "Maverick Activity Center", "A_Meadow_Run5", "A_Swift_Center", "A_Meadow_Run3", "A_Meadow_Run4", "A_Meadow_Run2", "A_Meadow_Run1", "A_Meadow_Run_Post_Box_1", "MEADOW_RUN_A", "MEADOW_RUN_B", "MEADOW_RUN_C", "MEADOW_RUN_D", "ARBOR_OAKS_A", "ARBOR_OAKS_B", "ARBOR_OAKS_C", "ARBOR_OAKS_D", "ARBOR_OAKS_E", "UNIVERSITY_VILLAGE_A", "UNIVERSITY_VILLAGE_B", "UNIVERSITY_VILLAGE_C", "UNIVERSITY_VILLAGE_D", "UNIVERSITY_VILLAGE_E", "UNIVERSITY_VILLAGE_F", "Physical Education", "OffCampus House 1", "OffCampus House 2", "TimberBrookBoundary", "TimberBrook400", "TimberBrook402", "TimberBrook404", "TimberBrook408", "TimberBrook410" }));

        jLabel10.setText("Choose the Building Name");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MapleSquare", "Tric", "BSM", "Richlynn_Apt", "GardenClub", "Brazos House", "Thermal Plant", "UTA Planetarium", "Health Center", "College Hall", "Arlington Hall", "University College", "Lipscomb Hall", "Woolf Hall", "GeoScience Building", "Science Laboratory", "Engineering Research Building", "Nedderman Hall", "Texas hall", "Davis Hall", "Nanofab Building", "Campus Center", "Trinity House", "Maverick Activity Center", "A_Meadow_Run5", "A_Swift_Center", "A_Meadow_Run3", "A_Meadow_Run4", "A_Meadow_Run2", "A_Meadow_Run1", "A_Meadow_Run_Post_Box_1", "MEADOW_RUN_A", "MEADOW_RUN_B", "MEADOW_RUN_C", "MEADOW_RUN_D", "ARBOR_OAKS_A", "ARBOR_OAKS_B", "ARBOR_OAKS_C", "ARBOR_OAKS_D", "ARBOR_OAKS_E", "UNIVERSITY_VILLAGE_A", "UNIVERSITY_VILLAGE_B", "UNIVERSITY_VILLAGE_C", "UNIVERSITY_VILLAGE_D", "UNIVERSITY_VILLAGE_E", "UNIVERSITY_VILLAGE_F", "Physical Education", "OffCampus House 1", "OffCampus House 2", "TimberBrookBoundary", "TimberBrook400", "TimberBrook402", "TimberBrook404", "TimberBrook408", "TimberBrook410" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton1)
                        .addGap(97, 97, 97)
                        .addComponent(jButton3)
                        .addGap(103, 103, 103)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Output Console");

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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("QGIS GUI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(393, 393, 393))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try {
            main app = new main();
      
            Connection con =  app.connect();
            Statement st = con.createStatement();
            st.executeQuery("CREATE VIEW "+jComboBox1.getSelectedItem().toString()+" AS select * from poly as p1 where p1.name = '"+jComboBox1.getSelectedItem().toString()+"'");
                
            st.close();   
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            JOptionPane.showMessageDialog(null, "Layer have been successfully uploaded to QGIS!", "QGIS", JOptionPane.INFORMATION_MESSAGE);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
         try {
            main app = new main();
      
            Connection con =  app.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select p1.name , ST_Distance(p1.geom,p2.geom,true)/1000 as Distance from poly as p1, poly as p2 where (ST_Distance(p1.geom,p2.geom,true) )/1000< ("+jTextField1.getText()+") AND p2.name = '"+jComboBox2.getSelectedItem().toString()+"' AND (p1.b_type = 'HOUSING' OR p1.btype = 'Housing')");

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            rs.close();
            st.close();   
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException {
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
            
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
