package gameview;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class view extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea questionTextArea;
	private JButton btn3;
	private JButton btn1;
	private JButton btn0;
	private JButton btn2;
	private ArrayList<JButton> buttons;
	private JPanel panel;
	private JButton btnFiftyFifty;
	private JLabel questionNum;
	private JLabel prize;
	private JLabel notificationLabel;
	private JButton btnYarmadanekil;
	
	public JButton getBtnYarmadanekil() {
		return btnYarmadanekil;
	}

	public void setBtnYarmadanekil(JButton btnYarmadanekil) {
		this.btnYarmadanekil = btnYarmadanekil;
	}

	public JLabel getNotificationLabel() {
		return notificationLabel;
	}

	public void setNotificationLabel(JLabel notificationLabel) {
		this.notificationLabel = notificationLabel;
	}

	public JLabel getPrize() {
		return prize;
	}

	public void setPrize(JLabel prize) {
		this.prize = prize;
	}

	


	public JButton getBtnFiftyFifty() {
		return btnFiftyFifty;
	}

	public void setBtnFiftyFifty(JButton btnFiftyFifty) {
		this.btnFiftyFifty = btnFiftyFifty;
	}

	public JLabel getQuestionNum() {
		return questionNum;
	}

	public void setQuestionNum(JLabel questionNum) {
		this.questionNum = questionNum;
	}

	public ArrayList<JButton> getButtons() {
		return buttons;
	}

	public void setButtons(ArrayList<JButton> buttons) {
		this.buttons = buttons;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public void setBtn3(JButton btn3) {
		this.btn3 = btn3;
	}

	public JButton getBtn1() {
		return btn1;
	}

	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
	}

	public JButton getBtn0() {
		return btn0;
	}

	public void setBtn0(JButton btn0) {
		this.btn0 = btn0;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}
	
	public JTextArea getQuestionTextArea() {
		return questionTextArea;
	}

	public void setQuestionTextArea(JTextArea questionTextArea) {
		this.questionTextArea = questionTextArea;
	}

	/**
	 * Create the frame.
	 */
	public view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		buttons = new ArrayList<JButton>();
		
		panel = new JPanel();
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 676, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
		);
		
				questionTextArea = new JTextArea();
				questionTextArea.setLineWrap(true);
				questionTextArea.setWrapStyleWord(true);
				questionTextArea.setRows(3);
				questionTextArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
				questionTextArea.setText("sdaadssaddsadsa sad s dasd daads  as ad ads ads ads ad ads as aaaa aaaaaa");
		
				btn0 = new JButton("New button");
				
		btn2 = new JButton("New button");
		//buttons.add(btn2);
		btn3 = new JButton("New button");
		//buttons.add(btn3);
		btn1 = new JButton("New button");
		
		notificationLabel = new JLabel("New label");
		notificationLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel lblNewLabel = new JLabel("\u00D6d\u00FCl:");
		
		btnFiftyFifty = new JButton("Yar\u0131 Yar\u0131ya");
		btnFiftyFifty.setIcon(new ImageIcon("D:\\Yerel Disk E\\DERSLER\\3.s\u0131n\u0131f\\Software\\PROJE\\workspace\\WhoWantsToBeAMillionare\\5050.jpg"));
		
		btnYarmadanekil = new JButton("Yar\u0131\u015Fmadan \u00C7ekil");
		
		JLabel lblSoru = new JLabel("Soru:");
		
		questionNum = new JLabel("1.");
		
		prize = new JLabel("prize");
		//buttons.add(btn1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btn2, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
								.addComponent(btn0, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btn3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btn1, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
							.addGap(76))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblSoru)
							.addGap(18)
							.addComponent(questionNum, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(87))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(prize, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(questionTextArea, GroupLayout.PREFERRED_SIZE, 448, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnFiftyFifty, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnYarmadanekil))
							.addGap(87))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(notificationLabel, GroupLayout.PREFERRED_SIZE, 399, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(267, Short.MAX_VALUE))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(questionTextArea, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnFiftyFifty, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addGap(20)
							.addComponent(btnYarmadanekil)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn3)
						.addComponent(btn2))
					.addGap(42)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSoru)
						.addComponent(questionNum))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(prize, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(notificationLabel, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addGap(62))
		);
		buttons.add(btn0);
		buttons.add(btn1);
		buttons.add(btn2);
		buttons.add(btn3);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

	public void addButtonActionListener(ActionListener listener) {
		btn0.addActionListener(listener);
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);
	}
}
