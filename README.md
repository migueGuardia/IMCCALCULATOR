# Calculadora de IMC

## Descripción
Esta es una aplicación de Android desarrollada en **Jetpack Compose** que permite a los usuarios calcular su Índice de Masa Corporal (IMC) en función de su peso y altura

## Características
- Interfaz sencilla y fácil de usar.
- Entrada de datos mediante campos de texto para peso y altura.
- Cálculo del IMC con categorización en "Ligero", "Normal" o "Pesado".
- Visualización de imágenes según la categoría del IMC.

## Capturas de Pantalla
*(Agrega imágenes aquí si es necesario)*

## Instalación
1. Clona este repositorio en tu máquina local:
   ```sh
   git clone https://github.com/migueGuardia/IMCCALCULATOR.git
   ```
2. Abre el proyecto en **Android Studio**.
3. Conéctate a un emulador o dispositivo físico.
4. Ejecuta la aplicación.

## Uso
1. Ingresa tu peso en kilogramos.
2. Ingresa tu altura en metros.
3. Presiona el botón **Calcular IMC**.
4. Verás tu resultado junto con una imagen representativa de tu categoría de IMC.

## Estructura del Código
- **`MainActivity.kt`**: Contiene la función principal que inicializa la aplicación.
- **`IMCCalculator()`**: Función Composable que define la UI y la lógica del cálculo del IMC.
- **`getIMCCategory(imc: Float)`**: Función que determina la categoría del IMC.
- **`getImageForCategory(category: String)`**: Función que selecciona la imagen adecuada según la categoría.

## Recursos
- **Imágenes**: `ligero.png`, `normal.png`, `pesado.png` (deben estar en la carpeta `res/drawable`).
- **Jetpack Compose**: Utilizado para la construcción de la UI.

## Mejoras Futuras
- Agregar soporte para múltiples idiomas.
- Implementar un diseño más atractivo con temas personalizados.
- Permitir la conversión entre diferentes unidades de medida.

## Licencia
Este proyecto está bajo la licencia MIT. Puedes utilizarlo y modificarlo libremente.

---
_¡Gracias por usar la Calculadora de IMC!_ 🚀

