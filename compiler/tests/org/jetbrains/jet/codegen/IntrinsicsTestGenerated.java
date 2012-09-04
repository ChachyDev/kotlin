/*
 * Copyright 2010-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.jet.codegen;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.codegen.AbstractIntrinsicsTestCase;

/** This class is generated by {@link org.jetbrains.jet.codegen.AbstractIntrinsicsTestCase}. DO NOT MODIFY MANUALLY */
@TestMetadata("compiler/testData/codegen/intrinsics")
public class IntrinsicsTestGenerated extends AbstractIntrinsicsTestCase {
    public void testAllFilesPresentInIntrinsics() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.codegen.AbstractIntrinsicsTestCase", new File("compiler/testData/codegen/intrinsics"), "kt", true);
    }
    
    @TestMetadata("longRangeWithExplicitDot.kt")
    public void testLongRangeWithExplicitDot() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/intrinsics/longRangeWithExplicitDot.kt");
    }
    
}
