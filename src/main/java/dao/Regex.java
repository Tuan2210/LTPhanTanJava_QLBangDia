package dao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Regex {
<<<<<<< HEAD
=======
	@SuppressWarnings("deprecation")
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
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
<<<<<<< HEAD
	
	public boolean regexSDTTxt(JTextField txtSDT) {
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
	
	public boolean regexDate(JTextField txtDate) {
		String input = txtDate.getText().trim();
		String regex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		if(!matcher.find()) {
			JOptionPane.showMessageDialog(null, "Ngày nhập sai, vui lòng nhập lại", "Thông báo", JOptionPane.ERROR_MESSAGE);
			txtDate.requestFocus();
			txtDate.selectAll();
			return false;
		} else {
			return true;
		}
	}
	
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
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
