package com.letspracticeskills.ahmedezzulddin.sootheappyt

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.letspracticeskills.ahmedezzulddin.sootheappyt.ui.theme.SootheAppYTTheme

private  val list1 = listOf(
    R.drawable.ab1_inversions to R.string.ab1_inversions,
    R.drawable.ab2_quick_yoga to R.string.ab2_quick_yoga,
    R.drawable.ab3_stretching to R.string.Stretching,
    R.drawable.ab4_tabata to R.string.Tabata,
    R.drawable.ab5_hiit to R.string.HIIT,
    R.drawable.ab6_pre_natal_yoga to R.string.prenatalyoga
).map { Model1(it.first , it.second ) }

@Composable
fun Scroll1( modifier: Modifier = Modifier)
{
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp ),
        horizontalArrangement = Arrangement.spacedBy(5.dp)
    ){
      items(list1){it ->
          bodyHorizontal(modifier = Modifier , it.image , it.text)
      }
    }
}



@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun test1()
{
    SootheAppYTTheme {
        Scroll1()
    }

}