package petstore;

import com.intuit.karate.junit5.Karate;

class PetstoreRunner {

    @Karate.Test
    Karate testUsers() {
        return Karate.run("/user").relativeTo(getClass());
    }
}