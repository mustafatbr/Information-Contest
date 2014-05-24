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
	private JButton btnFF;
	private JLabel questionNum;
	private JLabel prize;
	private JLabel notificationLabel;
	private JButton btnExit;
	private JLabel prizeAfter;
	private JLabel lblHoGeldiniz;
	private JLabel lblname;
	public JLabel getPrizeAfter() {
		return prizeAfter;
	}

	public void setPrizeAfter(JLabel prizeAfter) {
		this.prizeAfter = prizeAfter;
	}

	public JButton getBtnExit() {
		return btnExit;
	}

	public void setBtnExit(JButton btnExit) {
		this.btnExit = btnExit;
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

	


	public JButton getBtnFF() {
		return btnFF;
	}

	public void setBtnFF(JButton btnFF) {
		this.btnFF = btnFF;
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
		setBounds(100, 100, 765, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		buttons = new ArrayList<JButton>();
		
		panel = new JPanel();
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 641, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 371, Short.MAX_VALUE)
					.addContainerGap())
		);
		
				questionTextArea = new JTextArea();
				questionTextArea.setLineWrap(true);
				questionTextArea.setWrapStyleWord(true);
				questionTextArea.setRows(3);
				questionTextArea.setEditable(false);
				questionTextArea.setFont(new Font("sansserif", Font.BOLD+Font.ITALIC, 17));
				questionTextArea.setText("\u0130lk ekran");
		
				btn0 = new JButton("New button");
				
		btn2 = new JButton("New button");
	
		btn3 = new JButton("New button");
		
		btn1 = new JButton("New button");
		
		notificationLabel = new JLabel("");
		notificationLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel lblNewLabel = new JLabel("Kazan\u0131lan \u00D6d\u00FCl:");
		
		btnFF = new JButton("");
		btnFF.setIcon(new ImageIcon("C:\\Users\\ASUS\\git\\Information Contest\\deneme\\5050.jpg"));
		
		btnExit = new JButton("Yar\u0131\u015Fmadan \u00C7ekil");
		
		JLabel lblSoru = new JLabel("Soru:");
		
		questionNum = new JLabel("1.");
		
		prize = new JLabel("prize");
		
		JLabel lblSonrakiSorununDeeri = new JLabel("Sonraki Sorunun De\u011Feri: ");
		
		 prizeAfter = new JLabel("prize2");
		
		JLabel lblKazandnzEnFazla = new JLabel("kazand\u0131\u011F\u0131n\u0131z en fazla miktar=");
		
		lblHoGeldiniz = new JLabel("Ho\u015F geldiniz ");
		
		lblname = new JLabel("");
	
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(questionTextArea, GroupLayout.PREFERRED_SIZE, 448, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnExit)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblSoru)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(questionNum, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(btnFF, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGap(131))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(btn2, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
										.addComponent(btn0, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
									.addGap(18))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblSonrakiSorununDeeri)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(prize, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
										.addComponent(prizeAfter))
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btn3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btn1, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(9)
									.addComponent(lblKazandnzEnFazla)
									.addGap(18)
									.addComponent(notificationLabel, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(6)
									.addComponent(lblHoGeldiniz, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblname, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)))
							.addGap(76))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSoru)
								.addComponent(questionNum))
							.addGap(15)
							.addComponent(btnFF, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnExit))
						.addComponent(questionTextArea, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn3)
						.addComponent(btn2))
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(prize, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblHoGeldiniz)
								.addComponent(lblname, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSonrakiSorununDeeri)
								.addComponent(prizeAfter)
								.addComponent(lblKazandnzEnFazla, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(notificationLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
					.addGap(206))
		);
		buttons.add(btn0);
		buttons.add(btn1);
		buttons.add(btn2);
		buttons.add(btn3);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

	public JLabel getLblHoGeldiniz() {
		return lblHoGeldiniz;
	}

	public void setLblHoGeldiniz(JLabel lblHoGeldiniz) {
		this.lblHoGeldiniz = lblHoGeldiniz;
	}

	public JLabel getLblname() {
		return lblname;
	}

	public void setLblname(JLabel lblname) {
		this.lblname = lblname;
	}

	public void addButtonActionListener(ActionListener listener) {
		btn0.addActionListener(listener);
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);
	}
}
