<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <c:choose>
                        <c:when test="${asignatura.id == 0}">Agregar Asignatura</c:when>
                        <c:otherwise>Editar Asignatura</c:otherwise>
                    </c:choose>
                </div>
                <div class="panel-body">
                    <form:form method="post" modelAttribute="asignatura">
                        <form:hidden path="id"/>
                        <div class="form-group">
                            <form:label path="nombre">Nombre de la Asignatura:</form:label>
                            <form:input path="nombre" type="text" class="form-control" maxlength="30" required="required"/>
                            <form:errors path="nombre" cssClass="text-warning"/>
                        </div>
                        <div class="form-group">
                            <form:label path="descripcion">Descripción:</form:label>
                            <form:textarea path="descripcion" class="form-control" maxlength="100" rows="3"/>
                            <form:errors path="descripcion" cssClass="text-warning"/>
                        </div>
                        <div class="form-group">
                            <form:label path="salon">Salón:</form:label>
                            <form:input path="salon" type="number" class="form-control" required="required"/>
                            <form:errors path="salon" cssClass="text-warning"/>
                        </div>
                        <div class="form-group">
                            <form:label path="horario">Horario (Inicio - Fin):</form:label>
                            <form:input path="horario" type="text" class="form-control" required="required"/>
                            <form:errors path="horario" cssClass="text-warning"/>
                        </div>
                        <div class="form-group">
                            <form:label path="docente">Docente Encargado:</form:label>
                            <form:select path="docente" class="form-control" required="required">
                                <form:option value="">Seleccione un docente</form:option>
                                <form:options items="${docentes}" itemValue="id" itemLabel="nombre"/>
                            </form:select>
                            <form:errors path="docente" cssClass="text-warning"/>
                        </div>
                        <button type="submit" class="btn btn-primary">Guardar</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="common/footer.jsp"%>