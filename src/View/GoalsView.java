package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import  java.awt.*;

public class GoalsView extends JFrame {
    JLabel title;

    JLabel lAmount = new JLabel("Amount :");
    JLabel lAmountDB = new JLabel("Coba Munculin");

    public JButton btnAddGoals = new JButton("Add New Goals");
    public JButton back = new JButton();

    public JTable tabel;

    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"No","Name","Budget","Status"};

    Color background = new Color(23, 34, 59);
    Color button1 = new Color(62, 134, 160);
    Color button2 = new Color(152, 118, 170);
    Color ftitle = new Color(255, 198, 109);
    Color tbl  = new Color(56, 53, 59);
    Color font = new Color(255,255,255);

    public GoalsView() {
        tableModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);

        getContentPane().setBackground(background);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Money Record");
        setVisible(true);
        setLayout(null);
        setSize(600, 450);


        title = new JLabel("Goals",JLabel.CENTER);
        title.setFont(new Font("Serif",Font.BOLD,24));
        add(title);
        title.setBounds(250, 5, 100, 50);
        title.setForeground(ftitle);

        tabel.setBackground(tbl);
        tabel.setForeground(font);
        add(scrollPane);
        scrollPane.setBounds(85,120,420,250);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        back.setIcon(new ImageIcon("src\\ImageSource\\back1.png"));
        add(back);
        back.setBounds(4,4,30,30);
        back.setBackground(font);

        add(btnAddGoals);
        btnAddGoals.setBounds(225, 65, 150, 20);
        btnAddGoals.setBackground(button1);
        btnAddGoals.setForeground(font);

    }
}
