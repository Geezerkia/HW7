public class Demo {
    public static void main(String[] args) {

        Cat.allCatsResultOutput();
        Dog.allDogsResultOutput();
        allAnimalsResultOutput();
    }

    public static void allAnimalsResultOutput() {
        System.out.println("\nУсього прийняло участь у змаганні:" +
                "\n------------------------------------\n" + Cat.getCatCounter() +
                " кішок\n" + Dog.getDogCounter() + " собак\n" + "Разом: " + (Cat.getCatCounter() +
                Dog.getDogCounter()) + " тварин.");
    }
}

