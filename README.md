# BMI Calculator

The Body Mass Index (BMI) Calculator can be used to calculate BMI value and corresponding weight status while taking age into consideration.

## Getting started
To make it easy for you to get started with GitLab, here's a list of recommended next steps.

Already a pro? Just edit this README.md and make it your own. Want to make it easy? [Use the template at the bottom](#editing-this-readme)!


## How To use SDK
## Step 1
```bash
dependencyResolutionManagement {
            repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
            repositories {
                    mavenCentral()
                    maven { url 'https://jitpack.io' } 
            }
    }

```
## Step 2
```bash
dependencies {
    implementation 'com.github.akhajuria92:bmi_demo:Tag'
}
For Kotlin
dependencies {
    implementation ("com.github.akhajuria92:bmi_demo:Tag")
}
```
## Step 3
```bash
Add Hilt in your Project For use BMI 
for Kotlin add hilt
For the project-level build.gradle put this inside:
plugins {
    id 'com.google.dagger.hilt.android' version '2.46.1' apply false
}

For the app-level build.gradle put this inside respectively to sections:

plugins {
    // other plugins - order is important
    id 'kotlin-kapt'
    id 'com.google.dagger.hilt.android'
}

android {
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
}

dependencies {
// For hilt Implementation
    implementation 'com.google.dagger:hilt-android:2.46.1'
    kapt 'com.google.dagger:hilt-compiler:2.46.1'
}

For example, create MyApp.kt and add:
@HiltAndroidApp
class MyApp: Application()
```
## Add viewbinding and data binding in your project
```bash
android {
        buildFeatures {
                viewBinding = true
                dataBinding = true
        }
}
```
## Authors and acknowledgment
Show your appreciation to those who have contributed to the project.

## License
For open source projects, say how it is licensed.

## Project status
If you have run out of energy or time for your project, put a note at the top of the README saying that development has slowed down or stopped completely. Someone may choose to fork your project or volunteer to step in as a maintainer or owner, allowing your project to keep going. You can also make an explicit request for maintainers.