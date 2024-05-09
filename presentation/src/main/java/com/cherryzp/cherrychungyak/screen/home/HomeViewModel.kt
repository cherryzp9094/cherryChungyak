package com.cherryzp.cherrychungyak.screen.home

import com.cherryzp.cherrychungyak.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(): BaseViewModel<HomeUiState>() {
    override val initialState: HomeUiState
        get() = HomeUiState("Home")

}