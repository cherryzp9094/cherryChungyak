package com.cherryzp.cherrychungyak.screen.home

import com.cherryzp.cherrychungyak.base.UiSideEffect
import com.cherryzp.cherrychungyak.base.UiState

data class HomeUiState(
    val title: String
) : UiState<HomeUiState>

sealed class HomeUiSideEffect : UiSideEffect {
    data class ShowSnackBar(val message: String) : HomeUiSideEffect()
}