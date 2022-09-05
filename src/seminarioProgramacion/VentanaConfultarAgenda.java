package seminarioProgramacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class VentanaConfultarAgenda extends Ventanas {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollTabla;
	private JTable agenda;
	private JComboBox<Object> comboBoxEspecialidad;
	private JComboBox<Object> comboBoxMes;
	private JComboBox<Object> comboBoxDia;
	private JTextField txtNombreApellido;

	public VentanaConfultarAgenda(String nombreVentana) {

		super(nombreVentana);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		scrollTabla = new JScrollPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, scrollTabla, 57, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, scrollTabla, -108, SpringLayout.SOUTH, contentPane);
		contentPane.add(scrollTabla);
		agenda = new JTable();
		agenda.setModel(new DefaultTableModel(
			new Object[][] {
				
				{null, null, null},
			},
			new String[] {
				"Hora", "Disponibilidad", "Sel."
			}
		));
		sl_contentPane.putConstraint(SpringLayout.WEST, scrollTabla, 11, SpringLayout.WEST, contentPane);
		scrollTabla.setViewportView(agenda);
		

		JLabel lblEspecialidad = new JLabel("Especialidad:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblEspecialidad, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblEspecialidad, 11, SpringLayout.WEST, contentPane);
		contentPane.add(lblEspecialidad);
		
		comboBoxEspecialidad = new JComboBox<Object>();
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBoxEspecialidad, -3, SpringLayout.NORTH, lblEspecialidad);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBoxEspecialidad, 14, SpringLayout.EAST, lblEspecialidad);
		comboBoxEspecialidad.setModel(new DefaultComboBoxModel<Object>(new String[] {"Frenos", "Electricidad", "Tren delantero y amortiguaci\u00F3n", "Encendido y carburaci\u00F3n", "Chapa y pintura", "Mec\u00E1nica general"}));
		contentPane.add(comboBoxEspecialidad);
		
		JLabel lblFecha = new JLabel("Fecha:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblFecha, 0, SpringLayout.NORTH, lblEspecialidad);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblFecha, 23, SpringLayout.EAST, comboBoxEspecialidad);
		contentPane.add(lblFecha);
		
		comboBoxDia = new JComboBox<Object>();
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBoxDia, -3, SpringLayout.NORTH, lblEspecialidad);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBoxDia, 6, SpringLayout.EAST, lblFecha);
		comboBoxDia.setModel(new DefaultComboBoxModel<Object>(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		contentPane.add(comboBoxDia);
		
		comboBoxMes = new JComboBox<Object>();
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBoxMes, -3, SpringLayout.NORTH, lblEspecialidad);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBoxMes, 6, SpringLayout.EAST, comboBoxDia);
		comboBoxMes.setModel(new DefaultComboBoxModel<Object>(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		contentPane.add(comboBoxMes);
		
		JButton btnVolver = new JButton("Volver");
		sl_contentPane.putConstraint(SpringLayout.EAST, scrollTabla, 0, SpringLayout.EAST, btnVolver);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnVolver, -31, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnVolver, -10, SpringLayout.EAST, contentPane);
		contentPane.add(btnVolver);
		
		JButton btnAgendar = new JButton("Agendar");
		btnAgendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Asigna un turno y lo guarda en la base de datos.
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnAgendar, 0, SpringLayout.NORTH, btnVolver);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAgendar, -50, SpringLayout.WEST, btnVolver);
		contentPane.add(btnAgendar);
		
		JLabel lblNombreApellido = new JLabel("Nombre y apellido del cliente:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNombreApellido, 19, SpringLayout.SOUTH, scrollTabla);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNombreApellido, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblNombreApellido);
		
		txtNombreApellido = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtNombreApellido, 0, SpringLayout.NORTH, lblNombreApellido);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtNombreApellido, 6, SpringLayout.EAST, lblNombreApellido);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtNombreApellido, 400, SpringLayout.EAST, lblNombreApellido);
		contentPane.add(txtNombreApellido);
		txtNombreApellido.setColumns(10);
	}
}
