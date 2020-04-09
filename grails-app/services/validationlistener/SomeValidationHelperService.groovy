package validationlistener

class SomeValidationHelperService {

    boolean isValidNameCombination(String firstName, String lastName) {
        // Trivial example, but this could be arbitrarily complex
        // including interacting with other services, etc...
        lastName?.size() > firstName?.size()
    }
}
