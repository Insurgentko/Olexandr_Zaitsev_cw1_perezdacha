package ua.edu.lntu.olexandr_zaitsev_cw1_perezdacha

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ua.edu.lntu.olexandr_zaitsev_cw1_perezdacha.ui.theme.Olexandr_Zaitsev_cw1_perezdachaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Olexandr_Zaitsev_cw1_perezdachaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting( modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()
        .height(150.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(R.drawable.android_logo), contentDescription = "Android logo"
        )
        Text(
            text = stringResource(R.string.full_name), fontSize = 24.sp
        )
        Text(text = stringResource(R.string.title), fontSize = 16.sp)
    }
    Spacer(modifier = Modifier.height(16.dp))
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom){
    Row() {
        Text(text = stringResource(R.string.number), fontSize = 16.sp)
    }
        Row() {
            Text(text = stringResource(R.string.more), fontSize = 16.sp)
        }
        Row() {
            Text(text = stringResource(R.string.email), fontSize = 16.sp)
        }
}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Olexandr_Zaitsev_cw1_perezdachaTheme {
        Greeting()
    }
}