plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly("com.android.tools.build:gradle:8.0.2")

    testImplementation("junit:junit:4.13.2")
}


gradlePlugin {
    plugins {
        register("assembler") {
            id = "sdk-assembler"
            implementationClass = "com.anurag.assembler.SdkAssembler"
            version = "0.0.1"
        }
    }
}