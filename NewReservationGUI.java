package flightreservation;

import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class NewReservationGUI extends javax.swing.JFrame {
    private ArrayList<String> $loadedFlightsFinal = new ArrayList<>();
    private int $currentFlightNO =0;
    
    public NewReservationGUI() {
        initComponents();
    }
    
    void postFlightName(String $FLname){
        fTXT.setText($FLname);
    }
    
    void postInfo(ArrayList<String> $loadedFlights,int $currentFlight){
        $loadedFlightsFinal=$loadedFlights;
        $currentFlightNO = $currentFlight;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fTXT = new javax.swing.JTextField();
        fnTXT = new javax.swing.JTextField();
        lnTXT = new javax.swing.JTextField();
        tCMB = new javax.swing.JComboBox<String>();
        ccTXT = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        fstBUT = new javax.swing.JRadioButton();
        busBUT = new javax.swing.JRadioButton();
        ecoBUT = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reqTXT = new javax.swing.JTextArea();
        okBUT = new javax.swing.JButton();
        canBUT = new javax.swing.JButton();
        status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Reservation");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("New Reservation");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Please Fill up required feilds indicated by a * sign.");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservation/pics/new.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(379, 379, 379))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Given Name*:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Flight:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Title:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Special Requests:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Family Name*:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Credit Card Numeber*:");

        fTXT.setEditable(false);
        fTXT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        fnTXT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lnTXT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tCMB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tCMB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rev.", "Ven.", "Mr.", "Mrs.", "Miss." }));

        ccTXT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ccTXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ccTXTKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ccTXTKeyReleased(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Class*: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        buttonGroup1.add(fstBUT);
        fstBUT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fstBUT.setText("First Class");

        buttonGroup1.add(busBUT);
        busBUT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        busBUT.setText("Business Class");

        buttonGroup1.add(ecoBUT);
        ecoBUT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ecoBUT.setSelected(true);
        ecoBUT.setText("Economy Class");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fstBUT)
                .addGap(18, 18, 18)
                .addComponent(busBUT)
                .addGap(18, 18, 18)
                .addComponent(ecoBUT)
                .addGap(88, 88, 88))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(fstBUT)
                .addComponent(busBUT)
                .addComponent(ecoBUT))
        );

        reqTXT.setColumns(20);
        reqTXT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        reqTXT.setRows(5);
        jScrollPane1.setViewportView(reqTXT);

        okBUT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        okBUT.setText("OK");
        okBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBUTActionPerformed(evt);
            }
        });

        canBUT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        canBUT.setText("Cancel");
        canBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canBUTActionPerformed(evt);
            }
        });

        status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservation/pics/appbar.alert.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(ccTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(status))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(fnTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lnTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tCMB, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(fTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(okBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(canBUT)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tCMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ccTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(status))
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canBUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(okBUT))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/flightreservation/pics/appico.png")));
        status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservation/pics/appbar.alert.png")));
        
    }//GEN-LAST:event_formWindowOpened

    private void canBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canBUTActionPerformed
        this.dispose();
    }//GEN-LAST:event_canBUTActionPerformed

    private void okBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBUTActionPerformed
        if(fnTXT.getText().isEmpty() || lnTXT.getText().isEmpty() || ccTXT.getText().isEmpty()){
            errorMngrGUI err = new errorMngrGUI();
            err.setVisible(true);
            err.setError("Fill all required fields \nbefore proceed");
        }else{
            
            String $creditCard = ccTXT.getText();
            int $ccLength = 0;
            
            for (int i=0; i<$creditCard.length();i++){
                if(Character.isDigit($creditCard.charAt(i))){
                    $ccLength++;
                }
            }
            if($ccLength == 16){
                FlightBooking $addBooking = new FlightBooking();
                                
                String $Flight = $loadedFlightsFinal.get($currentFlightNO);
                String $Title = (tCMB.getSelectedItem()).toString();
                String $fName = fnTXT.getText();
                String $lName = lnTXT.getText();
                String $ccDigits = ccTXT.getText();
                
                String $newCC = $ccDigits.substring(0,4)+"-"+$ccDigits.substring(4,8)+"-"+$ccDigits.substring(8,12)+"-"+$ccDigits.substring(12,16);
                
                String $getClass ="";
                if(fstBUT.isSelected()){
                    $getClass=fstBUT.getText();
                }
                if(busBUT.isSelected()){
                    $getClass=busBUT.getText();
                }
                if(ecoBUT.isSelected()){
                    $getClass=ecoBUT.getText();
                }
                
                String $spReq = "";
                if (reqTXT.getText().isEmpty()){
                    $spReq="None";
                }else{
                    String []$singleReq=reqTXT.getText().split("\\n");
                    for(int $i=0;$i<$singleReq.length;$i++){
                        $spReq+=(","+$singleReq[$i]);
                    }
                }
                
                
                try {
                    $addBooking.addNew($Flight,$Title,$fName,$lName,$newCC,$getClass, $spReq);
                } catch (IOException ex) {
                    Logger.getLogger(NewReservationGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
            } else {
                errorMngrGUI err = new errorMngrGUI();
                err.setVisible(true);
                err.setError("Payment Details provided are\nIncorrect.Please Check again");
                
                ccTXT.setText("");
            }
        }
    }//GEN-LAST:event_okBUTActionPerformed

    private void ccTXTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccTXTKeyPressed
        char $getEntered = evt.getKeyChar();
        if(Character.isLetter($getEntered)){ 
            
            errorMngrGUI err = new errorMngrGUI();
            err.setVisible(true);
            err.setError("Credit Card number should only\ncontain Digits");
            
            String $getDigits = ccTXT.getText();
            $getDigits = $getDigits.replace($getDigits.substring($getDigits.length()-1),"");
            ccTXT.setText($getDigits);
        }
    }//GEN-LAST:event_ccTXTKeyPressed

    private void ccTXTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccTXTKeyReleased
        if(ccTXT.getText().length()==16){
                    status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservation/pics/ok.png")));
                }else{
                    status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservation/pics/nok.png")));
                }
    }//GEN-LAST:event_ccTXTKeyReleased

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
            java.util.logging.Logger.getLogger(NewReservationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewReservationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewReservationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewReservationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewReservationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton busBUT;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton canBUT;
    private javax.swing.JTextField ccTXT;
    private javax.swing.JRadioButton ecoBUT;
    private javax.swing.JTextField fTXT;
    private javax.swing.JTextField fnTXT;
    private javax.swing.JRadioButton fstBUT;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lnTXT;
    private javax.swing.JButton okBUT;
    private javax.swing.JTextArea reqTXT;
    private javax.swing.JLabel status;
    private javax.swing.JComboBox<String> tCMB;
    // End of variables declaration//GEN-END:variables
}
