package com.github.kasmadi17.intellijtestplugin.services

import com.intellij.openapi.project.Project
import com.github.kasmadi17.intellijtestplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
