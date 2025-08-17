plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    id("com.google.devtools.ksp")
    id("kotlin-kapt")


}

android {
    namespace = "com.example.fuelmate"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.fuelmate"
        minSdk = 24
        targetSdk = 33
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures{

        dataBinding=true
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.activity:activity-ktx:1.8.2")
    implementation("androidx.navigation:navigation-runtime-ktx:2.7.7")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.9.22")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.9.20")

    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //firebase
    implementation(platform("com.google.firebase:firebase-bom:32.8.0"))
    implementation("com.google.firebase:firebase-database-ktx:20.3.1")
    implementation("com.google.firebase:firebase-auth:22.3.1")
    implementation("com.google.firebase:firebase-database:20.3.1")

    //lottie  animation
    implementation ("com.airbnb.android:lottie:6.3.0")

    //About us page
    implementation ("io.github.medyo:android-about-page:2.0.0")

    //maps
    implementation("com.google.android.gms:play-services-maps:18.2.0")
    implementation ("com.google.android.gms:play-services-location:21.2.0")
    //places
   implementation("com.google.android.libraries.places:places:3.4.0")

    //Viewpager Implementation
    implementation ("androidx.viewpager2:viewpager2:1.0.0")
    //CircleIndicator
    implementation ("me.relex:circleindicator:2.1.6")


    //ROOM
    val room_version = "2.6.1"
    implementation("androidx.room:room-runtime:$room_version")
    // To use Kotlin Symbol Processing (KSP)
    implementation("com.google.devtools.ksp:symbol-processing-api:2.0.0-Beta4-1.0.19")
    ksp("androidx.room:room-compiler:$room_version")


    val lifecycle_version = "2.7.0"
    // ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    //coroutine with room
    implementation ("androidx.room:room-ktx:$room_version")

    //rozorpay
    implementation("com.razorpay:checkout:1.6.4")

    
}



