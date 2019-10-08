package com.wsyzj.example.interview;

/**
 * <pre>
 *     author : 焦洋
 *     e-mail : wsyzj_92@163.com
 *     time   : 2019/10/07
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class JaveBasics {

    /**
     * 请手写equal方法【String类】，讲讲具体的原理？Object类的equla方法是怎样的？
     *
     * @return
     */
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }

        String string = this.toString();     // 假设自己也是一个字符串

        if (otherObject instanceof String) {
            String otherString = (String) otherObject;
            int stringLength = string.length();
            int otherLength = otherString.length();

            if (stringLength == otherLength) {
                for (int i = 0; i < stringLength; i++) {
                    if (string.charAt(i) != otherString.charAt(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
