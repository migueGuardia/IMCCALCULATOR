# Calculadora de IMC

- [Funcionamiento del botón Calcular](#funcionamiento-del-boton-calcular)
- [Apariencia de la aplicación](#apariencia-de-la-aplicacion)
- [Tecnologías utilizadas](#tecnologias-utilizadas)
- [Pruebas](#pruebas)
- [Obtener el código](#obtener-el-codigo)

>[!NOTE]
> Esta aplicación es solo para fines educativos y no reemplaza el asesoramiento médico profesional.

>[!TIP]
> Ingresa valores válidos en los campos de peso y altura para obtener un resultado preciso.

>[!IMPORTANT]
> Asegúrate de tener un dispositivo Android compatible para ejecutar la aplicación.

---

Esta es una aplicación de Android desarrollada en **Jetpack Compose** que permite a los usuarios calcular su Índice de Masa Corporal (IMC) en función de su peso y altura.

## Funcionamiento del botón Calcular
```Kotlin
Button(onClick = {
    val weightValue = weight.text.toFloatOrNull()
    val heightValue = height.text.toFloatOrNull()
    if (weightValue != null && heightValue != null && heightValue > 0) {
        val imc = weightValue / heightValue.pow(2)
        val category = getIMCCategory(imc)
        result = "Tu IMC es %.2f (%s)".format(imc, category)
        imageRes = getImageForCategory(category)
    } else {
        result = "Por favor, ingresa valores válidos."
        imageRes = null
    }
}, modifier = Modifier.fillMaxWidth()) {
    Text("Calcular IMC")
}
```

## Apariencia de la aplicación
### Pantalla Principal
<a><img src="https://ruta-de-tu-imagen.com/pantalla-principal.png" alt="Pantalla Principal" width="250"></a>

### Ejemplo de Resultado IMC
**Ligero:**
<a><img src="https://ruta-de-tu-imagen.com/ligero.png" alt="IMC Ligero" width="200"></a>

**Normal:**
<a><img src="https://ruta-de-tu-imagen.com/normal.png" alt="IMC Normal" width="200"></a>

**Pesado:**
<a><img src="https://ruta-de-tu-imagen.com/pesado.png" alt="IMC Pesado" width="200"></a>

## Tecnologías utilizadas
![Kotlin](https://img.shields.io/badge/-Kotlin-7F52FF?style=flat&logo=kotlin&logoColor=white) ![Jetpack Compose](https://img.shields.io/badge/Jetpack-Compose-blue) ![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?style=flat&logo=AndroidStudio&logoColor=white)

## Pruebas
Esta aplicación puede incluir pruebas unitarias y de interfaz para validar el correcto funcionamiento.

Ejemplo de prueba unitaria:
```Kotlin
@Test
fun calculateIMC() {
    val result = calculateIMC(70f, 1.75f)
    assertEquals("22.86 (Normal)", result)
}
```

## Obtener el código
```Bash
git clone https://github.com/tu_usuario/IMC_Calculator.git
```

---
_¡Gracias por usar la Calculadora de IMC!_ 🚀

