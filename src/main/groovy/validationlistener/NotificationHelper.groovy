package validationlistener


import grails.web.api.ServletAttributes

class NotificationHelper implements ServletAttributes {
    void fireValidationEvent(source) {
        // The simplest thing here is to use
        // Spring's event mechanism.
        applicationContext.publishEvent(new DemoValidationEvent(source))
    }
}
