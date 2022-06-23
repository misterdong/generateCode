package com.github.misterdong.generatecode.services

import com.intellij.openapi.project.Project
import com.github.misterdong.generatecode.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
