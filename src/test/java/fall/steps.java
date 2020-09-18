package fall;

import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	int total=0;
int count=0 ;
	int price;
	int totalPrice=0;
	 checkout_price checkout;
		@Given("the price of a {string} is {int}")
		public void the_price_of_a_is(String product, Integer price1) {
		    price +=price1;
		    count++;
		}

		@When("I checkout {int} {string}")
		public void i_checkout(Integer numberOfPieces, String product) {
		checkout=new checkout_price();

		
		total += checkout.count(numberOfPieces, price);
		
	
		}
		

		@Then("the total price should be {int}")
		public void the_total_price_should_be(Integer TotalPrice) {
			    assertEquals(TotalPrice.intValue(),total/count);
		}

}
