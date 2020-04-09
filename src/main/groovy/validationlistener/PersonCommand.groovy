package validationlistener

import grails.validation.Validateable

class PersonCommand extends BaseCommand implements Validateable {
    String firstName
    String lastName

    static constraints = {
        firstName validator: { val, person ->
            // this is here to represent calling a static method from
            // a custom validator...
            if(!areNamesValid(person)) {
                return 'firstName.invalid'
            }
        }
    }
}
