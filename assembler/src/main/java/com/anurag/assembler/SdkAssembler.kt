package com.anurag.assembler

import org.gradle.api.Action
import org.gradle.api.Plugin
import org.gradle.api.Project

class SdkAssembler : Plugin<Project> {

    override fun apply(target: Project) {
        target.android {
            sourceSets {
                getByName("main") {
                    java {
                        srcDirs("./../sdk1/src/main", "./../sdk2/src/main", "./../sdk3/src/main")
                    }
                }
            }
        }
    }
}

fun Project.android(configure: Action<com.android.build.gradle.LibraryExtension>): Unit =
    (this as org.gradle.api.plugins.ExtensionAware).extensions.configure("android", configure)