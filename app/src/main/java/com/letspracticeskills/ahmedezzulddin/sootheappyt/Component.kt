package com.letspracticeskills.ahmedezzulddin.sootheappyt

import android.graphics.drawable.Icon
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Spa
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.letspracticeskills.ahmedezzulddin.sootheappyt.ui.theme.SootheAppYTTheme

@Composable
fun navigationComponent(modifier: Modifier = Modifier)
{
    BottomNavigation(backgroundColor = MaterialTheme.colors.background) {
        BottomNavigationItem(
            icon ={ Icon(imageVector = Icons.Default.Spa , contentDescription =null )},
            label = { Text(text = stringResource(id = R.string.bottom_navigation_home))},
            selected = true,
            onClick = { /*TODO*/ }
        )

        BottomNavigationItem(
            icon ={ Icon(imageVector = Icons.Default.AccountCircle , contentDescription =null )},
            label = { Text(text = stringResource(id = R.string.bottom_navigation_profile))},
            selected = false,
            onClick = { /*TODO*/ }
        )
        
    }
}


@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun componentTest(){
    SootheAppYTTheme {
        navigationComponent()
    }
}