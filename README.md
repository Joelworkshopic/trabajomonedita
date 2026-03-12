# Conversor de Monedas

Este es un conversor de monedas simple implementado en Java que permite convertir entre varias monedas latinoamericanas y dólares estadounidenses.

## Características

- Conversión entre USD y ARS (Peso Argentino)
- Conversión entre USD y BRL (Real Brasileño)
- Conversión entre USD y COP (Peso Colombiano)
- Interfaz de línea de comandos intuitiva
- Validación de entradas del usuario
- Tasas de cambio en tiempo real

## Requisitos

- Java 11 o superior
- Conexión a internet (para acceder a la API de tasas de cambio)

## Instalación y Ejecución

### Opción 1: Ejecutar desde el código fuente

1. Navegue al directorio del proyecto
2. Compile el programa:
   ```bash
   javac src/Main.java
   ```

3. Ejecute el programa:
   ```bash
   java src/Main
   ```

### Opción 2: Crear un archivo JAR ejecutable

1. En la raíz del proyecto, cree un archivo `manifest.txt` con:
   ```
   Main-Class: src.Main
   ```

2. Compile el programa:
   ```bash
   javac src/Main.java
   ```

3. Cree el JAR:
   ```bash
   jar cfm conversor.jar manifest.txt src/*.class
   ```

4. Ejecute el JAR:
   ```bash
   java -jar conversor.jar
   ```

## Cómo usar

### Menú de opciones

Al ejecutar el programa, verá el siguiente menú:

```
==============================
   CONVERSOR DE MONEDAS
==============================
1) Dólar -> Peso argentino
2) Peso argentino -> Dólar
3) Dólar -> Real brasileño
4) Real brasileño -> Dólar
5) Dólar -> Peso colombiano
6) Peso colombiano -> Dólar
0) SALIR
==============================
```

### Pasos para realizar una conversión

1. Seleccione la conversión deseada ingresando el número correspondiente (1-6)
2. Ingrese la cantidad que desea convertir cuando se le solicite
3. El programa mostrará el resultado de la conversión en tiempo real
4. Puede realizar múltiples conversiones consecutivas
5. Seleccione "0" para salir del programa

### Ejemplo de uso

```
Seleccione una opción: 1
Ingrese la cantidad a convertir: 100

Result:
100.0 USD = 85000.0 ARS
```

## Notas

- Este programa utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener las tasas de cambio actuales.
- Se requiere una conexión a internet para que el programa funcione correctamente.
- Las tasas de cambio se actualizan periódicamente según la disponibilidad de la API.

## Licencia

Este proyecto es de código abierto y está disponible bajo la licencia MIT.