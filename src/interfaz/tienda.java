package interfaz;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class tienda extends JFrame {
	
	private JLabel eNombre, eProducto, eCantidad, ePrecio, eDireccion;
	private JTextField cNombre, cProducto, cCantidad, cPrecio, cDireccion;
	private JPanel contenedor;
	JRadioButton envio, envio1, envio2;
	JTextArea especial, fin;

	
			
	 public static void main(String[] args) {
		 
		 EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    tienda frame = new tienda();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();}		
	            				}});}
	 
	 //CREACION DEL FRAME
		 
	 public tienda() {
		 
			//CREAR VENTANA
			 setTitle("NUKA'S SHOP");
			 setBounds(500, 300, 600, 600);
			 setVisible(true);
			 setLocationRelativeTo(null); //Posicionamos pantalla centro
			 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 			 
			 //INSTANCIAMOS CONTENEDOR A LA VENTANA 
			 contenedor=new JPanel(); 
			 contenedor.setLayout(null);
			 setContentPane(contenedor);
			 
			 //CREAR COMPONENTES
			 
			 JLabel titulo = new JLabel("NUKA'S SHOP");
		        titulo.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		        titulo.setHorizontalAlignment(SwingConstants.CENTER);
		        titulo.setForeground(new Color(102, 51, 255));
		        titulo.setBounds(420, 510, 163, 34);
		        contenedor.add(titulo);
			 
			 			 
			 	//ETIQUETAS 
			 
			 		 
			 JLabel	eNombre = new JLabel("NOMBRE");
			 JLabel	eDireccion = new JLabel("DIRECCIÓN");
			 JLabel	eProducto = new JLabel("PRODUCTO");
			 JLabel	eCantidad = new JLabel("CANTIDAD");
			 JLabel	ePrecio = new JLabel("PRECIO");
			 JLabel	eTotal = new JLabel("TOTAL");
			 JLabel	eeuros = new JLabel("€.");
			 
			 
			 		//POSICIÓN ETIQUETAS
			 
				eNombre.setBounds(25, 25, 75, 25);
				eDireccion.setBounds(350,25,100,25);
				eProducto.setBounds(25, 60, 75, 25);
				eCantidad.setBounds(25, 95, 75, 25);
				ePrecio.setBounds(25, 180, 175, 25);
				eTotal.setBounds(25, 400, 175, 25);
				eeuros.setBounds(190, 400, 175, 25);
				
					//INATANCIAMOS EN EL CONTENEDOR
				
				contenedor.add(eNombre);
				contenedor.add(eProducto);
				contenedor.add(eCantidad);
				contenedor.add(ePrecio);
				contenedor.add(eDireccion);
				contenedor.add(eTotal);
				contenedor.add(eeuros);
				
				//CUADROS DE TEXTO
				
			 JTextField	cNombre = new JTextField();
			 JTextField	cDireccion = new JTextField();
			 JTextField	cProducto = new JTextField();
			 JTextField	cCantidad = new JTextField();
			 JTextField	cPrecio = new JTextField();
			 JTextField	cTotal = new JTextField();
				 
			 		//POSICIÓN CUADROS DE TEXTO
			 
				cNombre.setBounds(100, 25, 160, 20);
				cDireccion.setBounds(430,25,120,25);
				cPrecio.setBounds(100,180,160,20);
				cTotal.setBounds(100, 400, 75, 25);
			 
					//INSATANCIAMOS EN EL CONTENEDOR
				
				contenedor.add(cNombre);
				contenedor.add(cProducto);
				contenedor.add(cCantidad);
				contenedor.add(cPrecio);
				contenedor.add(cDireccion);
				contenedor.add(cTotal);
				
				
				//MENU DESPLEGABLE OPCIONES
				
			JComboBox opciones = new JComboBox();
			opciones.setBounds(100,60,160,20);
			contenedor.add(opciones);
	 
	                //AÑADIMOS OP
				 opciones.addItem("COMIDA");
				 opciones.addItem("JUGUETES");
				 opciones.addItem("UTENSILIOS");
				 
			//CONTADOR PARA LA CANTIDAD 
			JSpinner cant = new JSpinner();
			cant.setBounds(100,95,160,20);
			contenedor.add(cant);
			
			//TIPO ANIMAL
			
			JCheckBox animal = new JCheckBox("PERRO", true);
			JCheckBox animal1 = new JCheckBox("GATO", true);
			JCheckBox animal2 = new JCheckBox("ROEDOR", false);
			
				//POSICIÓN
				animal.setBounds(50, 140, 100, 20);
				animal1.setBounds(150, 140, 100, 20);
				animal2.setBounds(250, 140, 100, 20);
            
				//INS
				contenedor.add(animal);
				contenedor.add(animal1);
				contenedor.add(animal2);
			
			//ENVÍO CON JRADIOBUTTON
			
			JRadioButton envio= new JRadioButton("ENVÍO EXPRESS. 3€", true);
			JRadioButton envio1 = new JRadioButton("ENVÍO NORMAL. 1.5€", false);
			JRadioButton envio2 = new JRadioButton("RECOGIDA EN TIENDA. GRATIS", false);
				
				//POSICIÓN
				envio.setBounds(25, 300, 209, 23);
				envio1.setBounds(25, 320, 209, 23);
				envio2.setBounds(25, 340, 209, 23);
		    
		    	//INSTANC
				contenedor.add(envio);
				contenedor.add(envio1);
				contenedor.add(envio2);
				
				//AGRUPAMOS
				ButtonGroup agr = new ButtonGroup();
                agr.add(envio);
                agr.add(envio1);
                agr.add(envio2);
	 
				
				
				 //TEXT AREA RESULTADO
				
            JTextArea especial = new JTextArea("AÑADIR NOTAS Y RECOMENDACIONES PARA SU PEDIDO.");
            especial.setBounds(350, 180, 200, 100);
            especial.setWrapStyleWord(true);
            especial.setLineWrap(true);
            contenedor.add(especial);   
            
            JTextArea fin = new JTextArea("Aquí aparecerán todos los productos pedidos");
            fin.setBounds(350, 300, 200, 100);
            fin.setWrapStyleWord(true);
            fin.setLineWrap(true);
            contenedor.add(fin);   
            
            JLabel lblNewLabel_1 = new JLabel();
            lblNewLabel_1.setIcon(new ImageIcon(tienda.class.getResource("/imagen/logonuka.jpg.jpg")));
            lblNewLabel_1.setBounds(0, 450, 320,120);
            contenedor.add(lblNewLabel_1);
    		
        				
				//BOTON PEDIDO
				
			JButton compra = new JButton("HACER PEDIDO");
            compra.setBounds(350, 450, 200, 30);
            contenedor.add(compra);	
            
               //AÑADIMOS Color y DETALLES
             contenedor.setBackground(new Color(204, 255, 255));
             especial.setBackground(new Color(204, 204, 255));
             envio.setBackground(new Color(204, 204, 255));
             envio1.setBackground(new Color(255, 153, 204));
             envio2.setBackground(new Color(255, 255, 53));
             animal.setBackground(new Color(204, 255, 102));
             animal1.setBackground(new Color(204, 255, 102));
             animal2.setBackground(new Color(204, 255, 102));
             compra.setBackground(new Color(0, 0, 0));
             compra.setForeground(new Color(255, 255, 153));
             fin.setBackground(new Color(204, 255, 204));
             fin.setBorder(new LineBorder(new Color(204, 255, 102), 2));
          
                      
	 }
	 
	
}
