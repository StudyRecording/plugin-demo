package com.github.studyrecording.plugindemo.services

import com.intellij.openapi.project.Project
import com.github.studyrecording.plugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
