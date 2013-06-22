import javax.swing.JButton;
import javax.swing.JFrame;//ES MUY IMPORTANTE IMPORTAR LAS LIBRERIAS.
import javax.swing.JLabel;


public class Ventana extends JFrame{
	int Ancho = 500;
	int Alto = 500;
	
	//inicializacion de componentes de la libreria SWIING;
	private JButton btnAceptar;
	private JLabel lblrReferenciaBoton, lblTitutlo;
	
	
	public Ventana() {
		// TODO Auto-generated constructor stub
		this.setTitle("Nombre de la ventana");
		this.setSize(Ancho,Alto);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		componentes();//AQUI MANDAMOS LLAMAR EL METODO QUE CREAMO
					  //ABAJO, QUE ES EL QUE CONTIENE LOS
					  //COMPONENTES-
	}
	
	public void componentes(){
		this.setLayout(null);//poner el layout de la ventana en null.
		
		add(lblTitutlo = new JLabel("Mis primeros componenetes (botón y etiqueta)."));
		lblTitutlo.setBounds(125,10,290,20);
		
		add(lblrReferenciaBoton = new JLabel("Botón aceptar"));
		lblrReferenciaBoton.setBounds(50,100,100,20);
		
		add(btnAceptar = new JButton("Aceptar"));
		btnAceptar.setBounds(50,140,100,30);
	}

}
