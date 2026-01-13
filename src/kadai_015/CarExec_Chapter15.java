package kadai_015;

public class CarExec_Chapter15 {
    public static void main(String[] args) { // mainメソッド（プログラムの開始点）

        Car_Chapter15 car = new Car_Chapter15(); // Carクラスのインスタンスを生成

        car.changeGear(3); // ギアを3速に変更
        car.run();         // 変更後の速度を表示
    }
}
