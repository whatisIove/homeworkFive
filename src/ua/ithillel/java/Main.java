package ua.ithillel.java;

public class Main {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard();
        creditCard.owner = "Vasya Pupkin";
        creditCard.cardNumber = "4234 5252 4455 9994";

        System.out.println("\nName client: " + creditCard.owner);
        System.out.println("Card number: " + creditCard.cardNumber);

        String cardType = "МИР";
        switch (cardType) {
            case "VISA":
                System.out.println("Dear " + creditCard.owner + " congratulations, you are using a normal card.");
                break;
            case "MASTER CARD":
                System.out.println("Dear " + creditCard.owner + " congratulations, you are using a normal card.");
                break;
            case "МИР":
                System.out.println(creditCard.owner + " fuck you and your Russian ship!!");
                break;
            default:
                System.out.println(cardType + " is unknown card type.");
        }

    }
}



