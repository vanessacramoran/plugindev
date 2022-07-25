package com.github.vanessacramoran.plugindev.services

import com.intellij.openapi.project.Project
import com.github.vanessacramoran.plugindev.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
