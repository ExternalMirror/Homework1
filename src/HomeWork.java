//task1
//public class HomeWork {
//    public static void main(String[] args) {
//        int num1 = 20;
//        int num2 = 10;
//        int num3 = 30;
//        int num4 = 40;
//        int AddNum1Num2 = num1 + num2;
//        int AddNum3Num4 = num3 + num4;
//        System.out.println("value of AddNum1Num2 is " + AddNum1Num2 + " and value of AddNum3Num4 is "+ AddNum3Num4);
//        if(AddNum1Num2 > AddNum3Num4){
//            System.out.println(AddNum1Num2 +" is greater than "+ AddNum3Num4);
//        }else if (AddNum1Num2 < AddNum3Num4){
//            System.out.println(AddNum3Num4 +" is greater than "+ AddNum1Num2);
//        }else {
//            System.out.println("Values are same");
//        }
//    }
//}

//Task2
// public class HomeWork {
//    public static void main(String[] args){
//        double num1 = 7;
//        double num2 = 22;
//        double num3 = 31;
//        double num4 = 10;
//
//        if (num1 != 0) {
//            if (num1 % 2 == 0) {
//                System.out.println(num1 + " is even");
//            } else if (num1 % 2 == 1){
//                System.out.println(num1 + " is odd");
//            }else {
//                System.out.println(num1 + " is kesr eded");
//            }
//
//        }else {
//            System.out.println("Number is neither odd nor even");
//        }
//        if (num2 != 0) {
//            if (num2 % 2 == 0) {
//                System.out.println(num2 + " is even");
//            } else if (num1 % 2 == 1){
//                System.out.println(num1 + " is odd");
//            }else {
//                System.out.println(num1 + " is kesr eded");
//            }
//        }else {
//            System.out.println("Number is neither odd nor even");
//        }
//
//        if (num3 != 0) {
//            if (num3 % 2 == 0) {
//                System.out.println(num3 + " is even");
//            } else if (num1 % 2 == 1){
//                System.out.println(num3 + " is odd");
//            }else {
//                System.out.println(num1 + " is kesr eded");
//            }
//        }else {
//            System.out.println("Number is neither odd nor even");
//        }
//
//        if (num4 != 0) {
//            if (num4 % 2 == 0) {
//                System.out.println(num4 + " is even");
//            } else if (num1 % 2 == 1){
//                System.out.println(num4 + " is odd");
//            }else {
//                System.out.println(num1 + " is kesr eded");
//            }
//        }else {
//            System.out.println("Number is neither odd nor even");
//        }
//    }
//}

//Task3
//public class HomeWork {
//    public static void main(String[] args) {
//        byte a = 10;
//        byte b = 11;
//        byte c = 2;
//        if (c == 0){
//            System.out.println("It can't be divided to 0");
//            return;
//        }
//        float result = (float) (a + b) / c;
//        System.out.println(result);
//
//        if (result < 10) {
//            System.out.println(" a and b addition being divided c is less than 10");
//        } else if (result == 10) {
//            System.out.println(" a and b addition divided c is equal to 10");
//        } else {
//            System.out.println(" a and b addition divided c is greater than 10");
//        }
//
//    }
//}

//Task4
//public class HomeWork {
//    public static void main(String[] args) {
//        int num1 = 11;
//        int num2 = 7;
//        int num3 = 9;
//        int num4 = 10;
//        int MaxNumBetween12;
//        int MinNumBetween34;
//        int result;
//
//        if (num1>num2){
//            MaxNumBetween12 = num1;
//        }else {
//            MaxNumBetween12 = num2;
//        }
//        if (num3>num4){
//            MinNumBetween34 = num4;
//        }else {
//            MinNumBetween34 = num3;
//        }
//
//        result = MaxNumBetween12*MinNumBetween34;
//        System.out.println("Maximum number between num1 and num2 is "+ MaxNumBetween12);
//        System.out.println("Minimum number between num3 and num4 is "+ MinNumBetween34);
//        System.out.println("Their multiplication is "+ result);
//    }
//}

