package seminarioProgramacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class VentanaNuevoCliente extends Ventanas {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTipoDocumento;
	private JTextField txtNumeroDocumento;
	private JTextField txtTelefono;
	private JTextField txtCiaAseguradora;
	private JTextField txtPoliza;
	private JTextField txtMarca;
	private JTextField txtModelo;

	public VentanaNuevoCliente(String nombreVentana) {
		
		super(nombreVentana);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNombre = new JLabel("Nombre:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNombre, 25, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNombre, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtNombre, 25, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtNombre, 110, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtNombre, 300, SpringLayout.WEST, contentPane);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblApellido, 20, SpringLayout.SOUTH, lblNombre);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblApellido, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblApellido);
		
		txtApellido = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtApellido, 0, SpringLayout.NORTH, lblApellido);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtApellido, 110, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtApellido, 300, SpringLayout.WEST, contentPane);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo documento:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblTipo, 20, SpringLayout.SOUTH, lblApellido);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblTipo, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblTipo);
		
		txtTipoDocumento = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtTipoDocumento, 0, SpringLayout.NORTH, lblTipo);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtTipoDocumento, 110, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtTipoDocumento, 300, SpringLayout.WEST, contentPane);
		contentPane.add(txtTipoDocumento);
		txtTipoDocumento.setColumns(10);
				
		JLabel lblNumero = new JLabel("Número:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNumero, 20, SpringLayout.SOUTH, lblTipo);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNumero, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblNumero);
		
		txtNumeroDocumento = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtNumeroDocumento, 0, SpringLayout.NORTH, lblNumero);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtNumeroDocumento, 110, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtNumeroDocumento, 300, SpringLayout.WEST, contentPane);
		contentPane.add(txtNumeroDocumento);
		txtNumeroDocumento.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Teléfono:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblTelefono, 20, SpringLayout.SOUTH, lblNumero);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblTelefono, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblTelefono);
		
		txtTelefono = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtTelefono, 0, SpringLayout.NORTH, lblTelefono);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtTelefono, 110, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtTelefono, 300, SpringLayout.WEST, contentPane);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
				
		JLabel lblSeguro = new JLabel("Datos del seguro");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblSeguro, 20, SpringLayout.SOUTH, lblTelefono);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblSeguro, 50, SpringLayout.WEST, contentPane);
		contentPane.add(lblSeguro);
		
		JLabel lblCiaAseguradora = new JLabel("Cia. aseguradora:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblCiaAseguradora, 20, SpringLayout.SOUTH, lblSeguro);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblCiaAseguradora, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblCiaAseguradora);
		
		txtCiaAseguradora = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtCiaAseguradora, 0, SpringLayout.NORTH, lblCiaAseguradora);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtCiaAseguradora, 110, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtCiaAseguradora, 300, SpringLayout.WEST, contentPane);
		contentPane.add(txtCiaAseguradora);
		txtCiaAseguradora.setColumns(10);
		
		JLabel lblPoliza = new JLabel("Póliza:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblPoliza, 20, SpringLayout.SOUTH, lblCiaAseguradora);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblPoliza, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblPoliza);
		
		txtPoliza = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtPoliza, 0, SpringLayout.NORTH, lblPoliza);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtPoliza, 110, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtPoliza, 300, SpringLayout.WEST, contentPane);
		contentPane.add(txtPoliza);
		txtPoliza.setColumns(10);
		
				JLabel lblVehiculo = new JLabel("Datos del vehículo");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblVehiculo, 20, SpringLayout.SOUTH, lblPoliza);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblVehiculo, 50, SpringLayout.WEST, contentPane);
		contentPane.add(lblVehiculo);
		
		JLabel lblMarca = new JLabel("Marce:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblMarca, 20, SpringLayout.SOUTH, lblVehiculo);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblMarca, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblMarca);
		
		txtMarca = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtMarca, 0, SpringLayout.NORTH, lblMarca);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtMarca, 110, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtMarca, 300, SpringLayout.WEST, contentPane);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		
		JLabel lblModelo = new JLabel("Modelo:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblModelo, 20, SpringLayout.SOUTH, lblMarca);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblModelo, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblModelo);
		
		txtModelo = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtModelo, 0, SpringLayout.NORTH, lblModelo);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtModelo, 110, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtModelo, 300, SpringLayout.WEST, contentPane);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
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
				
				// Guardo los datos en la base de datos e imprimo la ficha para el taller.
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnGuardar, 0, SpringLayout.NORTH, btnVolver);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnGuardar, -31, SpringLayout.WEST, btnVolver);
		contentPane.add(btnGuardar);
	}
}
