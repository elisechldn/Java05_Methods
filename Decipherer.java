public class Decipherer {

    public String decryptSecretMessage(String secretMessage) {
        int keyFigure = secretMessage.length() / 2;
        String secretSubString = secretMessage.substring(5, 5 + keyFigure);
        String replacedString = secretSubString.replace("@#?", " ");
        String reversedString = new StringBuilder(replacedString).reverse().toString();

        return reversedString;
    }

    public static void main(String[] args) {
        Decipherer decipherer = new Decipherer();

        String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
        String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";

        String decryptedMessage1 = decipherer.decryptSecretMessage(message1);
        String decryptedMessage2 = decipherer.decryptSecretMessage(message2);
        String decryptedMessage3 = decipherer.decryptSecretMessage(message3);

        System.out.println(decryptedMessage1);
        System.out.println(decryptedMessage2);
        System.out.println(decryptedMessage3);
    }
}