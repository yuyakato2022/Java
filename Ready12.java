package capsule.human;

public class HumanNoCapsule {
    // publicのアクセス修飾子のため外部から参照が可能
    public String name;
    public int age;

    public HumanNoCapsule(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

package capsule.human;

public class HumanCapsule {
    // privateのアクセス修飾子を設定して外部から隠蔽
    private String name;
    private int age;

    public HumanCapsule(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // nameのgetterメソッド
    public String getName() {
        return this.name;
    }

    // nameのsetterメソッド
    public void setName(String name) {
        this.name = name;
    }

    // ageのgetterメソッド
    // ageは外部から変更禁止なので、setterメソッドは作成しない
    public int getAge() {
        return this.age;
    }
}

package capsule;

import capsule.human.HumanCapsule;
import capsule.human.HumanNoCapsule;

public class Capsule01 {
    public static void main(String[] args) {
        // 名前や年齢が変更禁止のカプセル化されていないインスタンスを生成
        HumanNoCapsule human1 = new HumanNoCapsule("田中", 28);
        // 変更禁止だが、アクセス制限がないので変更できてしまう
        human1.name = "今田";
        human1.age = 70;
        // 変更されてしまうので想定外の名前と年齢になってしまう
        System.out.println("名前は" + human1.name + ", 年齢は" + human1.age + "です。");

        // 名前や年齢が変更禁止のカプセル化されたインスタンスを生成
        HumanCapsule human2 = new HumanCapsule("小林", 32);
        // privateのアクセス制限のため、以下のようにsetterを使わずに直接変更しようとするとコンパイルエラーが発生する
        // human2.name = "三村";
        // 直接変更されないため、想定通りの名前と年齢が取得できる。取得は、getterメソッドを使用する
        System.out.println("名前は" + human2.getName() + ", 年齢は" + human2.getAge() + "です。");
        // 変更は、setterメソッドを使用する
        human2.setName("佐々木");
        System.out.println("変更した名前は" + human2.getName() + "です。");
    }
}