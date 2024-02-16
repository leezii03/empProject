package home.view;

import Component.AlertMessager;
import auth.View.Main;
import home.Controller.EmployeeController;
import home.Model.EmployeeModel;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class HomeScreen extends javax.swing.JFrame {

    EmployeeController controller = new EmployeeController();

    String name1;
    String gender1;
    String age1;
    String position1;
    String salary1;
    String contact1;
    String image1;
    String date1;

    public HomeScreen() {
        initComponents();
        viewEmployee();
    }

    public void viewEmployee() {
        ScrollPanel.removeAll();
        ScrollPanel.setLayout(new GridLayout(controller.getData().size() % 1, 5));
        controller.getData().forEach((emp) -> {
            ScrollPanelItems items = new ScrollPanelItems(emp);
            ScrollPanel.add(items);
            ScrollPanel.repaint();
            ScrollPanel.revalidate();
        });
    }

    public void getData() {
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);
        controller.getData().forEach((emp) -> {
            Object[] row = {
                emp.getId(),
                emp.getName(),
                emp.getGender(),
                emp.getAge(),
                emp.getPosition(),
                emp.getSalary(),
                emp.getContact(),
                emp.getImage(),
                emp.getDate()
            };
            model.addRow(row);
        });

    }

    public void clear() {
        TextFieldName.setText("");
        MaleButton.setSelected(false);
        FemaleButton.setSelected(false);
        TextFieldAge.setText("");
        TextFieldPosition.setText("");
        TextFieldSalary.setText("");
        TextFieldContact.setText("");
        TextFieldImage.setText("");
        buttonGroup1.clearSelection();
        TextFieldDate.setIcon(null);
    }

    public void gotoScreen(Component screen) {
        MainScreen.removeAll();
        MainScreen.add(screen);
        MainScreen.repaint();
        MainScreen.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Background = new javax.swing.JPanel();
        DashBoard = new javax.swing.JPanel();
        Profile = new javax.swing.JLabel();
        GoToMenu = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        GoToHome = new com.k33ptoo.components.KButton();
        ButtonGoToRegister = new com.k33ptoo.components.KButton();
        GoToSearch = new com.k33ptoo.components.KButton();
        MainScreen = new javax.swing.JPanel();
        HomeScreen = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ScrollPanel = new javax.swing.JPanel();
        LabelName = new javax.swing.JLabel();
        TextFieldName = new javax.swing.JTextField();
        LabelGender = new javax.swing.JLabel();
        LabelSalary = new javax.swing.JLabel();
        LabelContact = new javax.swing.JLabel();
        TextFieldContact = new javax.swing.JTextField();
        LabelDate = new javax.swing.JLabel();
        LabelPosition = new javax.swing.JLabel();
        TextFieldPosition = new javax.swing.JTextField();
        LabelAge = new javax.swing.JLabel();
        TextFieldAge = new javax.swing.JTextField();
        FemaleButton = new javax.swing.JRadioButton();
        MaleButton = new javax.swing.JRadioButton();
        TextFieldGender = new javax.swing.JTextField();
        TextFieldSalary = new javax.swing.JTextField();
        ButtonChooseImage = new javax.swing.JButton();
        LabelImage = new javax.swing.JLabel();
        ButtonAddEmployee = new javax.swing.JButton();
        TextFieldDate = new com.toedter.calendar.JDateChooser();
        TextFieldImage = new javax.swing.JTextField();
        SearchScreen = new javax.swing.JPanel();
        TextFieldSearch = new javax.swing.JTextField();
        ButtonSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        LabelName1 = new javax.swing.JLabel();
        LabelGender1 = new javax.swing.JLabel();
        MaleUDButton = new javax.swing.JRadioButton();
        FemaleUDButton = new javax.swing.JRadioButton();
        TextFieldUDSalary = new javax.swing.JTextField();
        LabelSalary1 = new javax.swing.JLabel();
        LabelContact1 = new javax.swing.JLabel();
        TextFieldUDContact = new javax.swing.JTextField();
        TextFieldUDDate = new com.toedter.calendar.JDateChooser();
        LabelDate1 = new javax.swing.JLabel();
        LabelPosition1 = new javax.swing.JLabel();
        TextFieldUDPosition = new javax.swing.JTextField();
        TextFieldUDAge = new javax.swing.JTextField();
        LabelAge1 = new javax.swing.JLabel();
        LabelUDImage = new javax.swing.JLabel();
        ButtonChooseImage1 = new javax.swing.JButton();
        TextFieldGender1 = new javax.swing.JTextField();
        ButtonDelete = new com.k33ptoo.components.KButton();
        ButtonUpdate = new com.k33ptoo.components.KButton();
        TextFieldUDName = new javax.swing.JTextField();
        TextFieldUDImage = new javax.swing.JTextField();
        TextFieldUDId = new javax.swing.JTextField();
        MenuScreen = new javax.swing.JPanel();
        ButtonPrintRP = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 250));

        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DashBoard.setBackground(new java.awt.Color(255, 255, 255));
        DashBoard.setPreferredSize(new java.awt.Dimension(250, 500));

        Profile.setBackground(new java.awt.Color(255, 255, 255));
        Profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user_456212.png"))); // NOI18N

        GoToMenu.setBorder(null);
        GoToMenu.setText("Menu");
        GoToMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GoToMenu.setkBorderRadius(45);
        GoToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToMenuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin");

        GoToHome.setBorder(null);
        GoToHome.setText("Home");
        GoToHome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GoToHome.setkBorderRadius(45);
        GoToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToHomeActionPerformed(evt);
            }
        });

        ButtonGoToRegister.setBorder(null);
        ButtonGoToRegister.setText("Sign Out");
        ButtonGoToRegister.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonGoToRegister.setkBorderRadius(45);
        ButtonGoToRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGoToRegisterActionPerformed(evt);
            }
        });

        GoToSearch.setBorder(null);
        GoToSearch.setText("Search");
        GoToSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GoToSearch.setkBorderRadius(45);
        GoToSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DashBoardLayout = new javax.swing.GroupLayout(DashBoard);
        DashBoard.setLayout(DashBoardLayout);
        DashBoardLayout.setHorizontalGroup(
            DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashBoardLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GoToHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonGoToRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        DashBoardLayout.setVerticalGroup(
            DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashBoardLayout.createSequentialGroup()
                .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GoToHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GoToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GoToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(ButtonGoToRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Background.add(DashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 500));

        MainScreen.setBackground(new java.awt.Color(153, 255, 255));
        MainScreen.setLayout(new java.awt.CardLayout());

        HomeScreen.setBackground(new java.awt.Color(255, 255, 255));
        HomeScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Add Employee");
        Title.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        HomeScreen.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        ScrollPanel.setBackground(new java.awt.Color(245, 245, 245));
        ScrollPanel.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane1.setViewportView(ScrollPanel);

        HomeScreen.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 850, 210));

        LabelName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelName.setForeground(new java.awt.Color(100, 100, 100));
        LabelName.setText("Name             :");
        LabelName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        HomeScreen.add(LabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 120, 40));

        TextFieldName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextFieldName.setForeground(new java.awt.Color(100, 100, 100));
        TextFieldName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        HomeScreen.add(TextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 220, 40));

        LabelGender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelGender.setForeground(new java.awt.Color(100, 100, 100));
        LabelGender.setText("Gender          :");
        LabelGender.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        HomeScreen.add(LabelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 120, 40));

        LabelSalary.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelSalary.setForeground(new java.awt.Color(100, 100, 100));
        LabelSalary.setText("Salary            :");
        LabelSalary.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        HomeScreen.add(LabelSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 120, 40));

        LabelContact.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelContact.setForeground(new java.awt.Color(100, 100, 100));
        LabelContact.setText("Contact         :");
        LabelContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        HomeScreen.add(LabelContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 120, 40));

        TextFieldContact.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextFieldContact.setForeground(new java.awt.Color(100, 100, 100));
        TextFieldContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        HomeScreen.add(TextFieldContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 220, 40));

        LabelDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelDate.setForeground(new java.awt.Color(100, 100, 100));
        LabelDate.setText("Date               :");
        LabelDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        HomeScreen.add(LabelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 120, 40));

        LabelPosition.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelPosition.setForeground(new java.awt.Color(100, 100, 100));
        LabelPosition.setText("Position         :");
        LabelPosition.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        HomeScreen.add(LabelPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 120, 40));

        TextFieldPosition.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextFieldPosition.setForeground(new java.awt.Color(100, 100, 100));
        TextFieldPosition.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        HomeScreen.add(TextFieldPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 220, 40));

        LabelAge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelAge.setForeground(new java.awt.Color(100, 100, 100));
        LabelAge.setText(" Age               :");
        LabelAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        HomeScreen.add(LabelAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 120, 40));

        TextFieldAge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextFieldAge.setForeground(new java.awt.Color(100, 100, 100));
        TextFieldAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        HomeScreen.add(TextFieldAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 220, 40));

        FemaleButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(FemaleButton);
        FemaleButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FemaleButton.setForeground(new java.awt.Color(100, 100, 100));
        FemaleButton.setText("Female");
        HomeScreen.add(FemaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 338, 110, 30));

        MaleButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(MaleButton);
        MaleButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MaleButton.setForeground(new java.awt.Color(100, 100, 100));
        MaleButton.setText("Male");
        HomeScreen.add(MaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 338, 110, 30));

        TextFieldGender.setForeground(new java.awt.Color(100, 100, 100));
        TextFieldGender.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        HomeScreen.add(TextFieldGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 220, 40));

        TextFieldSalary.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextFieldSalary.setForeground(new java.awt.Color(100, 100, 100));
        TextFieldSalary.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        HomeScreen.add(TextFieldSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 220, 40));

        ButtonChooseImage.setBackground(new java.awt.Color(153, 204, 255));
        ButtonChooseImage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonChooseImage.setText("Browse");
        ButtonChooseImage.setBorder(null);
        ButtonChooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonChooseImageActionPerformed(evt);
            }
        });
        HomeScreen.add(ButtonChooseImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 120, 40));

        LabelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelImage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(100, 100, 100)));
        HomeScreen.add(LabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 120, 150));

        ButtonAddEmployee.setBackground(new java.awt.Color(153, 204, 255));
        ButtonAddEmployee.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonAddEmployee.setText("Add");
        ButtonAddEmployee.setBorder(null);
        ButtonAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddEmployeeActionPerformed(evt);
            }
        });
        HomeScreen.add(ButtonAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 110, 40));

        TextFieldDate.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        TextFieldDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HomeScreen.add(TextFieldDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 220, 40));

        TextFieldImage.setForeground(new java.awt.Color(100, 100, 100));
        TextFieldImage.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        HomeScreen.add(TextFieldImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 0, -1));

        MainScreen.add(HomeScreen, "card2");

        SearchScreen.setBackground(new java.awt.Color(255, 255, 255));
        SearchScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        SearchScreen.add(TextFieldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 12, 570, 50));

        ButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search1.png"))); // NOI18N
        ButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSearchActionPerformed(evt);
            }
        });
        SearchScreen.add(ButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 12, 60, 50));

        Table.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Age", "Position", "Salary", "Contact", "Image", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(0).setPreferredWidth(40);
            Table.getColumnModel().getColumn(1).setResizable(false);
            Table.getColumnModel().getColumn(1).setPreferredWidth(120);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(3).setResizable(false);
            Table.getColumnModel().getColumn(4).setResizable(false);
            Table.getColumnModel().getColumn(4).setPreferredWidth(100);
            Table.getColumnModel().getColumn(5).setResizable(false);
            Table.getColumnModel().getColumn(6).setResizable(false);
            Table.getColumnModel().getColumn(8).setResizable(false);
            Table.getColumnModel().getColumn(8).setPreferredWidth(100);
        }

        SearchScreen.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 850, 180));

        LabelName1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelName1.setForeground(new java.awt.Color(100, 100, 100));
        LabelName1.setText("Name             :");
        LabelName1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        SearchScreen.add(LabelName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 120, 40));

        LabelGender1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelGender1.setForeground(new java.awt.Color(100, 100, 100));
        LabelGender1.setText("Gender          :");
        LabelGender1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        SearchScreen.add(LabelGender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 120, 40));

        MaleUDButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(MaleUDButton);
        MaleUDButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MaleUDButton.setForeground(new java.awt.Color(100, 100, 100));
        MaleUDButton.setText("Male");
        SearchScreen.add(MaleUDButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 338, 110, 30));

        FemaleUDButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(FemaleUDButton);
        FemaleUDButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FemaleUDButton.setForeground(new java.awt.Color(100, 100, 100));
        FemaleUDButton.setText("Female");
        SearchScreen.add(FemaleUDButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 338, 110, 30));

        TextFieldUDSalary.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextFieldUDSalary.setForeground(new java.awt.Color(100, 100, 100));
        TextFieldUDSalary.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        SearchScreen.add(TextFieldUDSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 220, 40));

        LabelSalary1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelSalary1.setForeground(new java.awt.Color(100, 100, 100));
        LabelSalary1.setText("Salary            :");
        LabelSalary1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        SearchScreen.add(LabelSalary1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 120, 40));

        LabelContact1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelContact1.setForeground(new java.awt.Color(100, 100, 100));
        LabelContact1.setText("Contact         :");
        LabelContact1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        SearchScreen.add(LabelContact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 120, 40));

        TextFieldUDContact.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextFieldUDContact.setForeground(new java.awt.Color(100, 100, 100));
        TextFieldUDContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        SearchScreen.add(TextFieldUDContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 220, 40));

        TextFieldUDDate.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldUDDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        TextFieldUDDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SearchScreen.add(TextFieldUDDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 220, 40));

        LabelDate1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelDate1.setForeground(new java.awt.Color(100, 100, 100));
        LabelDate1.setText("Date               :");
        LabelDate1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        SearchScreen.add(LabelDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 120, 40));

        LabelPosition1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelPosition1.setForeground(new java.awt.Color(100, 100, 100));
        LabelPosition1.setText("Position         :");
        LabelPosition1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        SearchScreen.add(LabelPosition1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 120, 40));

        TextFieldUDPosition.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextFieldUDPosition.setForeground(new java.awt.Color(100, 100, 100));
        TextFieldUDPosition.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        SearchScreen.add(TextFieldUDPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 220, 40));

        TextFieldUDAge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextFieldUDAge.setForeground(new java.awt.Color(100, 100, 100));
        TextFieldUDAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        SearchScreen.add(TextFieldUDAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 220, 40));

        LabelAge1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelAge1.setForeground(new java.awt.Color(100, 100, 100));
        LabelAge1.setText(" Age               :");
        LabelAge1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        SearchScreen.add(LabelAge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 120, 40));

        LabelUDImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelUDImage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(100, 100, 100)));
        SearchScreen.add(LabelUDImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 120, 150));

        ButtonChooseImage1.setBackground(new java.awt.Color(153, 204, 255));
        ButtonChooseImage1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonChooseImage1.setText("Browse");
        ButtonChooseImage1.setBorder(null);
        SearchScreen.add(ButtonChooseImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 120, 40));

        TextFieldGender1.setForeground(new java.awt.Color(100, 100, 100));
        TextFieldGender1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        SearchScreen.add(TextFieldGender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 220, 40));

        ButtonDelete.setBorder(null);
        ButtonDelete.setText("Delete");
        ButtonDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonDelete.setkBorderRadius(45);
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });
        SearchScreen.add(ButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 140, 40));

        ButtonUpdate.setBorder(null);
        ButtonUpdate.setText("Update");
        ButtonUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonUpdate.setkBorderRadius(45);
        ButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdateActionPerformed(evt);
            }
        });
        SearchScreen.add(ButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 140, 40));

        TextFieldUDName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextFieldUDName.setForeground(new java.awt.Color(100, 100, 100));
        TextFieldUDName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        SearchScreen.add(TextFieldUDName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 220, 40));

        TextFieldUDImage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextFieldUDImage.setForeground(new java.awt.Color(100, 100, 100));
        TextFieldUDImage.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        SearchScreen.add(TextFieldUDImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 0, 20));

        TextFieldUDId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextFieldUDId.setForeground(new java.awt.Color(100, 100, 100));
        TextFieldUDId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        SearchScreen.add(TextFieldUDId, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 0, 20));

        MainScreen.add(SearchScreen, "card3");

        MenuScreen.setBackground(new java.awt.Color(255, 255, 0));
        MenuScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonPrintRP.setText("Print");
        ButtonPrintRP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ButtonPrintRP.setkBorderRadius(40);
        ButtonPrintRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPrintRPActionPerformed(evt);
            }
        });
        MenuScreen.add(ButtonPrintRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        MainScreen.add(MenuScreen, "card4");

        Background.add(MainScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 850, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1114, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void ButtonGoToRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGoToRegisterActionPerformed
        // TODO add your handling code here:
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonGoToRegisterActionPerformed

    private void GoToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToHomeActionPerformed
        gotoScreen(HomeScreen);
        viewEmployee();
    }//GEN-LAST:event_GoToHomeActionPerformed

    private void GoToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToMenuActionPerformed
        gotoScreen(MenuScreen);
    }//GEN-LAST:event_GoToMenuActionPerformed

    private void ButtonChooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonChooseImageActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
        File file = chooser.getSelectedFile();
        String fileName = file.getAbsolutePath();
        ImageIcon icon = new ImageIcon(fileName);
        Image image = icon.getImage().getScaledInstance(LabelImage.getWidth(), LabelImage.getHeight(), Image.SCALE_SMOOTH);
        LabelImage.setIcon(new ImageIcon(image));
        TextFieldImage.setText(fileName);
    }//GEN-LAST:event_ButtonChooseImageActionPerformed

    private void ButtonAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddEmployeeActionPerformed
        String name = TextFieldName.getText();
        String gender = MaleButton.isSelected() ? "Male" : FemaleButton.isSelected() ? "Female" : "Other";
        String age1 = TextFieldAge.getText();
        String position = TextFieldPosition.getText();
        String salary1 = TextFieldSalary.getText();
        String contact = TextFieldContact.getText();
        String image = TextFieldImage.getText();

        SimpleDateFormat df = new SimpleDateFormat(TextFieldDate.getDateFormatString());
        String date = df.format(TextFieldDate.getDate());

        if (!name.isEmpty() && !gender.isEmpty() && !age1.isEmpty() && !position.isEmpty() && !salary1.isEmpty() && !contact.isEmpty() && !image.isEmpty() && !date.isEmpty()) {
            int age = Integer.parseInt(age1);
            double salary = Double.parseDouble(salary1);
            controller.addEmpToDB(new EmployeeModel(0, name, gender, age, position, salary, contact, image, date));
            viewEmployee();
            clear();
        } else {
            AlertMessager.warning("Please Enter All Field");
        }
    }//GEN-LAST:event_ButtonAddEmployeeActionPerformed

    private void GoToSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToSearchActionPerformed
        gotoScreen(SearchScreen);
        getData();
    }//GEN-LAST:event_GoToSearchActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        int row = Table.getSelectedRow();
        TextFieldUDId.setText(model.getValueAt(row, 0).toString());
        TextFieldUDName.setText(model.getValueAt(row, 1).toString());
        if (model.getValueAt(row, 2).toString().equalsIgnoreCase("Male")) {
            MaleUDButton.setSelected(true);
        } else {
            FemaleUDButton.setSelected(true);
        }
        TextFieldUDAge.setText(model.getValueAt(row, 3).toString());
        TextFieldUDPosition.setText(model.getValueAt(row, 4).toString());
        TextFieldUDSalary.setText(model.getValueAt(row, 5).toString());
        TextFieldUDContact.setText(model.getValueAt(row, 6).toString());
        
        TextFieldUDImage.setText(model.getValueAt(row, 7).toString());
        ImageIcon icon = new ImageIcon(TextFieldUDImage.getText());
        Image image = icon.getImage().getScaledInstance(LabelImage.getWidth(), LabelImage.getHeight(), Image.SCALE_SMOOTH);
        LabelUDImage.setIcon(new ImageIcon(image));

        try {
            SimpleDateFormat df = new SimpleDateFormat(TextFieldUDDate.getDateFormatString());
            Date date = df.parse(model.getValueAt(row, 8).toString());
            TextFieldUDDate.setDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        name1 = model.getValueAt(row, 1).toString();
        if (model.getValueAt(row, 2).toString().equalsIgnoreCase("Male")) {
            gender1 = "Male";
        } else {
            gender1 = "Female";
        }

        age1 = model.getValueAt(row, 3).toString();
        position1 = model.getValueAt(row, 4).toString();
        salary1 = model.getValueAt(row, 5).toString();
        contact1 = model.getValueAt(row, 6).toString();
        image1 = model.getValueAt(row, 7).toString();

        SimpleDateFormat df = new SimpleDateFormat(TextFieldUDDate.getDateFormatString());
        date1 = df.format(TextFieldUDDate.getDate());
    }//GEN-LAST:event_TableMouseClicked

    private void ButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUpdateActionPerformed
        String id = TextFieldUDId.getText();
        String name = TextFieldUDName.getText();
        String gender = MaleUDButton.isSelected() ? "Male" : FemaleUDButton.isSelected() ? "Female" : "Other";
        String age = TextFieldUDAge.getText();
        String position = TextFieldUDPosition.getText();
        String salary = TextFieldUDSalary.getText();
        String contact = TextFieldUDContact.getText();
        String image = TextFieldUDImage.getText();

        SimpleDateFormat df = new SimpleDateFormat(TextFieldUDDate.getDateFormatString());
        String date = null;
        if (TextFieldUDDate.getDate() != null) {
            date = df.format(TextFieldUDDate.getDate());
        } else {
            date = df.format(TextFieldUDDate.getDate());
        }
        if (!name.isEmpty() && !gender.isEmpty() && !age.isEmpty() && !position.isEmpty() && !salary.isEmpty() && !contact.isEmpty() && !image.isEmpty() && !date.isEmpty()) {
            if (!name.equals(name1) || !gender.equalsIgnoreCase(gender1) || !age.equalsIgnoreCase(age1) || !position.equals(position1) || !salary.equals(salary1) || !contact.equals(contact1) || !image.equals(image1) || !date.equals(date1)) {
                // Update data
                int id2 = Integer.parseInt(id);
                int age2 = Integer.parseInt(age);
                double salary2 = Double.parseDouble(salary);
                controller.updateEmpToDB(new EmployeeModel(id2, name, gender, age2, position, salary2, contact, image, date));
                getData();
            } else {
                AlertMessager.error("Please Update Information");
            }
        } else {
            AlertMessager.error("Please Select Data to Update");
        }
    }//GEN-LAST:event_ButtonUpdateActionPerformed

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        String id1 = TextFieldUDId.getText();
        if (!id1.isEmpty()) {
            int id = Integer.parseInt(id1);
            controller.deleteEmp(id);
            getData();
        } else {
            AlertMessager.error("Please Select data for delete");
        }
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void ButtonPrintRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPrintRPActionPerformed
        int totalemp = controller.getTotalEmp();
        int totalmale = controller.getTotalMale();
        int totalfemale = controller.getTotalFemale();
        double totalsalary = controller.getTotalSalary();

        System.out.println(
                "Total Emp = " + totalemp
                + "\nTotal Male = " + totalmale
                + "\nTotal Female = " + totalfemale
                + "\nTotal Salary = " + totalsalary
        );

        HashMap<String, Object> data = new HashMap<>();
        data.put("totalemp", totalemp);
        data.put("totalmale", totalmale);
        data.put("totalfemale", totalfemale);
        data.put("totalsalary", totalsalary);
        
        try {
            JasperReport report = JasperCompileManager.compileReport("src/home/view/empreport.jrxml");
            JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(controller.getData());
            JasperPrint print = JasperFillManager.fillReport(report, data, source);
            JasperViewer.viewReport(print);
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ButtonPrintRPActionPerformed

    private void ButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSearchActionPerformed
        String searchTerm = TextFieldSearch.getText().trim();
        if (!searchTerm.isEmpty()) {
            filterData(searchTerm);
            
            // clear the emp name when searching finish
            TextFieldSearch.setText("");
        } else {
            // If the search is empty, show all data
            getData();
        }
    }//GEN-LAST:event_ButtonSearchActionPerformed

    private void filterData(String searchTerm) {
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);

        controller.getData().stream()
                .filter(emp -> emp.getName().toLowerCase().contains(searchTerm.toLowerCase()))
                .forEach(emp -> {
                    Object[] row = {
                        emp.getId(),
                        emp.getName(),
                        emp.getGender(),
                        emp.getAge(),
                        emp.getPosition(),
                        emp.getSalary(),
                        emp.getContact(),
                        emp.getImage(),
                        emp.getDate()
                    };
                    model.addRow(row);
                });
    }

    public static void main(String args[]) {
        new Themes.Theme("light");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton ButtonAddEmployee;
    private javax.swing.JButton ButtonChooseImage;
    private javax.swing.JButton ButtonChooseImage1;
    private com.k33ptoo.components.KButton ButtonDelete;
    private com.k33ptoo.components.KButton ButtonGoToRegister;
    private com.k33ptoo.components.KButton ButtonPrintRP;
    private javax.swing.JButton ButtonSearch;
    private com.k33ptoo.components.KButton ButtonUpdate;
    private javax.swing.JPanel DashBoard;
    private javax.swing.JRadioButton FemaleButton;
    private javax.swing.JRadioButton FemaleUDButton;
    private com.k33ptoo.components.KButton GoToHome;
    private com.k33ptoo.components.KButton GoToMenu;
    private com.k33ptoo.components.KButton GoToSearch;
    private javax.swing.JPanel HomeScreen;
    private javax.swing.JLabel LabelAge;
    private javax.swing.JLabel LabelAge1;
    private javax.swing.JLabel LabelContact;
    private javax.swing.JLabel LabelContact1;
    private javax.swing.JLabel LabelDate;
    private javax.swing.JLabel LabelDate1;
    private javax.swing.JLabel LabelGender;
    private javax.swing.JLabel LabelGender1;
    private javax.swing.JLabel LabelImage;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelName1;
    private javax.swing.JLabel LabelPosition;
    private javax.swing.JLabel LabelPosition1;
    private javax.swing.JLabel LabelSalary;
    private javax.swing.JLabel LabelSalary1;
    private javax.swing.JLabel LabelUDImage;
    private javax.swing.JPanel MainScreen;
    private javax.swing.JRadioButton MaleButton;
    private javax.swing.JRadioButton MaleUDButton;
    private javax.swing.JPanel MenuScreen;
    private javax.swing.JLabel Profile;
    private javax.swing.JPanel ScrollPanel;
    private javax.swing.JPanel SearchScreen;
    private javax.swing.JTable Table;
    private javax.swing.JTextField TextFieldAge;
    private javax.swing.JTextField TextFieldContact;
    private com.toedter.calendar.JDateChooser TextFieldDate;
    private javax.swing.JTextField TextFieldGender;
    private javax.swing.JTextField TextFieldGender1;
    private javax.swing.JTextField TextFieldImage;
    private javax.swing.JTextField TextFieldName;
    private javax.swing.JTextField TextFieldPosition;
    private javax.swing.JTextField TextFieldSalary;
    private javax.swing.JTextField TextFieldSearch;
    private javax.swing.JTextField TextFieldUDAge;
    private javax.swing.JTextField TextFieldUDContact;
    private com.toedter.calendar.JDateChooser TextFieldUDDate;
    private javax.swing.JTextField TextFieldUDId;
    private javax.swing.JTextField TextFieldUDImage;
    private javax.swing.JTextField TextFieldUDName;
    private javax.swing.JTextField TextFieldUDPosition;
    private javax.swing.JTextField TextFieldUDSalary;
    private javax.swing.JLabel Title;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
