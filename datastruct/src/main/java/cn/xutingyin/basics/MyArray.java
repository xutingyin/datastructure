package cn.xutingyin.basics;

/**
 * 数组实现 ：实现基本的增删查改功能 ；顺序链表在Java 中的实现就是数组来实现
 */
public class MyArray {

    // 定义一个整型数组
    private int[] intArray;

    // 数组长度
    private int length;

    // 数组实际长度
    private int elements;

    // 默认的构造函数
    public MyArray() {
        this.elements = 0;
        this.length = 100;
        this.intArray = new int[length];
    }

    // 带参构造函数，指定数组长度
    public MyArray(int length) {
        this.elements = 0;
        this.length = length;
        this.intArray = new int[length];
    }

    // 以下是数组常用的方法

    /**
     * 获取数据的实际大小
     * 
     * @return
     */
    public int length() {
        return elements;
    }

    /**
     * 遍历整个数组
     */
    public void display() {
        for (int i = 0; i < elements; i++) {
            System.out.println(intArray[i]);
        }
    }

    /**
     * 添加元素 1、不可重复添加 2、添加是否成功
     */

    public boolean add(int data) {
        boolean addFlag = false;
        if (elements != length) {
            intArray[elements] = data;
            elements++;
            addFlag = true;
        }
        return addFlag;
    }

    /**
     * 根据索引位置删除元素
     * 
     * @param index
     *            索引位置
     * @return 是否成功
     */
    public boolean deleteByIndex(int index) {
        boolean delFlag = false;
        if (index < length) {
            // 从删除的位置起，后面的数都要往前面移一位
            for (int i = index; i < elements - 1; i++) {
                intArray[i] = intArray[i + 1];
            }
            elements--;
            delFlag = true;
        }
        return delFlag;
    }

    /**
     * 直接删除元素
     * 
     * @param intValue
     *            删除的元素
     * @return 是否成功
     */
    public boolean delete(int intValue) {
        // 找到该元素所在索引
        int k = find(intValue);
        if (k == -1) {// 未找到值
            return false;
        } else {
            return deleteByIndex(k);
        }
    }

    /**
     * 查找元素在数组中的位置
     * 
     * @param searchValue
     *            查询值
     * @return 查找的元素如果存在则返回下标值，如果不存在，返回 -1
     */
    public int find(int searchValue) {
        int index = 0;
        for (int i = 0; i < elements; i++) {
            if (intArray[i] == searchValue) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }

    /**
     * 修改操作
     * 
     * @param oldValue
     *            原始值
     * @param newValue
     *            修改新值
     * @return
     */
    public boolean modify(int oldValue, int newValue) {
        int k = find(oldValue);
        if (k == -1) {
            return false;
        } else {
            intArray[k] = newValue;
            return true;
        }
    }

    public void printLine() {
        System.out.println("-------------------------------------------------------");
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.add(6);
        myArray.printLine();
        myArray.display();

        myArray.deleteByIndex(3);
        myArray.printLine();
        myArray.display();

        myArray.delete(2);
        myArray.printLine();
        myArray.display();

        myArray.modify(1, 111);
        myArray.printLine();
        myArray.display();

    }
}
