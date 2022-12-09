package com.letspracticeskills.ahmedezzulddin.sootheappyt

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.letspracticeskills.ahmedezzulddin.sootheappyt.ui.theme.SootheAppYTTheme

@Composable
fun homeSection(
    @StringRes title:Int ,
    modifier: Modifier = Modifier,
    content: @Composable ()-> Unit,

)
{
    Column(modifier = modifier) {
        Text(
            text = stringResource(title).uppercase(),
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .paddingFromBaseline(top = 40.dp, bottom = 8.dp)
                .padding(horizontal = 16.dp)
        )
        content()
    }
}


@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun homeSectionPreview()
{
    SootheAppYTTheme {
        Column() {
            search()
            homeSection(R.string.align_your_body ){
                Scroll1()
            }

            homeSection(title = R.string.favorite_collections) {
                Scroll2()
            }
        }

    }
}