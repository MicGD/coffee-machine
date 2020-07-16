package machine;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int waterAmount = 400, milkAmount = 540, beanAmount = 120, cupAmount = 9, moneyAmount = 550;
        int fillWater = 0, fillMilk = 0, fillBeans = 0, fillCups = 0;

        int takeCase = 0;

        boolean exitBoolean = false;

        String actionList = "Write action (buy, fill, take, remaining, exit):";
        String machineHas = "The coffee machine has:";
        String writeWater = "Write how many ml of water do you want to add:";
        String writeMilk = "Write how many ml of milk do you want to add: ";
        String writeBeans = "Write how many grams of coffee beans do you want to add:";
        String writeCups = "Write how many disposable cups of coffee do you want to add:";
        String notEnoughWater = "Sorry, not enough water!";
        String enoughResources = "I have enough resources, making you a coffee!";
        String action1;
        String action2;

        while (!exitBoolean) {
            System.out.println(actionList);
            action1 = s.next();
            switch (action1) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    action2 = s.next();
                    switch (action2) {
                        case "3":

                            if (waterAmount - 200 <= 0) {
                                System.out.println(notEnoughWater);
                                break;
                            } else if (milkAmount - 100 <= 0) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            } else if (beanAmount - 12 <= 0) {
                                System.out.println("Sorry, not enough beans!");
                                break;
                            } else if (cupAmount - 1 <= 0) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            } else {
                                waterAmount = waterAmount - 200;
                                milkAmount = milkAmount - 100;
                                beanAmount = beanAmount - 12;
                                cupAmount = cupAmount - 1;
                                moneyAmount = moneyAmount + 6;
                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            }
                        case "2":
                            if (waterAmount - 350 < 0) {
                                System.out.println(notEnoughWater);
                                break;
                            } else if (milkAmount - 75 < 0) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            } else if (beanAmount - 20 < 0) {
                                System.out.println("Sorry, not enough beans!");
                                break;
                            } else if (cupAmount - 1 < 0) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            } else {
                                waterAmount = waterAmount - 350;
                                milkAmount = milkAmount - 75;
                                beanAmount = beanAmount - 20;
                                cupAmount = cupAmount - 1;
                                moneyAmount = moneyAmount + 7;
                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            }
                        case "1":
                            if (waterAmount - 250 < 0) {
                                System.out.println(notEnoughWater);
                                break;
                            } else if (beanAmount - 16 < 0) {
                                System.out.println("Sorry, not enough beans!");
                                break;
                            } else if (cupAmount - 1 < 0) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            } else {
                                waterAmount = waterAmount - 250;
                                beanAmount = beanAmount - 16;
                                cupAmount = cupAmount - 1;
                                moneyAmount = moneyAmount + 4;
                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            }
                    }
                    break;
                case "fill":
                    System.out.println(writeWater);
                    fillWater = s.nextInt();

                    System.out.println(writeMilk);
                    fillMilk = s.nextInt();

                    System.out.println(writeBeans);
                    fillBeans = s.nextInt();

                    System.out.println(writeCups);
                    fillCups = s.nextInt();

                    waterAmount = waterAmount + fillWater;
                    milkAmount = milkAmount + fillMilk;
                    beanAmount = beanAmount + fillBeans;
                    cupAmount = cupAmount + fillCups;
                    moneyAmount = moneyAmount;
                    break;

                case "take":
                    System.out.println("I gave you $" + moneyAmount);
                    moneyAmount = moneyAmount - moneyAmount;
                    break;
                case "remaining":
                    System.out.println(machineHas);
                    System.out.println(waterAmount + " " + "of water");
                    System.out.println(milkAmount + " " + "of milk");
                    System.out.println(beanAmount + " " + "of coffee beans");
                    System.out.println(cupAmount + " " + "disposable cups");
                    System.out.println(moneyAmount + " of money");
                    break;
                case "exit":
                    exitBoolean = true;
                    break;
                default:
                    System.out.println("Unknown Input!");
                    break;

            }
        }
    }
}

