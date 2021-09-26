package com.github.fingerart.androidxmlcsv.services

import com.intellij.openapi.project.Project
import com.github.fingerart.androidxmlcsv.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
