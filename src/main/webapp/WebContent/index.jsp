<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reservar Espacio - Coworking</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center">Reserva tu Espacio de Trabajo</h2>
        <form action="ReservaServlet" method="post" class="mt-4">
            <div class="mb-3">
                <label class="form-label">Nombre:</label>
                <input type="text" name="nombre" class="form-control" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Fecha de Reserva:</label>
                <input type="date" name="fecha" class="form-control" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Espacio de Trabajo:</label>
                <select name="espacio" class="form-select" required>
                    <option value="Escritorio">Escritorio</option>
                    <option value="Sala de reuniones">Sala de reuniones</option>
                    <option value="Oficina privada">Oficina privada</option>
                </select>
            </div>
            <div class="mb-3">
                <label class="form-label">Duración (en horas):</label>
                <input type="number" name="duracion" class="form-control" min="1" required>
            </div>
            <button type="submit" class="btn btn-primary w-100">Reservar</button>
        </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
