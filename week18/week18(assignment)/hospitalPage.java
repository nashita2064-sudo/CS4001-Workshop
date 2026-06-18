import javax.swing.*;
import java.awt.*;

public class hospitalPage extends JFrame{
    private JPanel panel;
    private JLabel mainLabel, nameLabel, ageLabel;
    private JTextField nameField, ageField; 
    private JButton registerBtn;
    
    public hospitalPage(){
        setTitle("Bir Hospital Portal");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        String html = "<html>" + "<h1> <b> Patient Registration Form </b> </h1>" + "</html>";
        mainLabel = new JLabel(html, JLabel.CENTER);
        mainLabel.setBounds(200,60,400,30);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        
        nameLabel = new JLabel("Patient Name: ");
        nameLabel.setBounds(20, 100 , 100, 30);
        nameField = new JTextField();
        nameField.setBounds(150, 100, 100, 30);
        
        ageLabel = new JLabel("Age: ");
        ageLabel.setBounds(20, 180, 100, 30);
        ageField = new JTextField();
        ageField.setBounds(150,180,100,30);
        
        registerBtn = new JButton("Register");
        registerBtn.setBounds(280,220, 100, 30);
        
        panel.add(mainLabel);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(registerBtn);
        add(panel);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater( () -> {
            hospitalPage page1 = new hospitalPage();
            page1.setVisible(true);
        }
        );
    }
}