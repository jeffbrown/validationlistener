package validationlistener

class SomeValidationHelperService {

    void validateNames(PersonCommand person) {
        if (!isValidNameCombination(person.firstName, person.lastName)) {
            person.errors.rejectValue('firstName', 'firstName.invalid')
        }
    }

    boolean isValidNameCombination(String firstName, String lastName) {
        // Trivial example, but this could be arbitrarily complex
        // including interacting with other services, etc...
        lastName?.size() > firstName?.size()
    }
}
