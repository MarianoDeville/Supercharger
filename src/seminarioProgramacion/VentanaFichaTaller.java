package seminarioProgramacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JComboBox;


public class VentanaFichaTaller extends Ventanas {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTiempoTrabajo;
	private JTextField txtTrabajoRealizado;
	private JTextField txtMaterialesUsados;


	public VentanaFichaTaller(String nombreVentana) {

		super(nombreVentana);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblCliente = new JLabel("Cliente:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblCliente, 25, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblCliente, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblCliente);
		
		JComboBox comboBoxClientes = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBoxClientes, 25, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBoxClientes, 135, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, comboBoxClientes, 550, SpringLayout.WEST, contentPane);
		contentPane.add(comboBoxClientes);
		
		JLabel lblTiempo = new JLabel("Tiempo de trabajo:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblTiempo, 20, SpringLayout.SOUTH, lblCliente);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblTiempo, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblTiempo);
		
		txtTiempoTrabajo = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtTiempoTrabajo, 0, SpringLayout.NORTH, lblTiempo);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtTiempoTrabajo, 135, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtTiempoTrabajo, 550, SpringLayout.WEST, contentPane);
		contentPane.add(txtTiempoTrabajo);
		txtTiempoTrabajo.setColumns(10);
		
		JLabel lblTipoTrabajo = new JLabel("Trabajos realizados:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblTipoTrabajo, 20, SpringLayout.SOUTH, lblTiempo);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblTipoTrabajo, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblTipoTrabajo);
		
		txtTrabajoRealizado = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtTrabajoRealizado, 0, SpringLayout.NORTH, lblTipoTrabajo);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtTrabajoRealizado, 135, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtTrabajoRealizado, 550, SpringLayout.WEST, contentPane);
		contentPane.add(txtTrabajoRealizado);
		txtTrabajoRealizado.setColumns(10);
				
		JLabel lblMateriales = new JLabel("Materiales usados:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblMateriales, 20, SpringLayout.SOUTH, lblTipoTrabajo);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblMateriales, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblMateriales);
		
		txtMaterialesUsados = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtMaterialesUsados, 0, SpringLayout.NORTH, lblMateriales);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtMaterialesUsados, 135, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtMaterialesUsados, 550, SpringLayout.WEST, contentPane);
		contentPane.add(txtMaterialesUsados);
		txtMaterialesUsados.setColumns(10);
		
		JLabel lblMecanico = new JLabel("Mecanico:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblMecanico, 20, SpringLayout.SOUTH, lblMateriales);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblMecanico, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblMecanico);
				
		JComboBox comboBoxMecanico = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBoxMecanico, 0, SpringLayout.NORTH, lblMecanico);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBoxMecanico, 135, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, comboBoxMecanico, 550, SpringLayout.WEST, contentPane);
		contentPane.add(comboBoxMecanico);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnVolver, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnVolver, -10, SpringLayout.EAST, contentPane);
		contentPane.add(btnVolver);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Guardo los datos en la base de datos e imprimo la constancia para el cliente.
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnGuardar, 0, SpringLayout.NORTH, btnVolver);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnGuardar, -31, SpringLayout.WEST, btnVolver);
		contentPane.add(btnGuardar);

	}
}
