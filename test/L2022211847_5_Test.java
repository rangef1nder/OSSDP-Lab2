import main.Solution5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * 测试用例设计原则：
 * 1. 等价类划分：将输入数据划分为若干个等价类，每个等价类中的数据在程序中的处理是相同的。
 * 2. 边界值分析：测试输入数据的边界值，确保程序在边界条件下的正确性。
 * 3. 特殊值测试：测试一些特殊值，如空数组、最大值等。
 */
public class L2022211847_5_Test {

    /**
     * 测试方法：testNumSubseq
     * 测试目的：验证numSubseq方法在不同输入情况下的正确性。
     * 测试用例：
     * 1. nums = [3, 5, 6, 7], target = 9，预期结果：4
     * 2. nums = [3, 3, 6, 8], target = 10，预期结果：6
     * 3. nums = [2, 3, 3, 4, 6, 7], target = 12，预期结果：61
     * 4. nums = [], target = 5，预期结果：0（空数组测试）
     * 5. nums = [1, 2, 3, 4, 5], target = 0，预期结果：0（target为0测试）
     */
    @Test
    void testNumSubseq() {
        Solution5 solution = new Solution5();

        assertEquals(4, solution.numSubseq(new int[]{3, 5, 6, 7}, 9));
        assertEquals(6, solution.numSubseq(new int[]{3, 3, 6, 8}, 10));
        assertEquals(61, solution.numSubseq(new int[]{2, 3, 3, 4, 6, 7}, 12));
        assertEquals(0, solution.numSubseq(new int[]{}, 5));
        assertEquals(0, solution.numSubseq(new int[]{1, 2, 3, 4, 5}, 0));
    }
}
