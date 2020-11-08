package Observe;

/**
 * @Author: HouX
 * @Date: 2020/11/8
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ProductList observable = ProductList.getInstance();
        TaoBaoObserver tbObserver = new TaoBaoObserver();
        JingDongObserver jdObserver = new JingDongObserver();
        observable.addObserver(jdObserver);
        observable.addObserver(tbObserver);
        observable.addProduct("iPhone 12 Pro Max");
    }
}
