package pemilu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class dptpemilu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("Aplikasi DPT Pemilu 2024");
	private JTextField textNama;
	private JTextField textUmur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dptpemilu frame = new dptpemilu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public dptpemilu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(124, 11, 197, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNama = new JLabel("Nama");
		lblNama.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNama.setBounds(25, 63, 46, 14);
		contentPane.add(lblNama);
		
		JLabel lblUmur = new JLabel("Umur");
		lblUmur.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUmur.setBounds(25, 88, 46, 14);
		contentPane.add(lblUmur);
		
		JLabel lblMenikah = new JLabel("Menikah");
		lblMenikah.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMenikah.setBounds(25, 121, 61, 14);
		contentPane.add(lblMenikah);
		
		textNama = new JTextField();
		textNama.setBounds(108, 61, 242, 20);
		contentPane.add(textNama);
		textNama.setColumns(10);
		
		textUmur = new JTextField();
		textUmur.setBounds(108, 86, 128, 20);
		contentPane.add(textUmur);
		textUmur.setColumns(10);
		
		JComboBox cbmenikah = new JComboBox();
		cbmenikah.setModel(new DefaultComboBoxModel(new String[] {"Ya", "Tidak"}));
		cbmenikah.setBounds(108, 113, 61, 22);
		contentPane.add(cbmenikah);
		
		JLabel lblInfo = new JLabel(" ");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setBounds(25, 146, 384, 70);
		contentPane.add(lblInfo);
		
		JButton btnProses = new JButton("Proses");
		btnProses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = textNama.getText();
				int umur = Integer.parseInt(textUmur.getText());
				String status = cbmenikah.getSelectedItem().toString();
				
				if (umur>17) {
					lblInfo.setText(n+", Terdaftar Di DPT");
				} else if ((umur<17)&&(status.equals("ya"))){
					lblInfo.setText(n+", Terdaftar Di DPT");
				} else if ((umur<17)&&(!status.equals("ya"))) {
					lblInfo.setText(n+", Tidak bisa ikut memilih di Pemilu 2024");
				}
			}
		});
		btnProses.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnProses.setBounds(41, 227, 89, 23);
		contentPane.add(btnProses);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNama.setText("");
				textUmur.setText("");
				cbmenikah.setSelectedIndex(0);
				lblInfo.setText("");
				
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnReset.setBounds(290, 227, 89, 23);
		contentPane.add(btnReset);
		
		
	}
}
