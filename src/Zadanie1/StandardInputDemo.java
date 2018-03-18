package Zadanie1;

public class StandardInputDemo {

    public static void main(String[] args) {
        String checkedInputChar = args[0].toLowerCase();
        char[] checkedInputArray = checkedInputChar.trim().toCharArray();
        System.out.print(checkedInputChar + " ");
        int counter = 0;
        for (int i = 1; i < args.length; i++) {
            char[] argsInput = args[i].toLowerCase().toCharArray();
            for (int j = 0; j < argsInput.length; j++) {
                if (checkedInputArray[0] == argsInput[j]) {
                    counter++;
                }

            }

            System.out.print(args[i] + " ");
        }

        System.out.println("\n" + counter);

    }
}
