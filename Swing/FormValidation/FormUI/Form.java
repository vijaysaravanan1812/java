package FormUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import InputValidation.ValidationInputs;

public class Form implements ActionListener {

    JFrame frame;
    JTextField username, firstName, lastName, email, phoneNum;
    JPasswordField password, confirmPassword;
    JLabel title, usernameLabel, firstNameLabel, lastNameLabel, emailLabel, phoneNumLabel, passwordLabel,
            confirmPasswordLabel;
    JButton submit, reset;
    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    public Form() {
        frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.setLayout(null);

        title = new JLabel("Registration Form");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(myFont);
        title.setSize(300, 30);
        title.setLocation(300, 30);
        frame.add(title);

        usernameLabel = new JLabel("Username: ");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        usernameLabel.setSize(450, 30);
        usernameLabel.setLocation(100, 100);
        frame.add(usernameLabel);

        username = new JTextField();
        username.setFont(new Font("Arial", Font.PLAIN, 20));
        username.setSize(300, 30);
        username.setLocation(250, 100);
        frame.add(username);

        firstNameLabel = new JLabel("First Name: ");
        firstNameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        firstNameLabel.setSize(450, 30);
        firstNameLabel.setLocation(100, 150);
        frame.add(firstNameLabel);

        firstName = new JTextField();
        firstName.setFont(new Font("Arial", Font.PLAIN, 20));
        firstName.setSize(300, 30);
        firstName.setLocation(250, 150);
        frame.add(firstName);

        lastNameLabel = new JLabel("Last Name: ");
        lastNameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        lastNameLabel.setSize(450, 30);
        lastNameLabel.setLocation(100, 200);
        frame.add(lastNameLabel);

        lastName = new JTextField();
        lastName.setFont(new Font("Arial", Font.PLAIN, 20));
        lastName.setSize(300, 30);
        lastName.setLocation(250, 200);
        frame.add(lastName);

        emailLabel = new JLabel("Email :");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        emailLabel.setSize(450, 30);
        emailLabel.setLocation(100, 250);
        frame.add(emailLabel);

        email = new JTextField();
        email.setFont(new Font("Arial", Font.PLAIN, 20));
        email.setSize(300, 30);
        email.setLocation(250, 250);
        frame.add(email);

        phoneNumLabel = new JLabel("Phone number: ");
        phoneNumLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        phoneNumLabel.setSize(450, 30);
        phoneNumLabel.setLocation(100, 300);
        frame.add(phoneNumLabel);

        phoneNum = new JTextField();
        phoneNum.setFont(new Font("Arial", Font.PLAIN, 20));
        phoneNum.setSize(300, 30);
        phoneNum.setLocation(250, 300);
        frame.add(phoneNum);

        passwordLabel = new JLabel("Password: ");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        passwordLabel.setSize(450, 30);
        passwordLabel.setLocation(100, 350);
        frame.add(passwordLabel);

        password = new JPasswordField();
        password.setSize(300, 30);
        password.setLocation(250, 350);
        frame.add(password);

        confirmPasswordLabel = new JLabel("Retype: ");
        confirmPasswordLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        confirmPasswordLabel.setSize(450, 30);
        confirmPasswordLabel.setLocation(100, 400);
        frame.add(confirmPasswordLabel);

        confirmPassword = new JPasswordField();
        confirmPassword.setSize(300, 30);
        confirmPassword.setLocation(250, 400);
        frame.add(confirmPassword);

        submit = new JButton("Submit");
        submit.setFont(new Font("Arial", Font.PLAIN, 15));
        submit.setSize(100, 20);
        submit.setLocation(250, 450);
        submit.addActionListener(this);
        frame.add(submit);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(450, 450);
        reset.addActionListener(this);
        frame.add(reset);

        frame.setVisible(true);
    }

    public boolean isNotFilled() {
        return (username.getText() == null || username.getText().length() == 0 || firstName.getText() == null
                || firstName.getText().length() == 0 || lastName.getText() == null || lastName.getText().length() == 0
                || email.getText() == null || email.getText().length() == 0 || phoneNum.getText() == null
                || phoneNum.getText().length() == 0);
    }

    public String isNotFilledHandler() {
        String error = "";
        if (username.getText() == null || username.getText().length() == 0)
            error += "Username can't be empty\n";
        if (firstName.getText() == null || firstName.getText().length() == 0)
            error += "First name can't be empty\n";
        if (lastName.getText() == null || lastName.getText().length() == 0)
            error += "Last name can't be empty\n";
        if (email.getText() == null || email.getText().length() == 0)
            error += "Email can't be empty\n";
        if (phoneNum.getText() == null || phoneNum.getText().length() == 0)
            error += "Phone number can't be empty\n";

        return error;
    }

    public boolean isValidInputFormat() {
        return (ValidationInputs.isValidFirstName(firstName.getText())
                && ValidationInputs.validateLastName(lastName.getText())
                && ValidationInputs.isValidUsername(username.getText())
                && ValidationInputs.isValidEmail(email.getText())
                && ValidationInputs.isValidPhoneNumber(phoneNum.getText()));
    }

    public boolean validPassword() {
        String pass = String.valueOf(password.getPassword());
        String confirmPass = String.valueOf(confirmPassword.getPassword());
        return pass.equals(confirmPass) && pass.length() > 0 && confirmPass.length() > 0;
    }

    public String isValidInputFormatHandler() {
        String error = "";
        if (!ValidationInputs.isValidFirstName(firstName.getText()))
            error += "First name should start with an upper-case letter followed by alphabets only\n";
        if (!ValidationInputs.validateLastName(lastName.getText()))
            error += "Last name should contain only alphabets\n";
        if (!ValidationInputs.isValidUsername(username.getText()))
            error += "Invalid username\n";
        if (!ValidationInputs.isValidEmail(email.getText()))
            error += "Invalid email format\n";
        if (!ValidationInputs.isValidPhoneNumber(phoneNum.getText()))
            error += "Invalid phone number\n";
        return error;
    }

    public void emptyFields() {
        String emptyData = "";
        username.setText(emptyData);
        firstName.setText(emptyData);
        lastName.setText(emptyData);
        email.setText(emptyData);
        phoneNum.setText(emptyData);
        password.setText(emptyData);
        confirmPassword.setText(emptyData);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == reset)
            emptyFields();

        else if (e.getSource() == submit) {
            if (isNotFilled())
                JOptionPane.showMessageDialog(null, isNotFilledHandler(), "Empty Fields",
                        JOptionPane.INFORMATION_MESSAGE);

            if (!isValidInputFormat())
                JOptionPane.showMessageDialog(null, isValidInputFormatHandler(), "Invalid Input Format",
                        JOptionPane.INFORMATION_MESSAGE);

            if (!validPassword())
                JOptionPane.showMessageDialog(null,
                        "Password and confirm password don't match or either of the fields are blank",
                        "Password mismatch", JOptionPane.INFORMATION_MESSAGE);

            if (!isNotFilled() && isValidInputFormat() && validPassword()) {
                JOptionPane.showMessageDialog(null, "Registration Successful", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
                emptyFields();
            }
        }
    }

}
