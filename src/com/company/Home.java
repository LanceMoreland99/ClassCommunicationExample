package com.company;

public class Home {

    /**Declared for global scope. */

    private StringClass stringClass;
    private PrinterClass printerClass;

    public void init() {
        /** Initialized */
        stringClass = new StringClass();
        printerClass = new PrinterClass();

        /**Method that very specifically says what it does.*/
        printMessage();
    }

    private void printMessage() {
        /**Calls the print method on the PrinterClass and passes in the result of the getSentence() method on the StringClass*/
        printerClass.printMessage(stringClass.getSentence());
    }
}
