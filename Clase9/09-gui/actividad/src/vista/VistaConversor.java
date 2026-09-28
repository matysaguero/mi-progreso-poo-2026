package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VistaConversor {
    
    private final JFrame ventana;
    private final JTextField campoPesos;
    private final JLabel etiquetaResultado;
    private final JButton botonConvertir;

    public VistaConversor(){
        //super("Conversor de moneda");
        this.ventana = new JFrame("ventana"); 
        this.ventana.setSize(360, 200);
        this.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setResizable(false);
        // Sin administrador de disposicion: cada componente se ubica con setBounds().
        this.ventana.setLayout(null);
    
    
        this.etiquetaResultado = new JLabel("Resultado:  ");
        this.campoPesos = new JTextField();
        this.botonConvertir = new JButton("Convertir:  "); 

        etiquetaResultado.setBounds(20, 20, 200, 25);
        this.campoPesos.setBounds(150, 20, 170, 25);
        this.botonConvertir.setBounds(140, 65, 100, 50);

        this.ventana.add(etiquetaResultado);
        this.ventana.add(this.campoPesos);
        this.ventana.add(this.botonConvertir);
    }


    public void mostrar(){
        this.ventana.setVisible(true);
    }

    public JButton getBotonConvertir(){
       return this.botonConvertir;
    }

    public String getTextoPesos(){
        return this.campoPesos.getText();
    }

    public void mostrarResultado(double total){
        this.etiquetaResultado.setText(String.format("Total en dolares: $%.2f", total));
    }

    public void mostrarError(String mensaje){
        JOptionPane.showMessageDialog(this.ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

}
