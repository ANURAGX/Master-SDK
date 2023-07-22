package com.anurag.assembler

import org.gradle.api.Action
import org.gradle.api.Plugin
import org.gradle.api.Project

class SdkAssembler : Plugin<Project> {

    private val sdks =
        listOf("./../sdk1/src/main/java/", "./../sdk2/src/main/java/", "./../sdk3/src/main/java/")
    private val sdksRes =
        listOf("./../sdk1/src/main/res/", "./../sdk2/src/main/res/", "./../sdk3/src/main/res/")

    override fun apply(target: Project) {
        target.android {
            sourceSets {
                getByName("main") {
                    java {
                        srcDirs(sdks)
                    }
//                    manifest {
//                        srcFile("$it/AndroidManifest.xml")
//                    }

                    resources {
                        srcDirs(
                            "./../sdk1/src/main/res/",
                            "./../sdk2/src/main/res/",
                            "./../sdk3/src/main/res/"
                        )
                    }
                }
            }
        }
    }
}

fun Project.android(configure: Action<com.android.build.gradle.LibraryExtension>): Unit =
    (this as org.gradle.api.plugins.ExtensionAware).extensions.configure("android", configure)