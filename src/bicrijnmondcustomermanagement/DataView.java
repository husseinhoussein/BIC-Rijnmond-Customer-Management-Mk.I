
package bicrijnmondcustomermanagement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ikkileo
 */
public final class DataView extends javax.swing.JFrame {

    
  public static Connection connect = null;
  protected static java.sql.Statement statement = null;
  protected static PreparedStatement preparedStatement = null;
  protected static ResultSet resultSet = null;
    
  /**
     * Creates new form DataView
     */
  
  
    public DataView() throws Exception {
               

     initComponents();
     connect = DriverManager
            .getConnection("jdbc:mysql://127.0.0.1/test?"
                + "user=root&password=MSQLpass21!");
    // .getConnection("jdbc:mysql://82.197.130.55:3306/1522552_test?"
     //           + "user=1522552_test&password=MSQLpass21!");
     TheRefresher();
    }
  private void TheRefresher(){
     Update_tableCustomers();
     Update_tableTickets();
     fillComboBoxnaam();
     fillComboBoxbedrijf(); }  
private void Update_tableCustomers(){
      try {
          String sql = "select * from customers";
          preparedStatement=connect.prepareStatement(sql);
          resultSet=preparedStatement.executeQuery();
        Table_customer.setModel(DbUtils.resultSetToTableModel(resultSet));  
          
          
      } catch (SQLException ex) {
          Logger.getLogger(DataView.class.getName()).log(Level.SEVERE, null, ex);
      }finally {
try{
resultSet.close(); preparedStatement.close(); }
catch(Exception e) { } }
 }

private void Update_tableTickets(){
      try {
          String sql = "select * from tickets";
          preparedStatement=connect.prepareStatement(sql);
          resultSet=preparedStatement.executeQuery();
        table_tickets.setModel(DbUtils.resultSetToTableModel(resultSet));  
          
        
          
      } catch (SQLException ex) {
          Logger.getLogger(DataView.class.getName()).log(Level.SEVERE, null, ex);
      }finally {
try{
resultSet.close(); preparedStatement.close(); }
catch(Exception e) { } }
 }
       //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ticket = new javax.swing.JFrame();
        jpTicketId_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpNaam_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxPprio = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxpStat = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jpOmschrijving_txt = new javax.swing.JTextArea();
        jPopupEditBtn = new javax.swing.JButton();
        jpBedrijfsnaam_txt = new javax.swing.JTextField();
        Window = new javax.swing.JTabbedPane();
        Customers = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jNaam = new javax.swing.JLabel();
        lNaam = new javax.swing.JTextField();
        jEmail = new javax.swing.JLabel();
        lEmail = new javax.swing.JTextField();
        jAdres = new javax.swing.JLabel();
        lAdres = new javax.swing.JTextField();
        jPlaats = new javax.swing.JLabel();
        lPlaats = new javax.swing.JTextField();
        jPostcode = new javax.swing.JLabel();
        lPostcode = new javax.swing.JTextField();
        jTelefoon = new javax.swing.JLabel();
        lTelefoon = new javax.swing.JTextField();
        jBedrijfsNaam = new javax.swing.JLabel();
        lBedrijfsNaam = new javax.swing.JTextField();
        Dataview = new javax.swing.JScrollPane();
        Table_customer = new javax.swing.JTable();
        Refresh = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        HelpDeskBtn = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lOmschrijving = new javax.swing.JTextArea();
        jComboBoxPrio = new javax.swing.JComboBox();
        jPrioriteit = new javax.swing.JLabel();
        jnaamT = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxBedr = new javax.swing.JComboBox();
        jComboBoxNam = new javax.swing.JComboBox();
        JOmschrijving = new javax.swing.JLabel();
        jStatus = new javax.swing.JLabel();
        jComboBoxStat = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_tickets = new javax.swing.JTable();
        BackBtn = new javax.swing.JButton();
        Addbtn2 = new javax.swing.JButton();

        Ticket.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ticket.setMinimumSize(new java.awt.Dimension(450, 495));

        jpTicketId_txt.setEnabled(false);

        jLabel2.setText("Ticket Id:");

        jLabel3.setText("Naam:");

        jpNaam_txt.setEnabled(false);

        jLabel4.setText("Prioriteit:");

        jComboBoxPprio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hoog", "Midden", "Laag", "Extreem" }));

        jLabel5.setText("Status:");

        jComboBoxpStat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Open", "Doing", "Done", "Geëscaleerd" }));

        jLabel6.setText("Omschrijving:");

