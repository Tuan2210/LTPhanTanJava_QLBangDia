package dao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Regex {
	public boolean regexSDT(JPasswordField txtSDT) {
		String input = txtSDT.getText().trim();
		String regex = "^(0[0-9]{9})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if (!matcher.find()) {
			JOptionPane.showMessageDialog(null, "SĐT không hợp lệ!\nSĐT gồm 10 chữ số và bắt đầu bằng số 0", "Thông báo", JOptionPane.ERROR_MESSAGE);
			txtSDT.requestFocus();
			txtSDT.selectAll();
			return false;
		}else
			return true;
	}
	
	public boolean regexCMND(JTextField txtCMND) {
		String input = txtCMND.getText().trim();
		String regex = "^([0-9]{9}|[0-9]{12})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if (!matcher.find()) {
			JOptionPane.showMessageDialog(null, "CMND phải gồm 9 hoặc 12 chữ số!", "Thông báo", JOptionPane.ERROR_MESSAGE);
			txtCMND.requestFocus();
			txtCMND.selectAll();
			return false;
		}else
			return true;
	}
}
