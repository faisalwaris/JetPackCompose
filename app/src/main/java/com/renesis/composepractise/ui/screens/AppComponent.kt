package com.renesis.composepractise.ui.screens

import android.media.ImageReader
import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.ImeOptions
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.renesis.composepractise.R

@Composable
fun TopBar(title: String, fontSize: Double? = 16.0, color: Color? = Color.Black) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            color = color!!,
            fontSize = fontSize!!.sp,
            fontWeight = FontWeight.W400
        )
        Spacer(modifier = Modifier.weight(1f))

        Image(
            painterResource(R.drawable.sample), contentDescription = "Sample",
            modifier = Modifier.size(40.dp)
        )
    }

}


@Composable
fun TextComponent(title: String, fontSize: Double? = 16.0, color: Color? = Color.Black) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
          textAlign = TextAlign.Center,
            text = title,
            color = color!!,
            fontSize = fontSize!!.sp,
            fontWeight = FontWeight.W400,

        )

    }

}


@Composable
fun OutlinedTextFieldExample(onTextChanged: (String) -> Unit) {
    val localFocusManager = LocalFocusManager.current
    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        value = text,
        onValueChange = {
            text = it
            onTextChanged(it.text)
        },
        label = { Text("Enter your name") },
        placeholder = { Text("Type something...") },
        modifier = Modifier.fillMaxWidth(),
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions {
            localFocusManager.clearFocus()
        }
    )

}


@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    OutlinedTextFieldExample({})
}


@Composable
fun CardSelection(isSelected: Boolean,onCardSelected: () -> Unit) {

    Card(modifier = Modifier.width(120.dp).height(120.dp)
        .padding(10.dp).clickable{
        onCardSelected()
    },
        elevation = CardDefaults.cardElevation(4.dp)) {
        Box(
            modifier = Modifier.fillMaxSize()
                .border(
                    color = if (isSelected) Color.Green else Color.Transparent,
                    width = 2.dp,
                    shape = RoundedCornerShape(8.dp)
                )
        ) {
            Image(
                painter = painterResource(id = R.drawable.sample),
                contentDescription = "Sample",
            )
        }


    }

}




@Composable
@Preview(showBackground = true)
fun CardSelectionPreview() {
    CardSelection(isSelected = true, onCardSelected = {})
}