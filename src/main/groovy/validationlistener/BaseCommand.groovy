package validationlistener

class BaseCommand {
    static boolean areNamesValid(obj) {
        // This is here to represent interacting with a Service
        // bean from a static context...
        ServiceLocator.someValidationHelperService.isValidNameCombination obj.firstName, obj.lastName
    }
}
