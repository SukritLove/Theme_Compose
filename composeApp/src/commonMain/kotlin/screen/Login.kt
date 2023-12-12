package screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import ui.theme.Typography

@Composable
fun loginScreen() {
    var mpos_url by remember { mutableStateOf(TextFieldValue()) }
    var user_id by remember { mutableStateOf(TextFieldValue()) }
    var dev_id by remember { mutableStateOf(TextFieldValue()) }

    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    )
    {
        item {
            Column(modifier = Modifier.fillMaxWidth()) {
                create_Text(text = "First Time Login", style = Typography.bodyLarge)
            }
        }
        item {
            create_TextField(value = mpos_url, onTextChange = { it ->
                mpos_url = it
            })
        }
        item {
            create_TextField(value = user_id, onTextChange = { it ->
                user_id = it
            })
        }
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                create_Text(text = "SSO Information", style = Typography.titleLarge)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(checked = true, onCheckedChange = {})
                    create_Text(text = "SSO Login", style = Typography.titleLarge)
                }

            }
        }
        item {
            create_TextField(
                value = dev_id, onTextChange = { it ->
                    dev_id = it
                }
            )
        }
        item {
            Button(onClick = {}) {
                Text("Activate")
            }
        }
    }
}

@Composable
fun create_TextField(
    value: TextFieldValue,
    onTextChange: (TextFieldValue) -> Unit
) {
    OutlinedTextField(value = value, onValueChange = onTextChange, Modifier.fillMaxWidth())
}

@Composable
fun create_Text(modifier: Modifier = Modifier, text: String, style: TextStyle) {
    Text(text = text, style = style)
}