package com.example.imccalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import kotlin.math.pow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMCCalculator()
        }
    }
}

@Composable
fun IMCCalculator() {
    var weight by remember { mutableStateOf(TextFieldValue()) }
    var height by remember { mutableStateOf(TextFieldValue()) }
    var result by remember { mutableStateOf("") }
    var imageRes by remember { mutableStateOf<Int?>(null) }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Calculadora de IMC", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = weight,
                onValueChange = { weight = it },
                label = { Text("Peso en kg") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = height,
                onValueChange = { height = it },
                label = { Text("Altura en metros") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

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

            Spacer(modifier = Modifier.height(16.dp))
            Text(result, style = MaterialTheme.typography.bodyLarge)

            imageRes?.let { resId ->
                Spacer(modifier = Modifier.height(16.dp))
                Image(painter = painterResource(id = resId), contentDescription = null)
            }
        }
    }
}

fun getIMCCategory(imc: Float): String {
    return when {
        imc < 18.5 -> "Ligero"
        imc < 24.9 -> "Normal"
        else -> "Pesado"
    }
}

fun getImageForCategory(category: String): Int? {
    return when (category) {
        "Ligero" -> R.drawable.ligero
        "Normal" -> R.drawable.normal
        "Pesado" -> R.drawable.pesado
        else -> null
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewIMCCalculator() {
    IMCCalculator()
}
