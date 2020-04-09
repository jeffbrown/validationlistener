package validationlistener

import grails.core.GrailsApplication
import grails.util.Holders

/*
This is not a best practice and is here only to support a specific
discussion that is ongoing at the time of writing.
 */
class ServiceLocator {

    static final String SOME_VALIDATION_HELPER = 'someValidationHelperService'

    static GrailsApplication getGrailsApplication() {
        return Holders.grailsApplication
    }

    static getService(String serviceName) {
        if (getGrailsApplication()?.getMainContext()?.containsBean(serviceName)) {
            return getGrailsApplication()?.getMainContext()?.getBean(serviceName)
        }
    }

    static SomeValidationHelperService getSomeValidationHelperService() {
        getService SOME_VALIDATION_HELPER
    }
}
