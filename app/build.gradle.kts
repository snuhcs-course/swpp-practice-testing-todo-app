plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("com.google.devtools.ksp")
    id("androidx.navigation.safeargs.kotlin")
    id("org.jetbrains.kotlin.kapt")
}

android {
    namespace = "com.example.swpp.tododapp"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.swpp.tododapp"
        minSdk = 24
        targetSdk = 36
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

    buildFeatures {
        dataBinding = true
        viewBinding = true
        buildConfig = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    // fragment
    implementation("androidx.fragment:fragment-ktx:1.8.9")
    implementation(libs.androidx.junit.ktx)
    val lifecycle_version = "2.9.4"
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version")
    ksp("androidx.lifecycle:lifecycle-compiler:$lifecycle_version")
    // swiperefresh
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    // recyclerview
    implementation("androidx.recyclerview:recyclerview:1.4.0")
    // annotation
    implementation("androidx.annotation:annotation:1.9.1")
    // Room
    val room_version = "2.8.2"
    implementation("androidx.room:room-runtime:$room_version")
    ksp("androidx.room:room-compiler:$room_version")
    // navigation
    implementation("androidx.navigation:navigation-fragment:2.9.5")
    implementation("androidx.navigation:navigation-ui:2.9.5")

    // timber
    implementation("com.jakewharton.timber:timber:5.0.1")


    // Testing
    testImplementation(libs.junit)
    testImplementation(kotlin("test"))
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.10.2")
    // Dependencies for Android instrumented tests
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation("androidx.test:runner:1.7.0")
    androidTestImplementation("androidx.test:rules:1.7.0")
    androidTestImplementation(kotlin("test"))
    androidTestImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.10.2")
    androidTestImplementation ("org.mockito:mockito-core:5.18.0")
    androidTestImplementation ("com.linkedin.dexmaker:dexmaker-mockito:2.28.3")
    androidTestImplementation ("androidx.test.espresso:espresso-contrib:3.7.0")
    androidTestImplementation("androidx.fragment:fragment-testing:1.8.9")
    debugImplementation("androidx.fragment:fragment-testing-manifest:1.8.9")

}