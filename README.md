# Calculadora de IMC

## Índice
- [Descripción General](#descripcion-general)
- [Funcionamiento de la Aplicación](#funcionamiento-de-la-aplicacion)
- [Análisis del Código](#analisis-del-codigo)
  - [Estructura de la Aplicación](#estructura-de-la-aplicacion)
  - [Interfaz de Usuario](#interfaz-de-usuario)
  - [Cálculo del IMC](#calculo-del-imc)
  - [Clasificación del IMC](#clasificacion-del-imc)
  - [Asignación de Imágenes](#asignacion-de-imagenes)
- [Apariencia de la Aplicación](#apariencia-de-la-aplicacion)
- [Tecnologías Utilizadas](#tecnologias-utilizadas)
- [Pruebas](#pruebas)
- [Obtener el Código](#obtener-el-codigo)

---

## Descripción General
Esta es una aplicación de Android desarrollada en **Jetpack Compose** que permite a los usuarios calcular su Índice de Masa Corporal (IMC) en función de su peso y altura. La aplicación proporciona una interfaz intuitiva donde el usuario ingresa su peso y altura, y al presionar el botón **Calcular IMC**, se muestra el resultado con una categoría y una imagen representativa.

## Funcionamiento de la Aplicación
1. El usuario ingresa su peso en kilogramos.
2. El usuario ingresa su altura en metros.
3. Al presionar **Calcular IMC**, se ejecuta la lógica del cálculo.
4. Se muestra el resultado con su clasificación (Ligero, Normal o Pesado).
5. Se muestra una imagen representativa de la categoría.

## Análisis del Código

### Estructura de la Aplicación
La aplicación consta de una única actividad principal (`MainActivity.kt`) que ejecuta la función `IMCCalculator()`. Esta función contiene la interfaz de usuario y la lógica de cálculo del IMC.

### Interfaz de Usuario
```Kotlin
Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
    Column(modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Calculadora de IMC", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        ...
    }
}
```
Este código define una interfaz centrada en la pantalla con un título, campos de entrada y un botón de cálculo.

### Cálculo del IMC
```Kotlin
val imc = weightValue / heightValue.pow(2)
```
La fórmula utilizada es la estándar: **IMC = Peso (kg) / Altura² (m²)**.

### Clasificación del IMC
```Kotlin
fun getIMCCategory(imc: Float): String {
    return when {
        imc < 18.5 -> "Ligero"
        imc < 24.9 -> "Normal"
        else -> "Pesado"
    }
}
```
Según el valor del IMC, se determina su categoría.

### Asignación de Imágenes
```Kotlin
fun getImageForCategory(category: String): Int? {
    return when (category) {
        "Ligero" -> R.drawable.ligero
        "Normal" -> R.drawable.normal
        "Pesado" -> R.drawable.pesado
        else -> null
    }
}
```
Cada categoría tiene una imagen asociada en `res/drawable/`.

## Apariencia de la Aplicación
### Pantalla Principal
<img src="app/src/main/res/drawable/Captura de pantalla 2025-03-06 224839.png" alt="Pantalla Principal" width="150">

### Ejemplo de Resultado IMC
**Ligero:**
<img src="app/src/main/res/drawable/ligero.jpg" alt="IMC Ligero" width="100">

**Normal:**
<img src="app/src/main/res/drawable/normal.jpg" alt="IMC Normal" width="100">

**Pesado:**
<img src="app/src/main/res/drawable/pesado.jpg" alt="IMC Pesado" width="100">

## Tecnologías Utilizadas
![Kotlin](https://img.shields.io/badge/-Kotlin-7F52FF?style=flat&logo=kotlin&logoColor=white) ![Jetpack Compose](https://img.shields.io/badge/Jetpack-Compose-blue) ![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?style=flat&logo=AndroidStudio&logoColor=white)

## Pruebas
Se pueden realizar pruebas unitarias para validar el cálculo del IMC.
```Kotlin
@Test
fun calculateIMC() {
    val result = calculateIMC(70f, 1.75f)
    assertEquals("22.86 (Normal)", result)
}
```

## Obtener el Código
```Bash
git clone https://github.com/migueGuardia/IMCCALCULATOR.git
```

---
_¡Gracias por usar la Calculadora de IMC!_ 🚀





