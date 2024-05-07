<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
<div class="container">
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3>Lista de Asignaturas</h3>
        </div>
        <div class="panel-body">
             <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Descripción</th>
                        <th>Salón</th>
                        <th>Horario</th>
                        <th>Docente Encargado</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${asignaturas}" var="asignatura">
                        <tr>
                            <td>${asignatura.nombre}</td>
                            <td>${asignatura.descripcion}</td>
                            <td>${asignatura.salon}</td>
                            <td>${asignatura.horario}</td>
                            <td>${asignatura.docente.nombre}</td>
                            <td>
                                <a href="/asignaturas/actualizar?id=${asignatura.id}" class="btn btn-primary">Actualizar</a>
                                <a href="/asignaturas/eliminar?id=${asignatura.id}" class="btn btn-danger">Eliminar</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <a href="/asignaturas/agregar" class="btn btn-success">Agregar Asignatura</a>
        </div>
    </div>
</div>
<%@ include file="common/footer.jsp"%>