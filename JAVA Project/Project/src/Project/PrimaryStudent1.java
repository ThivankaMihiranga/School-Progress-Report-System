/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project;
import java.awt.Color;
import java.sql.ResultSetMetaData;
import java.awt.Frame;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTable;
/**
 *
 * @author btmab
 */
public class PrimaryStudent1 extends javax.swing.JFrame {
Connection conn;
PreparedStatement pst;
ResultSet rs;

    private JFrame Frame;
   

    /**
     * Creates new form PrimaryStudent
     */
    public PrimaryStudent1() {
        initComponents();
        table_update();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void table_update()
    {
        int c;
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
            pst = conn.prepareStatement("SELECT * FROM primarystudent");
            ResultSet rs=pst.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            
            DefaultTableModel Df= (DefaultTableModel)jTable2.getModel();
            Df.setRowCount(0);
            
            while (rs.next())
            {
            Vector v2 =new Vector();
            
            for(int a=1;a<=c;a++)
            {
            v2.add(rs.getString("SID"));
            v2.add(rs.getString("Firstname"));
            v2.add(rs.getString("Lastname"));
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
            v2.add(rs.getString("S6"));
            }
            Df.addRow(v2);
            }
                    
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(PrimaryStudent1.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtnDelete = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jbtnSubmit = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnHome = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jtxtDOB = new javax.swing.JTextField();
        jCheckBox7 = new javax.swing.JCheckBox();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jtxtNIC = new javax.swing.JTextField();
        jCheckBox10 = new javax.swing.JCheckBox();
        jtxtFname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtSID = new javax.swing.JTextField();
        jtxtClass = new javax.swing.JTextField();
        jtxtTpno = new javax.swing.JTextField();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jtxtYear = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jtxtAdd = new javax.swing.JTextField();
        jtxtLname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(930, 710));
        jPanel1.setPreferredSize(new java.awt.Dimension(930, 710));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Uglygoodbaddark", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Primary Student Registration Form 1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, 910, 119));

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
        jPanel1.add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 140, 70));

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
        jPanel1.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 140, 70));

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
        jPanel1.add(jbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 140, 70));

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
        jPanel1.add(jbtnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 100, -1, 70));

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
        jPanel1.add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 130, 70));

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
        jPanel1.add(jbtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 130, 70));

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
        jPanel1.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 130, 70));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SID", "Fname", "Lname", "NIC", "DOB", "Tp No", "Address", "Class", "Year", "Gender", "S1", "S2", "S3", "S4", "S5", "S6"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 910, 270));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Address");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 50, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 69, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DOB");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 50, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NIC");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 50, -1));

        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Sinhala");
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

        jRadioButtonFemale.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonFemale.setText("Female");
        jPanel1.add(jRadioButtonFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        jtxtDOB.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel1.add(jtxtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 182, -1));

        jCheckBox7.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("Religeon");
        jPanel1.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        jRadioButtonMale.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonMale.setText("Male");
        jPanel1.add(jRadioButtonMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        jtxtNIC.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel1.add(jtxtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 182, -1));

        jCheckBox10.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setText("Tamil");
        jPanel1.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        jtxtFname.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel1.add(jtxtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 182, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TP no");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 50, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Gender");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 50, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("S ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 50, -1));

        jtxtSID.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel1.add(jtxtSID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 182, -1));

        jtxtClass.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel1.add(jtxtClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 201, -1));

        jtxtTpno.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel1.add(jtxtTpno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 182, -1));

        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("English");
        jPanel1.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Environment");
        jPanel1.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        jtxtYear.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel1.add(jtxtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 201, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Class");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 50, -1));

        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Maths");
        jPanel1.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jtxtAdd.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel1.add(jtxtAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 182, -1));

        jtxtLname.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel1.add(jtxtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 182, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Year");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 50, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Choose Subjects");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sitka Small", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Enter Student Details");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/wallpaperflare.com_wallpaper (41).jpg"))); // NOI18N
        jLabel9.setText("jLabel3");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        Frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog( Frame,"confirm if you Want to Exit","Name of the Application or Title",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

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
        String S1 = null;
        if(jCheckBox3.isSelected())
        {
        S1="Sinhala";
        }
        String S2 = null;
        if(jCheckBox5.isSelected())
        {
        S2="Maths";
        }
        String S3 = null;
        if(jCheckBox4.isSelected())
        {
        S3="Environment";
        }
        String S4 = null;
        if(jCheckBox6.isSelected())
        {
        S4="English";
        }
        String S5 = null;
        if(jCheckBox7.isSelected())
        {
        S5="Religeon";
        }
        String S6 = null;
        if(jCheckBox10.isSelected())
        {
        S6="Tamil";
        }
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
            pst = conn.prepareStatement("INSERT INTO primarystudent(SID,Firstname,Lastname,NIC,DOB,Tpno,Address,Class,Year,Gender,S1,S2,S3,S4,S5,S6)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
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
                    pst.setString(16,S6 );
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
                    jCheckBox3.setSelected(false);
                    jCheckBox4.setSelected(false);
                    jCheckBox5.setSelected(false);
                    jCheckBox6.setSelected(false);
                    jCheckBox7.setSelected(false);
                    jCheckBox10.setSelected(false);
                    jtxtSID.requestFocus();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(PrimaryStudent1.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_jbtnSubmitActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
    DefaultTableModel Df= (DefaultTableModel)jTable2.getModel();
    int SelectedIndex=jTable2.getSelectedRow();
    
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
    jCheckBox3.setSelected(true);
    jCheckBox4.setSelected(true);
    jCheckBox5.setSelected(true);
    jCheckBox6.setSelected(true);
    jCheckBox7.setSelected(true);
    jCheckBox10.setSelected(true);
    
    }//GEN-LAST:event_jTable2MouseClicked

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
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox10.setSelected(false);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        DefaultTableModel Df= (DefaultTableModel)jTable2.getModel();
    int SelectedIndex=jTable2.getSelectedRow();
    
    
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
        String S1 = null;
        if(jCheckBox3.isSelected())
        {
        S1="Sinhala";
        }
        String S2 = null;
        if(jCheckBox5.isSelected())
        {
        S2="Maths";
        }
        String S3 = null;
        if(jCheckBox4.isSelected())
        {
        S3="Environment";
        }
        String S4 = null;
        if(jCheckBox6.isSelected())
        {
        S4="English";
        }
        String S5 = null;
        if(jCheckBox7.isSelected())
        {
        S5="Religeon";
        }
        String S6 = null;
        if(jCheckBox10.isSelected())
        {
        S6="Tamil";
        }
        
        
        Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
            pst = conn.prepareStatement("UPDATE primarystudent SET Firstname= ?,Lastname= ?,NIC= ?,"
                    + "DOB= ?,Tpno= ?,Address= ?,Class= ?,Year= ?,Gender= ?,S1= ?,S2= ?,S3= ?,S4= ?,S5= ?,S6= ? WHERE SID=?");
                    pst.setInt(16,SID );
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
                    pst.setString(15,S6 );
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
                    jCheckBox3.setSelected(false);
                    jCheckBox4.setSelected(false);
                    jCheckBox5.setSelected(false);
                    jCheckBox6.setSelected(false);
                    jCheckBox7.setSelected(false);
                    jCheckBox10.setSelected(false);
                    jtxtSID.requestFocus();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(PrimaryStudent1.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
    DefaultTableModel Df= (DefaultTableModel)jTable2.getModel();
    int SelectedIndex=jTable2.getSelectedRow();
    
    
    try {
        int SID=Integer.parseInt(Df.getValueAt(SelectedIndex, 0).toString());
//        String SID = jtxtSID.getText();
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
            pst = conn.prepareStatement("INSERT INTO removedpstd(SID,Firstname,Lastname,NIC,DOB,Tpno,Address,Class,Year,Gender)values(?,?,?,?,?,?,?,?,?,?)");
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
            pst = conn.prepareStatement("DELETE FROM `primarystudent` WHERE `primarystudent`.`SID` = ?");
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
                    jCheckBox3.setSelected(false);
                    jCheckBox4.setSelected(false);
                    jCheckBox5.setSelected(false);
                    jCheckBox6.setSelected(false);
                    jCheckBox7.setSelected(false);
                    jCheckBox10.setSelected(false);
                    jtxtSID.requestFocus();
        }
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(PrimaryStudent1.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jbtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHomeActionPerformed
        Home m = new Home();
        this.hide();
        m.setVisible(true);
    }//GEN-LAST:event_jbtnHomeActionPerformed

    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
        MessageFormat header=new MessageFormat("Primary Student Details");
        MessageFormat footer=new MessageFormat("Page(0,number,integer)");
        
        try
        {
        jTable2.print(JTable.PrintMode.NORMAL,header,footer);
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
            java.util.logging.Logger.getLogger(PrimaryStudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimaryStudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimaryStudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimaryStudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimaryStudent1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
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

    private static class DefualtTableModel {

        public DefualtTableModel() {
        }

        private void setRowCount(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void addRow(Vector v2) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private Object getValueAt(int SelectedRows, int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
