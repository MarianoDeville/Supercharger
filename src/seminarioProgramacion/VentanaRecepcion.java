package seminarioProgramacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class VentanaRecepcion extends Ventanas {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VentanaRecepcion(String nombreVentana) {
		
		super(nombreVentana);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton btnConsultarAgenda = new JButton("Consultar agenta");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnConsultarAgenda, 30, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnConsultarAgenda, -364, SpringLayout.EAST, contentPane);
		btnConsultarAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							VentanaConfultarAgenda frame = new VentanaConfultarAgenda("Consultar agenda");
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnConsultarAgenda, 50, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnConsultarAgenda, 110, SpringLayout.NORTH, contentPane);
		contentPane.add(btnConsultarAgenda);
				
		JButton btnRegistrarAsistencia = new JButton("Registrar asistencia");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnRegistrarAsistencia, 48, SpringLayout.SOUTH, btnConsultarAgenda);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnRegistrarAsistencia, 30, SpringLayout.WEST, contentPane);
		btnRegistrarAsistencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							VentanaRegistrarAsistencia frame = new VentanaRegistrarAsistencia("Registrar asistencia");
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		contentPane.add(btnRegistrarAsistencia);
		
		JButton btnListarTrabajos = new JButton("Listado trabajos realizados");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnRegistrarAsistencia, -47, SpringLayout.NORTH, btnListarTrabajos);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnRegistrarAsistencia, 0, SpringLayout.EAST, btnListarTrabajos);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnListarTrabajos, 265, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnListarTrabajos, 30, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnListarTrabajos, -364, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnListarTrabajos, -136, SpringLayout.SOUTH, contentPane);
		btnListarTrabajos.setHorizontalAlignment(SwingConstants.LEADING);
		btnListarTrabajos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							VentanaListarTrabajos frame = new VentanaListarTrabajos("Trabajos realizados");
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		contentPane.add(btnListarTrabajos);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnVolver, -22, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnVolver, -22, SpringLayout.EAST, contentPane);
		contentPane.add(btnVolver);

	}

}
