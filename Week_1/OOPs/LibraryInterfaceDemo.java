interface LibraryUser {
    void registerAccount();
    void requestBook();
}

class KidUser implements LibraryUser {
    int age;
    String bookType;

    KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account.");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid.");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equalsIgnoreCase("Kids")) {
            System.out.println("Book Issued successfully, please return the book within 10 days.");
        } else {
            System.out.println("You are allowed to take only Kids books.");
        }
    }
}


class AdultUser implements LibraryUser {
    int age;
    String bookType;

    AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age >= 12) {
            System.out.println("You have successfully registered under an Adult Account.");
        } else {
            System.out.println("Sorry, Age must be greater than or equal to 12 to register as an adult.");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equalsIgnoreCase("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days.");
        } else {
            System.out.println("You are allowed to take only Fiction books.");
        }
    }
}

public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        KidUser kid = new KidUser(10, "Kids");
        kid.registerAccount();
        kid.requestBook();

        System.out.println();

        AdultUser adult = new AdultUser(25, "Fiction");
        adult.registerAccount();
        adult.requestBook();
    }
}
