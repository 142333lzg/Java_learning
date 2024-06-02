public class Stringconcat {
    public static void main(String[] args) {
        Stringconcat test = new Stringconcat();
        String s1 = "-";
        String[] s2 = {"Hello", "world"};
        String concat_res = test.concat(s1, s2);
        System.out.println(concat_res);
    }

    public String concat(String separator, String ... nums) {
        //使用 split对输入的字符串 nums分割,如果没有传入字符串，则返回空字符串
        StringBuilder string_res = new StringBuilder();
        // 使用 StringBuilder类，包括
//        append(X x): 向 StringBuilder 实例追加任意类型的对象 x，并返回对象本身。
//        insert(int offset, X x): 在指定位置 offset 插入对象 x。
//        delete(int start, int end): 删除从 start 到 end - 1 之间的字符。
//        replace(int start, int end, String str): 用指定的 String str 替换从 start 到 end - 1 之间的字符序列。
//        substring(int start, int end): 返回一个新的 String，包含这个序列从 start 到 end - 1 之间的字符。
//        reverse(): 反转 StringBuilder 对象所包含的字符序列。

        for (int i = 0; i < nums.length; i++) {
            if (i == 0){
                string_res.append(nums[i]);
            }
            else{
                string_res.append(separator).append(nums[i]);
            }
        }
        return string_res.toString();
    }
}
