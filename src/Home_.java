import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.istack.internal.logging.Logger;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Image;
import java.util.Date;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.net.URI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JFileChooser;
import net.proteanit.sql.DbUtils;
import java.util.logging.Level;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Home_ extends javax.swing.JFrame {

    
     Connection conn = null;
    ResultSet rs;
    PreparedStatement pst;
    
     String path = null;
       
     
    
    
    
    public Home_() {
        initComponents();
        conn = javaconnect.ConnecrDb();
        update();
        CurrentDate();
    }

    
    
    public void CurrentDate(){
       Thread clock;
         clock = new Thread(){
             
             public void run(){
                 
                 for(;;){
                     Calendar cal = new GregorianCalendar();
                     int month = cal.get(Calendar.MONTH);
                     int year = cal.get(Calendar.YEAR);
                     int day = cal.get(Calendar.DAY_OF_MONTH);
                     jMenu4.setText("Date  "+day+"-"+(month+1)+"-"+year);
                     
                     int hour = cal.get(Calendar.HOUR);
                     int min = cal.get(Calendar.MINUTE);
                     int sec = cal.get(Calendar.SECOND);
                     jMenu5.setText("Time  "+hour+":"+(min)+":"+sec);
                     
                     try{
                         
                         sleep(1000);
                     }catch (InterruptedException ex){
                         
                         Logger.getLogger(Home_.class.getClass()).log(Level.SEVERE,null, ex);
                         
                     }
                 }
             }
             
         };
clock.start();
}
   public void update(){
       
       try{
           String sql = "SELECT `EmployeeID`, `Name`, `Surname`, `Age`, `Gender`, `Address`, `CellNumber`, `Department`, `Devision`, `Shifts`, `Hours` FROM `employeeinfo`";
           pst = conn.prepareStatement(sql);
           pst.execute("SELECT `EmployeeID`, `Name`, `Surname`, `Age`, `Gender`, `Address`, `CellNumber`, `Department`, `Devision`, `Shifts`, `Hours` FROM `employeeinfo`");
           rs = pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
           
           
       }catch(Exception e){
           
           JOptionPane.showMessageDialog(null, e);
           
           
       }
       
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jSearch = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        image = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true), "EmployeeInfo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 42, 164, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 341, -1, -1));

        jLabel1.setText("EmployeeID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 45, -1, -1));

        jLabel3.setText("Surname:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 157, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 42, 159, -1));

        jLabel2.setText("Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 99, -1, -1));

        jLabel4.setText("Age:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 212, -1, -1));

        jLabel6.setText("Department:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 99, -1, -1));

        jLabel9.setText("Hours:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 277, -1, -1));

        jLabel5.setText("CellNumber:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 45, -1, -1));

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 274, 164, -1));

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 209, 164, -1));

        jLabel7.setText("Devision:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 157, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT ", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 209, 159, -1));

        jLabel8.setText("Shifts:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 212, -1, -1));

        jRadioButton1.setText("Male");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel11.setText("Gender:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 277, -1, -1));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 96, 159, -1));

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 154, 159, -1));

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 96, 164, -1));

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 154, 164, -1));

        jRadioButton2.setText("Female");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jLabel10.setText("Address:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 341, -1, -1));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 640, 450));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Save-icon.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, 90, 30));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\Images\\Icons\\delete.png")); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 570, 90, 30));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\Images\\Icons\\grid_update.png")); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 570, 91, -1));

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\Images\\Icons\\Actions-edit-clear-icon-1.png")); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 570, 91, 30));

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\Images\\Icons\\Distributor-report-icon.png")); // NOI18N
        jButton5.setText("Report");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 610, 140, -1));

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\Images\\Icons\\print-icon-1.png")); // NOI18N
        jButton6.setText("Print");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 610, 133, 70));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EmployeeID", "Name", "Surname", "Age", "Gender", "Address", "CellNumber", "Department", "Devision", "Shifts", "Hours", "Username", "Password"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, 620, 310));

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\Images\\Icons\\User-Interface-Logout-icon.png")); // NOI18N
        jButton7.setText("Logout");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton7KeyPressed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 620, -1, 52));

        jLabel13.setBackground(new java.awt.Color(0, 255, 0));
        jLabel13.setFont(new java.awt.Font("Algerian", 2, 18)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\Images\\Icons\\devloper.png")); // NOI18N
        jLabel13.setText("Victors \nSolutions");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 306, -1));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        jSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSearchKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\Images\\Icons\\icon_view_new.gif")); // NOI18N
        jLabel14.setText("Search");

        jLabel12.setText("Name, Id, Surname ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 280, -1));

        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\Images\\Icons\\Editing-Attach-icon-1.png")); // NOI18N
        jButton8.setText("Attach");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 220, -1, 24));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\Images\\Icons\\Eye-2-icon.png")); // NOI18N
        jButton9.setText("Show");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel15.setText("Total Employee:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 350, -1));

        jDesktopPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopPane1.setLayer(image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 260, 210));

        jButton10.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\Images\\Icons\\chart-search-icon.png")); // NOI18N
        jButton10.setText("Pie Chart");
        jButton10.setToolTipText("");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 570, 100, 30));

        jMenu1.setText("File");
        jMenu1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu1KeyPressed(evt);
            }
        });

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\Images\\Icons\\attach-icon-1.png")); // NOI18N
        jMenuItem6.setText("Browse Path");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenuItem6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem6KeyPressed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\Images\\Icons\\check_yes.gif")); // NOI18N
        jMenuItem7.setText("Backup Path");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\Images\\Icons\\Close-icon.png")); // NOI18N
        jMenuItem13.setText("Exit");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Refresh");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuItem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem1KeyPressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\icons\\icons8-help-40.png")); // NOI18N
        jMenu3.setText("Help");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\Images\\Icons\\addusericon_2.png")); // NOI18N
        jMenuItem2.setText("FAQ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\Images\\Icons\\Person-Male-Light-icon.png")); // NOI18N
        jMenuItem3.setText("About Us");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Updates");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenu7.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\icons\\icons8-contacts-16.png")); // NOI18N
        jMenu7.setText("Follow Us");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\icons\\icons8-facebook-48.png")); // NOI18N
        jMenuItem8.setText("Facebook");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\icons\\icons8-whatsapp-48.png")); // NOI18N
        jMenuItem9.setText(" Watsapp/ +22748625345");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\icons\\icons8-linkedin-40.png")); // NOI18N
        jMenuItem10.setText("LinkdIn");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenu3.add(jMenu7);

        jMenu6.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\icons\\icons8-online-support-50.png")); // NOI18N
        jMenu6.setText("Online Support");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\icons\\icons8-skype-40.png")); // NOI18N
        jMenuItem5.setText("Skype");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\icons\\icons8-whatsapp-48.png")); // NOI18N
        jMenuItem11.setText("Online Watsapp Session");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem12.setText("Cell-Number - +22748625345");
        jMenu6.add(jMenuItem12);

        jMenu3.add(jMenu6);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Date");
        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Employee_Management_System\\icons\\icons8-time-16.png")); // NOI18N
        jMenu5.setText("Time");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1379, 879));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      // validate employee input form and insert data
      
      
        String id = jTextField1.getText();
        String name = jTextField2.getText();
        String surname = jTextField3.getText();
        String age = jComboBox1.getSelectedItem().toString();
       String gen = jRadioButton1.getActionCommand();
       String add = jTextArea1.getText();
       String cell = jTextField4.getText();
       String dep = jTextField5.getText();
       String dev = jTextField6.getText();
       String shif = jTextField7.getText();
       String hours = jTextField8.getText();
       byte[] img = person_image;
       
        
       if(id.equals("")){
           
           jLabel16.setText("The ID Field is Mandatory ");
           jTextField1.setBackground(Color.yellow);
       }
       if(name.equals("")){
           
           jLabel17.setText("The Name Field is Mandatory ");
           jTextField2.setBackground(Color.yellow);
       }
       if(surname.equals("")){
           
           jLabel18.setText("The Surname Field is Mandatory ");
           jTextField3.setBackground(Color.yellow);
       }
       if(age.equals("")){
           
           jLabel19.setText("Age Mandatory ");
           
       }
       if(add.equals("")){
           
           jLabel20.setText("Address is Mandatory ");
           jTextArea1.setBackground(Color.yellow);
       }
       if(cell.equals("")){
           
           jLabel21.setText("The Cell Field is Mandatory ");
           jTextField4.setBackground(Color.yellow);
       }
       if(dep.equals("")){
           
           jLabel22.setText("Department Field is Mandatory ");
           jTextField5.setBackground(Color.yellow);
       }
       if(dev.equals("")){
           
           jLabel23.setText("The Division Field is Mandatory ");
           jTextField6.setBackground(Color.yellow);
       }
       if(shif.equals("")){
           
           jLabel24.setText("The Shift Field is Mandatory ");
           jTextField7.setBackground(Color.yellow);
       }   
       
       if(hours.equals("")){
           
           jLabel25.setText("The Hours Field is Mandatory ");
           jTextField8.setBackground(Color.yellow);
       }
      
       else{
           
            // insert data
          try{
          String usr = jTextField9.getText();
          String pas = jTextField9.getText();
              
           String sql = "INSERT INTO `employeeinfo`(`EmployeeID`,`Name`,`Surname`,`Age`,`Gender`,`Address`,`CellNumber`,`Department`,`Devision`,`Shifts`,`Hours`,`Image`,`Username`,`Password`) VALUES  ("+id+","+"'"+name+"'"+","+"'"+surname+"'"+","+"'"+age+"'"+","+"'"+gen+"'"+","+"'"+add+"'"+","+"'"+cell+"'"+","+"'"+dep+"'"+","+"'"+dev+"'"+","+"'"+shif+"'"+","+"'"+hours+"'"+","+"'"+img+"'"+","+"'"+usr+"'"+","+"'"+pas+"'"+")";
          
           pst.execute(sql); 
                  
          
            JOptionPane.showMessageDialog(null, "your data has been saved successfully!");
           
                   
       }catch (Exception e){
           
            
            
           JOptionPane.showMessageDialog(null, e);
       }update();
       
       }
       
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
       // show data from input while clicking on the record 
        
          int row = jTable1.getSelectedRow();
        String Table_click = (jTable1.getModel().getValueAt(row,0).toString());
        try{
           String sql = "select Image from user where EmployeeID = '"+Table_click+"'"; 
           pst = conn.prepareStatement(sql);
          
           rs = pst.executeQuery();
           
           if(rs.next()){
              byte[] imagedata = rs.getBytes("Image");
                format = new ImageIcon(imagedata); 
               image.setIcon(format);
               
               
           }
            
        }catch(SQLException e){
            
            e.printStackTrace();
            
            
        }
        try{
            
            String sql = "select * from user where EmployeeID = '"+Table_click+"'";
            pst = conn.prepareStatement(sql);
            
            rs = pst.executeQuery();
            
            if(rs.next()){
                
               String add1 = rs.getString("EmployeeID");
                      jTextField1.setText(add1);
               String add2 = rs.getString("Name");
                      jTextField2.setText(add2); 
               String add3 = rs.getString("Surname");
                      jTextField3.setText(add3);       
                 String add5 = rs.getString("Address");
                      jTextArea1.setText(add5);      
                  String add6 = rs.getString("CellNumber");
                      jTextField4.setText(add6);  
                  String add7 = rs.getString("Department");
                      jTextField5.setText(add7);    
                  String add8 = rs.getString("Devision");
                      jTextField6.setText(add8);  
                  String add9 = rs.getString("Shifts");
                       jTextField7.setText(add9);      
                  String add10 = rs.getString("Hours");
                         jTextField8.setText(add10); 
                 
                      
                      
            }
            
            
        }catch(Exception e){
            
           JOptionPane.showMessageDialog(null, e);
            
            
        }
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
   // delete employee record from the table
       
        int p = JOptionPane.showConfirmDialog(null, "Are you sure?","Delete",JOptionPane.YES_NO_OPTION);
         
        if(p==0){
            
            String sql = "delete from employeeinfo where EmployeeID = ? ";
            
           try{
               
               
               
               pst = conn.prepareStatement(sql);
               pst.setString(1, jTextField1.getText());
               pst.execute();
               JOptionPane.showMessageDialog(null, "Deleted");
               
           } catch(Exception e){
               
               JOptionPane.showMessageDialog(null, e);
               
           }
            
            
        }update();
     
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
       JFileChooser chooser = new JFileChooser(); 
       chooser.showOpenDialog(null);
       File f = chooser.getSelectedFile();
       filename = f.getAbsolutePath();
       try{
         File Image = new File(filename);
         FileInputStream fis = new FileInputStream(Image);
         ByteArrayOutputStream  bos = new ByteArrayOutputStream();
          byte[] buf = new byte[1024]; 
          for(int readnum;(readnum = fis.read(buf))!= -1;){
           bos.write(buf,0,readnum);
              
              
          }
          
           person_image = bos.toByteArray();
           
       }catch (Exception e){
           
           JOptionPane.showMessageDialog(null, e);
           
           
           
       }
       
        
        
        
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
       
       
       
       
      try {
       // update data for employees  
       String id = jTextField1.getText();
       String name = jTextField2.getText();
       String surname = jTextField3.getText();
       String add = jTextArea1.getText();
       String cell = jTextField4.getText();
       String dep = jTextField5.getText();
       String dev = jTextField6.getText();
       String shif = jTextField7.getText();
       String hours = jTextField8.getText();
     
       String sql = "UPDATE `employeeinfo` SET `EmployeeID`='"+id+"', `Name`='"+name+"',`Surname`='"+surname+"',`Address`='"+add+"',`CellNumber`='"+cell+"',`Department`='"+dep+"',`Devision`='"+dev+"',`Shifts`='"+shif+"',`Hours`='"+hours+"' ";
        
       pst.execute();
          
          
    
       
          JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
          
          
      } catch(HeadlessException | SQLException e){
          
          JOptionPane.showMessageDialog(null, e);
          
          
          
      }
       
       
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
      // Clear input data from form  
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextArea1.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jComboBox1.getSelectedItem().equals("select");
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        // count the number of employees and display
        
        try{
         String slq = "select count(age) from employeeinfo";
          pst = conn.prepareStatement(slq);
          rs = pst.executeQuery();
           if (rs.next()){
               
               String tot = rs.getString("count(age)");
               jTextField9.setText(tot);
               jTextField9.setBackground(Color.yellow);
               
               
           } 
            
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            
            
        }
        
        
        
        
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
       try{
           
     Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Users\\User\\Desktop\\FAQ.pdf");
           
       } catch(IOException e){
           JOptionPane.showMessageDialog(null, e);
           
       }
        
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
       MessageFormat header = new MessageFormat("Report Print");
       MessageFormat footer = new MessageFormat("Page(0,number,integer)");
        try{
            
           jTable1.print(JTable.PrintMode.NORMAL, header, footer);
            
            
        }catch(java.awt.print.PrinterException e){
            
           System.err.format("cannot Print %s%n", e.getMessage());
            
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyReleased
      
      try{
         String sql  ="select * from employeeinfo where Name = ?";
         pst = conn.prepareStatement(sql);
         
         pst.setString(1, jSearch.getText());
         jSearch.setBackground(Color.ORANGE);
         rs = pst.executeQuery();
          
         if(rs.next()){
             
           String add1 = rs.getString("EmployeeID");
                      jTextField1.setText(add1);
               String add2 = rs.getString("Name");
                      jTextField2.setText(add2); 
               String add3 = rs.getString("Surname");
                      jTextField3.setText(add3);       
                 String add5 = rs.getString("Address");
                      jTextArea1.setText(add5);      
                  String add6 = rs.getString("CellNumber");
                      jTextField4.setText(add6);  
                  String add7 = rs.getString("Department");
                      jTextField5.setText(add7);    
                  String add8 = rs.getString("Devision");
                      jTextField6.setText(add8);  
                  String add9 = rs.getString("Shifts");
                       jTextField7.setText(add9);      
                  String add10 = rs.getString("Hours");
                         jTextField8.setText(add10); 
             
         }
         
        
      } catch(Exception e){
          
      JOptionPane.showMessageDialog(null, e);
          
      } 
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jSearchKeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
            int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to Logout ? ","Logging out ",JOptionPane.YES_NO_OPTION);
          
          if(x == 0){
              
              System.exit(0);
          }
        
          
          
              
         
              
              
          
          
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      
        try{
            
         Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Users\\User\\Desktop\\AboutUs.pdf");
          
       } catch(IOException e){
           JOptionPane.showMessageDialog(null, e);
           
       }
        
        
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
      jLabel16.setText("");
      jTextField1.setBackground(Color.white);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
       jLabel17.setText("");
       jTextField2.setBackground(Color.white);
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
       jLabel18.setText("");
       jTextField3.setBackground(Color.white);
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
       jLabel20.setText("");
       jTextArea1.setBackground(Color.white);
    }//GEN-LAST:event_jTextArea1KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
       jLabel21.setText("");
       jTextField4.setBackground(Color.white);
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
       jLabel22.setText("");
       jTextField5.setBackground(Color.white);
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
       jLabel23.setText("");
       jTextField6.setBackground(Color.white);
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
       jLabel24.setText("");
       jTextField7.setBackground(Color.white);
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
       jLabel25.setText("");
       jTextField8.setBackground(Color.white);
    }//GEN-LAST:event_jTextField8KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
          String emp = jTextField1.getText();
       String fname = jTextField2.getText();
       String lname = jTextField3.getText();
       String age = jComboBox1.getSelectedItem().toString();
       String addr = jTextArea1.getText();
       String cell = jTextField4.getText();
       String dep = jTextField5.getText(); 
       String dev = jTextField6.getText(); 
       String shifts = jTextField7.getText();
       String hours = jTextField8.getText();
       
        
       try{
         
         Document document = new Document();   
         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Report.pdf"));  
         document.open();
         Image image = Image.getInstance("Slide1.PNG");
         document.add(new Paragraph(""));
         document.add(image);
         document.add(new Paragraph(""));
         
         
         document.add(new Paragraph("                                                                                            VICTOR SOLUTIONS"));
         document.add(new Paragraph(""+""));
         document.add(new Paragraph(new Date().toString()));
         
         PdfPTable table = new PdfPTable(4);
         
         PdfPCell cell0 = new PdfPCell(new Paragraph(""));
         cell0.setColspan(10);
         
         cell0.setBackgroundColor(BaseColor.GREEN);
         cell0.setPadding(10.0f);
         table.addCell(cell0);
         
         table.addCell("EmployeeID");
         table.addCell(emp);
         table.addCell("Name");
         table.addCell(fname);
         table.addCell("Surname");
         table.addCell(lname);
         table.addCell("Age");
         table.addCell(age);
         table.addCell("Address");
         table.addCell(addr);
         table.addCell("CellNumber");
         table.addCell(cell);
         table.addCell("Department");
         table.addCell(dep);
         table.addCell("Devision");
         table.addCell(dev);
         table.addCell("Shifts");
         table.addCell(shifts);
         table.addCell("Hours");
         table.addCell(hours);
         
         
         
         document.add(table);
         com.itextpdf.text.List list = new com.itextpdf.text.List(true,20);
         document.add(new Paragraph("                                                                                  Assessmet"));
         list.add("First     =     70%");
         list.add("Second    =     62%");
         list.add("Third     =     80%");
         list.add("Fourth    =     74%");
         list.add("Fifth     =     51%");
         
         
         document.add(list);
         document.add(new Paragraph("                                                                                 Qualification Reqiured "));
         PdfPTable table1 = new PdfPTable(3);
         PdfPCell cell1 =new PdfPCell(new Paragraph("Training Required"));
         cell1.setColspan(8); 
         
         cell1.setBackgroundColor(BaseColor.YELLOW);
         cell1.setPadding(5.0f);
         table1.addCell(cell1);
         
         
         table1.addCell("java");
         table1.addCell("php");
         table1.addCell("SQL"); 
         document.add(table1);
         
         document.add(new Paragraph("                            Manager Comment :"));
         document.add(new Paragraph("  ")); 
          
         document.close();
         
         
         
         
         
         
         
          JOptionPane.showMessageDialog(null, "Report has been Successfully Saved");
          
          
       }catch(Exception e){
           
        JOptionPane.showMessageDialog(null, e);
           
       }
        
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
      
        
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        
        try{
           File f = fc.getSelectedFile();
            path = f.getAbsolutePath();
            path = path.replace("\\", "/");
            path = path+ "_" + date + ".sql";
            jMenuItem6.setText(path);
            
           
            
            
        }catch(Exception e){
            
          e.printStackTrace();
            
        }
           
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
      Process p = null;
      
       try{
         
        p  =  Runtime.getRuntime().exec("C:/Users/User/Documents/Xampp/mysql/bin/mysqldump.exe -uroot -p --add-drop-database -B ems_db -r"+path);
            
          int processComplete = p.waitFor(); 
          if(processComplete == 0){
              
              JOptionPane.showMessageDialog(null, "Backup sucessfully created ");
              
          }
          else{
              
              JOptionPane.showMessageDialog(null, "Cannot create Database ");
          }
          
          
       }catch(HeadlessException | IOException | InterruptedException e){
           
          e.printStackTrace();
           
       }
       
        
        
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
          
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       
        Desktop browser = Desktop.getDesktop();
        try{
           
            browser.browse(new URI("https://www.facebook.com/Vic_Solutions-264084037495949/"));
            
            
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "Error");
            
            
        }
        
        
        
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       
        
        
        
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButton7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton7KeyPressed
      
    // shortcut key for logout    
        
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        
        try {
          int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to Logout ? ","Logging out ",JOptionPane.YES_NO_OPTION);
          
          if(x == 0){
              
              pst.close();
            
              
          }
             
             
             
         } catch (SQLException ex) {
             java.util.logging.Logger.getLogger(Home_.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
    }    
        
        
        
    }//GEN-LAST:event_jButton7KeyPressed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       
      Desktop browser = Desktop.getDesktop();
        try{
           
            browser.browse(new URI("https://web.whatsapp.com/"));
            
            
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "Error");
            
            
        }
        
        
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       
        Desktop browser = Desktop.getDesktop();
        try{
           
            browser.browse(new URI("https://login.live.com"));
            
            
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "Error");
            
            
        }
        
        
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
       
        
       Desktop browser = Desktop.getDesktop();
        try{
           
            browser.browse(new URI("https://www.linkedin.com/uas/login"));
            
            
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "Error");
            
            
        }  
        
        
        
        
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed

        
        
     int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to Exit ? ","Exit ",JOptionPane.YES_NO_OPTION);
       if(p == 0) {
     
     System.exit(0);   
        
       }
        
        
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem6KeyPressed
        
      JMenuItem menuItemOpen = new JMenuItem("Open");
      menuItemOpen.setMnemonic(KeyEvent.VK_O);  
        
        
    }//GEN-LAST:event_jMenuItem6KeyPressed

    private void jMenu1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu1KeyPressed
       
        JMenu menuFile = new JMenu("File");
        menuFile.setMnemonic(KeyEvent.VK_F);
        
        
    }//GEN-LAST:event_jMenu1KeyPressed

    private void jMenuItem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem1KeyPressed
      
       JButton button = new JButton("Refresh");
       button.setMnemonic(KeyEvent.VK_R); 
        
        
    }//GEN-LAST:event_jMenuItem1KeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
       JButton button = new JButton("Refresh");
       button.setMnemonic(KeyEvent.VK_R); 
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       
        
        DefaultPieDataset PieDataSet = new DefaultPieDataset();
        PieDataSet.setValue("Mobile Programmers", new Integer(12));
        PieDataSet.setValue("Software Programmers", new Integer(9));
        PieDataSet.setValue("Business Analysts", new Integer(15));
        PieDataSet.setValue("Accountants", new Integer(18));
        PieDataSet.setValue("Business Analysts", new Integer(9));
        PieDataSet.setValue("salesman", new Integer(11));
        PieDataSet.setValue("Web Designers", new Integer(20));
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart ", PieDataSet,true,true,true);
        PiePlot p = (PiePlot)chart.getPlot();
       // p.setForegroundAlpha(TOP_ALIGNMENT);
        ChartFrame frame = new ChartFrame("Pie Chart",chart);
        frame.setVisible(true);
        frame.setSize(500,500);
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Home_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jSearch;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
private ImageIcon format = null;
String filename = null;
int s = 0;
byte[] person_image = null ;
private String gender;



}
