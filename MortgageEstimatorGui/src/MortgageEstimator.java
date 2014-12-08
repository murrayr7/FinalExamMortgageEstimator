import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MortgageEstimator {

	private JFrame frmMortgageEstimator;
	private JTextField textFieldGrossIncome;
	private JTextField textFieldMonthlyDebt;
	private JTextField textFieldInterest;
	private JTextField textFieldDown;
	private boolean emptyTextField=true;
	private boolean validTextFields=true;
	private JLabel lblStatus;
	private JLabel labelHousingPaymentOut;
	private JLabel labelMaxPaymentOut;
	private JLabel labelMaxMortgageOut;
	private JLabel labelTotalObligationsOut;
	private JComboBox comboBoxTerm;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MortgageEstimator window = new MortgageEstimator();
					window.frmMortgageEstimator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MortgageEstimator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMortgageEstimator = new JFrame();
		frmMortgageEstimator.setTitle("Mortgage Estimator");
		frmMortgageEstimator.setBounds(100, 100, 450, 300);
		frmMortgageEstimator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{216, 19, 176, 0};
		gridBagLayout.rowHeights = new int[]{18, 16, 16, 16, 16, 15, 16, 16, 16, 16, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmMortgageEstimator.getContentPane().setLayout(gridBagLayout);

		JLabel lblGross = new JLabel("Total Gross Income:");
		lblGross.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblGross = new GridBagConstraints();
		gbc_lblGross.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblGross.insets = new Insets(0, 0, 5, 5);
		gbc_lblGross.gridx = 0;
		gbc_lblGross.gridy = 0;
		frmMortgageEstimator.getContentPane().add(lblGross, gbc_lblGross);

		textFieldGrossIncome = new JTextField();
		GridBagConstraints gbc_textFieldGrossIncome = new GridBagConstraints();
		gbc_textFieldGrossIncome.fill = GridBagConstraints.BOTH;
		gbc_textFieldGrossIncome.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldGrossIncome.gridx = 2;
		gbc_textFieldGrossIncome.gridy = 0;
		textFieldGrossIncome.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				MortgageEstimator.this.actionPerformed();
			}
			public void removeUpdate(DocumentEvent e) {
				MortgageEstimator.this.actionPerformed();
			}
			public void insertUpdate(DocumentEvent e) {
				MortgageEstimator.this.actionPerformed();
			}
			});
		frmMortgageEstimator.getContentPane().add(textFieldGrossIncome, gbc_textFieldGrossIncome);
		textFieldGrossIncome.setColumns(10);

		JLabel lblDebt = new JLabel("Total Monthly Debt:");
		lblDebt.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblDebt = new GridBagConstraints();
		gbc_lblDebt.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDebt.insets = new Insets(0, 0, 5, 5);
		gbc_lblDebt.gridx = 0;
		gbc_lblDebt.gridy = 1;
		frmMortgageEstimator.getContentPane().add(lblDebt, gbc_lblDebt);

		textFieldMonthlyDebt = new JTextField();
		textFieldMonthlyDebt.setColumns(10);
		GridBagConstraints gbc_textFieldMonthlyDebt = new GridBagConstraints();
		gbc_textFieldMonthlyDebt.fill = GridBagConstraints.BOTH;
		gbc_textFieldMonthlyDebt.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldMonthlyDebt.gridx = 2;
		gbc_textFieldMonthlyDebt.gridy = 1;
		textFieldMonthlyDebt.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				MortgageEstimator.this.actionPerformed();
			}
			public void removeUpdate(DocumentEvent e) {
				MortgageEstimator.this.actionPerformed();
			}
			public void insertUpdate(DocumentEvent e) {
				MortgageEstimator.this.actionPerformed();
			}
			});
		frmMortgageEstimator.getContentPane().add(textFieldMonthlyDebt, gbc_textFieldMonthlyDebt);

		JLabel lblInterest = new JLabel("Mortgage Interest Rate (%):");
		lblInterest.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblInterest = new GridBagConstraints();
		gbc_lblInterest.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblInterest.insets = new Insets(0, 0, 5, 5);
		gbc_lblInterest.gridx = 0;
		gbc_lblInterest.gridy = 2;
		frmMortgageEstimator.getContentPane().add(lblInterest, gbc_lblInterest);

		textFieldInterest = new JTextField();
		GridBagConstraints gbc_textFieldInterest = new GridBagConstraints();
		gbc_textFieldInterest.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldInterest.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldInterest.gridx = 2;
		gbc_textFieldInterest.gridy = 2;
		textFieldInterest.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				MortgageEstimator.this.actionPerformed();
			}
			public void removeUpdate(DocumentEvent e) {
				MortgageEstimator.this.actionPerformed();
			}
			public void insertUpdate(DocumentEvent e) {
				MortgageEstimator.this.actionPerformed();
			}
			});
		frmMortgageEstimator.getContentPane().add(textFieldInterest, gbc_textFieldInterest);
		textFieldInterest.setColumns(10);

		JLabel lblTerm = new JLabel("Term:");
		lblTerm.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblTerm = new GridBagConstraints();
		gbc_lblTerm.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTerm.insets = new Insets(0, 0, 5, 5);
		gbc_lblTerm.gridx = 0;
		gbc_lblTerm.gridy = 3;
		frmMortgageEstimator.getContentPane().add(lblTerm, gbc_lblTerm);

		String[] vals= {"10 Years", "15 Years", "30 Years" };
		comboBoxTerm = new JComboBox(vals);
		GridBagConstraints gbc_comboBoxTerm = new GridBagConstraints();
		gbc_comboBoxTerm.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxTerm.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTerm.gridx = 2;
		gbc_comboBoxTerm.gridy = 3;
		comboBoxTerm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MortgageEstimator.this.actionPerformed();
			}
        });
		frmMortgageEstimator.getContentPane().add(comboBoxTerm, gbc_comboBoxTerm);

		JLabel lblDown = new JLabel("Down Payment:");
		lblDown.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblDown = new GridBagConstraints();
		gbc_lblDown.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDown.insets = new Insets(0, 0, 5, 5);
		gbc_lblDown.gridx = 0;
		gbc_lblDown.gridy = 4;
		frmMortgageEstimator.getContentPane().add(lblDown, gbc_lblDown);

		textFieldDown = new JTextField();
		GridBagConstraints gbc_textFieldDown = new GridBagConstraints();
		gbc_textFieldDown.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldDown.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldDown.gridx = 2;
		gbc_textFieldDown.gridy = 4;
		textFieldDown.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				MortgageEstimator.this.actionPerformed();
			}
			public void removeUpdate(DocumentEvent e) {
				MortgageEstimator.this.actionPerformed();
			}
			public void insertUpdate(DocumentEvent e) {
				MortgageEstimator.this.actionPerformed();
			}
			});
		frmMortgageEstimator.getContentPane().add(textFieldDown, gbc_textFieldDown);
		textFieldDown.setColumns(10);

		lblStatus = new JLabel("Enter Values");
		lblStatus.setForeground(Color.BLACK);
		lblStatus.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		GridBagConstraints gbc_lblStatus = new GridBagConstraints();
		gbc_lblStatus.gridwidth = 3;
		gbc_lblStatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblStatus.gridx = 0;
		gbc_lblStatus.gridy = 5;
		frmMortgageEstimator.getContentPane().add(lblStatus, gbc_lblStatus);

		JLabel lblHousingPayment = new JLabel("Housing Payment Only:");
		lblHousingPayment.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblHousingPayment = new GridBagConstraints();
		gbc_lblHousingPayment.anchor = GridBagConstraints.NORTH;
		gbc_lblHousingPayment.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblHousingPayment.insets = new Insets(0, 0, 5, 5);
		gbc_lblHousingPayment.gridx = 0;
		gbc_lblHousingPayment.gridy = 6;
		frmMortgageEstimator.getContentPane().add(lblHousingPayment, gbc_lblHousingPayment);

		labelHousingPaymentOut = new JLabel("");
		GridBagConstraints gbc_labelHousingPaymentOut = new GridBagConstraints();
		gbc_labelHousingPaymentOut.insets = new Insets(0, 0, 5, 0);
		gbc_labelHousingPaymentOut.gridx = 2;
		gbc_labelHousingPaymentOut.gridy = 6;
		frmMortgageEstimator.getContentPane().add(labelHousingPaymentOut, gbc_labelHousingPaymentOut);

		JLabel lblHousingAndOther = new JLabel("Total Obligation Payments:");
		lblHousingAndOther.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblHousingAndOther = new GridBagConstraints();
		gbc_lblHousingAndOther.anchor = GridBagConstraints.NORTH;
		gbc_lblHousingAndOther.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblHousingAndOther.insets = new Insets(0, 0, 5, 5);
		gbc_lblHousingAndOther.gridx = 0;
		gbc_lblHousingAndOther.gridy = 7;
		frmMortgageEstimator.getContentPane().add(lblHousingAndOther, gbc_lblHousingAndOther);

		labelTotalObligationsOut = new JLabel("");
		GridBagConstraints gbc_labelTotalObligationsOut = new GridBagConstraints();
		gbc_labelTotalObligationsOut.insets = new Insets(0, 0, 5, 0);
		gbc_labelTotalObligationsOut.gridx = 2;
		gbc_labelTotalObligationsOut.gridy = 7;
		frmMortgageEstimator.getContentPane().add(labelTotalObligationsOut, gbc_labelTotalObligationsOut);

		JLabel lblMaximumPaymentAllowed = new JLabel("Maximum Payment Allowed:");
		lblMaximumPaymentAllowed.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblMaximumPaymentAllowed = new GridBagConstraints();
		gbc_lblMaximumPaymentAllowed.anchor = GridBagConstraints.NORTH;
		gbc_lblMaximumPaymentAllowed.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMaximumPaymentAllowed.insets = new Insets(0, 0, 5, 5);
		gbc_lblMaximumPaymentAllowed.gridx = 0;
		gbc_lblMaximumPaymentAllowed.gridy = 8;
		frmMortgageEstimator.getContentPane().add(lblMaximumPaymentAllowed, gbc_lblMaximumPaymentAllowed);

		labelMaxPaymentOut = new JLabel("");
		GridBagConstraints gbc_labelMaxPaymentOut = new GridBagConstraints();
		gbc_labelMaxPaymentOut.insets = new Insets(0, 0, 5, 0);
		gbc_labelMaxPaymentOut.gridx = 2;
		gbc_labelMaxPaymentOut.gridy = 8;
		frmMortgageEstimator.getContentPane().add(labelMaxPaymentOut, gbc_labelMaxPaymentOut);

		JLabel lblAmountOfLargest = new JLabel("Amount of Largest Mortgage:");
		lblAmountOfLargest.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblAmountOfLargest = new GridBagConstraints();
		gbc_lblAmountOfLargest.anchor = GridBagConstraints.NORTH;
		gbc_lblAmountOfLargest.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAmountOfLargest.insets = new Insets(0, 0, 0, 5);
		gbc_lblAmountOfLargest.gridx = 0;
		gbc_lblAmountOfLargest.gridy = 9;
		frmMortgageEstimator.getContentPane().add(lblAmountOfLargest, gbc_lblAmountOfLargest);

		labelMaxMortgageOut = new JLabel("");
		GridBagConstraints gbc_labelMaxMortgageOut = new GridBagConstraints();
		gbc_labelMaxMortgageOut.gridx = 2;
		gbc_labelMaxMortgageOut.gridy = 9;
		frmMortgageEstimator.getContentPane().add(labelMaxMortgageOut, gbc_labelMaxMortgageOut);
	}

	protected void actionPerformed() {
		if(testTextFields()){
			double grossIncome =Double.parseDouble(textFieldGrossIncome.getText());
			double down =Double.parseDouble(textFieldDown.getText());
			double interest =Double.parseDouble(textFieldInterest.getText());
			double monthlyDebt =Double.parseDouble(textFieldMonthlyDebt.getText());
			String temp = (String) comboBoxTerm.getSelectedItem();
			temp= temp.split(" ")[0];
			System.out.println(temp);
			double term = Double.parseDouble(temp);
			//run engine and push results to the window
			labelHousingPaymentOut.setText(String.format("$ %,.2f", Estimator.HousingPayment(grossIncome,down,interest,monthlyDebt,term)));
			labelTotalObligationsOut.setText(String.format("$ %,.2f", Estimator.TotalObligations(grossIncome,down,interest,monthlyDebt,term)));
			labelMaxMortgageOut.setText(String.format("$ %,.2f", Estimator.MaxMortgage(grossIncome,down,interest,monthlyDebt,term)));
			labelMaxPaymentOut.setText(String.format("$ %,.2f", Estimator.MaxPayment(grossIncome,down,interest,monthlyDebt,term)));		
		}else{
			labelHousingPaymentOut.setText("");
			labelTotalObligationsOut.setText("");
			labelMaxMortgageOut.setText("");
			labelMaxPaymentOut.setText("");
		}
	}

	private boolean testTextFields() {
		//assume false until tested
		System.out.println("hit 'testTextFields'");
		validTextFields=true;
		emptyTextField=false;
		
		testTextField(textFieldGrossIncome);
		testTextField(textFieldMonthlyDebt);
		testTextField(textFieldDown);
		testTextField(textFieldInterest);
		if (!validTextFields){
			lblStatus.setText("Your inputs are not valid. You must input numbers.");
			lblStatus.setForeground(Color.RED);
		}else if(validTextFields & !emptyTextField){
			lblStatus.setText("CALCULATION COMPLETE");
			lblStatus.setForeground(Color.GREEN);
		}else{
			lblStatus.setText("Enter Values");
			lblStatus.setForeground(Color.BLACK);
		}
		return (validTextFields & !emptyTextField);
	}

	private void testTextField(JTextField textFieldInterest) {
		String str = textFieldInterest.getText();
		str = str.trim();
		if ( str == null || str.trim().equals("") ){
			emptyTextField = true;
		}else if(!str.matches("-?\\d+(\\.\\d+)?")){
			validTextFields=false;
		}
	}
}
