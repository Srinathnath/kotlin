/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.uast.test.kotlin

import org.junit.Test

class KotlinExpressionValueTest : AbstractKotlinExpressionValueTest() {
    @Test
    fun testDelegate() = doTest("Delegate")
}