package validationlistener

import grails.validation.Validateable

/**
 * This trait overrides the validate() method from
 * Validateable to include fire an event when
 * validation happens.
 */
trait NotifyingValidateable extends Validateable {

    private static final helper = new NotificationHelper()

    // if using overloaded versions of the validate() method, those
    // should be accounted for similar to how the no-arg validate()
    // is dealt with here...
    boolean validate() {
        Validateable.super.validate()
        helper.fireValidationEvent(this)
        !this.hasErrors()
    }

}
