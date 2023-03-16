public class Demo {
    public static void main(String[] args) {

        Cat.allCatsResultOutput();
        Dog.allDogsResultOutput();
        allAnimalsResultOutput();
    }

    public static void allAnimalsResultOutput() {
        System.out.println("\nУсього прийняло участь у змаганні:" + "\n------------------------------------\n" + Cat.catCount + " кішок\n" + Dog.dogCount + " собак\n" + "Разом: " + (Cat.catCount + Dog.dogCount) + " тварин.");
    }
}
