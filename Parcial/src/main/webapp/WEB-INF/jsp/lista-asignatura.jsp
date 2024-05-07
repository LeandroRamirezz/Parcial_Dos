<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Asignaturas - Estudiante</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <div class="row justify-content-center mt-5">
            <div class="col-md-8">
                <div class="card">
                    <div class="card-header">
                        <h4>Lista de Asignaturas</h4>
                    </div>
                    <div class="card-body">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Nombre</th>
                                    <th>Descripción</th>
                                    <th>Salón</th>
                                    <th>Horario</th>
                                    <th>Docente Encargado</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="asignatura" items="${asignaturas}">
                                    <tr>
                                        <td>${asignatura.nombre}</td>
                                        <td>${asignatura.descripcion}</td>
                                        <td>${asignatura.salon}</td>
                                        <td>${asignatura.horario}</td>
                                        <td>${asignatura.docenteEncargado.nombre} ${asignatura.docenteEncargado.apellido}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
<%@ include file="common/footer.jsp"%>