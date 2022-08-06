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

public class For02 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        // 拡張for文：
        // 配列の要素を順番にnumberに代入し、要素分繰り返す
        for (int number : array) {
            // ブロック：numberを出力
            System.out.println("For02 = " + number);
        }
    }
}

public class Recursive01 {
  public static void main(String[] args) {
    int number = 1;
    printNum(number);
  }

  public static int printNum(int number) {
    if (number < 50) {
      number *= 2;
      System.out.println("While01 = " + number);
      // 条件にマッチしたら自分自身を再度呼び出す
      printNum(number);
    }
    return number;
  }
}