object AndroidX {
    const val CORE_KTX = "${Libs.ANDROIDX_CORE_KTX}:${Versions.coreKtx}"
    const val LIFECYCLE_RUNTIME_KTX = "${Libs.ANDROIDX_LIFECYCLE_RUNTIME_KTX}:${Versions.lifecycleRuntimeKtx}"
    const val ACTIVITY_COMPOSE = "${Libs.ANDROIDX_ACTIVITY_COMPOSE}:${Versions.activityCompose}"
    const val MATERIAL3 = Libs.ANDROIDX_MATERIAL3
}

object Compose {
    const val UI_TOOLING = Libs.ANDROIDX_COMPOSE_UI_TOOLING
    const val BOM = "${Libs.ANDROIDX_COMPOSE_BOM}:${Versions.composeBom}"
    const val UI = Libs.ANDROIDX_COMPOSE_UI
    const val UI_GRAPHICS = Libs.ANDROIDX_COMPOSE_UI_GRAPHICS
    const val UI_TOOLING_PREVIEW = Libs.ANDROIDX_UI_TOOLING_PREVIEW
}

object Jetbrains {
    const val KOTLIN_BOM = "${Libs.JETBRAINS_KOTLIN_BOM}:${Versions.kotlinBom}"
}

object Tests {
    const val JUNIT = "${Libs.JUNIT}:${Versions.junit}"
    const val EXT_JUNIT = "${Libs.ANDROIDX_TEST_EXT_JUNIT}:${Versions.testExtJUnit}"
    const val ESPRESSO_CORE = "${Libs.ANDROIDX_TEST_ESPRESSO_CORE}:${Versions.testEspressoCore}"
    const val UI_TEST_JUNIT4 = Libs.ANDROIDX_COMPOSE_UI_TEST_JUNIT4
    const val UI_TEST_MANIFEST = Libs.ANDROIDX_UI_TEST_MANIFEST
}