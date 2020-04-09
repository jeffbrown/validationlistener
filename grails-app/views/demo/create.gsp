<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Person</title>
</head>

<body>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(action: 'index')}">Back</a></li>
    </ul>
</div>

<div class="content">
    <h1>Person</h1>

    <g:hasErrors bean="${this.personCommand}">
        <ul class="errors" role="alert">
            <g:eachError bean="${this.personCommand}" var="error">
                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
                        error="${error}"/></li>
            </g:eachError>
        </ul>
    </g:hasErrors>

</div>

</body>
</html>