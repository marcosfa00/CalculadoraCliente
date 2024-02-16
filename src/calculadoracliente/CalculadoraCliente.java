/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoracliente;

import java.io.IOException;

/**
 *
 * @author postgres
 */
public class CalculadoraCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Methods cliente = new Methods();

        try {
            // Conectar al servidor
            cliente.connect();

            // Obtener las opciones de operación desde el servidor
            cliente.getOperationOptions();

            // Enviar operando al servidor
            cliente.sendOperaciones();

            // Realizar más operaciones según tus necesidades
            cliente.receiveCalculation();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
          
        }
    }

    }
    

