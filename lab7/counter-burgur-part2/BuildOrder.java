 

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" );
       

       //1st Order
        
        Component burger = new Burger( Burger.ORGANIC_BISON,Burger.MEDIUM,Burger.BUN ) ;
        String[] selectedCheese = new String[]{"Yellow American","Spicy Jalapeno Jack"};
        burger = new Cheese(burger,selectedCheese);
        String[] selectedPCheese = new String[]{"Danish Blue Cheese"};
        burger = new PremiumCheese(burger,selectedPCheese);
        String[] selectedSauce = new String[]{"Mayonnaise", "Thai Peanut Sauce"};
        burger = new Sauce(burger,selectedSauce);
        String[] selectedTopping = new String[]{"Dill Pickle Chips","Black Olives","Spicy Pickels"};
        burger = new Topping(burger,selectedTopping);
        String[] selectedPTopping = new String[]{"Marinated Tomatoes"};
        burger = new PremiumTopping(burger,selectedPTopping);
        String[] selectedBun = new String[]{"Ciabatta(Vegan)"};
        burger = new Bun(burger,selectedBun);
        String[] selectedSide = new String[]{"Shoestring Fries"};
        burger = new Side(burger,selectedSide);
        
        order.addChild(new Leaf("Build Your Own Burger", burger));

        //2nd Order
     
        
        Component secondBurger = new Burger( Burger.BEEF,Burger.SMALL,Burger.BUN ) ;
        selectedCheese = new String[]{"Smoked Gouda","Greek Feta"};
        secondBurger = new Cheese(secondBurger,selectedCheese);
        selectedPCheese = new String[]{"Fresh Mpzzarella"};
        secondBurger = new PremiumCheese(secondBurger,selectedPCheese);
        selectedSauce = new String[]{"Habanero Salsa"};
        secondBurger = new Sauce(secondBurger,selectedSauce);
        selectedTopping = new String[]{"Crushed Peanuts"};
        secondBurger = new Topping(secondBurger,selectedTopping);
        selectedPTopping = new String[]{"Sunny Side Up Egg","Marinated Tomatoes"};
        secondBurger = new PremiumTopping(secondBurger,selectedPTopping);
        selectedBun = new String[]{"Gluten-Free Bun"};
        secondBurger = new Bun(secondBurger,selectedBun);
        selectedSide = new String[]{"Shoestring Fries"};
        secondBurger = new Side(secondBurger,selectedSide);
        
        order.addChild(new Leaf("Build Your Own Burger", secondBurger));
        return order ;
    }

}

