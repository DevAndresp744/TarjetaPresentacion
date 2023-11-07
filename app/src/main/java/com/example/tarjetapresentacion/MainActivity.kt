package com.example.tarjetapresentacion


import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BussinesCardImage()
                }
            }
        }
    }
}

@Composable
fun BussinesCardImage(){
    val image = painterResource(id = R.drawable.masterchieftransparent)
    val wallpaper = painterResource(id = R.drawable.halowallpaper)

    Box {
        Image(
            painter = wallpaper,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            alpha = 10F
        )
        //Columna 1
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 400.dp, start = 10.dp, end = 10.dp, top = 70.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(170.dp)
                    .padding(top = 1.dp)

            )
            Text(
                text = stringResource(R.string.Name),
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                fontSize = 45.sp,
                fontStyle = FontStyle.Italic
            )
            Text(
                text = stringResource(R.string.Title),
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 0.5.dp),
                fontSize = 35.sp,
                fontStyle = FontStyle.Italic
            )


        }

        // Columna 2
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 10.dp, start = 10.dp, end = 10.dp, top = 450.dp),

            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ){

            //numero de teléfono
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 40.dp, end = 40.dp)

            ){
               BussinesCardDataInput(
                   dataInfo = stringResource(id = R.string.PhoneNumber),
                   icon = painterResource(id = R.drawable.icons8_whatsapp_48),
                   iconColor = Color.Unspecified,
                   linkUrl = stringResource(R.string.whatsapp)
                   )
            }

            //correo electronico
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 40.dp, end = 40.dp)

            ) {
                BussinesCardDataInput(
                    dataInfo = stringResource(id = R.string.Email),
                    icon = painterResource(id = R.drawable.gmail_29991),
                    iconColor = Color.Unspecified,
                    linkUrl = stringResource(R.string.correoElectronicoPara)
                )
            }

            // perfíl de linkedin
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 40.dp, end = 40.dp)


            ) {
               BussinesCardDataInput(
                   dataInfo = stringResource(id = R.string.Linkedin),
                   icon = painterResource(id = R.drawable.icons8_linkedin_48),
                   iconColor = Color.Unspecified,
                   linkUrl = stringResource(R.string.LinkedinUrl)
               )
            }

            // Iconos portafolio
            Spacer(modifier = Modifier.height(40.dp))
            Row {
                Text(
                    text = stringResource(R.string.Skills),
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,


                )
            }

            Spacer(modifier = Modifier.height(10.dp))
            Row {
                Icon(painter = painterResource(id = R.drawable.icons8_kotlin_48),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp),
                    tint= Color.Unspecified)

                Spacer(modifier = Modifier.width(21.dp)) // Espacio entre el icono y el texto
                Icon(painter = painterResource(
                    id = R.drawable.icons8_logotipo_de_java_coffee_cup_48),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp),
                    tint= Color.Unspecified)

                Spacer(modifier = Modifier.width(21.dp)) // Espacio entre el icono y el texto
                Icon(painter = painterResource(
                    id = R.drawable.icons8_mysql_48),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp),
                    tint= Color.Unspecified)

                Spacer(modifier = Modifier.width(21.dp)) // Espacio entre el icono y el texto
                Icon(painter = painterResource(id = R.drawable.icons8_mongodb_a_cross_platform_document_oriented_database_program_24),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp),
                    tint= Color.Unspecified

                )

                Spacer(modifier = Modifier.width(21.dp)) // Espacio entre el icono y el texto
                Icon(painter = painterResource(id = R.drawable.github_mark_white),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp),
                    tint= Color.Unspecified)
            }
        }
    }
}


@Composable
fun BussinesCardDataInput(dataInfo: String, icon: Painter, iconColor:Color, modifier: Modifier = Modifier, linkUrl: String?=null) {
    val context = LocalContext.current
   //informacion

        Icon(
            painter = icon,
            contentDescription = null,
            modifier = Modifier.size(25.dp),
            tint = iconColor

        )
    val onClick: () -> Unit = {
        val intent = Intent(Intent.ACTION_VIEW,
            Uri.parse(linkUrl))
        context.startActivity(intent)
    }
        Spacer(modifier = Modifier.width(8.dp)) // Espacio entre el icono y el texto
        Text(
            text = dataInfo,
            fontSize = 23.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            fontStyle = FontStyle.Italic,

            modifier = Modifier
                .clickable { if (linkUrl != null) onClick() }
        )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacionTheme {

        BussinesCardImage()
    }
}