//Task5

//public class HomeWork {
//    public static void main(String[] args) {
//        byte DayOfWeek = 3;
//
//        if (DayOfWeek == 1){
//            System.out.println("This day of week is Bazar ertesi");
//        }else if (DayOfWeek == 2) {
//            System.out.println("This day od week is Cersenbe axasmi");
//        }else if (DayOfWeek == 3) {
//            System.out.println("This day of week is Cersenbe");
//        }else if (DayOfWeek == 4) {
//            System.out.println("This day of week is Cume axsami");
//        }else if (DayOfWeek == 5) {
//            System.out.println("This day of week is Cume");
//        }else if (DayOfWeek == 6) {
//            System.out.println("This day of week is Senbe");
//        }else if (DayOfWeek == 7){
//            System.out.println("This day of week is Bazar ertesi");
//        }else {
//            System.out.println("This number isn't between 1 and 7");
//        }
//    }
//}

//Task6

//public class HomeWork {
//    public static void main(String[] args) {
//        byte a = 0;
//        byte b = 7;
//        System.out.println("Before displacement a is " + a + "; b is " + b);
//            a = (byte) (a + b);
//            b = (byte) (a - b);
//            a = (byte) (a - b);
//        System.out.println("After displacement a is " + a + "; b is " + b);
//    }
//}

//Task1 but with scanner
import java.util.Scanner;

//public class HomeWork {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the value for num1: ");
//        byte num1 = sc.nextByte();
//
//        System.out.println("Enter the value for num2: ");
//        byte num2 = sc.nextByte();
//
//        System.out.println("Enter the value for num3: ");
//        byte num3 = sc.nextByte();
//
//        System.out.println("Enter the value for num4: ");
//        byte num4 = sc.nextByte();
//
//        byte AddNum1Num2 = (byte)(num1 + num2);
//        byte AddNum3Num4 = (byte)(num3 + num4);
//
//        System.out.println("value of AddNum1Num2 is " + AddNum1Num2 + " and value of AddNum3Num4 is "+ AddNum3Num4);
//
//        if (AddNum1Num2 > AddNum3Num4) {
//            System.out.println(AddNum1Num2 + " is greater than " + AddNum3Num4);
//        } else if(AddNum1Num2 < AddNum3Num4) {
//            System.out.println(AddNum3Num4 + " is greater than " + AddNum1Num2);
//        }else {
//            System.out.println("Values are the same");
//        }
//        sc.close();
//    }
//}

//Task2 with scanner
//public class HomeWork {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter value of num1: ");
//        double num1 = sc.nextDouble();
//        System.out.println("Enter value of num2: ");
//        double num2 = sc.nextDouble();
//        System.out.println("Enter value of num3: ");
//        double num3 = sc.nextDouble();
//        System.out.println("Enter value of num4: ");
//        double num4 = sc.nextDouble();
//
//
//        if (num1 != 0) {
//            if (num1 % 2 == 0 ) {
//                System.out.println(num1 + " is even");
//            } else if (num1 % 2 == 1){
//                System.out.println(num1 + " is odd");
//            }else {
//                System.out.println(num1 + " is kesr eded");
//            }
//
//        }else {
//            System.out.println("Number is neither odd nor even");
//        }
//        if (num2 != 0) {
//            if (num2 % 2 == 0) {
//                System.out.println(num2 + " is even");
//            } else if (num1 % 2 == 1){
//                System.out.println(num1 + " is odd");
//            }else {
//                System.out.println(num1 + " is kesr eded");
//            }
//        }else {
//            System.out.println("Number is neither odd nor even");
//        }
//
//        if (num3 != 0) {
//            if (num3 % 2 == 0) {
//                System.out.println(num3 + " is even");
//            } else if (num1 % 2 == 1){
//                System.out.println(num3 + " is odd");
//            }else {
//                System.out.println(num1 + " is kesr eded");
//            }
//        }else {
//            System.out.println("Number is neither odd nor even");
//        }
//
//        if (num4 != 0) {
//            if (num4 % 2 == 0) {
//                System.out.println(num4 + " is even");
//            } else if (num1 % 2 == 1){
//                System.out.println(num4 + " is odd");
//            }else {
//                System.out.println(num1 + " is kesr eded");
//            }
//        }else {
//            System.out.println("Number is neither odd nor even");
//        }
//        sc.close();
//    }
//}

