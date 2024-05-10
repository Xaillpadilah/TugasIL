package screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class Pantai(
    val nama: String,
    val lokasi: String,
    val rating: Float,
    val imageResId: Int
)

val pantaiList = listOf(
    Pantai("Pantai Kuta", "Bali", 4.5f, R.drawable.pantaikuta),
    Pantai("Pantai Parangtritis", "Yogyakarta", 4.3f, R.drawable.pantaiparangtriti),
    Pantai("Pantai Tanjung Bira", "Sulawesi Selatan", 4.6f, R.drawable.pantaitanjung),
    Pantai("Pantai Papuma", "Jawa Timur", 4.4f, R.drawable.pantaipapum),
    Pantai("Pantai Pink", "Lombok", 4.7f, R.drawable.ping),
    Pantai("Pantai Tanjung Aan", "Lombok", 4.2f, R.drawable.tanjungaan),
    Pantai("Pantai Wedi Ombo", "Yogyakarta", 4.0f, R.drawable.pantaiwedi),
    Pantai("Pantai Teluk Kiluan", "Lampung", 4.6f, R.drawable.pantaiteluk),
    Pantai("Pantai Seger", "Lombok", 4.5f, R.drawable.pantaiseger),
    Pantai("Pantai Tanjung Lesung", "Banten", 4.3f, R.drawable.tanjunglesung)
)

@Composable
fun PantaiList() {
    LazyColumn {
        items(items = pantaiList) { pantai ->
            PantaiItem(pantai = pantai)
        }
    }
}

@Composable
fun PantaiItem(pantai: Pantai) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = pantai.imageResId),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .padding(end = 16.dp)
        )
        Column {
            Text(text = pantai.nama)
            Text(text = pantai.lokasi)
            Text(text = "Rating: ${pantai.rating}")
        }
    }
}

@Composable
fun PantaiRow() {
    LazyRow {
        items(items = pantaiList) { pantai ->
            Image(
                painter = painterResource(id = pantai.imageResId),
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
                    .padding(8.dp)
            )
        }
    }
}

@Preview
@Composable
fun PreviewPantaiList() {
    PantaiList()
}

@Preview
@Composable
fun PreviewPantaiRow() {
    PantaiRow()
}