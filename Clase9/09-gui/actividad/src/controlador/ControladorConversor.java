package controlador;

import java.awt.event.ActionEvent;
import modelo.Conversor;
import vista.VistaConversor;
import java.awt.event.ActionListener;

public class ControladorConversor implements ActionListener {
    
    private final VistaConversor vistaConversor;
    private final Conversor conversor;

    public ControladorConversor(VistaConversor vistaConversor, Conversor conversor){
        if (vistaConversor == null || conversor == null) {
            throw new IllegalArgumentException("La vista y el conversor son obligatorios");
        }
        this.vistaConversor = vistaConversor;
        this.conversor = conversor;
        
        this.vistaConversor.getBotonConvertir().addActionListener(this);
    }

    @Override 
    public void actionPerformed(ActionEvent evento){
        try {
            double pesos = Double.parseDouble(this.vistaConversor.getTextoPesos());
            double dolares = this.conversor.aDolares(pesos);
            this.vistaConversor.mostrarResultado(dolares);
        } catch (NumberFormatException ex) {
            this.vistaConversor.mostrarError("Ingrese un numero");
        } catch (IllegalArgumentException ex) {
            this.vistaConversor.mostrarError(ex.getMessage());
        }
    }


}
