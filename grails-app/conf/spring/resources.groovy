import validationlistener.NameValidationListener

// Place your Spring DSL code here
beans = {

    nameValidationListener(NameValidationListener) { bean ->
        bean.autowire = 'byName'
    }
}
