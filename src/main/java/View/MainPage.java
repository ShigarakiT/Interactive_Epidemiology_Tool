package View;

import Model.PopulationModel;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainPage extends javax.swing.JFrame {
    
    int reportNum = 0;
 
    public MainPage() {
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        popSlider = new javax.swing.JSlider();
        popCurrent = new javax.swing.JLabel();
        popLabel = new javax.swing.JLabel();
        infectedSlider = new javax.swing.JSlider();
        infectedCurrent = new javax.swing.JLabel();
        infectLabel = new javax.swing.JLabel();
        timeSlider = new javax.swing.JSlider();
        timeCurrent = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        covidButton = new javax.swing.JRadioButton();
        fluButton = new javax.swing.JRadioButton();
        vaccineCurrent = new javax.swing.JLabel();
        vaccineLabel = new javax.swing.JLabel();
        vaccineSlider = new javax.swing.JSlider();
        quarantineCurrent = new javax.swing.JLabel();
        quarantineLabel = new javax.swing.JLabel();
        quarantineSlider = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        instructions = new javax.swing.JTextArea();
        aboutModelButton = new javax.swing.JButton();
        aboutModelButton1 = new javax.swing.JButton();
        bubonicButton = new javax.swing.JRadioButton();
        userHistoryButton = new javax.swing.JButton();
        cleanHistoryButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        popSlider.setMaximum(100000);
        popSlider.setMinimum(10000);
        popSlider.setToolTipText("");
        popSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                popSliderStateChanged(evt);
            }
        });

        popCurrent.setForeground(new java.awt.Color(204, 204, 204));
        popCurrent.setLabelFor(popSlider);
        popCurrent.setText("10000");
        popCurrent.setToolTipText("");

        popLabel.setForeground(new java.awt.Color(204, 204, 204));
        popLabel.setLabelFor(popSlider);
        popLabel.setText("Population");

        infectedSlider.setMinimum(1);
        infectedSlider.setToolTipText("");
        infectedSlider.setValue(1);
        infectedSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                infectedSliderStateChanged(evt);
            }
        });

        infectedCurrent.setForeground(new java.awt.Color(204, 204, 204));
        infectedCurrent.setLabelFor(infectedSlider);
        infectedCurrent.setText("1");
        infectedCurrent.setToolTipText("");

        infectLabel.setForeground(new java.awt.Color(204, 204, 204));
        infectLabel.setLabelFor(infectedSlider);
        infectLabel.setText("Infected");

        timeSlider.setMaximum(365);
        timeSlider.setMinimum(100);
        timeSlider.setToolTipText("");
        timeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                timeSliderStateChanged(evt);
            }
        });

        timeCurrent.setForeground(new java.awt.Color(204, 204, 204));
        timeCurrent.setLabelFor(timeSlider);
        timeCurrent.setText("100");
        timeCurrent.setToolTipText("");

        timeLabel.setForeground(new java.awt.Color(204, 204, 204));
        timeLabel.setLabelFor(timeSlider);
        timeLabel.setText("Timeframe");

        buttonGroup2.add(covidButton);
        covidButton.setForeground(new java.awt.Color(204, 204, 204));
        covidButton.setSelected(true);
        covidButton.setText("Covid-19");
        covidButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                covidButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(fluButton);
        fluButton.setForeground(new java.awt.Color(204, 204, 204));
        fluButton.setText("Influenza");
        fluButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fluButtonActionPerformed(evt);
            }
        });

        vaccineCurrent.setForeground(new java.awt.Color(204, 204, 204));
        vaccineCurrent.setLabelFor(vaccineSlider);
        vaccineCurrent.setText("0");
        vaccineCurrent.setToolTipText("");

        vaccineLabel.setForeground(new java.awt.Color(204, 204, 204));
        vaccineLabel.setLabelFor(infectedSlider);
        vaccineLabel.setText("Percent of population that is vaccinated");

        vaccineSlider.setToolTipText("");
        vaccineSlider.setValue(0);
        vaccineSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                vaccineSliderStateChanged(evt);
            }
        });

        quarantineCurrent.setForeground(new java.awt.Color(204, 204, 204));
        quarantineCurrent.setLabelFor(quarantineSlider);
        quarantineCurrent.setText("0");
        quarantineCurrent.setToolTipText("");

        quarantineLabel.setForeground(new java.awt.Color(204, 204, 204));
        quarantineLabel.setLabelFor(quarantineSlider);
        quarantineLabel.setText("Percent of population that quarantine when displaying symptoms");

        quarantineSlider.setToolTipText("");
        quarantineSlider.setValue(0);
        quarantineSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quarantineSliderStateChanged(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(204, 204, 204));

        instructions.setEditable(false);
        instructions.setBackground(new java.awt.Color(51, 51, 51));
        instructions.setColumns(20);
        instructions.setForeground(new java.awt.Color(204, 204, 204));
        instructions.setLineWrap(true);
        instructions.setRows(5);
        instructions.setText("Welcome to our interactive epidemiology tool!\n\nTo get started please select a disease you wish to simulate.\nAfter that please selection the parameters and safeguards you\nwould like to simulate for that disease.\n\nWhen you are happy with your selection please hit Start.\n\nIf you would like to learn more about a component please hit Learn More.");
        jScrollPane1.setViewportView(instructions);

        aboutModelButton.setBackground(new java.awt.Color(0, 0, 51));
        aboutModelButton.setForeground(new java.awt.Color(204, 204, 204));
        aboutModelButton.setText("Learn More");
        aboutModelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutModelButtonActionPerformed(evt);
            }
        });

        aboutModelButton1.setBackground(new java.awt.Color(0, 0, 51));
        aboutModelButton1.setForeground(new java.awt.Color(204, 204, 204));
        aboutModelButton1.setText("Learn More");
        aboutModelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutModelButton1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(bubonicButton);
        bubonicButton.setForeground(new java.awt.Color(204, 204, 204));
        bubonicButton.setText("Black Death");
        bubonicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubonicButtonActionPerformed(evt);
            }
        });

        userHistoryButton.setBackground(new java.awt.Color(0, 0, 51));
        userHistoryButton.setForeground(new java.awt.Color(204, 204, 204));
        userHistoryButton.setText("User History");
        userHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userHistoryButtonActionPerformed(evt);
            }
        });

        cleanHistoryButton.setBackground(new java.awt.Color(0, 0, 51));
        cleanHistoryButton.setForeground(new java.awt.Color(204, 204, 204));
        cleanHistoryButton.setText("Clean History");
        cleanHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanHistoryButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        startButton.setBackground(new java.awt.Color(0, 0, 51));
        startButton.setForeground(new java.awt.Color(204, 204, 204));
        startButton.setText("Start!");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(startButton)
                .addContainerGap(647, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(570, Short.MAX_VALUE)
                .addComponent(startButton)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(646, 646, 646)
                .addComponent(popSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(686, 686, 686)
                .addComponent(aboutModelButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(718, 718, 718)
                .addComponent(popCurrent))
            .addGroup(layout.createSequentialGroup()
                .addGap(563, 563, 563)
                .addComponent(userHistoryButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(717, 717, 717)
                .addComponent(timeCurrent))
            .addGroup(layout.createSequentialGroup()
                .addGap(478, 478, 478)
                .addComponent(quarantineLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(572, 572, 572)
                .addComponent(popLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(563, 563, 563)
                .addComponent(timeLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(646, 646, 646)
                .addComponent(timeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(covidButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(cleanHistoryButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(fluButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(583, 583, 583)
                .addComponent(infectLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(646, 646, 646)
                .addComponent(infectedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(592, 592, 592)
                .addComponent(vaccineLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(646, 646, 646)
                .addComponent(quarantineSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(aboutModelButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(646, 646, 646)
                .addComponent(vaccineSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(bubonicButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(740, 740, 740)
                .addComponent(quarantineCurrent))
            .addGroup(layout.createSequentialGroup()
                .addGap(740, 740, 740)
                .addComponent(vaccineCurrent))
            .addGroup(layout.createSequentialGroup()
                .addGap(733, 733, 733)
                .addComponent(infectedCurrent))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(popSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(aboutModelButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(popCurrent))
            .addGroup(layout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(userHistoryButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(timeCurrent))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(quarantineLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(popLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(484, 484, 484)
                .addComponent(timeLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(484, 484, 484)
                .addComponent(timeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(covidButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(cleanHistoryButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(fluButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(infectLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(infectedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(vaccineLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(quarantineSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(aboutModelButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(vaccineSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(bubonicButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(quarantineCurrent))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(vaccineCurrent))
            .addGroup(layout.createSequentialGroup()
                .addGap(388, 388, 388)
                .addComponent(infectedCurrent))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // TODO: Implement observer
    // I believe this is the data that requires implementing an observer for
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        PopulationModel epidemic = new PopulationModel();
        
        epidemic.setPop(popSlider.getValue());
        epidemic.setInfected(infectedSlider.getValue());
        epidemic.setTimeframe(timeSlider.getValue());
        
        if(covidButton.isSelected()){             
            epidemic.setInfectionRate(epidemic.setRateCovid(vaccineSlider.getValue(), quarantineSlider.getValue()));
            epidemic.setIncubation(5.0, 7.0);
            epidemic.setRecovery(7.0, 12.0);
        }
        else if(fluButton.isSelected()){  
            epidemic.setInfectionRate(epidemic.setRateFlu(vaccineSlider.getValue(), quarantineSlider.getValue()));
            epidemic.setIncubation(1.0, 4.0);
            epidemic.setRecovery(4.0, 14.0);
        }
        else if(bubonicButton.isSelected()){   
            epidemic.setInfectionRate(0.4);
            epidemic.setIncubation(2.0, 8.0);
            epidemic.setRecovery(3.0, 6.0);
        }
        
        epidemic.simulate();
        
        reportNum++;
        
        try {
            FileWriter writer;
            writer = new FileWriter("UserReport.txt", true);
            writer.write("Report Number: " + reportNum);
            writer.write("\r\n");
            writer.write("S" + epidemic.S.get(epidemic.getTimeframe()).toString() + "\n");
            writer.write("E" + epidemic.E.get(epidemic.getTimeframe()).toString() + "\n");
            writer.write("I" + epidemic.I.get(epidemic.getTimeframe()).toString() + "\n");
            writer.write("R" + epidemic.R.get(epidemic.getTimeframe()).toString() + "\n\n");
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        ResultsPage results = new ResultsPage(new MainPage(), true, 
                epidemic, timeSlider.getValue());
        results.setVisible(true);
    }//GEN-LAST:event_startButtonActionPerformed

    private void popSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_popSliderStateChanged
        popCurrent.setText(""+popSlider.getValue());
    }//GEN-LAST:event_popSliderStateChanged

    private void infectedSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_infectedSliderStateChanged
        infectedCurrent.setText(""+infectedSlider.getValue());
    }//GEN-LAST:event_infectedSliderStateChanged

    private void timeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_timeSliderStateChanged
        timeCurrent.setText(""+timeSlider.getValue());
    }//GEN-LAST:event_timeSliderStateChanged

    private void covidButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_covidButtonActionPerformed
        vaccineSlider.setEnabled(true);
        quarantineSlider.setEnabled(true);
    }//GEN-LAST:event_covidButtonActionPerformed

    private void fluButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fluButtonActionPerformed
        vaccineSlider.setEnabled(true);
        quarantineSlider.setEnabled(true);
    }//GEN-LAST:event_fluButtonActionPerformed

    private void vaccineSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_vaccineSliderStateChanged
        vaccineCurrent.setText(""+vaccineSlider.getValue());
    }//GEN-LAST:event_vaccineSliderStateChanged

    private void quarantineSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quarantineSliderStateChanged
        quarantineCurrent.setText(""+quarantineSlider.getValue());
    }//GEN-LAST:event_quarantineSliderStateChanged

    private void aboutModelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutModelButtonActionPerformed
        String fileToRead = "Instructions.txt";
        ReadMorePage infodump = new ReadMorePage(new MainPage(), true, fileToRead);
        infodump.setVisible(true);
    }//GEN-LAST:event_aboutModelButtonActionPerformed

    private void aboutModelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutModelButton1ActionPerformed
        String fileToRead = "Safeguards.txt";
        ReadMorePage infodump = new ReadMorePage(new MainPage(), true, fileToRead);
        infodump.setVisible(true);
    }//GEN-LAST:event_aboutModelButton1ActionPerformed

    private void bubonicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubonicButtonActionPerformed
        vaccineSlider.setEnabled(false);
        quarantineSlider.setEnabled(false);
    }//GEN-LAST:event_bubonicButtonActionPerformed

    private void userHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userHistoryButtonActionPerformed
        String fileToRead = "UserReport.txt";
        ReadMorePage infodump = new ReadMorePage(new MainPage(), true, fileToRead);
        infodump.setVisible(true);
    }//GEN-LAST:event_userHistoryButtonActionPerformed

    private void cleanHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanHistoryButtonActionPerformed
        try {
            FileWriter writer;
            writer = new FileWriter("UserReport.txt", false);
            writer.write(".");
        } catch (IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cleanHistoryButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            FileWriter writer;
            writer = new FileWriter("UserReport.txt", false);
            writer.write(".");
        } catch (IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutModelButton;
    private javax.swing.JButton aboutModelButton1;
    private javax.swing.JRadioButton bubonicButton;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cleanHistoryButton;
    private javax.swing.JRadioButton covidButton;
    private javax.swing.JRadioButton fluButton;
    private javax.swing.JLabel infectLabel;
    private javax.swing.JLabel infectedCurrent;
    private javax.swing.JSlider infectedSlider;
    private javax.swing.JTextArea instructions;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel popCurrent;
    private javax.swing.JLabel popLabel;
    private javax.swing.JSlider popSlider;
    private javax.swing.JLabel quarantineCurrent;
    private javax.swing.JLabel quarantineLabel;
    private javax.swing.JSlider quarantineSlider;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel timeCurrent;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JSlider timeSlider;
    private javax.swing.JButton userHistoryButton;
    private javax.swing.JLabel vaccineCurrent;
    private javax.swing.JLabel vaccineLabel;
    private javax.swing.JSlider vaccineSlider;
    // End of variables declaration//GEN-END:variables
}
