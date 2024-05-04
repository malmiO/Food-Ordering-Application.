package view;
import Controller.CLogin;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {
    public LoginPage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_panal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        pwd_1 = new javax.swing.JPasswordField();
        btn_login1 = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_cls = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        login_panal.setBackground(new java.awt.Color(61, 61, 61));

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\one drive edu\\OneDrive\\Pictures\\chubby foods\\Toast_your_happiness2-removebg-preview.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Password");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Username");

        txt_username.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        pwd_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pwd_1.setForeground(new java.awt.Color(0, 0, 0));
        pwd_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwd_1ActionPerformed(evt);
            }
        });

        btn_login1.setBackground(new java.awt.Color(0, 204, 204));
        btn_login1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_login1.setForeground(new java.awt.Color(0, 0, 0));
        btn_login1.setText("Log In");
        btn_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login1ActionPerformed(evt);
            }
        });

        btn_exit.setBackground(new java.awt.Color(0, 204, 204));
        btn_exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(0, 0, 0));
        btn_exit.setText("EXIT");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        btn_cls.setBackground(new java.awt.Color(0, 204, 204));
        btn_cls.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_cls.setForeground(new java.awt.Color(0, 0, 0));
        btn_cls.setText("Clear");
        btn_cls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_panalLayout = new javax.swing.GroupLayout(login_panal);
        login_panal.setLayout(login_panalLayout);
        login_panalLayout.setHorizontalGroup(
            login_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panalLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(login_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(login_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(login_panalLayout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(login_panalLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pwd_1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_panalLayout.createSequentialGroup()
                            .addComponent(btn_cls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btn_login1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(212, Short.MAX_VALUE))
        );

        login_panalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel3, pwd_1, txt_username});

        login_panalLayout.setVerticalGroup(
            login_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panalLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(login_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(login_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(pwd_1))
                .addGap(18, 18, 18)
                .addComponent(btn_login1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(login_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cls))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        login_panalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel3, pwd_1, txt_username});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_panal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(login_panal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        StartupPage startuppage = new StartupPage();
        startuppage.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_login1ActionPerformed
        String a = txt_username.getText();
        String b = pwd_1.getText();

        if (a.isEmpty() || b.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter both username and password.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method early
    }
        CLogin ob = new CLogin();
        boolean x = ob.checkUserC(a,b);

        if (x)
        {
            JOptionPane.showMessageDialog(null, "Logged in Successfully!");
            Dashboard dashboard = new Dashboard();
            dashboard.setVisible(true);
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password!");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_login1ActionPerformed

    private void btn_clsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clsActionPerformed
        txt_username.setText("");
        pwd_1.setText("");
    }//GEN-LAST:event_btn_clsActionPerformed

    private void pwd_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwd_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwd_1ActionPerformed

        public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cls;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_login1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel login_panal;
    private javax.swing.JPasswordField pwd_1;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
