public class Test {
    public static void main(String[] args) {
        // 故意写一些有问题的代码，以便测试
        int  i = 1/0;
        System.out.println("Hello World!");

        Integer a = 129;
        Integer b = 129;
        System.out.println(a == b);


        Integer c = 1;
        Integer d = 1;
        System.out.println(c == d);

        int[] arr = new int[10];
        System.out.println(arr[10]);

    }
}
