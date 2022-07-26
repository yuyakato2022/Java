// レッスン１
// 変数
class Main {
  public static void main(String[] args) {
    // int型の変数numberを定義してください
    int number;
    
    // 変数numberに3を代入してください
    number = 3;
    
    // 変数numberを出力してください
    System.out.println(number);

    // String型の変数nameを定義してください
    String name;
    
    // 変数nameに"Wanko"を代入してください
    name = "Wanko";
    
    // 変数nameを出力してください
    System.out.println(name);
    
  }
}

// 変数連結
class Main {
  public static void main(String[] args) {
    int number1 = 3;
    
    // int型の変数number2を定義し、7を代入してください
    int number2 = 7;
    
    // number1 * number2を出力してください
    System.out.println(number1 * number2);
    
    // 変数textに「プログラミングを勉強しよう」を代入してください
    String text = "プログラミングを勉強しよう";
    
    // 「Progateで」と変数textを連結して出力してください
    System.out.println("Progateで" + text);
    
  }
}

// 変数更新
class Main {
  public static void main(String[] args) {
    int number = 11;
    String text = "Ruby";
    System.out.println(number);
    System.out.println(text);
    
    // 変数numberを9で上書きしてください
    number = 9;
    
    // 変数numberを出力してください
    System.out.println(number);
    
    // 変数textを「Java」で上書きしてください
    text = "Java";
    
    // 変数textを出力してください
    System.out.println(text);
    
  }
}

// 自己代入
class Main {
  public static void main(String[] args) {
    int number = 3;
    System.out.println(number);
    
    // 変数numberの値に7を足して、変数numberを上書きしてください
    number = number + 7;
    
    // 変数numberを出力してください
    System.out.println(number);
      
  }
}

// 変数省略
class Main {
  public static void main(String[] args) {
    int number = 8;
    
    // 変数numberに7をかけて、変数numberを上書きしてください
    number *= 7;
    
    // 変数numberを出力してください
    System.out.println(number);
    
    // 変数numberの値に1を足して、変数numberを上書きしてください
    number ++;
    
    // 変数numberを出力してください
    System.out.println(number);
    
  }
}

// 少数
class Main {
  public static void main(String[] args) {
    // double型の変数number1を定義し、8.5を代入してください。
    double number1 = 8.5;
    
    // double型の変数number2を定義し、3.4を代入してください。
    double number2 = 3.4;
    
    // number1にnumber2を足した値を出力してください
    System.out.println(number1 + number2);
    
    // number1からnumber2を引いた値を出力してください
    System.out.println(number1 - number2);
    
  }
}
// 型自動変換
class Main {
  public static void main(String[] args) {
    int month = 12;
    int date = 31;
    
    // 「12月31日」となるように変数と文字列を連結して出力してください
    System.out.println(month + "月" + date + "日");
    
    // 7を2で割った値を出力してください
    System.out.println(7 / 2);
    
    // 7.0を2.0で割った値を出力してください
    System.out.println(7.0 / 2.0);
    
    // 7を2.0で割った値を出力してください
    System.out.println(7 / 2.0);
    
  }
}

// 少数キャスト
class Main {
  public static void main(String[] args) {
    int number1 = 7;
    int number2 = 2;
    System.out.println(number1 / number2);
    
    // number1をdouble型にキャストし、number2で割った値を出力してください
    System.out.println((double)number1 / number2);
    
  }
}
