package com.letspracticeskills.ahmedezzulddin.sootheappyt

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.letspracticeskills.ahmedezzulddin.sootheappyt.ui.theme.SootheAppYTTheme



private val list2 = listOf(
    R.drawable.fc1_short_mantras to R.string.short_mantras,
    R.drawable.fc2_nature_meditations to R.string.stress_and_anxiety,
    R.drawable.fc3_stress_and_anxiety to R.string.nature_meditations,
    R.drawable.fc4_self_massage to R.string.self_massage,
    R.drawable.fc5_overwhelmed to R.string.overwhelmed,
    R.drawable.fc6_nightly_wind_down to R.string.nightly_wind_down
).map { Model2(it.first , it.second) }

@Composable
fun Scroll2(modifier: Modifier=Modifier)
{
    LazyHorizontalGrid(rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 10.dp),
        modifier = Modifier.height(130.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ){
        items(list2){it ->
            gridItem(it.image , it.text , modifier = Modifier.height(56.dp))
        }
    }
}


@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun test2(){
    SootheAppYTTheme {
        Scroll2()
    }
}