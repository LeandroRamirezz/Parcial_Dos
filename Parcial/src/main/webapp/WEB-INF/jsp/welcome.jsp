<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
<div class="container">
    <div class="panel panel-primary">
        <div class="panel-heading">P�gina Principal</div>
        <div class="panel-body">
            <h3>Bienvenido, ${name}!</h3>
            
              <p><a class="btn btn-primary btn-lg" href="/asignaturas-estudiante" role="button">Ver Asignaturas</a></p>
              <p><a class="btn btn-primary btn-lg" href="/asignaturas-admin" role="button">Administrar Asignaturas</a></p>
              <p><a class="btn btn-primary btn-lg" href="/asignatura-form" role="button">Agregar Asignatura</a></p>
           
           
        </div>
    </div>
</div>
<%@ include file="common/footer.jsp"%>