plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.cherryzp.data"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(project(":domain"))

    implementation(AndroidX.CORE_KTX)
    implementation(AndroidX.APP_COMPAT)
    implementation(AndroidX.MATERIAL)
    testImplementation(Tests.JUNIT)
    androidTestImplementation(Tests.EXT_JUNIT)
    androidTestImplementation(Tests.ESPRESSO_CORE)

    implementation(platform(Libraries.OK_HTTP3_BOM))
    implementation(Libraries.OK_HTTP3)
    implementation(Libraries.OK_HTTP3_LOGGING_INTERCEPTOR)

    implementation(Libraries.RETROFIT2)
    implementation(Libraries.RETROFIT2_CONVERTER_GSON)
}