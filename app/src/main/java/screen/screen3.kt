package screen
import Data.Student
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen(student: Student) {
    Surface(color = MaterialTheme.colors.background) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column {
                Image(
                    painter = painterResource(id =R.drawable.me),
                    contentDescription = "Profile Picture",
                    modifier = Modifier
                        .size(200.dp)
                        .padding(8.dp),
                    contentScale = ContentScale.Crop
                )
            }
            TextWithLabel("Name:", student.name)
            TextWithLabel("Email:", student.email)
            TextWithLabel("University:", student.university)
            TextWithLabel("Major:", student.major)
        }
    }
}

@Composable
fun TextWithLabel(label: String, value: String) {
    Column(
        modifier = Modifier.padding(vertical = 4.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = label,
            fontSize = 18.sp,
            color = Color.Black
        )
        Text(
            text = value,
            fontSize = 16.sp,
            color = Color.DarkGray,
            textAlign = TextAlign.Start
        )
    }
}

@Preview
@Composable
fun PreviewProfileScreen() {
    val student = Student(
        image = ".drawable.profile.jpeg",
        name = "M Wipaldi Nurpadilah",
        email = "wipaldie@gmail.com",
        university = "Universitas Teknologi Bandung",
        major = "Teknik Informatika"
    )
    ProfileScreen(student = student)
}