//Task 3 with scanner
//public class HomeWork {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please value of a: ");
//        int a = sc.nextInt();
//        System.out.println("Please value of b: ");
//        int b = sc.nextInt();
//        System.out.println("Please value of c: ");
//        int c = sc.nextInt();
//
//
//        float result = (float) (a + b) / c;
//                if (c == 0){
//          System.out.println("It can't be divided to 0");
//            return;
//        }
//        if (result < 10){
//            System.out.println(" a and b addition being divided c is less than 10");
//        }else if (result == 10){
//            System.out.println(" a and b addition divided c is equal to 10");
//        }else {
//            System.out.println(" a and b addition divided c is greater than 10");
//        }
//        sc.close();
//    }
//}

//Task4 with scanner
//public class HomeWork {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please write value of num1: ");
//        int num1 = sc.nextInt();
//        System.out.println("Please write value of num2: ");
//        int num2 = sc.nextInt();
//        System.out.println("Please write value of num3: ");
//        int num3 = sc.nextInt();
//        System.out.println("Please write value of num4: ");
//        int num4 = sc.nextInt();
//        int MaxNumBetween12;
//        int MinNumBetween34;
//        int result;
//
//        if (num1>num2){
//            MaxNumBetween12 = num1;
//        }else {
//            MaxNumBetween12 = num2;
//        }
//        if (num3>num4){
//            MinNumBetween34 = num4;
//        }else {
//            MinNumBetween34 = num3;
//        }
//
//        result = MaxNumBetween12*MinNumBetween34;
//        System.out.println("Maximum number between num1 and num2 is "+ MaxNumBetween12);
//        System.out.println("Minimum number between num3 and num4 is "+ MinNumBetween34);
//        System.out.println("Their multiplication is "+ result);
//        sc.close();
//    }
//}

//Task5 with scanner

//public class HomeWork {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please write number of Day of week");
//        byte DayOfWeek = sc.nextByte();
//
//        if (DayOfWeek == 1){
//            System.out.println("This day of week is Bazar ertesi");
//        }else if (DayOfWeek == 2) {
//            System.out.println("This day od week is Cersenbe axasmi");
//        }else if (DayOfWeek == 3) {
//            System.out.println("This day of week is Cersenbe");
//        }else if (DayOfWeek == 4) {
//            System.out.println("This day of week is Cume axsami");
//        }else if (DayOfWeek == 5) {
//            System.out.println("This day of week is Cume");
//        }else if (DayOfWeek == 6) {
//            System.out.println("This day of week is Senbe");
//        }else if (DayOfWeek == 7){
//            System.out.println("This day of week is Bazar ertesi");
//        }else if (DayOfWeek < 0) {
//            System.out.println("Please write positive number");
//        } else {
//            System.out.println("There is only 7 days in week, please write in between 1 and 7");
//        }
//    }
//}

//Task6 with scanner

public  class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write value of a: ");
        int a = sc.nextInt();
        System.out.println("Please write value of b: ");
        int b = sc.nextInt();
        System.out.println("Before displacement a is "+ a +"; b is " + b);

            a = a + b;
            b = a - b;
            a = a - b;


        System.out.println("After displacement a is "+ a + "; b is " + b);
    }
}
