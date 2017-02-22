package word.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import word.controller.WordController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WordPanel extends JPanel 
{
	private WordController baseController;
	private SpringLayout baseLayout;
	private JButton submit;
	private JTextField FirstName;
	private JTextField LastName;
	private JTextField PhoneNumber;
	private JTextField Email;
	private JLabel FirstNameL;
	private JLabel LastNameL;
	private JLabel PhoneNumberL;
	private JLabel EmailL;
	public WordPanel(WordController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		this.submit = new JButton("Submit!");
		baseLayout.putConstraint(SpringLayout.EAST, submit, -287, SpringLayout.EAST, this);
		
		this.FirstName = new JTextField();
		baseLayout.putConstraint(SpringLayout.SOUTH, FirstName, 96, SpringLayout.NORTH, this);
		
		this.LastName = new JTextField();
		baseLayout.putConstraint(SpringLayout.WEST, LastName, 65, SpringLayout.WEST, this);
		
		this.PhoneNumber = new JTextField();
		baseLayout.putConstraint(SpringLayout.NORTH, submit, 33, SpringLayout.SOUTH, PhoneNumber);
		
		this.Email = new JTextField();
		baseLayout.putConstraint(SpringLayout.EAST, FirstName, 0, SpringLayout.EAST, Email);
		baseLayout.putConstraint(SpringLayout.WEST, PhoneNumber, 0, SpringLayout.WEST, Email);
		baseLayout.putConstraint(SpringLayout.WEST, FirstName, 0, SpringLayout.WEST, Email);
		baseLayout.putConstraint(SpringLayout.WEST, Email, 65, SpringLayout.WEST, this);
		
		this.FirstNameL = new JLabel("First Name");
		baseLayout.putConstraint(SpringLayout.NORTH, FirstName, -6, SpringLayout.NORTH, FirstNameL);
		baseLayout.putConstraint(SpringLayout.NORTH, FirstNameL, 73, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, FirstNameL, 654, SpringLayout.WEST, this);
		
		this.LastNameL = new JLabel("Last Name");
		baseLayout.putConstraint(SpringLayout.NORTH, Email, -6, SpringLayout.NORTH, LastNameL);
		baseLayout.putConstraint(SpringLayout.SOUTH, Email, 23, SpringLayout.NORTH, LastNameL);
		baseLayout.putConstraint(SpringLayout.EAST, Email, -36, SpringLayout.WEST, LastNameL);
		baseLayout.putConstraint(SpringLayout.NORTH, LastNameL, 91, SpringLayout.SOUTH, FirstNameL);
		baseLayout.putConstraint(SpringLayout.EAST, LastNameL, 0, SpringLayout.EAST, FirstNameL);
		
		this.PhoneNumberL = new JLabel("Phone Number");
		baseLayout.putConstraint(SpringLayout.NORTH, LastName, -5, SpringLayout.NORTH, PhoneNumberL);
		baseLayout.putConstraint(SpringLayout.SOUTH, LastName, 24, SpringLayout.NORTH, PhoneNumberL);
		baseLayout.putConstraint(SpringLayout.EAST, LastName, -34, SpringLayout.WEST, PhoneNumberL);
		baseLayout.putConstraint(SpringLayout.NORTH, PhoneNumberL, 96, SpringLayout.SOUTH, LastNameL);
		baseLayout.putConstraint(SpringLayout.WEST, PhoneNumberL, 0, SpringLayout.WEST, FirstNameL);
		
		this.EmailL = new JLabel("Email");
		baseLayout.putConstraint(SpringLayout.NORTH, PhoneNumber, -5, SpringLayout.NORTH, EmailL);
		baseLayout.putConstraint(SpringLayout.SOUTH, PhoneNumber, 0, SpringLayout.SOUTH, EmailL);
		baseLayout.putConstraint(SpringLayout.EAST, PhoneNumber, -34, SpringLayout.WEST, EmailL);
		baseLayout.putConstraint(SpringLayout.NORTH, EmailL, 91, SpringLayout.SOUTH, PhoneNumberL);
		baseLayout.putConstraint(SpringLayout.WEST, EmailL, 0, SpringLayout.WEST, FirstNameL);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel() 
	{
		this.setPreferredSize(new Dimension(900, 600));
		this.setLayout(baseLayout);
		this.add(Email);
		this.add(EmailL);
		this.add(FirstName);
		this.add(FirstNameL);
		this.add(LastName);
		this.add(LastNameL);
		this.add(PhoneNumber);
		this.add(PhoneNumberL);
		this.add(submit);
	}

	private void setupLayout() 
	{
		
	}

	private void setupListeners() 
	{
		
	}
}
