package validationlistener

class DemoController {

    def index(){}

    def create(String firstName, String lastName) {
        // Intentionall not being used as a Grails
        // Command Object, just a validateable POGO.
        def person = new PersonCommand(firstName: firstName, lastName: lastName)

        person.validate()

        respond person
    }
}
