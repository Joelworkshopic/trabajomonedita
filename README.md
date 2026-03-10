# Conversor de Monedas

Este es un conversor de monedas simple implementado en Java que permite convertir entre varias monedas latinoamericanas y dólares estadounidenses.

## Características

- Conversión entre USD y ARS (Peso Argentino)
- Conversión entre USD y BRL (Real Brasileño)
- Conversión entre USD y COP (Peso Colombiano)
- Interfaz de línea de comandos intuitiva
- Validación de entradas del usuario

## Requisitos

- Java 11 o superior
- Conexión a internet (para acceder a la API de tasas de cambio)

## Cómo usar

1. Compile el programa:
   ```
   javac src/Main.java
   ```

2. Ejecute el programa:
   ```
   java src/Main
   ```

3. En el menú principal, seleccione la conversión deseada ingresando el número correspondiente:
   - 1: Dólar -> Peso argentino
   - 2: Peso argentino -> Dólar
   - 3: Dólar -> Real brasileño
   - 4: Real brasileño -> Dólar
   - 5: Dólar -> Peso colombiano
   - 6: Peso colombiano -> Dólar
   - 0: Salir

4. Ingrese la cantidad que desea convertir cuando se le solicite.

5. El programa mostrará el resultado de la conversión.

## Notas

- Este programa utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener las tasas de cambio actuales.
- Se requiere una conexión a internet para que el programa funcione correctamente.
- Las tasas de cambio se actualizan periódicamente según la disponibilidad de la API.

## Licencia

Este proyecto es de código abierto y está disponible bajo la licencia MIT.