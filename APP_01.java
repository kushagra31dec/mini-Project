import java.util.ArrayList;
import java.util.Scanner;

public class APP_01 {
        public static void main(String[] args) {
                String q1 = "Number of primitive data types in Java are?\n"
                                + "(a)6\n(b)7\n(c)8\n(d)9\n";
                String q2 = "What is the size of float and double in java?\n"
                                + "(a)32 and 64\n(b)32 and 32\n(c)64 and 64\n(d)64 and 32\n";
                String q3 = "Automatic type conversion is possible in which of the possible cases?\n"
                                + "(a)Byte to int\n(b)Int to long\n(c)Long to int\n(d)Short to int\n";
                String q4 = "Select the valid statement.\n"
                                + "(a)char[] ch = new char(5)\n(b)char[] ch = new char[5]\n(c)char[] ch = new char()\n(d)char[] ch = new char[]\n";
                String q5 = "When an array is passed to a method, what does the method receive?\n"
                                + "(a)The reference of the array\n(b)A copy of the array\n(c)Length of the array\n(d)Copy of first element\n";
                String q6 = "Select the valid statement to declare and initialize an array.\n"
                                + "(a)int[] A = {}\n(b)int[] A = {1,2,3}\n(c)int[] A = (1,2,3)\n(d)int[][] A = {1,2,3}\n";
                String q7 = "Arrays in java are-\n"
                                + "(a)Object references\n(b)Primitive data type\n(c)Objects\n(d)None\n";
                String q8 = "When is the object created with new keyword?\n"
                                + "(a)At run time\n(b)At compile time\n(c)Depends on the code\n(d)None\n";
                String q9 = "Identify the corrected definition of a package.\n"
                                + "(a)A package is a collection of editing tools\n(b)A package is a collection of classes\n(c)A package is a collection of classes and interfaces\n(d)A package is a collection of interfaces\n";
                String q10 = "Identify the correct restriction on static methods.\n"
                                + "1. They must access only static data.\n"
                                + "2. They can only call other static methods.\n"
                                + "3. They cannot refer to this or super.\n"
                                + "(a)I AND II\n(b)II AND III\n(c)Only III\n(d)I, II AND III\n";
                ArrayList<APP_01helper> questions = new ArrayList<>();
                questions.add(new APP_01helper(q1, "c"));
                questions.add(new APP_01helper(q2, "a"));
                questions.add(new APP_01helper(q3, "b"));
                questions.add(new APP_01helper(q4, "b"));
                questions.add(new APP_01helper(q5, "a"));
                questions.add(new APP_01helper(q6, "b"));
                questions.add(new APP_01helper(q7, "c"));
                questions.add(new APP_01helper(q8, "a"));
                questions.add(new APP_01helper(q9, "c"));
                questions.add(new APP_01helper(q10, "d"));
                takeTest(questions);
        }

        public static void takeTest(ArrayList<APP_01helper> questions) {
                try (Scanner keyPrint = new Scanner(System.in)) {
                        int score = 0;
                        for (int i = 0; i < 10; i++) {
                                System.out.println();
                                System.out.println("Question no. " + (i + 1));
                                System.out.println(questions.get(i).prompt);
                                System.out.println("Choose correct option:");
                                String answer = keyPrint.next();
                                if (answer.equals(questions.get(i).answer)) {
                                        score++;
                                }
                        }
                        System.out.println();
                        System.out.println("\t\t\t\t\t       Score");
                        System.out.println("\t\t\t\t\t       ->" + score);
                        System.out.println("\t\t\t\t\t       Percentage");
                        System.out.println("\t\t\t\t\t       ->" + (score / 10f) * 100 + "%");
                }
        }
}
