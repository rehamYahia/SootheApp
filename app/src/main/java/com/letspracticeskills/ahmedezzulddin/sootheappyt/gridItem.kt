package com.letspracticeskills.ahmedezzulddin.sootheappyt

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.letspracticeskills.ahmedezzulddin.sootheappyt.ui.theme.SootheAppYTTheme

@Composable
fun gridItem( @DrawableRes image:Int , @StringRes text:Int , modifier: Modifier = Modifier)
{
    Surface(
        shape = MaterialTheme.shapes.small,

    ) {
        Row(modifier = Modifier
            .width(250.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(image),
                contentDescription = null,
                modifier = Modifier.size(56.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(text),
                modifier = Modifier.padding(horizontal = 16.dp),
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold

            )
        }
    }

}


@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun gridItemPreview()
{
    SootheAppYTTheme {
        gridItem( R.drawable.fc1_short_mantras , R.string.fc1_short_mantras)
    }

}