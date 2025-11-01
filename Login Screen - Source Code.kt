package com.example.myapp

import android.graphics.Paint
import android.media.Image
import android.os.Bundle
import android.text.Layout
import android.text.style.SuperscriptSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.ColorLong
import androidx.annotation.DrawableRes
import androidx.collection.intIntMapOf
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.simulateHotReload
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.BlendMode.Companion
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapp.ui.theme.MyAppTheme
import androidx.compose.ui.UiComposable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.draw.innerShadow
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultShadowColor
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.graphics.vector.DefaultTintColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.Paragraph
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.trace
import com.example.myapp.R
import org.w3c.dom.Text
import java.nio.file.WatchEvent
import kotlin.io.encoding.Base64
import kotlin.math.abs
import kotlin.random.Random
import kotlin.random.Random.Default


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyAppTheme {
                LoginScreen()







                }


                   }



                }
            }







@Composable
fun LoginScreen() {


    var name by remember { mutableStateOf(" ") }
    // this variable sets the default value of our first textfield
    var num by remember { mutableStateOf(value = " ") }
    // this variable sets the default value of our second textfield


    // Define a box that fills the entire screen of our app
    Box(modifier = Modifier.fillMaxSize()
        .background(Color.Black)
        .verticalScroll(rememberScrollState()))
    // add this modifier so that your box can be scrollable
    {

        Column() {

            // Create some space above our header
            Spacer(modifier = Modifier.height(50.dp))


            // Enclose app's header in a box
            Box(
                modifier = Modifier.height(30.dp)
                    .fillMaxWidth()
                    .background(Color.Transparent), // set color to transparent if you don't want box to be visible
                contentAlignment = Alignment.Center
            )
            {

                Row() {
                    Text(
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        text = "Welcome",
                        fontFamily = FontFamily.Serif,
                        fontSize = 30.sp
                    )
                    Spacer(modifier = Modifier.width(12.dp))

                    // You can add a round image card beside your text with your app's logo
                    Card(
                        modifier = Modifier.fillMaxHeight()
                            .width(30.dp) // set width to be equal to that of the box it is nested in

                            .background(Color.Transparent),
                        shape = CircleShape
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img1),
                            contentDescription = "profile",
                            contentScale = ContentScale.Crop
                        )
                        // Ensure you add your image to your 'drawable' folder


                    }
                }


            }



            Spacer(Modifier.height(100.dp))
// Create a card and nest a box in it
            Card(shape = RoundedCornerShape(15.dp)) {

                Box(
                    modifier = Modifier.background(Color.White)
                        .fillMaxWidth()
                        .height(500.dp)

                ) {

                    Row(modifier = Modifier.fillMaxSize()) // set row to fill max size of the box it is nested in
                    // Our row will have two cards stacked side by side with different weights
                    {

                        // This first card contains an image
                        Card(modifier = Modifier.weight(1f) // set weight to be smaller than second card
                            .fillMaxHeight()
                            ,
                            shape = RectangleShape
                            ) {
                                Image(painter = painterResource(R.drawable.img2), contentDescription = "Image 2", contentScale = ContentScale.Crop)
                            // Ensure images are in 'drawable' folder

                        }
// This second box will house out text fields and buttons, which will be nested in another box
                        Box(modifier = Modifier.weight(2f)
                            .background(Color.LightGray)
                            .fillMaxHeight()
                            , contentAlignment = Alignment.Center // add this modifier so that our text fields and button will be placed in the center
                            )
                        {

                            Box(modifier = Modifier.width(200.dp)
                                .height(300.dp)
                                // set width and height of this box to be smaller than box it is nested in
                                .background(Color.LightGray),
                                contentAlignment = Alignment.Center) {


                                Column {
                                    Text("Sign in or create a new account",
                                         fontWeight = FontWeight.ExtraBold,
                                        fontFamily = FontFamily.Serif, fontSize = 12.sp,
                                             color = Color.Black)

                                    Spacer(modifier= Modifier.height(20.dp))
                                Column(verticalArrangement = Arrangement.Center,
                                     horizontalAlignment = Alignment.CenterHorizontally) {
                                    OutlinedTextField(value = name, onValueChange = { newname ->
                                        name = newname},
                                        label = { Text("Name") },
                                        singleLine = true,
                                        colors = OutlinedTextFieldDefaults.colors(
                                            focusedLabelColor = Color.Black,
                                            unfocusedLabelColor = Color.Black,
                                            focusedBorderColor = Color.Black,
                                            unfocusedBorderColor = Color.Black,
                                            focusedTextColor = Color.Black,
                                             unfocusedTextColor = Color.Black,
                                            cursorColor = Color.Black))
    Spacer(modifier = Modifier.height(5.dp))

    OutlinedTextField(
        value = num, onValueChange = { newnum ->
            num = newnum
        },
        label = { Text("Phone or email") },
        colors = OutlinedTextFieldDefaults.colors(
            focusedLabelColor = Color.Black,
            unfocusedLabelColor = Color.Black,
            focusedBorderColor = Color.Black,
            unfocusedBorderColor = Color.Black,
            focusedTextColor = Color.Black,
            unfocusedTextColor = Color.Black,
            cursorColor = Color.Black),
        singleLine = true
    )
Spacer(Modifier.height(10.dp))

           // When our button is clicked, it expands, the text changes and a progress indicator appears

                                    var clicked by remember { mutableStateOf(false) } // this variable monitors the state of our button
                                    var text : String = "Loading" // this is what the text changes to when our button is clicked

                                    // We use a surface to make a button
                                    Surface(onClick = {clicked = !clicked},
                                        shape = RoundedCornerShape(2.dp),
                                        border = BorderStroke(width = 1.dp, color = Color.LightGray),
                                        color = Color.Black
                                    ) {
                                        Row(modifier = Modifier
                                            .padding(start = 12.dp,
                                                end = 16.dp,
                                                top = 12.dp,
                                                bottom = 12.dp)
                                            .animateContentSize(animationSpec = tween(
                                                durationMillis = 300,
                                                easing = LinearOutSlowInEasing
                                            )) // this modifier is responsible for the expansion of our button's size when it is clicked
                                            ,
                                            horizontalArrangement = Arrangement.Center,
                                            verticalAlignment = Alignment.CenterVertically){

                                            // You can add an image card in your button as well
                                            Card(modifier = Modifier.height(20.dp)
                                                .width(20.dp), // ensure that height and width are equal to the height of your button
                                                shape = CircleShape
                                            ) {
                                                Image(painter = painterResource(id = R.drawable.img1),
                                                    contentDescription = "Google button", contentScale = ContentScale.Crop)
                                            }

                                            Spacer(Modifier.width(8.dp))
                                            Text( text = if(clicked) text else "Continue", // this if statement changes our text when our button is clicked
                                                color = Color.White)


                                            // This if statement will cause our progress indicator to appear when our button is clicked

                                            if(clicked) {
                                                Spacer(modifier = Modifier.width(16.dp))
                                                CircularProgressIndicator(modifier = Modifier.height(16.dp)
                                                    .width(16.dp),
                                                    strokeWidth = 2.dp,
                                                    color = Color.White)

                                            }
                                        }


                                    }
                                }
}


                                }




                            }
                        }

                    }
                }
            }

                    }





                }

















