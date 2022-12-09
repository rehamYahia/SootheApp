package com.letspracticeskills.ahmedezzulddin.sootheappyt

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.letspracticeskills.ahmedezzulddin.sootheappyt.ui.theme.SootheAppYTTheme


@Composable fun homeScreen(modifier: Modifier = Modifier)
{
    Column {
        Spacer(modifier = Modifier.padding(vertical = 10.dp))
        search(modifier = Modifier.padding(horizontal = 6.dp).padding(horizontal = 10.dp))
        homeSection(title = R.string.align_your_body ){
            Scroll1()
        }

        homeSection(title = R.string.favorite_collections) {
            Scroll2()
        }


    }
}



@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable fun homeScreenPreview()
{
    SootheAppYTTheme {
        homeScreen()
    }
}