        jpOmschrijving_txt.setColumns(20);
        jpOmschrijving_txt.setLineWrap(true);
        jpOmschrijving_txt.setRows(5);
        jpOmschrijving_txt.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jpOmschrijving_txt);

        jPopupEditBtn.setText("Edit");
        jPopupEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPopupEditBtnActionPerformed(evt);
            }
        });

        jpBedrijfsnaam_txt.setText(" ");
        jpBedrijfsnaam_txt.setEnabled(false);

        javax.swing.GroupLayout TicketLayout = new javax.swing.GroupLayout(Ticket.getContentPane());
        Ticket.getContentPane().setLayout(TicketLayout);
        TicketLayout.setHorizontalGroup(
            TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TicketLayout.createSequentialGroup()
                .addGroup(TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TicketLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jpTicketId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TicketLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jpNaam_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpBedrijfsnaam_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TicketLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxPprio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TicketLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxpStat, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TicketLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6))
                    .addGroup(TicketLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TicketLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jPopupEditBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TicketLayout.setVerticalGroup(
            TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TicketLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TicketLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jpTicketId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TicketLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addGroup(TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jpNaam_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jpBedrijfsnaam_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TicketLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(jComboBoxPprio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TicketLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(jComboBoxpStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPopupEditBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jNaam.setText("Naam");

        jEmail.setText("E-mail");

        jAdres.setText("Adres");

        jPlaats.setText("Plaats");

        jPostcode.setText("Postcode");

        jTelefoon.setText("Telefoon");

        jBedrijfsNaam.setText("Bedrijfsnaam");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lBedrijfsNaam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addComponent(lTelefoon, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lPostcode, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lPlaats, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lAdres, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lNaam))
                    .addComponent(jAdres)
                    .addComponent(jPlaats)
                    .addComponent(jPostcode)
                    .addComponent(jTelefoon)
                    .addComponent(jBedrijfsNaam)
                    .addComponent(jNaam)
                    .addComponent(jEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jNaam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lNaam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAdres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lAdres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPlaats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lPlaats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPostcode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTelefoon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lTelefoon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBedrijfsNaam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lBedrijfsNaam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Table_customer.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Table_customerMouseReleased(evt);
            }
        });
        Dataview.setViewportView(Table_customer);

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        HelpDeskBtn.setText("Helpdesk");
        HelpDeskBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpDeskBtnActionPerformed(evt);
            }
        });

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jLabel7.setText("Search:");

        javax.swing.GroupLayout CustomersLayout = new javax.swing.GroupLayout(Customers);
        Customers.setLayout(CustomersLayout);
        CustomersLayout.setHorizontalGroup(
            CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CustomersLayout.createSequentialGroup()
                        .addGroup(CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Edit, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(Submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HelpDeskBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CustomersLayout.createSequentialGroup()
                        .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Dataview, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE))
                .addContainerGap())
        );
        CustomersLayout.setVerticalGroup(
            CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomersLayout.createSequentialGroup()
                .addGroup(CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CustomersLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HelpDeskBtn)
                            .addComponent(Edit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CustomersLayout.createSequentialGroup()
                        .addGroup(CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CustomersLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(1, 1, 1)
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addComponent(Dataview))
                        .addGap(24, 24, 24)))
                .addGroup(CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Refresh)
                    .addComponent(Delete)
                    .addComponent(Submit))
                .addContainerGap())
        );

        Window.addTab("Customers", Customers);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel3MouseMoved(evt);
            }
        });

        lOmschrijving.setColumns(20);
        lOmschrijving.setLineWrap(true);
        lOmschrijving.setRows(5);
        lOmschrijving.setWrapStyleWord(true);
        jScrollPane1.setViewportView(lOmschrijving);

        jComboBoxPrio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hoog", "Midden", "Laag", "Extreem" }));

        jPrioriteit.setText("Prioriteit:");

        jnaamT.setText("Naam:");

        jLabel1.setText("Bedrijf:");

        jComboBoxBedr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-select-" }));

        jComboBoxNam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-select-" }));
        jComboBoxNam.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxNamPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxNam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxNamItemStateChanged(evt);
            }
        });

        JOmschrijving.setText("Omschrijving:");

        jStatus.setText("Status:");

        jComboBoxStat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Open", "Doing", "Done", "Geëscaleerd" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JOmschrijving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxBedr, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jnaamT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPrioriteit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jStatus, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jComboBoxNam, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxStat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxPrio, 0, 122, Short.MAX_VALUE))))))
                        .addGap(0, 105, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jnaamT)
                    .addComponent(jComboBoxNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxBedr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPrioriteit)
                    .addComponent(jComboBoxPrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jStatus))
                .addGap(18, 18, 18)
                .addComponent(JOmschrijving, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        table_tickets.setModel(new javax.swing.table.DefaultTableModel(
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
        table_tickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                table_ticketsMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(table_tickets);

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        Addbtn2.setText("Add");
        Addbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Addbtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BackBtn)
                            .addComponent(Addbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Addbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackBtn)
                .addContainerGap())
            .addComponent(jScrollPane2)
        );

        Window.addTab("Tickets", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Window, javax.swing.GroupLayout.DEFAULT_SIZE, 1298, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Window)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        String sql ="delete from test.customers where NAAM=? ";
        try {
            // TODO add your handling code here:
            preparedStatement = connect.prepareStatement(sql);

            preparedStatement.setString(1, lNaam.getText());
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted");

        } catch (SQLException ex) {
            Logger.getLogger(DataView.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
try{
resultSet.close(); preparedStatement.close(); }
catch(Exception e) { } }
        TheRefresher();
    }//GEN-LAST:event_DeleteActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        TheRefresher();
        lNaam.setText(null);
        lEmail.setText(null);
        lAdres.setText(null);
        lPlaats.setText(null);
        lPostcode.setText(null);
        lTelefoon.setText(null);
        lBedrijfsNaam.setText(null);
        txt_search.setText(null);
    }//GEN-LAST:event_RefreshActionPerformed

    private void Table_customerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_customerMouseReleased
      try{
        
        int row = Table_customer.getSelectedRow();
        String TClick = (Table_customer.getModel().getValueAt(row, 0).toString());
        String sql="select * from customers where KL_NR='"+TClick+"'";
        preparedStatement=connect.prepareStatement(sql);
        resultSet=preparedStatement.executeQuery();
        if(resultSet.next()){
            SearchIfStm();
        }
        
        
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally {
try{
resultSet.close(); preparedStatement.close(); }
catch(Exception e) { } }
    }//GEN-LAST:event_Table_customerMouseReleased

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed

       try{
        int row = Table_customer.getSelectedRow();
         if(row < 0) {
      JOptionPane.showMessageDialog(null, "Selecteer eerst een rij!" ); 
      return;
         }
        String TClick = (Table_customer.getModel().getValueAt(row, 0).toString());
        
       
           String edit1 = lNaam.getText();
           String edit2 = lEmail.getText();
           String edit3 = lAdres.getText();
           String edit4 = lPlaats.getText();
           String edit5 = lPostcode.getText();
           String edit6 = lTelefoon.getText();
           String edit7 = lBedrijfsNaam.getText();
           
           String sql="update customers set naam='"+edit1+"',email='"+edit2+"',adres='"+edit3+"',plaats='"+edit4+"',postcode='"+edit5+"',telefoon='"+edit6+"',bedrijfsnaam='"+edit7+"'where KL_NR='"+TClick+"'";
           preparedStatement=connect.prepareStatement(sql);
           preparedStatement.execute();
        JOptionPane.showMessageDialog(null, "Updated");
       TheRefresher();
       
       
       }catch(SQLException | HeadlessException e){
       JOptionPane.showMessageDialog(null, e);
       }finally {
try{ //Update_tableCustomers();
resultSet.close(); preparedStatement.close(); }
catch(Exception e) { } }
        
        
    }//GEN-LAST:event_EditActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        try {
          String sql ="INSERT INTO customers (NAAM, EMAIL, ADRES, "
                + "PLAATS, POSTCODE, TELEFOON, BEDRIJFSNAAM) values (?,?,?,?,?,?,?)";

    
            preparedStatement=connect.prepareStatement(sql);
            preparedStatement.setString(1, lNaam.getText());
            preparedStatement.setString(2, lEmail.getText());
            preparedStatement.setString(3, lAdres.getText());
            preparedStatement.setString(4, lPlaats.getText());
            preparedStatement.setString(5, lPostcode.getText());
            preparedStatement.setString(6, lTelefoon.getText());
            preparedStatement.setString(7, lBedrijfsNaam.getText());
            preparedStatement.execute();
            
            lNaam.setText(null);
            lEmail.setText(null);
            lAdres.setText(null);
            lPlaats.setText(null);
            lPostcode.setText(null);
            lTelefoon.setText(null);
            lBedrijfsNaam.setText(null);

          TheRefresher();
        } catch (SQLException ex) {
            Logger.getLogger(DataView.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
try{
resultSet.close(); preparedStatement.close(); }
catch(Exception e) { } }
    }//GEN-LAST:event_SubmitActionPerformed

    private void HelpDeskBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpDeskBtnActionPerformed
