/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author HP
 */
public class CustomExceptionName extends IllegalArgumentException {
    private static String msgERR = "Sorry, the input you provided is either not a full Name or empty. Please Try again.";

    public CustomExceptionName() {
        super(msgERR);
    }

    public CustomExceptionName(String s) {
        super(msgERR);
    }

    public CustomExceptionName(String message, Throwable cause) {
        super(msgERR, cause);
    }

    public CustomExceptionName(Throwable cause) {
        super(cause);
    }
    
}
