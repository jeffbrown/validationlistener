package validationlistener

class PersonCommand extends BaseCommand implements NotifyingValidateable {
    String firstName
    String lastName
}
