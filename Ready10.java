public class While01 {
    public static void main(String[] args) {
        int number = 1;
        // while文：ループ開始
        // numberが50未満の場合、ブロックの処理を行なう
        while (number < 50) {
            // ブロック：
            // numberにnumber * 2 を代入して、numberを出力
            number *= 2;
            System.out.println("While01 = " + number);
        }
    }
}

public class DoWhile01 {
    public static void main(String[] args) {
        int number = 1;
        // do-while文：ループ開始
        do {
            // ブロック：
            // numberにnumber * 2 を代入して、numberを出力
            number *= 2;
            System.out.println("DoWhile01 = " + number);
        // do-while文：
        // numberが50未満の場合、ブロックの処理をループ実行する
        } while (number < 50);
    }
}

public class For01 {
    public static void main(String[] args) {
        // for文：
        // 初期化式：numberを1で初期化
        // 条件式：numberが5未満の場合、ブロックの処理を行う
        // 変化式：ブロックの処理後に、numberをインクリメント
        for (int number = 1; number <= 5; number++) {
            // ブロック：numberを出力
            System.out.println("For01 = " + number);
        }
    }
}