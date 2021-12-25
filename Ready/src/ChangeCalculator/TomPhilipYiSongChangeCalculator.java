package ChangeCalculator;
/*
2021/09/23 (YYYY, MM, DD)
Yi Song Ding and Tom Philip
Ms. Krasteva

This program attempts to create the change calculator machine in question 16 of the variables review assignment. Total purchase amount and amount tendered 
are the inputs, and the specific change is calculated out of this difference, and displayed in a table of varying bills and coins. Please note that 
this program does not round the cents to the nearest nickel. 
*/

import hsa.Console; // imports console



public class TomPhilipYiSongChangeCalculator // the change calculator program
{

    Console c; // calls console

    public TomPhilipYiSongChangeCalculator()
    {
        c = new Console (); // creates new console for display

    }


    public void calculator () // the main code for calulating
    {

        c.print ("Change Making Program"); // title
        c.println (); // spacers
        c.println ();

        c.print ("Please enter the total purchase:" + " "); // asks for total purchase amount
        double totalPurchase = c.readDouble (); // the line of code that entries the total purchase amount
        c.println ();

        c.print ("Please enter the amount tendered:" + " "); // asks for amount tendered (how much the customer gives)
        double amountTendered = c.readDouble ();// the line of code that entries the amount tendered
        c.println ();

        c.print ("The amount of change you need:"); // the title for the amount of change
        c.println ();

        double changeOwed = amountTendered - totalPurchase; // calculates the total change owed


        double dollarTwentyBill = changeOwed / 20; // checks if the current change owed is divisable by a 20 dollar bill
        int BillTwenty = (int) dollarTwentyBill; // truncates the divisable number to a whole number of bills/ coins
        c.println ("20-dollar bills:" + " " + BillTwenty); // displays the available amount of 20 dollar bills to be given
        int BillTwentyDeduct = BillTwenty * 20; // adds up the amount of money to be subtracted from the owed change by giving out the specificed 20-dollar bills
        changeOwed = changeOwed - BillTwentyDeduct; // deducts the calculated deductable for the next cycle of smaller coins

        double dollarTenBill = changeOwed / 10;  // checks if the current change owed is divisable by a 10 dollar bill
        int BillTen = (int) dollarTenBill; // truncates the divisable number to a whole number of bills/ coins
        c.println ("10-dollar bills:" + " " + BillTen); // displays the available amount of 10 dollar bills to be given
        int BillTenDeduct = BillTen * 10;  // adds up the amount of money  to be subtracted from the owed change by giving out the specificed 10-dollar bills
        changeOwed = changeOwed - BillTenDeduct; // deducts the calculated deductable for the next cycle of smaller coins

        double dollarFiveBill = changeOwed / 5; // checks if the current change owed is divisable by a 5 dollar bill
        int BillFive = (int) dollarFiveBill; // truncates the divisable number to a whole number of bills/ coins
        c.println ("5-dollar bills:" + " " + BillFive); // displays the available amount of 5 dollar bills to be given
        int BillFiveDeduct = BillFive * 5;// adds up the amount of money  to be subtracted from the owed change by giving out the specificed 5-dollar bills
        changeOwed = changeOwed - BillFiveDeduct; // deducts the calculated deductable for the next cycle of smaller coins

        double dollarTwoCoin = changeOwed / 2;  // checks if the current change owed is divisable by a 2 dollar coin
        int TwoCoin = (int) dollarTwoCoin; // truncates the divisable number to a whole number of bills/ coins
        c.println ("2-dollar coins:" + " " + TwoCoin); // displays the available amount of 2 dollar coins to be given
        int TwoCoinDeduct = TwoCoin * 2;  // adds up the amount of money  to be subtracted from the owed change by giving out the specificed 2 dollar coins
        changeOwed = changeOwed - TwoCoinDeduct; // deducts the calculated deductable for the next cycle of smaller coins

        double dollarOneCoin = changeOwed / 1;  // checks if the current change owed is divisable by a 1 dollar coin
        int OneCoin = (int) dollarOneCoin; // truncates the divisable number to a whole number of bills/ coins
        c.println ("1-dollar coins:" + " " + OneCoin); // displays the available amount of 1 dollar coins to be given
        int OneCoinDeduct = OneCoin * 1; // adds up the amount of money  to be subtracted from the owed change by giving out the specificed 1 dollar coins
        changeOwed = changeOwed - OneCoinDeduct; // deducts the calculated deductable for the next cycle of smaller coins

        double dollarQuarterCoin = changeOwed / 0.25;  // checks if the current change owed is divisable by a 25 cent coin
        int QuarterCoin = (int) dollarQuarterCoin; // truncates the divisable number to a whole number of bills/ coins
        c.println ("Quarters:" + " " + QuarterCoin); // displays the available amount of 25 cent coins to be given
        double QuarterCoinDeduct = QuarterCoin * 0.25; // adds up the amount of money  to be subtracted from the owed change by giving out the specificed 25 cent coins
        changeOwed = changeOwed - QuarterCoinDeduct; // deducts the calculated deductable for the next cycle of smaller coins

        double dollarDimeCoin = changeOwed / 0.1;  // checks if the current change owed is divisable by a 10 cent coin
        int DimeCoin = (int) dollarDimeCoin; // truncates the divisable number to a whole number of bills/ coins
        c.println ("Dimes:" + " " + DimeCoin); // displays the available amount of 10 cent coins to be given
        double DimeCoinDeduct = DimeCoin * 0.1; // adds up the amount of money  to be subtracted from the owed change by giving out the specificed 10 cent coins
        changeOwed = changeOwed - DimeCoinDeduct; // deducts the calculated deductable for the next cycle of smaller coins

        double dollarNickelCoin = changeOwed / 0.05;  // checks if the current change owed is divisable by a 5 cent coin
        int NickelCoin = (int) dollarNickelCoin; // truncates the divisable number to a whole number of bills/ coins
        c.print ("Nickels:" + " " + NickelCoin); // displays the available amount of 5 cent coins to be given
        c.println ();
        double NickelCoinDeduct = NickelCoin * 0.05; // adds up the amount of money  to be subtracted from the owed change by giving out the specificed 5 cent coins
        changeOwed = changeOwed - NickelCoinDeduct; // deducts the calculated deductable for the next cycle of smaller coins


        changeOwed = changeOwed + 0.00001; // to compensate for truncating and subtracting errors made by Java

        double dollarPennyCoin = changeOwed / 0.01;  // checks if the current change owed is divisable by a 1 cent coin
        int PennyCoin = (int) dollarPennyCoin; // truncates the divisable number to a whole number of bills/ coins
        c.println ("Pennies:" + " " + PennyCoin); // displays the available amount of 1 cent coins to be given
        double PennyCoinDeduct = PennyCoin * 0.01; // adds up the amount of money  to be subtracted from the owed change by giving out the specificed 1 cent coins
        changeOwed = changeOwed - PennyCoinDeduct; // not needed at all, but is kept for easier advancements for further demoninations

        c.println(); // spacers
        c.println();
        c.print("Thank you for using our program."); // thanks the user for using the program




    }


    public static void main (String[] args) // calls the main program's innards
    {
        TomPhilipYiSongChangeCalculator g = new TomPhilipYiSongChangeCalculator();// makes the change calculator tool a new one version with g
        g.calculator (); // calls the new calculator tool
    }
}