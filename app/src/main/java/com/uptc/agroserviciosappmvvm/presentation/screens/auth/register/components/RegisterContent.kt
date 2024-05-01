package com.uptc.agroserviciosappmvvm.presentation.screens.auth.register.components

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.uptc.agroserviciosappmvvm.R
import com.uptc.agroserviciosappmvvm.presentation.components.DefaultButton
import com.uptc.agroserviciosappmvvm.presentation.components.DefaultTextField
import com.uptc.agroserviciosappmvvm.presentation.screens.auth.register.RegisterState
import com.uptc.agroserviciosappmvvm.presentation.screens.auth.register.RegisterViewModel
import com.uptc.agroserviciosappmvvm.presentation.ui.theme.Green400

@Composable
fun RegisterContent(paddingValues: PaddingValues, vm: RegisterViewModel = hiltViewModel()) {

    val state = vm.state
    val context = LocalContext.current

    LaunchedEffect(key1 = vm.errorMessage) {
        if (vm.errorMessage != "") {
            Toast.makeText(context, vm.errorMessage, Toast.LENGTH_LONG).show()
        }
    }

    Box(modifier = Modifier
        .padding(paddingValues = paddingValues)
        .fillMaxSize()) {
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
                .padding(top = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                modifier = Modifier
                    .height(152.dp)
                    .width(152.dp),
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo"
            )
            Spacer(modifier = Modifier.weight(0.1f))
            Card (
                modifier = Modifier
                    .height(550.dp)
                    .width(900.dp)
                    .padding(bottom = 20.dp)
                    .padding(horizontal = 30.dp),
                shape = RoundedCornerShape(40.dp)
            ) {
                Column (
                    modifier = Modifier
                        .padding(top = 30.dp)
                        .padding(horizontal = 30.dp)
                        .fillMaxWidth()
                        .verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Ingrese sus datos",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 18.sp
                    )
                    DefaultTextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 5.dp),
                        value = state.name,
                        onValueChange = { text -> vm.onNameInput(text) },
                        label = "Nombre",
                        keyboardType = KeyboardType.Text
                    )
                    DefaultTextField(
                        modifier = Modifier
                            .fillMaxWidth(),
                        value = state.email,
                        onValueChange = { text -> vm.onEmailInput(text) },
                        label = "Correo",
                        keyboardType = KeyboardType.Email
                    )
                    DefaultTextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 43.dp),
                        value = state.password,
                        onValueChange = { text -> vm.onPasswordInput(text) },
                        label = "Contraseña",
                        keyboardType = KeyboardType.Password,
                        hideText = true
                    )
                    DefaultButton(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 10.dp),
                        text = "Crear Cuenta",
                        onClick = { vm.validateForm() }
                    )
                }
            }
        }
    }
}