<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Gesti�n de Asignaturas</a>
        </div>
        <ul class="nav navbar-nav">
            <li><a href="/">Inicio</a></li>
            <c:if test="${role == 'RECTOR'}">
                <li><a href="/asignaturas">Asignaturas</a></li>
            </c:if>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="/logout">Cerrar Sesi�n</a></li>
        </ul>
    </div>
</nav>