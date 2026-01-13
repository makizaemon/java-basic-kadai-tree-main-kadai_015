package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;   // ギア（1～5速）を表すフィールド（初期値：1）
    private int speed = 10; // 速度を表すフィールド（初期値：10km）

    // ギアチェンジを行うメソッド
    public void changeGear(int afterGear) { // ギア変更用メソッド（引数：変更後のギア）
        System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました"); // ギア変更メッセージを表示
        this.gear = afterGear; // 現在のギアを変更後のギアに代入

        // ギアの値によって速度を変更
        switch (gear) { // gearの値で分岐処理
            case 1:
                speed = 10; // 1速の場合は時速10km
                break;
            case 2:
                speed = 20; // 2速の場合は時速20km
                break;
            case 3:
                speed = 30; // 3速の場合は時速30km
                break;
            case 4:
                speed = 40; // 4速の場合は時速40km
                break;
            case 5:
                speed = 50; // 5速の場合は時速50km
                break;
            default:
                speed = 10; // 上記以外の場合は時速10km
        }

    }
    
    public void run() { // runメソッド（戻り値なし）
        System.out.println("速度は時速" + speed + "kmです"); // 現在の速度を表示
    }
}
