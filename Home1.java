import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Home1 extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JButton b1, b2, b3, b4, b5, b6;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Home1().setVisible(true));
    }

    public Home1() {
        super("Library Management System");
        setBounds(400, 150, 1000, 800);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(128, 128, 128)));
        menuBar.setBackground(Color.white);
        menuBar.setBounds(0, 10, 1000, 40);
        contentPane.add(menuBar);

        JMenu mnExit = new JMenu("Exit");
        mnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));

        JMenuItem mntmLogout = new JMenuItem("Logout");
        mntmLogout.setBackground(Color.white);
        mntmLogout.setForeground(Color.red);
        mntmLogout.addActionListener(this);
        mnExit.add(mntmLogout);

        JMenuItem mntmExit = new JMenuItem("Exit");
        mntmExit.setForeground(Color.red);
        mntmExit.setBackground(Color.white);
        mntmExit.addActionListener(this);
        mnExit.add(mntmExit);

        JMenu mnHelp = new JMenu("Help");
        mnHelp.setFont(new Font("Trebuchet MS", Font.BOLD, 17));

        JMenuItem mntmReadme = new JMenuItem("Read Me");
        mntmReadme.setBackground(Color.white);
        mntmReadme.setForeground(Color.red);
        mnHelp.add(mntmReadme);

        JMenuItem mntmAboutUs = new JMenuItem("About Us");
        mntmAboutUs.setForeground(Color.red);
        mntmAboutUs.setBackground(Color.white);
        mntmAboutUs.addActionListener(this);
        mnHelp.add(mntmAboutUs);

        JMenu mnRecord = new JMenu("Record");
        mnRecord.setFont(new Font("Trebuchet MS", Font.BOLD, 17));

        JMenuItem bookDetails = new JMenuItem("Book Details");
        bookDetails.addActionListener(this);
        bookDetails.setBackground(Color.white);
        bookDetails.setForeground(Color.red);
        mnRecord.add(bookDetails);

        JMenuItem studentDetails = new JMenuItem("Student Details");
        studentDetails.setBackground(Color.white);
        studentDetails.setForeground(Color.red);
        studentDetails.addActionListener(this);
        mnRecord.add(studentDetails);

        menuBar.add(mnRecord);
        menuBar.add(mnHelp);
        menuBar.add(mnExit);

        // ... (Rest of the code remains unchanged)
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (msg.equals("Logout")) {
            setVisible(false);
            new Login_user().setVisible(true);
        } else if (msg.equals("Exit")) {
            System.exit(0);
        //} else if (msg.equals("About Us")) {
          //  setVisible(false);
            //new AboutUs().setVisible(true);
        } else if (msg.equals("Book Details")) {
            setVisible(false);
            new BookDetails().setVisible(true);
        } else if (msg.equals("Student Details")) {
            setVisible(false);
            new StudentDetails().setVisible(true);
        } else if (ae.getSource() == b1) {
            this.setVisible(false);
            new AddBook().setVisible(true);
        } else if (ae.getSource() == b2) {
            this.setVisible(false);
            new Statistics().setVisible(true);
        } else if (ae.getSource() == b3) {
            this.setVisible(false);
            new AddStudent().setVisible(true);
        } else if (ae.getSource() == b4) {
            this.setVisible(false);
            new IssueBook().setVisible(true);
        } else if (ae.getSource() == b5) {
            this.setVisible(false);
            new ReturnBook().setVisible(true);
        } //else if (ae.getSource() == b6) {
            //this.setVisible(false);
            //new AboutUs().setVisible(true);
        }
    }

