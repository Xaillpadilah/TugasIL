package screen

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GrideView() {
    val alamList = listOf(
        Alam("Gunung Everest", "Gunung", "Nepal", "Gunung tertinggi di dunia.", R.drawable.everst),
        Alam("Danau Toba", "Danau", "Sumatera Utara, Indonesia", "Danau vulkanik terbesar di Indonesia.", R.drawable.danautoba),
        Alam("Great Barrier Reef", "Terumbu Karang", "Australia", "Sistem terumbu karang terbesar di dunia.", R.drawable.greatt),
        Alam("Amazon Rainforest", "Hutan Hujan", "Amerika Selatan", "Hutan hujan terbesar di dunia.", R.drawable.amaazon),
        Alam("Victoria Falls", "Air Terjun", "Zimbabwe dan Zambia", "Air terjun terbesar di dunia.", R.drawable.victoria),
        Alam("Grand Canyon", "Canyon", "Arizona, Amerika Serikat", "Canyon terbesar di dunia.", R.drawable.grancanyon),
        Alam("Mount Fuji", "Gunung", "Jepang", "Gunung tertinggi di Jepang.", R.drawable.mountfuji),
        Alam("Sahara Desert", "Padang Pasir", "Afrika", "Padang pasir terbesar di dunia.", R.drawable.sahara),
        Alam("Aurora Borealis", "Fenomena Alam", "Kawasan Polar", "Fenomena cahaya yang terjadi di langit utara.", R.drawable.aurora),
        Alam("Galápagos Islands", "Kepulauan", "Ekuador", "Kepulauan yang menjadi tempat penelitian Charles Darwin.", R.drawable.gala)
    )

    AlamList(alamList)
}

@Composable
fun AlamList(alamList: List<Alam>) {
    LazyVerticalGrid(cells = GridCells.Fixed(2)) {
        items(alamList) { alam ->
            AlamItem(alam)
        }
    }
}

@Composable
fun AlamItem(alam: Alam) {
    Column(modifier = Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = alam.imageResId),
            contentDescription = null,
            modifier = Modifier
                .height(120.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = alam.nama)
        Text(text = alam.lokasi)
    }
}

data class Alam(
    val nama: String,
    val jenis: String,
    val lokasi: String,
    val deskripsi: String,
    val imageResId: Int
)

@Preview
@Composable
fun PreviewViewScreen() {
    GrideView()
}