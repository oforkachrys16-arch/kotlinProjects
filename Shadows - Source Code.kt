package com.example.shadows

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.tooling.preview.Preview
import com.example.shadows.ui.theme.ShadowsTheme
import  androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import  androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Card
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.painter.Painter
import com.example.shadows.ui.theme.MyPink
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text
import androidx.compose.foundation.layout.Row

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShadowsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Shadows()

                }
            }
        }
    }
}

@Composable
fun Shadows() {

    var is_clicked by remember { mutableStateOf(false) } // manage button's state
    val box_size by animateDpAsState(targetValue = if (is_clicked) 350.dp else 200.dp) // changes size of box when button is clicked

    Box(modifier = Modifier
    .fillMaxSize()
    .background(Color.White), contentAlignment = Alignment.Center) {
    Column {


        Box(
            modifier = Modifier
                .size(box_size)
                // first shadow with higher offsets
                .dropShadow(
                    shape = RoundedCornerShape(70.dp),
                    shadow = Shadow(
                        radius = 8.dp, color = MyPink, spread = 0.dp, alpha = 1.5f,
                        // You can create a custom color in your Color.kt file
                        offset = DpOffset(x = 5.dp, y = 5.dp)
                    )
                )
// second drop shadow with lower offsets
                .dropShadow(
                    shape = RoundedCornerShape(70.dp),
                    shadow = Shadow(radius = 8.dp, color = Color.Blue, offset = DpOffset(x = -2.dp, y = -2.dp))
                )

                .background(color = Color.White, shape = RoundedCornerShape(70.dp)),

            contentAlignment = Alignment.Center

        ) {

            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center){



                    Text(
                        text = "Hi",
                        fontStyle = FontStyle.Normal,
                        fontFamily = FontFamily.Cursive,
                        fontSize = 30.sp,
                        color = Color.Black
                    )


                    Spacer(modifier = Modifier.height(12.dp))




                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .width(80.dp)
                            .height(30.dp)
                            // first shadow
                            .dropShadow(
                                shape = RoundedCornerShape(10.dp),
                                shadow = Shadow(
                                    radius = 2.dp,
                                    color = Color.Blue,
                                    spread = 1.dp

                                )

                            )
// second shadow
                            .dropShadow(
                                shape = RoundedCornerShape(10.dp),
                                shadow = Shadow(
                                    radius = 2.dp,
                                    color = MyPink,
                                    spread = 1.dp

                                )
                            )
                            .background(Color.White, shape = RoundedCornerShape(10.dp))
                            .clickable { is_clicked = !is_clicked }
                    ) {

                        Text(
                            "Click me",
                            fontFamily = FontFamily.SansSerif,
                            color = Color.Black
                        )

                    }












            }


        }





    }


}
}
