package com.cherryzp.cherrychungyak.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.cherryzp.cherrychungyak.Greeting
import com.cherryzp.cherrychungyak.base.UiState

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel(),
    modifier: Modifier = Modifier,
) {
    val uiState by viewModel.container.uiState.collectAsState()

    Column(
        modifier = modifier
    ) {
        Greeting(name = uiState.title)
    }
}

@Preview(showBackground = true, showSystemUi = true, device = "id:pixel_5")
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}