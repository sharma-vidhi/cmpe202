public class CardNumberDecorator extends DecoratorPattern {
    final static String space = " ";

    public CardNumberDecorator(Display c) {
        super(c);
    }

    public String display() {
        String number = this.component.display();
        StringBuilder cardNumber = new StringBuilder();

        if (number.equals(""))
            cardNumber.append("[4444 4444 4444 4444]" + "  ");
        else {
            cardNumber.append("[");
            for (int index = 0; index < number.length(); index++) {
                if (index == 4 || index == 8 || index == 12)
                    cardNumber.append(space + number.charAt(index));
                else
                    cardNumber.append(number.charAt(index));
            }
            cardNumber.append("]  ");
        }
        return cardNumber.toString();
    }


}