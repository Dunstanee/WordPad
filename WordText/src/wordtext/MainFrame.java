/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordtext;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author PAUL
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {

        initComponents();
        indicator();
    }
    
    public void indicator(){
        String change = filettl.getText();
        if(change.equals("")){
            colorindicator.setBackground(Color.red);
            offon.setText("OFF");
        }else{
             colorindicator.setBackground(Color.green);
            offon.setText("READY"); 
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        flocation = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        filename = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        doctype = new javax.swing.JComboBox();
        location = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        Filelocation = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        filettl = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        labelname = new javax.swing.JLabel();
        colorindicator = new javax.swing.JPanel();
        offon = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Word Editor");
        setMinimumSize(new java.awt.Dimension(1200, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 204, 0));
        jPanel3.setMinimumSize(new java.awt.Dimension(1200, 67));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(1500, 67));
        jPanel2.setPreferredSize(new java.awt.Dimension(1500, 67));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.background"));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordtext/files.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 50, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Open File");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Close");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        jButton3.setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.background"));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordtext/erase.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 50, 50));

        jButton4.setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.background"));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordtext/add.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 40, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Save");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jButton5.setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.background"));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordtext/new.png"))); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 40, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("CREATE");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jButton10.setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.background"));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordtext/settings.png"))); // NOI18N
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 50, 50));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Details");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("File Details");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 140, -1));

        fname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 220, 20));
        jPanel2.add(flocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 500, 20));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Clear");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        jButton11.setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.background"));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordtext/invoice.png"))); // NOI18N
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 60, 40));

        jButton12.setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.background"));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordtext/trash.png"))); // NOI18N
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 50, 50));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Permanet Delete");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.background"));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cleared.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 50, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Update");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Preloader_4.gif"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 70, 50));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 70));
        jPanel3.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New Document");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("File Location : ");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel4.add(filename, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 160, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("File Name : ");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setText("Choose");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 150, 20));

        jButton7.setBackground(new java.awt.Color(0, 204, 51));
        jButton7.setText("CREATE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 220, -1));

        jPanel5.setBackground(new java.awt.Color(255, 102, 0));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 20));

        doctype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".doc", ".txt", ".exe", ".cmd", ".rb", ".php" }));
        jPanel4.add(doctype, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 150, -1));

        location.setEditable(false);
        jPanel4.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, 170));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 102, 102));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Open File");
        jPanel7.add(jLabel9);

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Select File :");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jButton8.setText("Choose");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 130, -1));

        jButton9.setBackground(new java.awt.Color(0, 204, 0));
        jButton9.setText("Open");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 220, -1));

        Filelocation.setEditable(false);
        jPanel6.add(Filelocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 240, 140));

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel11.setText("System Info");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        jPanel9.setBackground(new java.awt.Color(255, 51, 51));
        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 30));

        jLabel17.setText("UI DESIGNER: @dunstan");
        jLabel17.setToolTipText("");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 160, 20));

        jLabel18.setText("System Foundation : Java Language");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, -1));

        jLabel19.setText("Email: dunstanamkowa1@gmail.com");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        jLabel20.setText("@copyright 2020");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 240, 150));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtarea.setColumns(20);
        txtarea.setRows(5);
        txtarea.setWrapStyleWord(true);
        txtarea.setMaximumSize(new java.awt.Dimension(1500, 500));
        txtarea.setMinimumSize(new java.awt.Dimension(1500, 500));
        jScrollPane1.setViewportView(txtarea);
        txtarea.getAccessibleContext().setAccessibleName("txtarea");
        txtarea.getAccessibleContext().setAccessibleParent(jPanel1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 930, 380));

        viewdocname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(viewdocname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 260, 20));

        filettl.setEditable(false);
        filettl.setFont(new java.awt.Font("Arial Black", 2, 11)); // NOI18N
        jPanel1.add(filettl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 550, 30));

        jLabel12.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("FILE LOCATION");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        labelname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelname.setForeground(new java.awt.Color(255, 0, 51));
        labelname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 550, 20));

        colorindicator.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.add(colorindicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 40, -1));

        offon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offon.setText("OFF");
        jPanel1.add(offon, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 40, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 970, 460));
        jPanel1.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1220, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
