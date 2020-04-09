package validationlistener

import org.springframework.context.ApplicationListener

class NameValidationListener implements ApplicationListener<DemoValidationEvent> {

    // Since NameValidationListener is configured as a Spring
    // bean, other services can be injected directly here with
    // no need for the ServiceLocator.
    SomeValidationHelperService someValidationHelperService

    @Override
    void onApplicationEvent(DemoValidationEvent event) {
        def person = event.source

        // Here polymorphic dispatch could be used to invoker helper methods
        // which accept different typed arguments so event.source could be passed
        // and Groovy's dynamic dispatch will resolve the correct method to invoke
        // based on the runtime type of event.source.  For this trivial example,
        // the logic is embedded right here, no dispatch needed.

        if (!someValidationHelperService.isValidNameCombination(person.firstName, person.lastName)) {
            person.errors.rejectValue('firstName', 'firstName.invalid')
        }
    }
}
