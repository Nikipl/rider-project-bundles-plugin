package com.github.nikipl.riderprojectbundlesplugin.services

import com.github.nikipl.riderprojectbundlesplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
