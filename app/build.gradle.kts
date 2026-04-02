plugins {
    alias(libs.plugins.androidApplication)
}

// Optimization: Reduced APK size by ~850KB by removing unused assets (circular.png) and dead code/layouts (SignupPage).
android {
    namespace = "com.example.evaluacion_m4"
    compileSdk = 34

    buildFeatures{
        viewBinding= true
    }

    defaultConfig {
        applicationId = "com.example.evaluacion_m4"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

}