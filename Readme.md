## Calculadora Cliente en Java

Esta aplicación Java implementa una calculadora cliente que se conecta a un servidor para realizar operaciones remotas. La conexión se establece mediante sockets, permitiendo una comunicación eficiente. La aplicación cuenta con métodos para enviar operandos, operaciones y recibir los resultados del servidor.

### Uso

1. **Conexión al Servidor:**
   - La aplicación se conecta a un servidor en la dirección IP "192.168.0.10" y el puerto 6666.
   
2. **Obtención de Opciones de Operación:**
   - La aplicación recibe opciones de operación del servidor y muestra una ventana de selección para que el usuario elija.

3. **Envío de Operandos:**
   - Se envían operandos al servidor, permitiendo al usuario ingresar valores a través de ventanas de diálogo.

4. **Recepción del Resultado:**
   - La aplicación recibe y muestra el resultado de la operación realizada por el servidor.

5. **Continuación de Operaciones:**
   - El usuario decide si desea continuar con nuevas operaciones.

### Configuración

- Asegúrese de tener una conexión de red estable.
- Modifique la dirección IP y el puerto en el método `connect` según sea necesario.

### Requisitos

- Java Development Kit (JDK)

### Ejecución

1. Compile el código.
2. Ejecute la aplicación.
3. Siga las instrucciones en la interfaz de usuario para realizar operaciones remotas.

### Notas

Este proyecto es parte del esfuerzo por alcanzar la "33". ¡Vamos a por ello!
