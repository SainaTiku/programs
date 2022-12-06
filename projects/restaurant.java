import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.util.*;
public class restaurant extends JFrame
{
        public void launchApp()	{
            Login login = new Login();
            login.launchFrame();
        }
        public static void main(String args[]) {
            restaurant r = new restaurant();
            r.launchApp();
        }
    }
    class Login extends JFrame implements KeyListener {
        public static String cashierName;
        private JFrame loginFrame;
        private JLabel loginLabel;
        private JTextField loginText;public Login() {
            loginFrame = new JFrame("Customer Login");
            loginLabel = new JLabel("Customer Name :");
            loginText = new JTextField("NewCustomer", 10);
            loginText.setFont(new Font("",Font.BOLD,12));
        }
        public void launchFrame() {
            loginFrame.setSize(200,350);

            loginFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
            loginFrame.getContentPane().add(loginLabel);
            loginFrame.getContentPane().add(loginText);
            loginFrame.pack();

            // Centering the screen on the desktop
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = loginFrame.getSize();
            loginFrame.setLocation(((screenSize.width - frameSize.width) / 2),
                    ((screenSize.height - frameSize.height) / 2));

            loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            loginFrame.setVisible(true);

            loginText.selectAll();
            loginText.addKeyListener(this);
        }
        public void keyTyped(KeyEvent e) { }
        public void keyReleased(KeyEvent e) { }

        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == 10) {

                cashierName = loginText.getText();
                loginFrame.setVisible(false);

                Menu menu = new Menu();
                menu.launchFrame();

            }
        }
    }
    class Menu extends JFrame implements KeyListener {
        private JFrame menuFrame;
        private JPanel menuNorthPanel,
                menuSouthPanel,
                menuCenterPanel,
                menuTitlePanel,
                menuDetailPanel,
                menuChoicePanel,
                menuHeaderPanel;

        private JLabel menuStoreLabel,
                menuTitleLabel,
                menuCashierLabel,
                menuHeaderLabel,
                menuDateLabel,
                menuChoiceLabel[],
                menuGuideLabel;
        public static String choice[] = {"Bread Pakora",
                "Fried Noodles  ",
                "Fried Rice     ",
                "Thai Rice      ",
                "Sandwiches     ",
                "Soft Drinks    ",
                "Fruit Juices   ",
                "Mineral Water  ",
                "Ice Cream      ",
                "Chowmein       "};
        public static double price[] = {20.00,
                15.00,
                20.00,
                40.00,
                15.00,
                20.00,
                15.00,
                15.00,
                12.00,
                30.00,};
        public static int ordered[];

        String option[] = {"Sub Total",
                "Log Off"};
        public Menu() {
            menuFrame = new JFrame("Food Menu");
            menuFrame.getContentPane().setLayout(new BorderLayout(0,0));
            menuNorthPanel = new JPanel();
            menuNorthPanel.setLayout(new FlowLayout());
            menuNorthPanel.setBackground(Color.black);
            menuSouthPanel = new JPanel();
            menuSouthPanel.setBackground(new Color(0,155,0));
            menuTitlePanel = new JPanel();
            menuTitlePanel.setLayout(new BorderLayout(10,10));
            menuTitlePanel.setBackground(new Color(137,195,232));
            menuDetailPanel = new JPanel();
            menuDetailPanel.setLayout(new GridLayout(2,1));
            menuDetailPanel.setBackground(new Color(157,217,252));
            menuCenterPanel = new JPanel();
            menuCenterPanel.setLayout(new BorderLayout(0,0));
            menuCenterPanel.setBackground(new Color(160,255,150));
            menuStoreLabel = new JLabel(" Asian Restaurant ");
            menuStoreLabel.setForeground(Color.yellow);
            menuStoreLabel.setFont(new Font("Arial Black",Font.BOLD+Font.ITALIC,36));
            menuTitleLabel = new JLabel(" Food Menu ", JLabel.CENTER);
            menuTitleLabel.setForeground(Color.blue);
            menuTitleLabel.setFont(new Font("Courier New",Font.BOLD,24));
            GregorianCalendar calendar = new GregorianCalendar();
            DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,
                    DateFormat.SHORT,
                    Locale.US);
            menuCashierLabel = new JLabel("   Cashier on Duty : " + Login.cashierName);
            menuCashierLabel.setForeground(Color.red);
            menuCashierLabel.setFont(new Font("Verdana",Font.BOLD,14));
            menuDateLabel = new JLabel("   Date/Time : "
                    + dateFormat.format(calendar.getTime())
                    + "  ");
            menuDateLabel.setForeground(Color.red);
            menuDateLabel.setFont(new Font("Verdana",Font.BOLD,14));
            menuHeaderLabel = new JLabel("             Food Item"
                    +"              Price(RM)"
                    +"    Ordered");
            menuHeaderLabel.setForeground(Color.white);
            menuHeaderLabel.setFont(new Font("Verdana",Font.BOLD,18));
            menuChoicePanel = new JPanel();
            menuChoicePanel.setLayout(new GridLayout(choice.length+4,1,0,0));
            menuChoicePanel.setBackground(new Color(0,0,0));
            menuChoicePanel.add(menuHeaderLabel);
            menuChoiceLabel = new JLabel[choice.length + 2];
            ordered = new int[choice.length];
            for (int i = 0; i < choice.length; i++)	{
                ordered[i] = 0;
                menuChoiceLabel[i] = new JLabel("  [" + (i+1) + "]  " + choice[i]
                        +"      "+ price[i] + "0"
                        +"       "+ ordered[i]);
                menuChoiceLabel[i].setForeground(Color.green);
                menuChoiceLabel[i].setFont(new Font("Courier New",Font.BOLD,18));

                menuChoicePanel.add(menuChoiceLabel[i]);
            }
            menuChoiceLabel[choice.length] = new JLabel("  [0]  " + option[0]);
            menuChoiceLabel[choice.length+1] = new JLabel("  [Q]  "
                    + option[1] + " "
                    + Login.cashierName);
            menuChoiceLabel[choice.length].setForeground(Color.yellow);
            menuChoiceLabel[choice.length+1].setForeground(Color.yellow);
            menuChoiceLabel[choice.length].setFont(new Font("Courier New",Font.BOLD,18));
            menuChoiceLabel[choice.length+1].setFont(new Font("Courier New",Font.BOLD,18));
            menuChoicePanel.add(menuChoiceLabel[choice.length]);
            menuChoicePanel.add(menuChoiceLabel[choice.length+1]);
            menuGuideLabel = new JLabel("   Use the keyboard and press the appropriate keys in [ ]");
            menuGuideLabel.setForeground(Color.white);
            menuGuideLabel.setFont(new Font("Verdana",Font.BOLD,14));
        }
        public void launchFrame() {
            menuFrame.setSize(200,350);
            menuDetailPanel.add(menuCashierLabel);
            menuDetailPanel.add(menuDateLabel);
            menuTitlePanel.add(menuTitleLabel, BorderLayout.WEST);
            menuTitlePanel.add(menuDetailPanel, BorderLayout.EAST);
            menuNorthPanel.add(menuStoreLabel, BorderLayout.NORTH);
            menuSouthPanel.add(menuGuideLabel, BorderLayout.SOUTH);
            menuCenterPanel.add(menuTitlePanel, BorderLayout.NORTH);
            menuCenterPanel.add(menuChoicePanel, BorderLayout.CENTER);
            menuFrame.getContentPane().add(menuNorthPanel, BorderLayout.NORTH);
            menuFrame.getContentPane().add(menuCenterPanel, BorderLayout.CENTER);
            menuFrame.getContentPane().add(menuSouthPanel, BorderLayout.SOUTH);
            menuFrame.pack();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = menuFrame.getSize();
            menuFrame.setLocation(((screenSize.width - frameSize.width) / 2),
                    ((screenSize.height - frameSize.height) / 2));
            menuFrame.addKeyListener(this);
            menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            menuFrame.setVisible(true);

        }
        private void refresh() {
            for (int i = 0; i < choice.length; i++)	{
                menuChoiceLabel[i].setText("  [" + (i+1) + "]  " + choice[i]
                        +"      "+ price[i] + "0"

                        +"       "+ ordered[i]);
            }
        }
        public void keyTyped(KeyEvent e) { }
        public void keyReleased(KeyEvent e) { }
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                    ordered[e.getKeyCode() - 49]++;
                    break;

                case 48:
                    menuFrame.setVisible(false);
                    SubTotal subTotal = new SubTotal();
                    subTotal.launchFrame();
                    break;

                case 81:
                    menuFrame.setVisible(false);
                    JOptionPane.showMessageDialog(this, "Customer Log Off",
                            "Goodbye and have a nice day!", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                    break;
            }
            this.refresh();
        }
    }
    class SubTotal extends JFrame implements KeyListener {
        double perItemTotal, grandTotal;
        private JFrame subTotalFrame;
        private JPanel subTotalNorthPanel,
                subTotalSouthPanel,
                subTotalCenterPanel,
                subTotalTitlePanel,
                subTotalDetailPanel,
                subTotalOrderedPanel,
                subTotalHeaderPanel;

        private JLabel subTotalStoreLabel,
                subTotalTitleLabel,
                subTotalCashierLabel,
                subTotalHeaderLabel,
                subTotalDateLabel,
                subTotalOrderedLabel[],
                subTotalGrandTotalLabel,
                subTotalGuideLabel;
        public SubTotal() {
            subTotalFrame = new JFrame("Sub Total");
            subTotalFrame.getContentPane().setLayout(new BorderLayout(0,0));
            subTotalNorthPanel = new JPanel();
            subTotalNorthPanel.setLayout(new FlowLayout());
            subTotalNorthPanel.setBackground(Color.white);
            subTotalSouthPanel = new JPanel();
            subTotalSouthPanel.setBackground(new Color(0,155,0));
            subTotalTitlePanel = new JPanel();
            subTotalTitlePanel.setLayout(new BorderLayout(10,10));
            subTotalTitlePanel.setBackground(new Color(137,195,232));
            subTotalDetailPanel = new JPanel();
            subTotalDetailPanel.setLayout(new GridLayout(2,1));
            subTotalDetailPanel.setBackground(new Color(100,100,100));
            subTotalCenterPanel = new JPanel();
            subTotalCenterPanel.setLayout(new BorderLayout(0,0));
            subTotalCenterPanel.setBackground(new Color(160,255,150));
            subTotalStoreLabel = new JLabel(" East Malaysia Restaurant ");
            subTotalStoreLabel.setForeground(Color.yellow);
            subTotalStoreLabel.setFont(new Font("Arial Blue",Font.BOLD+Font.ITALIC,36));
            subTotalTitleLabel = new JLabel(" SUB TOTAL ", JLabel.CENTER);
            subTotalTitleLabel.setForeground(Color.blue);
            subTotalTitleLabel.setFont(new Font("Courier New",Font.BOLD,24));
            GregorianCalendar calendar = new GregorianCalendar();
            DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,
                    DateFormat.SHORT,
                    Locale.US);
            subTotalCashierLabel = new JLabel("   Cashier on Duty : " + Login.cashierName);
            subTotalCashierLabel.setForeground(Color.red);
            subTotalCashierLabel.setFont(new Font("Verdana",Font.BOLD,14));

            subTotalDateLabel = new JLabel("   Date/Time : "
                    + dateFormat.format(calendar.getTime())
                    + "  ");
            subTotalDateLabel.setForeground(Color.red);
            subTotalDateLabel.setFont(new Font("Verdana",Font.BOLD,14));
            subTotalHeaderLabel = new JLabel("    Food Item"
                    +"           Price/Unit"
                    +"    Ordered"
                    +"    Total(RM)   ");
            subTotalHeaderLabel.setForeground(Color.white);
            subTotalHeaderLabel.setFont(new Font("Verdana",Font.BOLD,18));
            subTotalOrderedPanel = new JPanel();
            subTotalOrderedPanel.setBackground(new Color(0,0,0));
            subTotalOrderedPanel.add(subTotalHeaderLabel);
            subTotalOrderedLabel = new JLabel[Menu.choice.length];
            perItemTotal = 0;
            grandTotal = 0;
            int count = 0;
            for (int i = 0; i < Menu.choice.length; i++)	{
                if (Menu.ordered[i] > 0) {
                    perItemTotal = Menu.ordered[i] * Menu.price[i];
                    grandTotal+= perItemTotal;
                    count++;
                    subTotalOrderedLabel[i] = new JLabel("  " + Menu.choice[i]
                            +"    " + Menu.price[i] + "0"
                            +"        " + Menu.ordered[i]
                            +"       " + perItemTotal + "0");
                    subTotalOrderedLabel[i].setForeground(Color.green);
                    subTotalOrderedLabel[i].setFont(new Font("Courier New",Font.BOLD,18));
                    subTotalOrderedPanel.add(subTotalOrderedLabel[i]);
                    Menu.ordered[i] = 0;
                }
            }
            subTotalGrandTotalLabel = new JLabel(" Sub Total :  " + grandTotal + "0");
            subTotalGrandTotalLabel.setForeground(Color.yellow);
            subTotalGrandTotalLabel.setFont(new Font("Courier New",Font.BOLD,30));
            subTotalOrderedPanel.add(subTotalGrandTotalLabel);
            subTotalGuideLabel = new JLabel("   Press [ Esc ] to return to menu");
            subTotalGuideLabel.setForeground(Color.white);
            subTotalGuideLabel.setFont(new Font("Verdana",Font.BOLD,14));
            subTotalOrderedPanel.setLayout(new GridLayout(count+2,1,0,0));
        }
        public void launchFrame() {
            subTotalFrame.setSize(200,350);
            subTotalDetailPanel.add(subTotalCashierLabel);
            subTotalDetailPanel.add(subTotalDateLabel);
            subTotalTitlePanel.add(subTotalTitleLabel, BorderLayout.WEST);
            subTotalTitlePanel.add(subTotalDetailPanel, BorderLayout.EAST);
            subTotalNorthPanel.add(subTotalStoreLabel, BorderLayout.NORTH);
            subTotalSouthPanel.add(subTotalGuideLabel, BorderLayout.SOUTH);
            subTotalCenterPanel.add(subTotalTitlePanel, BorderLayout.NORTH);
            subTotalCenterPanel.add(subTotalOrderedPanel, BorderLayout.CENTER);
            subTotalFrame.getContentPane().add(subTotalNorthPanel, BorderLayout.NORTH);
            subTotalFrame.getContentPane().add(subTotalCenterPanel, BorderLayout.CENTER);
            subTotalFrame.getContentPane().add(subTotalSouthPanel, BorderLayout.SOUTH);
            subTotalFrame.pack();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = subTotalFrame.getSize();
            subTotalFrame.setLocation(((screenSize.width - frameSize.width) / 2),
                    ((screenSize.height - frameSize.height) / 2));

            subTotalFrame.addKeyListener(this);

            subTotalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            subTotalFrame.setVisible(true);
        }
        public void keyTyped(KeyEvent e) { }
        public void keyReleased(KeyEvent e) { }

        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == 27) {
                subTotalFrame.setVisible(false);
                Menu menu = new Menu();
                menu.launchFrame();
            }
        }
    }


