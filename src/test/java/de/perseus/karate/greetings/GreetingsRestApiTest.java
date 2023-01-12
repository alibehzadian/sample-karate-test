package de.perseus.karate.greetings;

import com.intuit.karate.junit5.Karate;

class GreetingsRestApiTest {
  
    @Karate.Test
    Karate testGreetings() {
        return Karate.run("greetings").relativeTo(getClass());
    }
}
