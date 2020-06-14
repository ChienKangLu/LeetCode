package com.leo.lab.solution.kotlin.longestcommonprefix

import com.leo.lab.question.LongestCommonPrefix
import com.leo.lab.solution.java.longestcommonprefix.BaseLongestCommonPrefixTest

/**
 * @author Leo Lu
 * @since 2020/06/13
 */
class LongestCommonPrefixTest2 : BaseLongestCommonPrefixTest() {

    override fun initializeTestedSolution(): LongestCommonPrefix = Solution2()
}