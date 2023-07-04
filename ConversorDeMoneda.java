import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConversorDeMoneda extends JFrame implements ActionListener {
	private JLabel pesosMexicanosLabel, dolaresLabel, eurosLabel, librasEsterlinasLabel, yenLabel, wonLabel;
	private JTextField pesosMexicanosTextField, dolaresTextField, eurosTextField, librasEsterlinasTextField, yenTextField, wonTextField;
	private JButton convertirButton, limpiarButton;

	private ImageIcon image = new ImageIcon("image.png");

	public ConversorDeMoneda() {
		setTitle("Conversor de Moneda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLayout(new GridLayout(8, 2));
		getContentPane().setBackground(new Color(173, 216, 230));

		pesosMexicanosLabel = new JLabel("Pesos Mexicanos:");
		pesosMexicanosTextField = new JTextField();
		dolaresLabel = new JLabel("Dólares:");
		dolaresTextField = new JTextField();
		eurosLabel = new JLabel("Euros:");
		eurosTextField = new JTextField();
		librasEsterlinasLabel = new JLabel("Libras Esterlinas:");
		librasEsterlinasTextField = new JTextField();
		yenLabel = new JLabel("Yen Japonés:");
		yenTextField = new JTextField();
		wonLabel = new JLabel("Won sul-coreano:");
		wonTextField = new JTextField();

		convertirButton = new JButton("Convertir");
		convertirButton.setBackground(Color.WHITE);
		convertirButton.addActionListener(this);

		limpiarButton = new JButton("Limpiar");
		limpiarButton.setBackground(Color.WHITE);
		limpiarButton.addActionListener(this);

		add(pesosMexicanosLabel);
		add(pesosMexicanosTextField);
		add(dolaresLabel);
		add(dolaresTextField);
		add(eurosLabel);
		add(eurosTextField);
		add(librasEsterlinasLabel);
		add(librasEsterlinasTextField);
		add(yenLabel);
		add(yenTextField);
		add(wonLabel);
		add(wonTextField);
		add(new JLabel());
		add(convertirButton);
		add(new JLabel());
		add(limpiarButton);

		pack();
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == convertirButton) {
			if (!pesosMexicanosTextField.getText().isEmpty()) {
				double pesosMexicanos = Double.parseDouble(pesosMexicanosTextField.getText());

				if (!dolaresTextField.getText().isEmpty()) {
					double dolares = Double.parseDouble(dolaresTextField.getText());
					double pesosMexicanosConvertidos = dolares * 19.98;
					pesosMexicanosTextField.setText(String.format("%.2f", pesosMexicanosConvertidos));
				} else if (!eurosTextField.getText().isEmpty()) {
					double euros = Double.parseDouble(eurosTextField.getText());
					double pesosMexicanosConvertidos = euros * 22.39;
					pesosMexicanosTextField.setText(String.format("%.2f", pesosMexicanosConvertidos));
				} else if (!librasEsterlinasTextField.getText().isEmpty()) {
					double librasEsterlinas = Double.parseDouble(librasEsterlinasTextField.getText());
					double pesosMexicanosConvertidos = librasEsterlinas * 24.49;
					pesosMexicanosTextField.setText(String.format("%.2f", pesosMexicanosConvertidos));
				} else if (!yenTextField.getText().isEmpty()) {
					double yen = Double.parseDouble(yenTextField.getText());
					double pesosMexicanosConvertidos = yen * 0.059;
					pesosMexicanosTextField.setText(String.format("%.2f", pesosMexicanosConvertidos));
				} else if (!wonTextField.getText().isEmpty()) {
					double won = Double.parseDouble(wonTextField.getText());
					double pesosMexicanosConvertidos = won * 0.017;
					pesosMexicanosTextField.setText(String.format("%.2f", pesosMexicanosConvertidos));
				}
			} else {
				if (!dolaresTextField.getText().isEmpty()) {
					double dolares = Double.parseDouble(dolaresTextField.getText());
					double pesosMexicanos = dolares / 19.98;
					pesosMexicanosTextField.setText(String.format("%.2f", pesosMexicanos));
				} else if (!eurosTextField.getText().isEmpty()) {
					double euros = Double.parseDouble(eurosTextField.getText());
					double pesosMexicanos = euros / 22.39;
					pesosMexicanosTextField.setText(String.format("%.2f", pesosMexicanos));
				} else if (!librasEsterlinasTextField.getText().isEmpty()) {
					double librasEsterlinas = Double.parseDouble(librasEsterlinasTextField.getText());
					double pesosMexicanos = librasEsterlinas / 24.49;
					pesosMexicanosTextField.setText(String.format("%.2f", pesosMexicanos));
				} else if (!yenTextField.getText().isEmpty()) {
					double yen = Double.parseDouble(yenTextField.getText());
					double pesosMexicanos = yen / 0.059;
					pesosMexicanosTextField.setText(String.format("%.2f", pesosMexicanos));
				} else if (!wonTextField.getText().isEmpty()) {
					double won = Double.parseDouble(wonTextField.getText());
					double pesosMexicanos = won / 0.017;
					pesosMexicanosTextField.setText(String.format("%.2f", pesosMexicanos));
				}
			}
		} else if (e.getSource() == limpiarButton) {
			pesosMexicanosTextField.setText("");
			dolaresTextField.setText("");
			eurosTextField.setText("");
			librasEsterlinasTextField.setText("");
			yenTextField.setText("");
			wonTextField.setText("");
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ConversorDeMoneda();
			}
		});
	}
}
