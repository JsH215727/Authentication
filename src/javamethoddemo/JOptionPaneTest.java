package javamethoddemo;
import javax.swing.JOptionPane;


public class JOptionPaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username;
		String password;
		
		username = JOptionPane.showInputDialog("Enter Username: ");
		password = JOptionPane.showInputDialog("Enter Password: ");
		
		UserAuthentication.authenciation(username, password);
	}
}
