package validationlistener

class DemoController {

    SomeValidationHelperService someValidationHelperService

    def index(){}

    def create(String firstName, String lastName) {
        // Intentionall not being used as a Grails
        // Command Object, just a validateable POGO.
        def person = new PersonCommand(firstName: firstName, lastName: lastName)

        person.validate()

        someValidationHelperService.validateNames person

        respond person
    }
}