JFileChooser chooser = new JFileChooser();
chooser.showOpenDialog(this);
String filename = chooser.getSelectedFile().getAbsolutePath();
Filelocation.setText(filename);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        //frame.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         try{
             String locationfile = filettl.getText();
             if(locationfile.equals("")){
               JOptionPane.showMessageDialog(null, "No file to Save");
                colorindicator.setBackground(Color.red);
            offon.setText("OFF");
             }
             else{
        FileWriter f = new FileWriter(locationfile);
 String words = txtarea.getText();
 f.write(words);
 
 f.close();
  JOptionPane.showMessageDialog(null, "Saved");
   colorindicator.setBackground(Color.GREEN);
            offon.setText("READY");
             }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "No file to Save");
    }
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
          try{
          String path = filename.getText();
          String  locationn= location.getText();
            String extension = doctype.getSelectedItem().toString();
          if(path.equals("") && locationn.equals("")){
        JOptionPane.showMessageDialog(null, "Please input File name and Location");
          }
          else{
          String fulledition = locationn+"\\"+path+extension;
          File f = new File(fulledition);
          
          if(f.createNewFile()){
            JOptionPane.showMessageDialog(null, "File Created Successful");
            
            Filelocation.setText(fulledition);
            
            filename.setText("");
            location.setText("");
             filettl.setText(fulledition);
              colorindicator.setBackground(Color.GREEN);
            offon.setText("READY");
             String name= f.getName();
             labelname.setText(name);
          }
          else{
            JOptionPane.showMessageDialog(null, "File Failed to Generate");
          }
          }
      }catch(Exception e){
          System.out.println(e.getMessage());
      }
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        
        try{
          String path = filename.getText();
          String extension = doctype.getSelectedItem().toString();
          String  locationn= location.getText();
          String fulledition = locationn+"\\"+path+extension;
          File f = new File(fulledition);
          
          if(f.createNewFile()){
            JOptionPane.showMessageDialog(null, "File Created Successful");
            
            
            
            filename.setText("");
            location.setText("");
            filettl.setText(fulledition);
             colorindicator.setBackground(Color.GREEN);
            offon.setText("READY");
             String name= f.getName();
             labelname.setText(name);
          }
          else{
            JOptionPane.showMessageDialog(null, "File Failed to Generate");
          }
      }catch(Exception e){
          System.out.println(e.getMessage());
      }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         try{
             txtarea.setText(null);
            String ll = Filelocation.getText();
            File f = new File(ll);
            filettl.setText(ll);
             colorindicator.setBackground(Color.GREEN);
            offon.setText("READY");
            FileInputStream fis = new FileInputStream(ll);
            byte buffer[] = new byte[fis.available()];
            fis.read(buffer);
            String word = new String(buffer);
            txtarea.setText(word.toString());
            Filelocation.setText("");
             String name= f.getName();
             labelname.setText(name);
//            Scanner scan  = new Scanner(f);
//            if(scan.hasNextLine()){
//                String notes = scan.nextLine();
//           txtarea.setText(notes);
//            }else{
//                JOptionPane.showMessageDialog(null,"No file Selected"); 
//            }
            
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null,"Failed to Load File");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        
        String choosertitle = null;
        chooser.setDialogTitle(choosertitle);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if(chooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            //System.out.println("getCurrentDirectry(): " + chooser.getCurrentDirectory());
           location.setText(chooser.getSelectedFile().toString());
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
chooser.showOpenDialog(this);
String filename = chooser.getSelectedFile().getAbsolutePath();
Filelocation.setText(filename);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        
        try{
            String path = filettl.getText();
            File f = new File(path);
            if(path.equals("")){
                 colorindicator.setBackground(Color.red);
            offon.setText("OFF");
                JOptionPane.showMessageDialog(null,"No file Found"); 
            }else{
            if(f.exists()){
             
            
               String  name = f.getName();
               String  path1 =  f.getAbsolutePath();
           fname.setText(name);
           labelname.setText(name);
           flocation.setText(path1);
            }
            }  
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"ERROR !!!!"); 
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        
         fname.setText("");
           flocation.setText("");
        filettl.setText("");
        txtarea.setText("");
         colorindicator.setBackground(Color.red);
            offon.setText("OFF");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        
        try{
            String del = filettl.getText();
            if(del.equals("")){
                 colorindicator.setBackground(Color.red);
            offon.setText("OFF");
                   JOptionPane.showMessageDialog(null,"No File To Delete"); 
            }
            else{
             File file = new File(del);
             file.delete();
                JOptionPane.showMessageDialog(null,"File deleted"); 
            }
        }catch(Exception e){
               JOptionPane.showMessageDialog(null,"ERROR !!!!"); 
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
     try{
             String locationfile = filettl.getText();
             if(locationfile.equals("")){
                  colorindicator.setBackground(Color.red);
            offon.setText("OFF");
               JOptionPane.showMessageDialog(null, "No file to update");  
             }
             else{
                  colorindicator.setBackground(Color.GREEN);
            offon.setText("READY");
        FileWriter f = new FileWriter(locationfile);
 String words = txtarea.getText();
 f.write(words);
 
 f.close();
  JOptionPane.showMessageDialog(null, " File Updated");
  
             }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "No file to update");
    }
           
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Filelocation;
    public javax.swing.JPanel colorindicator;
    public javax.swing.JComboBox doctype;
    public javax.swing.JTextField filename;
    public javax.swing.JTextField filettl;
    public javax.swing.JLabel flocation;
    public javax.swing.JLabel fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    public javax.swing.JLabel labelname;
    public javax.swing.JTextField location;
    public javax.swing.JLabel offon;
    public static javax.swing.JTextArea txtarea;
    public static final transient javax.swing.JLabel viewdocname = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
