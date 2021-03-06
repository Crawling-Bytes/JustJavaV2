package com.example.owner.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the plus button is clicked
     */

    public void increment(View view){
        quantity = quantity + 1;
        display(quantity);
    }

    /**
     * This method is called when the minus button is clicked
     *
     */

    public void decrement(View view){
        quantity = quantity - 1;
        display(quantity);
    }

    public void submitOrder(View view) {
        //displayPrice(5 * quantity);
        String string = "\u20B9";
        int price = quantity * 5;
        String priceMessage = "Total item count " + quantity + " coffees" +
                               "\n\nTotal price is : " + string +" "+ price ;
        displayMessage(priceMessage);

    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

}
