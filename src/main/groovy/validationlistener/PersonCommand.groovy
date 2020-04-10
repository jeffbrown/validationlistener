package validationlistener

import grails.validation.Validateable

class PersonCommand extends BaseCommand implements Validateable {
    String firstName
    String lastName
}
