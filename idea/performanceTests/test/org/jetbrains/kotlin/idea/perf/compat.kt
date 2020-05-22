/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

@file:Suppress("UNUSED_PARAMETER")

package org.jetbrains.kotlin.idea.perf

import com.intellij.codeInspection.ex.InspectionProfileImpl
import com.intellij.openapi.Disposable
import com.intellij.openapi.project.Project
import com.intellij.testFramework.propertyBased.MadTestingUtil

// BUNCH: 193
fun enableAllInspectionsCompat(project: Project, disposable: Disposable) {
    MadTestingUtil.enableAllInspections(project, disposable)
}

fun InspectionProfileImpl.disableInspection(project: Project, shortId: String) {
    this.getToolsOrNull(shortId, project)?.let { it.isEnabled = false }
}

typealias TestApplicationManager = com.intellij.idea.IdeaTestApplication
