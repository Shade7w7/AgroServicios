package com.uptc.agroserviciosappmvvm

import android.os.Bundle
import android.widget.Switch
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uptc.agroserviciosappmvvm.ui.theme.AgroServiciosAppMVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AgroServiciosAppMVVMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginContent()
                }
            }
        }
    }
}

@Composable
fun LoginContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Imagen de fondo",
            contentScale = ContentScale.Crop,
            colorFilter = ColorFilter.colorMatrix(
                ColorMatrix().apply {
                    setToScale(0.2f,0.2f,0.2f,1f)
                }
            )
        )
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp),
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo"
            )
            Spacer(modifier = Modifier.weight(0.1f))
            Card (
                modifier = Modifier
                    .height(550.dp)
                    .width(900.dp)
                    .padding(bottom = 25.dp)
                    .padding(horizontal = 30.dp),
                shape = RoundedCornerShape(40.dp)
            ) {
                Column (
                    modifier = Modifier
                        .padding(40.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Bienvenido a",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ){
                        Text(
                            modifier = Modifier
                                .padding(bottom = 20.dp),
                            text = "Agro",
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            fontSize = 20.sp
                        )
                        Text(
                            modifier = Modifier
                                .padding(bottom = 20.dp),
                            text = "Servicios",
                            fontWeight = FontWeight.Bold,
                            color = Color.Green,
                            fontSize = 20.sp
                        )
                    }
                    TextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 20.dp),
                        value = "",
                        onValueChange = {},
                        label = {
                            Text(
                                text = "Correo",
                                fontWeight = FontWeight.Bold,
                                color = Color.Gray,
                                fontSize = 18.sp
                            )
                        }
                    )
                    TextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 50.dp),
                        value = "",
                        onValueChange = {},
                        label = {
                            Text(
                                text = "Contraseña",
                                fontWeight = FontWeight.Bold,
                                color = Color.Gray,
                                fontSize = 18.sp
                            )
                        }
                    )
                    Button(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 3.dp),
                        onClick = { /*TODO*/ }
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(bottom = 10.dp)
                                .padding(top = 10.dp),
                            text = "Entrar",
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            fontSize = 20.sp,
                        )
                    }
                    Button(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 20.dp),
                        onClick = { /*TODO*/ }
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(bottom = 10.dp)
                                .padding(top = 10.dp),
                            text = "Registrarse",
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            fontSize = 20.sp,
                        )
                    }
                    Text(
                        text = "¿Olvidó su contraseña?",
                        fontWeight = FontWeight.Bold,
                        color = Color.Green,
                        fontSize = 20.sp
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    AgroServiciosAppMVVMTheme {
        LoginContent()
    }
}