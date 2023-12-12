package pemilu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class GuiDataMahasiswa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNama;
	private JTextField textNim;

	 int n = 0 ;
		String nama;
		int nim;
		String jurusan;
		 String[] arraynama = new String[999];
	     long[] arraynim = new long[999];
	     String[] arrayjurusan = new String[999];

	     
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiDataMahasiswa frame = new GuiDataMahasiswa();
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
	public GuiDataMahasiswa() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\Pictures\\Untitled.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data Mahasiswa");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(153, 22, 136, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNama = new JLabel("Nama");
		lblNama.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNama.setBounds(54, 61, 46, 14);
		contentPane.add(lblNama);
		
		textNama = new JTextField();
		textNama.setBounds(110, 59, 190, 20);
		contentPane.add(textNama);
		textNama.setColumns(10);
		
		JLabel lblNim = new JLabel("Nim");
		lblNim.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNim.setBounds(54, 93, 46, 14);
		contentPane.add(lblNim);
		
		textNim = new JTextField();
		textNim.setBounds(110, 91, 136, 20);
		contentPane.add(textNim);
		textNim.setColumns(10);
		
		JLabel lblJurusan = new JLabel("Jurusan");
		lblJurusan.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblJurusan.setBounds(54, 130, 46, 14);
		contentPane.add(lblJurusan);
		
		JComboBox cbJurusan = new JComboBox();
		cbJurusan.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cbJurusan.setEditable(true);
		cbJurusan.setModel(new DefaultComboBoxModel(new String[] {"Teknik Komputer", "Sistem Informasi", "Informatika"}));
		cbJurusan.setBounds(110, 127, 127, 22);
		contentPane.add(cbJurusan);
		
		JLabel lblInfo = new JLabel("");
		lblInfo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblInfo.setBounds(28, 155, 377, 61);
		contentPane.add(lblInfo);
		
		JButton btnSimpan = new JButton("Simpan");
		btnSimpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 arraynama[n] = textNama.getText();
	                long nim = Long.parseLong(textNim.getText());
	                arraynim[n] = nim;

	                arrayjurusan[n] = (String) cbJurusan.getSelectedItem();

	                textNama.setText("");
	                textNim.setText("");
	                cbJurusan.setSelectedIndex(0);

	                lblInfo.setText("Data " + arraynama[n] + " tersimpan!");

	                System.out.println(arraynama[n] + "\n" + arraynim[n] + " " + "\n" + arrayjurusan[n]);
	                System.out.println();
	                n++;

				
			}
		});
		btnSimpan.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSimpan.setBounds(38, 227, 89, 23);
		contentPane.add(btnSimpan);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNama.setText("");
				textNim.setText("");
				cbJurusan.setSelectedIndex(0);
				lblInfo.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnReset.setBounds(316, 228, 89, 23);
		contentPane.add(btnReset);
		
		
	}
}
