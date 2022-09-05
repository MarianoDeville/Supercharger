package seminarioProgramacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

public class VentanaEmitirInforme extends Ventanas {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollTabla;
	private JTable trabajos;

	public VentanaEmitirInforme(String nombreVentana) {
		
		super(nombreVentana);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		scrollTabla = new JScrollPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, scrollTabla, 29, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, scrollTabla, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, scrollTabla, -100, SpringLayout.SOUTH, contentPane);
		contentPane.add(scrollTabla);
		trabajos = new JTable();
		trabajos.setModel(new DefaultTableModel(
			new Object[][] {
				
				{null, null, null},
			},
			new String[] {
				"Cia. aseguradora", "Cantidad de trabajos", "Monto"
			}
		));
		scrollTabla.setViewportView(trabajos);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Imprimo la tabla.
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, scrollTabla, -30, SpringLayout.NORTH, btnImprimir);
		contentPane.add(btnImprimir);
		
		JButton btnVolver = new JButton("Volver");
		sl_contentPane.putConstraint(SpringLayout.EAST, scrollTabla, 0, SpringLayout.EAST, btnVolver);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnVolver, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnImprimir, 0, SpringLayout.NORTH, btnVolver);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnImprimir, -22, SpringLayout.WEST, btnVolver);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnVolver, -10, SpringLayout.EAST, contentPane);
		contentPane.add(btnVolver);
	}
}
