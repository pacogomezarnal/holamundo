import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DadosRisk extends JFrame {

	private JPanel contentPane;
	
	private byte dadosAtaque[]=new byte[2];
	private byte dadosDefensa[]=new byte[2];
	private int resultadoAtaque=0;
	
	private byte dadosAtaqueOrdenado[]=new byte[2];
	private byte dadosDefensaOrdenado[]=new byte[2];
	private int resultadoDefensa=0;
	
	
	private JTextField dadoAtaque1;
	private JTextField dadoAtaque2;
	private JTextField dadoDefensa1;
	private JTextField dadoDefensa2;
	private JTextField ResultadoA;
	private JTextField ResultadoD;

	/**
	 * Create the frame.
	 */
	public DadosRisk() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 243, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDadosAtaque = new JLabel("Dados Ataque");
		lblDadosAtaque.setBounds(10, 23, 107, 14);
		contentPane.add(lblDadosAtaque);
		
		JLabel lblDadosDefensa = new JLabel("Dados Defensa");
		lblDadosDefensa.setBounds(10, 123, 107, 14);
		contentPane.add(lblDadosDefensa);
		
		JLabel lblDado = new JLabel("Dado 1:");
		lblDado.setBounds(10, 54, 46, 14);
		contentPane.add(lblDado);
		
		JLabel lblDado_1 = new JLabel("Dado 2:");
		lblDado_1.setBounds(10, 79, 46, 14);
		contentPane.add(lblDado_1);
		
		dadoAtaque1 = new JTextField();
		dadoAtaque1.setBounds(59, 51, 46, 20);
		contentPane.add(dadoAtaque1);
		dadoAtaque1.setColumns(10);
		
		dadoAtaque2 = new JTextField();
		dadoAtaque2.setColumns(10);
		dadoAtaque2.setBounds(59, 79, 46, 20);
		contentPane.add(dadoAtaque2);
		
		JLabel label = new JLabel("Dado 1:");
		label.setBounds(10, 155, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Dado 2:");
		label_1.setBounds(10, 189, 46, 14);
		contentPane.add(label_1);
		
		dadoDefensa1 = new JTextField();
		dadoDefensa1.setColumns(10);
		dadoDefensa1.setBounds(59, 148, 46, 20);
		contentPane.add(dadoDefensa1);
		
		dadoDefensa2 = new JTextField();
		dadoDefensa2.setColumns(10);
		dadoDefensa2.setBounds(59, 186, 46, 20);
		contentPane.add(dadoDefensa2);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dadosAtaque[0]= Byte.valueOf(dadoAtaque1.getText());
				dadosAtaque[1]= Byte.valueOf(dadoAtaque2.getText());
				
				if(dadosAtaque[0]>dadosAtaque[1])
				{
					//dadoAtaqueMayor.setText(String.valueOf(dadosAtaque[0]));
					//dadoAtaqueMenor.setText(String.valueOf(dadosAtaque[1]));
					dadosAtaqueOrdenado[0]=dadosAtaque[0];
					dadosAtaqueOrdenado[1]=dadosAtaque[1];
				}else{
					//dadoAtaqueMayor.setText(String.valueOf(dadosAtaque[1]));
					//dadoAtaqueMenor.setText(String.valueOf(dadosAtaque[0]));	
					dadosAtaqueOrdenado[0]=dadosAtaque[1];
					dadosAtaqueOrdenado[1]=dadosAtaque[0];
				}
				
				
				dadosDefensa[0]= Byte.valueOf(dadoDefensa1.getText());
				dadosDefensa[1]= Byte.valueOf(dadoDefensa2.getText());	
				
				if(dadosDefensa[0]>dadosDefensa[1])
				{
					//dadoDefensaMayor.setText(String.valueOf(dadosDefensa[0]));
					//dadoDefensaMenor.setText(String.valueOf(dadosDefensa[1]));
					dadosDefensaOrdenado[0]=dadosDefensa[0];
					dadosDefensaOrdenado[1]=dadosDefensa[1];
				}else{
					//dadoDefensaMayor.setText(String.valueOf(dadosDefensa[1]));
					//dadoDefensaMenor.setText(String.valueOf(dadosDefensa[0]));		
					dadosDefensaOrdenado[0]=dadosDefensa[1];
					dadosDefensaOrdenado[1]=dadosDefensa[0];
				}
				
				if(dadosAtaqueOrdenado[0]>dadosDefensaOrdenado[0])
				{
					resultadoAtaque=resultadoAtaque+1;
				}else{
					resultadoDefensa=resultadoDefensa+1;
				}
				
				if(dadosAtaqueOrdenado[1]>dadosDefensaOrdenado[1])
				{
					resultadoAtaque=resultadoAtaque+1;
				}else{
					resultadoDefensa=resultadoDefensa+1;
				}
				
				ResultadoA.setText(String.valueOf(resultadoAtaque));
				ResultadoD.setText(String.valueOf(resultadoDefensa));
				
				
			}
		});
		btnNewButton.setBounds(59, 239, 91, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(137, 79, 81, 14);
		contentPane.add(lblResultado);
		
		JLabel lblAtaque = new JLabel("Ataque");
		lblAtaque.setBounds(137, 104, 46, 14);
		contentPane.add(lblAtaque);
		
		JLabel lblDefensa = new JLabel("Defensa");
		lblDefensa.setBounds(137, 155, 46, 14);
		contentPane.add(lblDefensa);
		
		ResultadoA = new JTextField();
		ResultadoA.setColumns(10);
		ResultadoA.setBounds(137, 124, 46, 20);
		contentPane.add(ResultadoA);
		
		ResultadoD = new JTextField();
		ResultadoD.setColumns(10);
		ResultadoD.setBounds(137, 180, 46, 20);
		contentPane.add(ResultadoD);
	}
}
