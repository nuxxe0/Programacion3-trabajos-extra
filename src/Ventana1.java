import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldVehicle;
	private JTextField textFieldClientId;
	private JTextField textFieldIssueDate;
	private JTextField textFieldNoDates;
	private JTextField textFieldCharge;
	private JTextField textFieldAdvance;
	private JTextField textFieldBalance;
	private static JTable table;
	private static DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);//centrar la ventana en la pantalla
		this.setResizable(false);//no deja cambiar el tamaño de la ventana

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelTop = new JPanel();
		panelTop.setBackground(Color.RED);
		panelTop.setBounds(0, 0, 839, 50);
		contentPane.add(panelTop);
		panelTop.setLayout(null);
		
		JLabel lblHome = new JLabel("");
		lblHome.setBounds(10, 14, 25, 25);
		panelTop.add(lblHome);
		ImageIcon casa = new ImageIcon(Ventana1.class.getResource("/Images/casa.png"));
        lblHome.setIcon(new ImageIcon(casa.getImage().getScaledInstance(lblHome.getWidth(), lblHome.getHeight(), Image.SCALE_SMOOTH)));
        
        JLabel lblAddVehicle = new JLabel("");
        lblAddVehicle.setBounds(69, 14, 25, 25);
        panelTop.add(lblAddVehicle);
        ImageIcon mas = new ImageIcon(Ventana1.class.getResource("/Images/mas.png"));
        lblAddVehicle.setIcon(new ImageIcon(mas.getImage().getScaledInstance(lblAddVehicle.getWidth(), lblAddVehicle.getHeight(), Image.SCALE_SMOOTH)));
        
        JLabel textoVehicle = new JLabel("Add Vehicle");
        textoVehicle.setFont(new Font("Tahoma", Font.BOLD, 11));
        textoVehicle.setForeground(Color.WHITE);
        textoVehicle.setBounds(104, 20, 74, 14);
        panelTop.add(textoVehicle);
        
        JLabel lblAddClients = new JLabel("");
        lblAddClients.setBounds(188, 14, 25, 25);
        panelTop.add(lblAddClients);
        ImageIcon user = new ImageIcon(Ventana1.class.getResource("/Images/user.png"));
        lblAddClients.setIcon(new ImageIcon(user.getImage().getScaledInstance(lblAddClients.getWidth(), lblAddClients.getHeight(), Image.SCALE_SMOOTH)));
        
        JLabel textoAddClients = new JLabel("Add Clients");
        textoAddClients.setForeground(Color.WHITE);
        textoAddClients.setFont(new Font("Tahoma", Font.BOLD, 11));
        textoAddClients.setBounds(223, 20, 74, 14);
        panelTop.add(textoAddClients);
        
        JLabel lblRent = new JLabel("");
        lblRent.setBounds(300, 14, 25, 25);
        panelTop.add(lblRent);
        ImageIcon der = new ImageIcon(Ventana1.class.getResource("/Images/der.png"));
        lblRent.setIcon(new ImageIcon(der.getImage().getScaledInstance(lblRent.getWidth(), lblRent.getHeight(), Image.SCALE_SMOOTH)));
        
        JLabel textoRent = new JLabel("Rent");
        textoRent.setForeground(Color.WHITE);
        textoRent.setFont(new Font("Tahoma", Font.BOLD, 11));
        textoRent.setBounds(335, 20, 74, 14);
        panelTop.add(textoRent);
        
        JLabel lblAddReturn = new JLabel("");
        lblAddReturn.setBounds(378, 14, 25, 25);
        panelTop.add(lblAddReturn);
        ImageIcon izq = new ImageIcon(Ventana1.class.getResource("/Images/izq.png"));
        lblAddReturn.setIcon(new ImageIcon(izq.getImage().getScaledInstance(lblAddReturn.getWidth(), lblAddReturn.getHeight(), Image.SCALE_SMOOTH)));
        
        JLabel textoReturn = new JLabel("Return");
        textoReturn.setForeground(Color.WHITE);
        textoReturn.setFont(new Font("Tahoma", Font.BOLD, 11));
        textoReturn.setBounds(413, 20, 74, 14);
        panelTop.add(textoReturn);
        
        JLabel lblReport = new JLabel("");
        lblReport.setBounds(461, 14, 25, 25);
        panelTop.add(lblReport);
        ImageIcon doc = new ImageIcon(Ventana1.class.getResource("/Images/doc.png"));
        lblReport.setIcon(new ImageIcon(doc.getImage().getScaledInstance(lblReport.getWidth(), lblReport.getHeight(), Image.SCALE_SMOOTH)));
        
        JLabel textoReport = new JLabel("Report");
        textoReport.setForeground(Color.WHITE);
        textoReport.setFont(new Font("Tahoma", Font.BOLD, 11));
        textoReport.setBounds(496, 20, 74, 14);
        panelTop.add(textoReport);
        
        JLabel lblClients = new JLabel("");
        lblClients.setBounds(553, 14, 25, 25);
        panelTop.add(lblClients);
        ImageIcon usuarios = new ImageIcon(Ventana1.class.getResource("/Images/usuarios.png"));
        lblClients.setIcon(new ImageIcon(usuarios.getImage().getScaledInstance(lblClients.getWidth(), lblClients.getHeight(), Image.SCALE_SMOOTH)));
        
        JLabel textoClients = new JLabel("Clients");
        textoClients.setForeground(Color.WHITE);
        textoClients.setFont(new Font("Tahoma", Font.BOLD, 11));
        textoClients.setBounds(588, 20, 74, 14);
        panelTop.add(textoClients);
        
        JLabel lblVehicles = new JLabel("");
        lblVehicles.setBounds(648, 14, 25, 25);
        panelTop.add(lblVehicles);
        ImageIcon coche = new ImageIcon(Ventana1.class.getResource("/Images/coche.png"));
        lblVehicles.setIcon(new ImageIcon(coche.getImage().getScaledInstance(lblVehicles.getWidth(), lblVehicles.getHeight(), Image.SCALE_SMOOTH)));
        
        JLabel textoVehicles = new JLabel("Vehicles");
        textoVehicles.setForeground(Color.WHITE);
        textoVehicles.setFont(new Font("Tahoma", Font.BOLD, 11));
        textoVehicles.setBounds(683, 20, 74, 14);
        panelTop.add(textoVehicles);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(10, 61, 819, 369);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JTextPane txtpnDatos = new JTextPane();
        txtpnDatos.setEditable(false);
        txtpnDatos.setFont(new Font("Tahoma", Font.BOLD, 11));
        txtpnDatos.setText("Vehicle No\r\n\r\nClient Id\r\n\r\nIssue Date\r\n\r\nNo of Dates\r\n\r\nCharge\r\n\r\nAdvance\r\n\r\nBalance");
        txtpnDatos.setBounds(10, 11, 104, 188);
        panel.add(txtpnDatos);
        
        textFieldVehicle = new JTextField();
        textFieldVehicle.setBounds(124, 11, 155, 20);
        panel.add(textFieldVehicle);
        textFieldVehicle.setColumns(10);
        
        textFieldClientId = new JTextField();
        textFieldClientId.setColumns(10);
        textFieldClientId.setBounds(124, 38, 155, 20);
        panel.add(textFieldClientId);
        
        textFieldIssueDate = new JTextField();
        textFieldIssueDate.setColumns(10);
        textFieldIssueDate.setBounds(124, 65, 155, 20);
        panel.add(textFieldIssueDate);
        
        textFieldNoDates = new JTextField();
        textFieldNoDates.setColumns(10);
        textFieldNoDates.setBounds(124, 92, 155, 20);
        panel.add(textFieldNoDates);
        
        textFieldCharge = new JTextField();
        textFieldCharge.setColumns(10);
        textFieldCharge.setBounds(124, 119, 155, 20);
        panel.add(textFieldCharge);
        
        textFieldAdvance = new JTextField();
        textFieldAdvance.setColumns(10);
        textFieldAdvance.setBounds(124, 146, 155, 20);
        panel.add(textFieldAdvance);
        
        textFieldBalance = new JTextField();
        textFieldBalance.setColumns(10);
        textFieldBalance.setBounds(124, 173, 155, 20);
        panel.add(textFieldBalance);
        
        JTextArea txtrRecibo = new JTextArea();
        txtrRecibo.setEditable(false);
        txtrRecibo.setLineWrap(true);
        txtrRecibo.setBackground(Color.WHITE);
        //txtrRecibo.setBounds(322, 11, 201, 188);
        //panel.add(txtrRecibo);
        JScrollPane sp = new JScrollPane(txtrRecibo, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setBounds(309, 11, 200, 200);
        panel.add(sp);
        
        JButton btnReturn = new JButton("Return");
        btnReturn.setIcon(new ImageIcon(Ventana1.class.getResource("/Images/returnss.png")));
        btnReturn.setBackground(new Color(50, 205, 50));
        btnReturn.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnReturn.setBounds(532, 26, 245, 47);
        panel.add(btnReturn);
        
        JButton btnPrint = new JButton("Print");
        btnPrint.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//validacion para que llene todos los datos
        		if(textFieldVehicle.getText().equals("") || textFieldClientId.getText().equals("") || textFieldIssueDate.getText().equals("") || textFieldNoDates.getText().equals("") || textFieldCharge.getText().equals("") || textFieldAdvance.getText().equals("") || textFieldBalance.getText().equals("") ) 
        		{
        			JOptionPane.showMessageDialog(null,"Llene todos los datos");
        		}else {
        			txtrRecibo.setText("");
        			
        			String data[] = {textFieldVehicle.getText(), textFieldClientId.getText(), textFieldIssueDate.getText(), textFieldNoDates.getText(), textFieldCharge.getText(), textFieldAdvance.getText(), textFieldBalance.getText(),""};
			        
			        DefaultTableModel model = (DefaultTableModel)table.getModel();
			        model.addRow(data);
        			
	    			txtrRecibo.append("RECIBO"+"\n" +
	    					"Vehicle No: " + textFieldVehicle.getText() + "\n" +
	    					"Cliente Id: " + textFieldClientId.getText() + "\n" +
	    					"Issue Date: " + textFieldIssueDate.getText() + "\n" +
	    					"No of Dates: " + textFieldNoDates.getText() + "\n" +
	    					"Charge: " + textFieldCharge.getText() + "\n" +
	    					"Advance: " + textFieldAdvance.getText() + "\n" +
	    					"Balance: " + textFieldBalance.getText() + "\n");
			        // Limpiar el JTextField
			        textFieldVehicle.setText("");
			        textFieldClientId.setText("");
			        textFieldIssueDate.setText("");
			        textFieldNoDates.setText("");
			        textFieldCharge.setText("");
			        textFieldAdvance.setText("");
			        textFieldBalance.setText("");
			        
			        
			        
			        
			        
        		}
        	}
        });
        btnPrint.setIcon(new ImageIcon(Ventana1.class.getResource("/Images/print.png")));
        btnPrint.setBackground(new Color(238, 130, 238));
        btnPrint.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnPrint.setBounds(532, 92, 104, 47);
        panel.add(btnPrint);
        
        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		txtrRecibo.setText("");
        	}
        });
        btnClear.setIcon(new ImageIcon(Ventana1.class.getResource("/Images/clear.png")));
        btnClear.setBackground(new Color(255, 255, 0));
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnClear.setBounds(673, 91, 104, 47);
        panel.add(btnClear);
        /*
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(35, 264, 708, 181);
        panel.add(scrollPane);
        */
        
        model = new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                    "Vehicle No", "Client Id", "Issue Data", "No of Dates", "Charge", "Advance", "Balance"
                }
            );
        
        table = new JTable();
        table.setModel(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 230, 700, 100);
        panel.add(scrollPane);
        
        JLabel lblNewLabel = new JLabel("Vehicle Rental System");
        lblNewLabel.setForeground(Color.RED);
        lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 20));
        lblNewLabel.setBounds(10, 455, 241, 25);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("2019-7-20");
        lblNewLabel_1.setForeground(Color.BLUE);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 16));
        lblNewLabel_1.setBounds(292, 455, 241, 25);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("1:15:2");
        lblNewLabel_1_1.setForeground(Color.BLUE);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.ITALIC, 16));
        lblNewLabel_1_1.setBounds(573, 455, 241, 25);
        contentPane.add(lblNewLabel_1_1);
        
        
        
	}
}
