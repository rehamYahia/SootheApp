package com.letspracticeskills.ahmedezzulddin.sootheappyt

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.letspracticeskills.ahmedezzulddin.sootheappyt.ui.theme.SootheAppYTTheme

@Composable
fun search(modifier: Modifier = Modifier)
{
    TextField(value = "",
        onValueChange = {},
        placeholder = { Text(text = stringResource(id = R.string.placeholder_search))},

        modifier = Modifier
            .fillMaxWidth()
            .heightIn(56.dp),
        colors = TextFieldDefaults.textFieldColors(backgroundColor= MaterialTheme.colors.surface),
        leadingIcon = {Icon(imageVector = Icons.Default.Search, contentDescription = null)},
    )
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun searchPreview()
{
    SootheAppYTTheme {
        search()
    }

}