Window.setSelectedIndex(1);
    }//GEN-LAST:event_HelpDeskBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
Window.setSelectedIndex(0);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void Addbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Addbtn2ActionPerformed
        // OVVER HERE SEE MEE!!!!!!!
       try{
               
        String sql="INSERT INTO tickets (NAAM , BEDRIJFSNAAM, Prioriteit,Status , OMSCHRIJVING) values(?,?,?,?,?)" ;
      
        preparedStatement=connect.prepareStatement(sql);
        

             String nameValue = jComboBoxNam.getSelectedItem().toString();
             preparedStatement.setString(1, nameValue);
             String bedrijfnmValue = jComboBoxBedr.getSelectedItem().toString();
             preparedStatement.setString(2, bedrijfnmValue);
             String priorityValue = jComboBoxPrio.getSelectedItem().toString();
             preparedStatement.setString(3, priorityValue);
             String statusValue = jComboBoxStat.getSelectedItem().toString();
             preparedStatement.setString(4, statusValue);
             preparedStatement.setString(5, lOmschrijving.getText());
             
             
         
          preparedStatement.execute();
          Update_tableTickets();
          table_tickets.repaint();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e)
                   ;}finally {
try{
resultSet.close(); preparedStatement.close(); }
catch(Exception e) { } }
        
        
        
        
        
    }//GEN-LAST:event_Addbtn2ActionPerformed

    private void jPanel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseMoved
