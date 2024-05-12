package com.cherryzp.cherrychungyak.base

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow

interface Container<S : UiState<S>> {
    val uiState: StateFlow<S>
    val uiSideEffect: SharedFlow<UiSideEffect>

    fun event(intent: ContainerContext<S>.() -> Unit)
}

interface ContainerHost<S : UiState<S>> {
    val container: Container<S>
}

class ContainerContext<S : UiState<S>>(
    val initState: () -> S,
    val postSideEffect: suspend (UiSideEffect) -> Unit,
    val reduceState: ((S) -> S) -> Unit
) {
    val state: S
        get() = initState()

}

fun <S: UiState<S>> ContainerHost<S>.event(
    transformer: ContainerContext<S>.() -> Unit
) {
    container.event {
        transformer()
    }
}
