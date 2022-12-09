package com.letspracticeskills.ahmedezzulddin.sootheappyt

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.letspracticeskills.ahmedezzulddin.sootheappyt.ui.theme.SootheAppYTTheme


@Composable
fun bodyHorizontal(modifier: Modifier = Modifier , @DrawableRes image:Int , @StringRes text:Int)
{
    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Image(painter = painterResource(image),
            contentDescription = null,
            modifier = Modifier
                .size(88.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(text),
            style = MaterialTheme.typography.h6 ,
            modifier = Modifier.paddingFromBaseline(top = 24.dp , bottom = 8.dp),
            fontSize = 15.sp
        )
        
    }
    
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun bodyHorizontalPreview()
{
    SootheAppYTTheme {
        bodyHorizontal( Modifier.padding(8.dp) ,R.drawable.ab1_inversions , R.string.ab1_inversions )
    }

}