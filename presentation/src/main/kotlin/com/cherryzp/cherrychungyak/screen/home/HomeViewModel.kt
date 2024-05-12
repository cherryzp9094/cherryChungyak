package com.cherryzp.cherrychungyak.screen.home

import com.cherryzp.cherrychungyak.base.BaseViewModel
import com.cherryzp.cherrychungyak.base.event
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(): BaseViewModel<HomeUiState>() {
    override val initialState: HomeUiState
        get() = HomeUiState("Home")

    fun testChangeState() = reduceState {
        it.copy(
            title = "test state!!"
        )
    }

    fun showSnackBar(message: String) = postSideEffect {
        HomeUiSideEffect.ShowSnackBar(message)
    }

}