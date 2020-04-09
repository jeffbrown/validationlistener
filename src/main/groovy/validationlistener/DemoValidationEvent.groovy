package validationlistener


import org.springframework.context.ApplicationEvent

class DemoValidationEvent extends ApplicationEvent {
    DemoValidationEvent(Object data) {
        super(data)
    }
}
