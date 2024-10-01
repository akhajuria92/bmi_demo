plugins {
    id ("com.android.library")
    alias(libs.plugins.jetbrains.kotlin.android)
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id ("maven-publish")
    alias(libs.plugins.hilt.android)

}

android {
    namespace = "com.app.bmicalculator"
    compileSdk = 34



    defaultConfig {
        aarMetadata {
            minSdk = 24
            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            isShrinkResources = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions  {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    kotlinOptions {
        jvmTarget = "21"
    }
    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }


}
publishing {
    publications {
            create("release",MavenPublication::class.java){
                groupId = "com.techglock" // Your GitHub username or organization
                artifactId = "bmi-calculator" // Your library's artifact ID
                version = "1.1.6"
                afterEvaluate {
                    from(components["release"])
                }
            }
        /*
        register<MavenPublication>("release") {

            afterEvaluate {
                from(components["release"])
                groupId = "com.techglock" // Your GitHub username or organization
                artifactId = "bmi-calculator" // Your library's artifact ID
                version = "1.1.5" // Your library's version

                pom {
                    name.set("BMI Calculator")
                    description.set("A library to calculate Body Mass Index (BMI)")
                    url.set("https://github.com/akhajuria92/bmi_demo")

                    licenses {
                        license {
                            name.set("The Apache License, Version 2.0")
                            url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                        }
                    }

                    developers {
                        developer {
                            id.set("akhajuria92")
                            name.set("Akshay Khajuria")
                            email.set("akshaykhajuria92@gmail.com")
                        }
                    }

                    scm {
                        connection.set("scm:git:git://github.com/akhajuria92/bmi_demo.git")
                        developerConnection.set("scm:git:ssh://github.com/akhajuria92/bmi_demo.git")
                        url.set("https://github.com/akhajuria92/bmi_demo")
                    }
                }
            }
        }
        */
        repositories {
            mavenLocal()
            maven {
                url = uri("https://jitpack.io")
            }
        }

    }
}
dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.databinding.runtime)
    implementation(libs.play.services.auth.api.phone)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.logging.interceptor)
    implementation(libs.httpclient)
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    implementation(libs.sdp.android)
    // Glide
    implementation(libs.glide)
    //noinspection KaptUsageInsteadOfKsp
    kapt(libs.compiler)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.extensions)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.preference.ktx)
    implementation(libs.androidx.legacy.support.v4)
    implementation(libs.gson)
    implementation(libs.circularseekbar)

}