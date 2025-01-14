/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project;

import java.sql.ResultSetMetaData;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.JTable;
/**
 *
 * @author btmab
 */
public class StudentRegistration extends javax.swing.JFrame {
Connection conn;
PreparedStatement pst;
ResultSet rs;

    private JFrame Frame;

    /**
     * Creates new form StudentRegistration
     */
    public StudentRegistration() {
        initComponents();
        table_update();
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
        jLabel1 = new javax.swing.JLabel();
        jbtnSubmit = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnHome = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jtxtYear = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtClass = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtSID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtFname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtLname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtNIC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtDOB = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtTpno = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtxtAdd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Uglygoodbaddark", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Senior Student Registration Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 860, 50));

        jbtnSubmit.setBackground(new java.awt.Color(51, 102, 255));
        jbtnSubmit.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jbtnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/submit.png"))); // NOI18N
        jbtnSubmit.setText("Submit");
        jbtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 150, 70));

        jbtnUpdate.setBackground(new java.awt.Color(51, 102, 255));
        jbtnUpdate.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jbtnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jbtnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/update.png"))); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 150, 70));

        jbtnReset.setBackground(new java.awt.Color(51, 102, 255));
        jbtnReset.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jbtnReset.setForeground(new java.awt.Color(255, 255, 255));
        jbtnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/reset.png"))); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 150, 70));

        jbtnPrint.setBackground(new java.awt.Color(51, 102, 255));
        jbtnPrint.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jbtnPrint.setForeground(new java.awt.Color(255, 255, 255));
        jbtnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/printer.png"))); // NOI18N
        jbtnPrint.setText("Print");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 150, 70));

        jbtnHome.setBackground(new java.awt.Color(51, 102, 255));
        jbtnHome.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jbtnHome.setForeground(new java.awt.Color(255, 255, 255));
        jbtnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/house.png"))); // NOI18N
        jbtnHome.setText("Home");
        jbtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 150, 70));

        jbtnDelete.setBackground(new java.awt.Color(51, 102, 255));
        jbtnDelete.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jbtnDelete.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/delete.png"))); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 150, 70));

        jbtnExit.setBackground(new java.awt.Color(51, 102, 255));
        jbtnExit.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jbtnExit.setForeground(new java.awt.Color(255, 255, 255));
        jbtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/exit.png"))); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 150, 70));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SID", "FirstName", "LastName", "NIC", "DOB", "TPno", "Address", "Class", "Year", "Gender", "S1", "S2", "S3", "S4", "S5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 910, 180));

        jRadioButtonFemale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonFemale.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonFemale.setText("Female");
        jPanel1.add(jRadioButtonFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, 20));

        jRadioButtonMale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonMale.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonMale.setText("Male");
        jPanel1.add(jRadioButtonMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Gender");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 50, 20));

        jtxtYear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jtxtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 201, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Year");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 50, 30));

        jtxtClass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jtxtClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 201, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Class");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 50, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Enter Student Details");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("S ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 30));

        jtxtSID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jtxtSID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 182, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 69, 30));

        jtxtFname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jtxtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 182, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 30));

        jtxtLname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jtxtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 182, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NIC");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 50, 30));

        jtxtNIC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jtxtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 182, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DOB");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 50, 30));

        jtxtDOB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jtxtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 182, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TP no");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 50, 30));

        jtxtTpno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jtxtTpno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 182, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Address");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 70, 40));

        jtxtAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jtxtAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 182, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Choose Subjects");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Subject 1");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Physics", "History", "Agri", "Political", "Accounting", "S.F.T", "Geogrophy" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 131, -1));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chemistry", "Buddsum", "Catholic", "Islam", "Economics", "I.C.T" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 131, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Subject 2");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Subject 3");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, -1));

        jComboBox4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biology", "Combined Maths", "Art", "Music", "Drama", "Dancing", "Poitical", "E.T", "B.T" }));
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 131, -1));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("English");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("GIT");
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/wallpaperflare.com_wallpaper (41).jpg"))); // NOI18N
        jLabel14.setText("jLabel3");
        jLabel14.setMaximumSize(new java.awt.Dimension(930, 710));
        jLabel14.setMinimumSize(new java.awt.Dimension(930, 710));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -160, 930, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void table_update()
    {
        int c;
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
            pst = conn.prepareStatement("SELECT * FROM seniorstudent");
            ResultSet rs=pst.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            
            DefaultTableModel Df= (DefaultTableModel)jTable1.getModel();
            Df.setRowCount(0);
            
            while (rs.next())
            {
            Vector v2 =new Vector();
            
            for(int a=1;a<=c;a++)
            {
            v2.add(rs.getString("SID"));
            v2.add(rs.getString("Fname"));
            v2.add(rs.getString("Lname"));
            v2.add(rs.getString("NIC"));
            v2.add(rs.getString("DOB"));
            v2.add(rs.getString("Tpno"));
            v2.add(rs.getString("Address"));
            v2.add(rs.getString("Class"));
            v2.add(rs.getString("Year"));
            v2.add(rs.getString("Gender"));
            v2.add(rs.getString("S1"));
            v2.add(rs.getString("S2"));
            v2.add(rs.getString("S3"));
            v2.add(rs.getString("S4"));
            v2.add(rs.getString("S5"));
            }
            Df.addRow(v2);
            }
                    
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    
    
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        Frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog( Frame,"confirm if you Want to Exit","Name of the Application or Title",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtSID.setText("");
        jtxtFname.setText("");
        jtxtLname.setText("");
        jtxtNIC.setText("");
        jtxtDOB.setText("");
        jtxtTpno.setText("");
        jtxtAdd.setText("");
        jtxtClass.setText("");
        jtxtYear.setText("");
        jRadioButtonMale.setSelected(false);
        jRadioButtonFemale.setSelected(false);
        jComboBox2.setSelectedIndex(-1);
        jComboBox3.setSelectedIndex(-1);
        jComboBox4.setSelectedIndex(-1);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubmitActionPerformed
        String SID = jtxtSID.getText();
        String Firstname = jtxtFname.getText();
        String Lastname = jtxtLname.getText();
        String NIC = jtxtNIC.getText();
        String DOB = jtxtDOB.getText();
        String Telephone = jtxtTpno.getText();
        String Address = jtxtAdd.getText();
        String Class1 = jtxtClass.getText();
        String Year = jtxtYear.getText();
        String Gender;
        if(jRadioButtonMale.isSelected())
        {
        Gender="Male";
        }
        else
        {
        Gender="Female";
        }
        String S1 = jComboBox2.getSelectedItem().toString();
        
        String S2 = jComboBox3.getSelectedItem().toString();
        
        String S3 = jComboBox4.getSelectedItem().toString();
        
        String S4 = null;
        if(jCheckBox1.isSelected())
        {
        S4="English";
        }
        String S5 = null;
        if(jCheckBox2.isSelected())
        {
        S5="GIT";
        }
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
            pst = conn.prepareStatement("INSERT INTO seniorstudent(SID,Fname,Lname,NIC,DOB,Tpno,Address,Class,Year,Gender,S1,S2,S3,S4,S5)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    pst.setString(1,SID );
                    pst.setString(2,Firstname );
                    pst.setString(3,Lastname );
                    pst.setString(4,NIC );
                    pst.setString(5,DOB );
                    pst.setString(6,Telephone );
                    pst.setString(7,Address );
                    pst.setString(8,Class1 );
                    pst.setString(9,Year );
                    pst.setString(10,Gender );
                    pst.setString(11,S1 );
                    pst.setString(12,S2 );
                    pst.setString(13,S3 );
                    pst.setString(14,S4 );
                    pst.setString(15,S5 );
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "User Was Added.....");
                    
                    table_update();
                    
                    jtxtSID.setText("");
                    jtxtFname.setText("");
                    jtxtLname.setText("");
                    jtxtNIC.setText("");
                    jtxtDOB.setText("");
                    jtxtTpno.setText("");
                    jtxtAdd.setText("");
                    jtxtClass.setText("");
                    jtxtYear.setText("");
                    jRadioButtonMale.setSelected(false);
                    jRadioButtonFemale.setSelected(false);
                    jComboBox2.setSelectedIndex(-1);
                    jComboBox3.setSelectedIndex(-1);
                    jComboBox4.setSelectedIndex(-1);
                    jCheckBox2.setSelected(false);
                    jCheckBox1.setSelected(false);
                    jtxtSID.requestFocus();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jbtnSubmitActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel Df= (DefaultTableModel)jTable1.getModel();
    int SelectedIndex=jTable1.getSelectedRow();
    
    jtxtSID.setText(Df.getValueAt(SelectedIndex,0).toString());
    jtxtFname.setText(Df.getValueAt(SelectedIndex,1).toString());
    jtxtLname.setText(Df.getValueAt(SelectedIndex,2).toString());
    jtxtNIC.setText(Df.getValueAt(SelectedIndex,3).toString());
    jtxtDOB.setText(Df.getValueAt(SelectedIndex,4).toString());
    jtxtTpno.setText(Df.getValueAt(SelectedIndex,5).toString());
    jtxtAdd.setText(Df.getValueAt(SelectedIndex,6).toString());
    jtxtClass.setText(Df.getValueAt(SelectedIndex,7).toString());
    jtxtYear.setText(Df.getValueAt(SelectedIndex,8).toString());
    jRadioButtonMale.setSelected(true);
    jRadioButtonFemale.setSelected(false);
    jComboBox2.setSelectedIndex(-1);
    jComboBox3.setSelectedIndex(-1);
    jComboBox4.setSelectedIndex(-1);
    jCheckBox2.setSelected(true);
    jCheckBox1.setSelected(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHomeActionPerformed
        Home m = new Home();
        this.hide();
        m.setVisible(true);
    }//GEN-LAST:event_jbtnHomeActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        DefaultTableModel Df= (DefaultTableModel)jTable1.getModel();
    int SelectedIndex=jTable1.getSelectedRow();
    
    
    try {
        int SID =Integer.parseInt(Df.getValueAt(SelectedIndex, 0).toString());
        String Firstname = jtxtFname.getText();
        String Lastname = jtxtLname.getText();
        String NIC = jtxtNIC.getText();
        String DOB = jtxtDOB.getText();
        String Telephone = jtxtTpno.getText();
        String Address = jtxtAdd.getText();
        String Class1 = jtxtClass.getText();
        String Year = jtxtYear.getText();
        String Gender;
        if(jRadioButtonMale.isSelected())
        {
        Gender="Male";
        }
        else
        {
        Gender="Female";
        }
        String S1 = jComboBox2.getSelectedItem().toString();
        
        String S2 = jComboBox3.getSelectedItem().toString();
        
        String S3 = jComboBox4.getSelectedItem().toString();
        
        String S4 = null;
        if(jCheckBox1.isSelected())
        {
        S4="English";
        }
        String S5 = null;
        if(jCheckBox2.isSelected())
        {
        S5="GIT";
        }
        
        
        Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
            pst = conn.prepareStatement("UPDATE seniorstudent SET Fname= ?,Lname= ?,NIC= ?,"
                    + "DOB= ?,Tpno= ?,Address= ?,Class= ?,Year= ?,Gender= ?,S1= ?,S2= ?,S3= ?,S4= ?,S5= ? WHERE SID= ?");
                    pst.setInt(15,SID );
                    pst.setString(1,Firstname );
                    pst.setString(2,Lastname );
                    pst.setString(3,NIC );
                    pst.setString(4,DOB );
                    pst.setString(5,Telephone );
                    pst.setString(6,Address );
                    pst.setString(7,Class1 );
                    pst.setString(8,Year );
                    pst.setString(9,Gender );
                    pst.setString(10,S1 );
                    pst.setString(11,S2 );
                    pst.setString(12,S3 );
                    pst.setString(13,S4 );
                    pst.setString(14,S5 );
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "User Was UPDATED.....");
                    
                    table_update();
                    
                    jtxtSID.setText("");
                    jtxtFname.setText("");
                    jtxtLname.setText("");
                    jtxtNIC.setText("");
                    jtxtDOB.setText("");
                    jtxtTpno.setText("");
                    jtxtAdd.setText("");
                    jtxtClass.setText("");
                    jtxtYear.setText("");
                    jRadioButtonMale.setSelected(false);
                    jRadioButtonFemale.setSelected(false);
                    jComboBox2.setSelectedIndex(-1);
                    jComboBox3.setSelectedIndex(-1);
                    jComboBox4.setSelectedIndex(-1);
                    jCheckBox2.setSelected(false);
                    jCheckBox1.setSelected(false);
                    jtxtSID.requestFocus();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        DefaultTableModel Df= (DefaultTableModel)jTable1.getModel();
    int SelectedIndex=jTable1.getSelectedRow();
    
    try {
        int SID=Integer.parseInt(Df.getValueAt(SelectedIndex, 0).toString());
        String Firstname = jtxtFname.getText();
        String Lastname = jtxtLname.getText();
        String NIC = jtxtNIC.getText();
        String DOB = jtxtDOB.getText();
        String Telephone = jtxtTpno.getText();
        String Address = jtxtAdd.getText();
        String Class1 = jtxtClass.getText();
        String Year = jtxtYear.getText();
        String Gender;
        if(jRadioButtonMale.isSelected())
        {
        Gender="Male";
        }
        else
        {
            Gender="Female";
        }
        int Dialog = JOptionPane.showConfirmDialog(null,"Do You Want To Delete The Record?","Warning",JOptionPane.YES_NO_OPTION);
        if (Dialog == JOptionPane.YES_OPTION)
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
            pst = conn.prepareStatement("INSERT INTO removedpsintd(SID,Fname,Lname,NIC,DOB,Tpno,Address,Class,Year,Gender)values(?,?,?,?,?,?,?,?,?,?)");
                    pst.setInt(1,SID );
                    pst.setString(2,Firstname );
                    pst.setString(3,Lastname );
                    pst.setString(4,NIC );
                    pst.setString(5,DOB );
                    pst.setString(6,Telephone );
                    pst.setString(7,Address );
                    pst.setString(8,Class1 );
                    pst.setString(9,Year );
                    pst.setString(10,Gender );
                    pst.executeUpdate();
                    
                    
            Class.forName("com.mysql.cj.jdbc.Driver");
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
            pst = conn.prepareStatement("DELETE FROM `seniorstudent` WHERE `seniorstudent`.`SID` = ?");
                    pst.setInt(1,SID );
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "User Was Deleted.....");
                    
                    table_update();
                    
                    jtxtSID.setText("");
                    jtxtFname.setText("");
                    jtxtLname.setText("");
                    jtxtNIC.setText("");
                    jtxtDOB.setText("");
                    jtxtTpno.setText("");
                    jtxtAdd.setText("");
                    jtxtClass.setText("");
                    jtxtYear.setText("");
                    jRadioButtonMale.setSelected(false);
                    jRadioButtonFemale.setSelected(false);
                    jComboBox2.setSelectedIndex(-1);
                    jComboBox3.setSelectedIndex(-1);
                    jComboBox4.setSelectedIndex(-1);
                    jCheckBox2.setSelected(false);
                    jCheckBox1.setSelected(false);
                    jtxtSID.requestFocus();
        }
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
        MessageFormat header=new MessageFormat("Senior Student Details");
        MessageFormat footer=new MessageFormat("Page(0,number,integer)");
        
        try
        {
        jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        }
        catch(java.awt.print.PrinterException e)
        {
            System.err.format("No Printer Found", e.getMessage());
        }
    }//GEN-LAST:event_jbtnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnHome;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSubmit;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JTextField jtxtAdd;
    private javax.swing.JTextField jtxtClass;
    private javax.swing.JTextField jtxtDOB;
    private javax.swing.JTextField jtxtFname;
    private javax.swing.JTextField jtxtLname;
    private javax.swing.JTextField jtxtNIC;
    private javax.swing.JTextField jtxtSID;
    private javax.swing.JTextField jtxtTpno;
    private javax.swing.JTextField jtxtYear;
    // End of variables declaration//GEN-END:variables
}
