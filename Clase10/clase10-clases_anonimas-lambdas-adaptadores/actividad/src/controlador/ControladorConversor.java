// Archivo: ControladorConversor.java
// El controlador tal como quedo en la clase 9: un solo receptor registrado en
// los dos botones, que adentro pregunta cual fue la fuente.
//
// Los pasos de cada TODO estan en el enunciado de la actividad.
// TODO 1: ReceptorEuros, una clase con nombre para el boton de euros.
// TODO 2: la misma clase, anonima, adentro del constructor. Borrar ReceptorEuros.
// TODO 3: una lambda por boton. Sacar implements ActionListener y actionPerformed().
// TODO 4: Enter en el campo convierte a dolares (KeyAdapter).
// TODO 5: doble click en el campo lo vacia (MouseAdapter).
// TODO 6: reales. Una lambda y un metodo mas; nada de lo que ya estaba se modifica.

package controlador;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import modelo.Conversor;
import vista.VistaConversor;

public class ControladorConversor {

    private final VistaConversor vista;
    private final Conversor conversor;

    public ControladorConversor(VistaConversor vista, Conversor conversor) {
        if (vista == null || conversor == null) {
            throw new IllegalArgumentException("La vista y el conversor son obligatorios");
        }
        this.vista = vista;
        this.conversor = conversor;
        // Un solo receptor, este objeto, registrado en los dos botones.
        this.vista.getBotonDolares().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evento){
                if (evento.getKeyCode() == KeyEvent.VK_ENTER) {
                    convertirADolares();
                }
            }
        });
        this.vista.getBotonEuros().addActionListener(evento -> this.convertirAEuros());
        
        this.vista.getCampoPesos().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evento) {
                if (evento.getClickCount() == 2){
                    vista.limpiar();
                }
            }
        });

        this.vista.getBotonReales().addActionListener(evento -> this.convertirAReales());
    }

    // Lo llama Swing cada vez que se presiona alguno de los dos botones. Se comenta ActionPerformed porque se implementaron Lambdas
    /*    @Override
    public void actionPerformed(ActionEvent evento) {
        try {
            double pesos = Double.parseDouble(this.vista.getTextoPesos());
            if (evento.getSource() == this.vista.getBotonDolares()) {
                this.vista.mostrarResultado(String.format("%.2f USD", this.conversor.aDolares(pesos)));
            }
        } catch (NumberFormatException ex) {
            this.vista.mostrarError("Ingrese un numero");
        } catch (IllegalArgumentException ex) {
            this.vista.mostrarError(ex.getMessage());
        }
    } */

    private void convertirADolares(){
        try {
            double pesos = Double.parseDouble(this.vista.getTextoPesos());
            this.vista.mostrarResultado(String.format("%.2f USD", this.conversor.aDolares(pesos)));
        } catch (NumberFormatException ex) {
            this.vista.mostrarError("Ingrese un numero");
        } catch (IllegalArgumentException ex) {
            this.vista.mostrarError(ex.getMessage());
        }
    }    
        
    private void convertirAEuros(){
        try {
            double pesos = Double.parseDouble(this.vista.getTextoPesos());
            this.vista.mostrarResultado(String.format("%.2f EUR", this.conversor.aEuros(pesos)));
        } catch (NumberFormatException ex) {
            this.vista.mostrarError("Ingrese un numero");
        } catch (IllegalArgumentException ex) {
            this.vista.mostrarError(ex.getMessage());
        }
    }

    private void convertirAReales(){
        try {
            double pesos = Double.parseDouble(this.vista.getTextoPesos());
            this.vista.mostrarResultado(String.format("%.2f BRL", this.conversor.aReales(pesos)));
        } catch (NumberFormatException ex) {
            this.vista.mostrarError("Ingrese un numero");
        } catch (IllegalArgumentException ex) {
            this.vista.mostrarError(ex.getMessage());
        }
    }    
}