//fillComboBoxbedrijf();          // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseMoved

    private void jComboBoxNamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxNamItemStateChanged
   // fillComboBoxbedrijf();
    }//GEN-LAST:event_jComboBoxNamItemStateChanged

    private void jComboBoxNamPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxNamPopupMenuWillBecomeInvisible
fillComboBoxbedrijf();        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNamPopupMenuWillBecomeInvisible

    private void table_ticketsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_ticketsMouseReleased
        try{
        
        int row = table_tickets.getSelectedRow();
        String TClick = (table_tickets.getModel().getValueAt(row, 0).toString());
        String sql="select * from Tickets where Ticket_Id='"+TClick+"'";
        preparedStatement=connect.prepareStatement(sql);
        resultSet=preparedStatement.executeQuery();
        if(resultSet.next()){
            String add0 =resultSet.getString("Ticket_Id");
            jpTicketId_txt.setText(add0);
            String add1 =resultSet.getString("Naam");
            jpNaam_txt.setText(add1);
            String add2 =resultSet.getString("Bedrijfsnaam");
            jpBedrijfsnaam_txt.setText(add2);
            String add3 =resultSet.getString("Omschrijving");
            jpOmschrijving_txt.setText(add3);
           
        }
        
        
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally {
try{
resultSet.close(); preparedStatement.close(); }
catch(Exception e) { } }
        
        
        Ticket.setVisible(true);
    }//GEN-LAST:event_table_ticketsMouseReleased

    private void jPopupEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPopupEditBtnActionPerformed
        
       try{
           int row = table_tickets.getSelectedRow();
           String TClick = (table_tickets.getModel().getValueAt(row, 0).toString());
           //String edit1 = jpTicketId_txt.getText();
           String edit2 = jpNaam_txt.getText();
           String edit3 = jpBedrijfsnaam_txt.getText();
           String edit4 = jComboBoxPprio.getSelectedItem().toString();
           String edit5 = jComboBoxpStat.getSelectedItem().toString();
           String edit6 = jpOmschrijving_txt.getText();
           //ticket_id='"+edit1+"',
           
           String sql="update tickets set Naam='"+edit2+"',Bedrijfsnaam='"+edit3+"',Prioriteit='"+edit4+"',Status='"+edit5+"',omschrijving='"+edit6+"' where Ticket_Id='"+TClick+"'";
           preparedStatement=connect.prepareStatement(sql);
           preparedStatement.execute();
      //  JOptionPane.showMessageDialog(null, "Updated");
       TheRefresher();
       }catch(SQLException | HeadlessException e){
       JOptionPane.showMessageDialog(null, e);
       }finally {
try{
resultSet.close(); preparedStatement.close(); }
catch(Exception e) { } }
        Update_tableCustomers();
        Ticket.dispose();
    }//GEN-LAST:event_jPopupEditBtnActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
       try
       {
           String sql = "select * from customers where naam =?";
           
           preparedStatement=connect.prepareStatement(sql);
          
           preparedStatement.setString(1, txt_search.getText());
           resultSet=preparedStatement.executeQuery();
           if(resultSet.next()){
            SearchIfStm();
           }
           
           
       }
       catch(Exception e){JOptionPane.showMessageDialog(null, e);}
       
        try
       {
           
           String sql2 = "select * from customers where KL_NR =?";
           preparedStatement=connect.prepareStatement(sql2);
           preparedStatement.setString(1, txt_search.getText());
           resultSet=preparedStatement.executeQuery();
           if(resultSet.next()){
            SearchIfStm();
           }
           
       }
       catch(Exception e){JOptionPane.showMessageDialog(null, e);}
        
    }//GEN-LAST:event_txt_searchKeyReleased

      private void SearchIfStm(){
      try{
      
            String add1=resultSet.getString("naam");
            lNaam.setText(add1);
            String add2 =resultSet.getString("Email");
            lEmail.setText(add2);
            String add3 =resultSet.getString("Adres");
            lAdres.setText(add3);
            String add4 =resultSet.getString("Plaats");
            lPlaats.setText(add4);
            String add5 =resultSet.getString("Postcode");
            lPostcode.setText(add5);
            String add6 =resultSet.getString("Telefoon");
            lTelefoon.setText(add6);
            String add7 =resultSet.getString("Bedrijfsnaam");
            lBedrijfsNaam.setText(add7);
            
           
       }
       catch(Exception e){JOptionPane.showMessageDialog(null, e);}
      }
    public void fillComboBoxbedrijf()
{
   
try{

    jComboBoxBedr.removeAllItems();
    String NameValue = jComboBoxNam.getSelectedItem().toString();
    String sql ="select distinct(bedrijfsnaam) from customers where naam = '"+ NameValue+"'";
     
            preparedStatement=connect.prepareStatement(sql);
            resultSet=preparedStatement.executeQuery();
           
            while(resultSet.next()){
         
            String bedrijf = resultSet.getString("bedrijfsnaam");
            jComboBoxBedr.addItem(bedrijf);
           
            } 
            
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}//finally {
//try{
//resultSet.close(); preparedStatement.close(); }
//catch(Exception e) { } }

}
private void fillComboBoxnaam()
{
try{
         jComboBoxNam.removeAllItems();
         
    
    String sql ="select distinct(naam) from customers";
            preparedStatement=connect.prepareStatement(sql);
            resultSet=preparedStatement.executeQuery();
           
            while(resultSet.next()){
            String naam = resultSet.getString("naam");
            jComboBoxNam.addItem(naam);
            
            }
}catch(Exception e){JOptionPane.showMessageDialog(null, e);}finally {
try{
resultSet.close(); preparedStatement.close(); }
catch(Exception e) { } }
}


        /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }finally {
try{
resultSet.close(); preparedStatement.close(); }
catch(Exception e) { } }
               
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new DataView().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(DataView.class.getName()).log(Level.SEVERE, null, ex);
                }finally {
try{
resultSet.close(); preparedStatement.close(); }
catch(Exception e) { } }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn2;
    private javax.swing.JButton BackBtn;
    private javax.swing.JPanel Customers;
    private javax.swing.JScrollPane Dataview;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton HelpDeskBtn;
    private javax.swing.JLabel JOmschrijving;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Submit;
    protected static javax.swing.JTable Table_customer;
    private javax.swing.JFrame Ticket;
    private javax.swing.JTabbedPane Window;
    private javax.swing.JLabel jAdres;
    private javax.swing.JLabel jBedrijfsNaam;
    private javax.swing.JComboBox jComboBoxBedr;
    private javax.swing.JComboBox jComboBoxNam;
    private javax.swing.JComboBox jComboBoxPprio;
    private javax.swing.JComboBox jComboBoxPrio;
    private javax.swing.JComboBox jComboBoxStat;
    private javax.swing.JComboBox jComboBoxpStat;
    private javax.swing.JLabel jEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    protected static javax.swing.JLabel jNaam;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jPlaats;
    private javax.swing.JButton jPopupEditBtn;
    private javax.swing.JLabel jPostcode;
    private javax.swing.JLabel jPrioriteit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jStatus;
    private javax.swing.JLabel jTelefoon;
    private javax.swing.JLabel jnaamT;
    private javax.swing.JTextField jpBedrijfsnaam_txt;
    private javax.swing.JTextField jpNaam_txt;
    private javax.swing.JTextArea jpOmschrijving_txt;
    private javax.swing.JTextField jpTicketId_txt;
    private javax.swing.JTextField lAdres;
    private javax.swing.JTextField lBedrijfsNaam;
    private javax.swing.JTextField lEmail;
    private javax.swing.JTextField lNaam;
    private javax.swing.JTextArea lOmschrijving;
    private javax.swing.JTextField lPlaats;
    private javax.swing.JTextField lPostcode;
    private javax.swing.JTextField lTelefoon;
    private javax.swing.JTable table_tickets;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

   
}
