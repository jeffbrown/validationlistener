<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>People</title>
</head>

<body>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
    </ul>
</div>

<div class="content">
    <h1>Create Person</h1>
    <g:form action="create" method="POST">
        <fieldset class="form">
            <p>The first name must contain fewer characters than the last name or a validation
            error should be displayed after clicking the Create button.</p>

            <div class='fieldcontain required'>
                <label for='firstName'>First Name
                    <span class='required-indicator'>*</span>
                </label><input type="text" name="firstName" value="" required="" id="firstName"
                               placeholder="Enter First Name"/>
            </div>

            <div class='fieldcontain required'>
                <label for='lastName'>Last Name
                    <span class='required-indicator'>*</span>
                </label><input type="text" name="lastName" value="" required="" id="lastName"
                               placeholder="Enter Last Name"/>
            </div>
        </fieldset>
        <fieldset class="buttons">
            <g:submitButton name="create" class="create"
                            value="${message(code: 'default.button.create.label', default: 'Create')}"/>
        </fieldset>
    </g:form>

</div>

</body>
</html>