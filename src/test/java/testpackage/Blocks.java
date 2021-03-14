package testpackage;

public class Blocks {
    private void blockExamples() {

        List<String> listOfOptions = Arrays.asList("One", "Two", "Three", "Four"); //Здесь я просто создал коллекцию внутри которой 4 строки

        for (int i = 0; i < listOfOptions.size(); i++) {
            System.out.println(listOfOptions.get(i));
        }

        int k = 0;

        for (; k < listOfOptions.size(); ) {
            System.out.println(listOfOptions.get(k));
            k++;
        }

        for (String listOfOption : listOfOptions) {
            System.out.println(listOfOption);
        }

        boolean b = true;

        while (b) {
            System.out.println("TEST!");
            if (k < 5)
                b = false;
        }

        while (k < 5) {
            System.out.println("TEST!");
            k++;
        }

        do {
            System.out.println("TEST!");
            k++;
        } while (k < 5);

        if (k < 5) {
            System.out.println("K less than 5");
            System.out.println("K less than 5");
        } else if (k > 0) {
            System.out.println("K > 0");
        } else {
            System.out.println("K >= 5");
            System.out.println("K >= 5");
        }

        if ((k < 5 && k > 0) || b == true) {
            System.out.println("K less than 5");
            System.out.println("K less than 5");
        }

        String s = k < 5 ? "k < 5" : "k >= 5";
        boolean boo = k < 5;

        switch (k) {
            case 0:
                System.out.println("zero");
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
            default:
                System.out.println("N/A");
        }
    }
}
